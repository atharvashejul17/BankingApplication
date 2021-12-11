package com.itsamankrsingh.bankingapp.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CustomerDao_Impl implements CustomerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Customer> __insertionAdapterOfCustomer;

  private final EntityDeletionOrUpdateAdapter<Customer> __updateAdapterOfCustomer;

  public CustomerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCustomer = new EntityInsertionAdapter<Customer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `customer_table` (`customer_id`,`customerName`,`customerEmail`,`customerMobileNumber`,`customerAccountNumber`,`ifscCode`,`accountBalance`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Customer value) {
        stmt.bindLong(1, value.getId());
        if (value.getCustomerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCustomerName());
        }
        if (value.getCustomerEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCustomerEmail());
        }
        if (value.getCustomerMobileNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerMobileNumber());
        }
        if (value.getCustomerAccountNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCustomerAccountNumber());
        }
        if (value.getIfscCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIfscCode());
        }
        stmt.bindLong(7, value.getAccountBalance());
      }
    };
    this.__updateAdapterOfCustomer = new EntityDeletionOrUpdateAdapter<Customer>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `customer_table` SET `customer_id` = ?,`customerName` = ?,`customerEmail` = ?,`customerMobileNumber` = ?,`customerAccountNumber` = ?,`ifscCode` = ?,`accountBalance` = ? WHERE `customer_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Customer value) {
        stmt.bindLong(1, value.getId());
        if (value.getCustomerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCustomerName());
        }
        if (value.getCustomerEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCustomerEmail());
        }
        if (value.getCustomerMobileNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerMobileNumber());
        }
        if (value.getCustomerAccountNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCustomerAccountNumber());
        }
        if (value.getIfscCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIfscCode());
        }
        stmt.bindLong(7, value.getAccountBalance());
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insertCustomer(final Customer customer) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCustomer.insert(customer);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object updateCustomer(final Customer customer,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCustomer.handle(customer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Customer>> getAllCustomer() {
    final String _sql = "SELECT * FROM customer_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"customer_table"}, false, new Callable<List<Customer>>() {
      @Override
      public List<Customer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerName");
          final int _cursorIndexOfCustomerEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "customerEmail");
          final int _cursorIndexOfCustomerMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerMobileNumber");
          final int _cursorIndexOfCustomerAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerAccountNumber");
          final int _cursorIndexOfIfscCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ifscCode");
          final int _cursorIndexOfAccountBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "accountBalance");
          final List<Customer> _result = new ArrayList<Customer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Customer _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerEmail;
            if (_cursor.isNull(_cursorIndexOfCustomerEmail)) {
              _tmpCustomerEmail = null;
            } else {
              _tmpCustomerEmail = _cursor.getString(_cursorIndexOfCustomerEmail);
            }
            final String _tmpCustomerMobileNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerMobileNumber)) {
              _tmpCustomerMobileNumber = null;
            } else {
              _tmpCustomerMobileNumber = _cursor.getString(_cursorIndexOfCustomerMobileNumber);
            }
            final String _tmpCustomerAccountNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerAccountNumber)) {
              _tmpCustomerAccountNumber = null;
            } else {
              _tmpCustomerAccountNumber = _cursor.getString(_cursorIndexOfCustomerAccountNumber);
            }
            final String _tmpIfscCode;
            if (_cursor.isNull(_cursorIndexOfIfscCode)) {
              _tmpIfscCode = null;
            } else {
              _tmpIfscCode = _cursor.getString(_cursorIndexOfIfscCode);
            }
            final int _tmpAccountBalance;
            _tmpAccountBalance = _cursor.getInt(_cursorIndexOfAccountBalance);
            _item = new Customer(_tmpId,_tmpCustomerName,_tmpCustomerEmail,_tmpCustomerMobileNumber,_tmpCustomerAccountNumber,_tmpIfscCode,_tmpAccountBalance);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getCustomExcept(final List<Long> idArray,
      final Continuation<? super List<Customer>> continuation) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM customer_table WHERE customer_id IN (");
    final int _inputSize = idArray.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Long _item : idArray) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Customer>>() {
      @Override
      public List<Customer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerName");
          final int _cursorIndexOfCustomerEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "customerEmail");
          final int _cursorIndexOfCustomerMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerMobileNumber");
          final int _cursorIndexOfCustomerAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerAccountNumber");
          final int _cursorIndexOfIfscCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ifscCode");
          final int _cursorIndexOfAccountBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "accountBalance");
          final List<Customer> _result = new ArrayList<Customer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Customer _item_1;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerEmail;
            if (_cursor.isNull(_cursorIndexOfCustomerEmail)) {
              _tmpCustomerEmail = null;
            } else {
              _tmpCustomerEmail = _cursor.getString(_cursorIndexOfCustomerEmail);
            }
            final String _tmpCustomerMobileNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerMobileNumber)) {
              _tmpCustomerMobileNumber = null;
            } else {
              _tmpCustomerMobileNumber = _cursor.getString(_cursorIndexOfCustomerMobileNumber);
            }
            final String _tmpCustomerAccountNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerAccountNumber)) {
              _tmpCustomerAccountNumber = null;
            } else {
              _tmpCustomerAccountNumber = _cursor.getString(_cursorIndexOfCustomerAccountNumber);
            }
            final String _tmpIfscCode;
            if (_cursor.isNull(_cursorIndexOfIfscCode)) {
              _tmpIfscCode = null;
            } else {
              _tmpIfscCode = _cursor.getString(_cursorIndexOfIfscCode);
            }
            final int _tmpAccountBalance;
            _tmpAccountBalance = _cursor.getInt(_cursorIndexOfAccountBalance);
            _item_1 = new Customer(_tmpId,_tmpCustomerName,_tmpCustomerEmail,_tmpCustomerMobileNumber,_tmpCustomerAccountNumber,_tmpIfscCode,_tmpAccountBalance);
            _result.add(_item_1);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getCustomerById(final long customerId,
      final Continuation<? super Customer> continuation) {
    final String _sql = "SELECT * FROM customer_table WHERE customer_id = (?) ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, customerId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Customer>() {
      @Override
      public Customer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerName");
          final int _cursorIndexOfCustomerEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "customerEmail");
          final int _cursorIndexOfCustomerMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerMobileNumber");
          final int _cursorIndexOfCustomerAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "customerAccountNumber");
          final int _cursorIndexOfIfscCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ifscCode");
          final int _cursorIndexOfAccountBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "accountBalance");
          final Customer _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerEmail;
            if (_cursor.isNull(_cursorIndexOfCustomerEmail)) {
              _tmpCustomerEmail = null;
            } else {
              _tmpCustomerEmail = _cursor.getString(_cursorIndexOfCustomerEmail);
            }
            final String _tmpCustomerMobileNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerMobileNumber)) {
              _tmpCustomerMobileNumber = null;
            } else {
              _tmpCustomerMobileNumber = _cursor.getString(_cursorIndexOfCustomerMobileNumber);
            }
            final String _tmpCustomerAccountNumber;
            if (_cursor.isNull(_cursorIndexOfCustomerAccountNumber)) {
              _tmpCustomerAccountNumber = null;
            } else {
              _tmpCustomerAccountNumber = _cursor.getString(_cursorIndexOfCustomerAccountNumber);
            }
            final String _tmpIfscCode;
            if (_cursor.isNull(_cursorIndexOfIfscCode)) {
              _tmpIfscCode = null;
            } else {
              _tmpIfscCode = _cursor.getString(_cursorIndexOfIfscCode);
            }
            final int _tmpAccountBalance;
            _tmpAccountBalance = _cursor.getInt(_cursorIndexOfAccountBalance);
            _result = new Customer(_tmpId,_tmpCustomerName,_tmpCustomerEmail,_tmpCustomerMobileNumber,_tmpCustomerAccountNumber,_tmpIfscCode,_tmpAccountBalance);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
