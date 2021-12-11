package com.itsamankrsingh.bankingapp.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CustomerDatabase_Impl extends CustomerDatabase {
  private volatile CustomerDao _customerDao;

  private volatile TransactionRecordDao _transactionRecordDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `customer_table` (`customer_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `customerName` TEXT NOT NULL, `customerEmail` TEXT NOT NULL, `customerMobileNumber` TEXT NOT NULL, `customerAccountNumber` TEXT NOT NULL, `ifscCode` TEXT NOT NULL, `accountBalance` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transaction_record` (`transaction_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `senderCustomerName` TEXT NOT NULL, `receiverCustomerName` TEXT NOT NULL, `senderAccountNumber` TEXT NOT NULL, `receiverAccountNumber` TEXT NOT NULL, `transferredAmount` INTEGER NOT NULL, `status` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ab949f50644c56820e037810e2be5fd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `customer_table`");
        _db.execSQL("DROP TABLE IF EXISTS `transaction_record`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCustomerTable = new HashMap<String, TableInfo.Column>(7);
        _columnsCustomerTable.put("customer_id", new TableInfo.Column("customer_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("customerName", new TableInfo.Column("customerName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("customerEmail", new TableInfo.Column("customerEmail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("customerMobileNumber", new TableInfo.Column("customerMobileNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("customerAccountNumber", new TableInfo.Column("customerAccountNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("ifscCode", new TableInfo.Column("ifscCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("accountBalance", new TableInfo.Column("accountBalance", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomerTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomerTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomerTable = new TableInfo("customer_table", _columnsCustomerTable, _foreignKeysCustomerTable, _indicesCustomerTable);
        final TableInfo _existingCustomerTable = TableInfo.read(_db, "customer_table");
        if (! _infoCustomerTable.equals(_existingCustomerTable)) {
          return new RoomOpenHelper.ValidationResult(false, "customer_table(com.itsamankrsingh.bankingapp.database.Customer).\n"
                  + " Expected:\n" + _infoCustomerTable + "\n"
                  + " Found:\n" + _existingCustomerTable);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactionRecord = new HashMap<String, TableInfo.Column>(7);
        _columnsTransactionRecord.put("transaction_id", new TableInfo.Column("transaction_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("senderCustomerName", new TableInfo.Column("senderCustomerName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("receiverCustomerName", new TableInfo.Column("receiverCustomerName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("senderAccountNumber", new TableInfo.Column("senderAccountNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("receiverAccountNumber", new TableInfo.Column("receiverAccountNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("transferredAmount", new TableInfo.Column("transferredAmount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionRecord.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionRecord = new TableInfo("transaction_record", _columnsTransactionRecord, _foreignKeysTransactionRecord, _indicesTransactionRecord);
        final TableInfo _existingTransactionRecord = TableInfo.read(_db, "transaction_record");
        if (! _infoTransactionRecord.equals(_existingTransactionRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "transaction_record(com.itsamankrsingh.bankingapp.database.TransactionRecord).\n"
                  + " Expected:\n" + _infoTransactionRecord + "\n"
                  + " Found:\n" + _existingTransactionRecord);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "1ab949f50644c56820e037810e2be5fd", "1ee9d9caa5556d664c73b590e37e8b80");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "customer_table","transaction_record");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `customer_table`");
      _db.execSQL("DELETE FROM `transaction_record`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CustomerDao.class, CustomerDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TransactionRecordDao.class, TransactionRecordDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CustomerDao getCustomerDao() {
    if (_customerDao != null) {
      return _customerDao;
    } else {
      synchronized(this) {
        if(_customerDao == null) {
          _customerDao = new CustomerDao_Impl(this);
        }
        return _customerDao;
      }
    }
  }

  @Override
  public TransactionRecordDao getTransactionRecordDao() {
    if (_transactionRecordDao != null) {
      return _transactionRecordDao;
    } else {
      synchronized(this) {
        if(_transactionRecordDao == null) {
          _transactionRecordDao = new TransactionRecordDao_Impl(this);
        }
        return _transactionRecordDao;
      }
    }
  }
}
