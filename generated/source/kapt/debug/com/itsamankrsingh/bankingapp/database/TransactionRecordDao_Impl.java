package com.itsamankrsingh.bankingapp.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionRecordDao_Impl implements TransactionRecordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TransactionRecord> __insertionAdapterOfTransactionRecord;

  private final EntityDeletionOrUpdateAdapter<TransactionRecord> __deletionAdapterOfTransactionRecord;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTransaction;

  public TransactionRecordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransactionRecord = new EntityInsertionAdapter<TransactionRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `transaction_record` (`transaction_id`,`senderCustomerName`,`receiverCustomerName`,`senderAccountNumber`,`receiverAccountNumber`,`transferredAmount`,`status`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionRecord value) {
        stmt.bindLong(1, value.getTransactionId());
        if (value.getSenderCustomerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSenderCustomerName());
        }
        if (value.getReceiverCustomerName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReceiverCustomerName());
        }
        if (value.getSenderAccountNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSenderAccountNumber());
        }
        if (value.getReceiverAccountNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getReceiverAccountNumber());
        }
        stmt.bindLong(6, value.getTransferredAmount());
        final int _tmp;
        _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__deletionAdapterOfTransactionRecord = new EntityDeletionOrUpdateAdapter<TransactionRecord>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `transaction_record` WHERE `transaction_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionRecord value) {
        stmt.bindLong(1, value.getTransactionId());
      }
    };
    this.__preparedStmtOfDeleteAllTransaction = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM transaction_record";
        return _query;
      }
    };
  }

  @Override
  public Object insertTransaction(final TransactionRecord transaction,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTransactionRecord.insert(transaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTransactionRecord(final TransactionRecord transaction,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTransactionRecord.handle(transaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllTransaction(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTransaction.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTransaction.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllTransaction(
      final Continuation<? super List<TransactionRecord>> continuation) {
    final String _sql = "SELECT * FROM transaction_record";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<TransactionRecord>>() {
      @Override
      public List<TransactionRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionId = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_id");
          final int _cursorIndexOfSenderCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "senderCustomerName");
          final int _cursorIndexOfReceiverCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverCustomerName");
          final int _cursorIndexOfSenderAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "senderAccountNumber");
          final int _cursorIndexOfReceiverAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "receiverAccountNumber");
          final int _cursorIndexOfTransferredAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "transferredAmount");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<TransactionRecord> _result = new ArrayList<TransactionRecord>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionRecord _item;
            final long _tmpTransactionId;
            _tmpTransactionId = _cursor.getLong(_cursorIndexOfTransactionId);
            final String _tmpSenderCustomerName;
            if (_cursor.isNull(_cursorIndexOfSenderCustomerName)) {
              _tmpSenderCustomerName = null;
            } else {
              _tmpSenderCustomerName = _cursor.getString(_cursorIndexOfSenderCustomerName);
            }
            final String _tmpReceiverCustomerName;
            if (_cursor.isNull(_cursorIndexOfReceiverCustomerName)) {
              _tmpReceiverCustomerName = null;
            } else {
              _tmpReceiverCustomerName = _cursor.getString(_cursorIndexOfReceiverCustomerName);
            }
            final String _tmpSenderAccountNumber;
            if (_cursor.isNull(_cursorIndexOfSenderAccountNumber)) {
              _tmpSenderAccountNumber = null;
            } else {
              _tmpSenderAccountNumber = _cursor.getString(_cursorIndexOfSenderAccountNumber);
            }
            final String _tmpReceiverAccountNumber;
            if (_cursor.isNull(_cursorIndexOfReceiverAccountNumber)) {
              _tmpReceiverAccountNumber = null;
            } else {
              _tmpReceiverAccountNumber = _cursor.getString(_cursorIndexOfReceiverAccountNumber);
            }
            final int _tmpTransferredAmount;
            _tmpTransferredAmount = _cursor.getInt(_cursorIndexOfTransferredAmount);
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            _item = new TransactionRecord(_tmpTransactionId,_tmpSenderCustomerName,_tmpReceiverCustomerName,_tmpSenderAccountNumber,_tmpReceiverAccountNumber,_tmpTransferredAmount,_tmpStatus);
            _result.add(_item);
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
