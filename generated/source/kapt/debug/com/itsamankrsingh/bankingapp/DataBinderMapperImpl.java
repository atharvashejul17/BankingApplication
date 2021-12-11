package com.itsamankrsingh.bankingapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.itsamankrsingh.bankingapp.databinding.ActivityMainBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.CustomerItemBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentCustomerBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentDetailsBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentHomeBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentSuccessfulTransactionBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentTransactionBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.FragmentTransactionRecordBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.TransactionRecordItemBindingImpl;
import com.itsamankrsingh.bankingapp.databinding.TransferAmountBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CUSTOMERITEM = 2;

  private static final int LAYOUT_FRAGMENTCUSTOMER = 3;

  private static final int LAYOUT_FRAGMENTDETAILS = 4;

  private static final int LAYOUT_FRAGMENTHOME = 5;

  private static final int LAYOUT_FRAGMENTSUCCESSFULTRANSACTION = 6;

  private static final int LAYOUT_FRAGMENTTRANSACTION = 7;

  private static final int LAYOUT_FRAGMENTTRANSACTIONRECORD = 8;

  private static final int LAYOUT_TRANSACTIONRECORDITEM = 9;

  private static final int LAYOUT_TRANSFERAMOUNT = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.customer_item, LAYOUT_CUSTOMERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_customer, LAYOUT_FRAGMENTCUSTOMER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_successful_transaction, LAYOUT_FRAGMENTSUCCESSFULTRANSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_transaction, LAYOUT_FRAGMENTTRANSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.fragment_transaction_record, LAYOUT_FRAGMENTTRANSACTIONRECORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.transaction_record_item, LAYOUT_TRANSACTIONRECORDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itsamankrsingh.bankingapp.R.layout.transfer_amount, LAYOUT_TRANSFERAMOUNT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMERITEM: {
          if ("layout/customer_item_0".equals(tag)) {
            return new CustomerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for customer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCUSTOMER: {
          if ("layout/fragment_customer_0".equals(tag)) {
            return new FragmentCustomerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_customer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUCCESSFULTRANSACTION: {
          if ("layout/fragment_successful_transaction_0".equals(tag)) {
            return new FragmentSuccessfulTransactionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_successful_transaction is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRANSACTION: {
          if ("layout/fragment_transaction_0".equals(tag)) {
            return new FragmentTransactionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_transaction is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRANSACTIONRECORD: {
          if ("layout/fragment_transaction_record_0".equals(tag)) {
            return new FragmentTransactionRecordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_transaction_record is invalid. Received: " + tag);
        }
        case  LAYOUT_TRANSACTIONRECORDITEM: {
          if ("layout/transaction_record_item_0".equals(tag)) {
            return new TransactionRecordItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for transaction_record_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TRANSFERAMOUNT: {
          if ("layout/transfer_amount_0".equals(tag)) {
            return new TransferAmountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for transfer_amount is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clicklistener");
      sKeys.put(2, "customer");
      sKeys.put(3, "customerViewmodel");
      sKeys.put(4, "transactionRecord");
      sKeys.put(5, "viewModel");
      sKeys.put(6, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_main_0", com.itsamankrsingh.bankingapp.R.layout.activity_main);
      sKeys.put("layout/customer_item_0", com.itsamankrsingh.bankingapp.R.layout.customer_item);
      sKeys.put("layout/fragment_customer_0", com.itsamankrsingh.bankingapp.R.layout.fragment_customer);
      sKeys.put("layout/fragment_details_0", com.itsamankrsingh.bankingapp.R.layout.fragment_details);
      sKeys.put("layout/fragment_home_0", com.itsamankrsingh.bankingapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_successful_transaction_0", com.itsamankrsingh.bankingapp.R.layout.fragment_successful_transaction);
      sKeys.put("layout/fragment_transaction_0", com.itsamankrsingh.bankingapp.R.layout.fragment_transaction);
      sKeys.put("layout/fragment_transaction_record_0", com.itsamankrsingh.bankingapp.R.layout.fragment_transaction_record);
      sKeys.put("layout/transaction_record_item_0", com.itsamankrsingh.bankingapp.R.layout.transaction_record_item);
      sKeys.put("layout/transfer_amount_0", com.itsamankrsingh.bankingapp.R.layout.transfer_amount);
    }
  }
}
