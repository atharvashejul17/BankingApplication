package com.itsamankrsingh.bankingapp.databinding;
import com.itsamankrsingh.bankingapp.R;
import com.itsamankrsingh.bankingapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSuccessfulTransactionBindingImpl extends FragmentSuccessfulTransactionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title, 7);
        sViewsWithIds.put(R.id.sender_info, 8);
        sViewsWithIds.put(R.id.title_sender_info, 9);
        sViewsWithIds.put(R.id.name_linear_layout, 10);
        sViewsWithIds.put(R.id.account_number_linear_layout, 11);
        sViewsWithIds.put(R.id.account_balance_linear_layout, 12);
        sViewsWithIds.put(R.id.receiver_info, 13);
        sViewsWithIds.put(R.id.title_receiver_info, 14);
        sViewsWithIds.put(R.id.receiver_name_linear_layout, 15);
        sViewsWithIds.put(R.id.receiver_account_number_linear_layout, 16);
        sViewsWithIds.put(R.id.receiver_account_balance_linear_layout, 17);
        sViewsWithIds.put(R.id.amount_linear_layout, 18);
        sViewsWithIds.put(R.id.transferred_amount_text_view, 19);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSuccessfulTransactionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentSuccessfulTransactionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (android.widget.LinearLayout) bindings[16]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[15]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[14]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[19]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.receiverAccountBalanceTextView.setTag(null);
        this.receiverAccountNumberTextView.setTag(null);
        this.receiverCustomerNameTextView.setTag(null);
        this.senderAccountBalanceTextView.setTag(null);
        this.senderAccountNumberTextView.setTag(null);
        this.senderCustomerNameTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.customerViewmodel == variableId) {
            setCustomerViewmodel((com.itsamankrsingh.bankingapp.ui.fragment.successfulTransaction.SuccessfulTransactionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCustomerViewmodel(@Nullable com.itsamankrsingh.bankingapp.ui.fragment.successfulTransaction.SuccessfulTransactionViewModel CustomerViewmodel) {
        this.mCustomerViewmodel = CustomerViewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.customerViewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCustomerViewmodelSenderCustomer((androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer>) object, fieldId);
            case 1 :
                return onChangeCustomerViewmodelReceiverCustomer((androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCustomerViewmodelSenderCustomer(androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer> CustomerViewmodelSenderCustomer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCustomerViewmodelReceiverCustomer(androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer> CustomerViewmodelReceiverCustomer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String customerViewmodelSenderCustomerCustomerName = null;
        java.lang.String customerViewmodelReceiverCustomerCustomerName = null;
        int customerViewmodelReceiverCustomerAccountBalance = 0;
        java.lang.String integerToStringCustomerViewmodelSenderCustomerAccountBalance = null;
        java.lang.String customerViewmodelSenderCustomerCustomerAccountNumber = null;
        androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer> customerViewmodelSenderCustomer = null;
        com.itsamankrsingh.bankingapp.ui.fragment.successfulTransaction.SuccessfulTransactionViewModel customerViewmodel = mCustomerViewmodel;
        androidx.lifecycle.LiveData<com.itsamankrsingh.bankingapp.database.Customer> customerViewmodelReceiverCustomer = null;
        java.lang.String customerViewmodelReceiverCustomerCustomerAccountNumber = null;
        com.itsamankrsingh.bankingapp.database.Customer customerViewmodelReceiverCustomerGetValue = null;
        com.itsamankrsingh.bankingapp.database.Customer customerViewmodelSenderCustomerGetValue = null;
        int customerViewmodelSenderCustomerAccountBalance = 0;
        java.lang.String integerToStringCustomerViewmodelReceiverCustomerAccountBalance = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (customerViewmodel != null) {
                        // read customerViewmodel.senderCustomer
                        customerViewmodelSenderCustomer = customerViewmodel.getSenderCustomer();
                    }
                    updateLiveDataRegistration(0, customerViewmodelSenderCustomer);


                    if (customerViewmodelSenderCustomer != null) {
                        // read customerViewmodel.senderCustomer.getValue()
                        customerViewmodelSenderCustomerGetValue = customerViewmodelSenderCustomer.getValue();
                    }


                    if (customerViewmodelSenderCustomerGetValue != null) {
                        // read customerViewmodel.senderCustomer.getValue().customerName
                        customerViewmodelSenderCustomerCustomerName = customerViewmodelSenderCustomerGetValue.getCustomerName();
                        // read customerViewmodel.senderCustomer.getValue().customerAccountNumber
                        customerViewmodelSenderCustomerCustomerAccountNumber = customerViewmodelSenderCustomerGetValue.getCustomerAccountNumber();
                        // read customerViewmodel.senderCustomer.getValue().accountBalance
                        customerViewmodelSenderCustomerAccountBalance = customerViewmodelSenderCustomerGetValue.getAccountBalance();
                    }


                    // read Integer.toString(customerViewmodel.senderCustomer.getValue().accountBalance)
                    integerToStringCustomerViewmodelSenderCustomerAccountBalance = java.lang.Integer.toString(customerViewmodelSenderCustomerAccountBalance);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (customerViewmodel != null) {
                        // read customerViewmodel.receiverCustomer
                        customerViewmodelReceiverCustomer = customerViewmodel.getReceiverCustomer();
                    }
                    updateLiveDataRegistration(1, customerViewmodelReceiverCustomer);


                    if (customerViewmodelReceiverCustomer != null) {
                        // read customerViewmodel.receiverCustomer.getValue()
                        customerViewmodelReceiverCustomerGetValue = customerViewmodelReceiverCustomer.getValue();
                    }


                    if (customerViewmodelReceiverCustomerGetValue != null) {
                        // read customerViewmodel.receiverCustomer.getValue().customerName
                        customerViewmodelReceiverCustomerCustomerName = customerViewmodelReceiverCustomerGetValue.getCustomerName();
                        // read customerViewmodel.receiverCustomer.getValue().accountBalance
                        customerViewmodelReceiverCustomerAccountBalance = customerViewmodelReceiverCustomerGetValue.getAccountBalance();
                        // read customerViewmodel.receiverCustomer.getValue().customerAccountNumber
                        customerViewmodelReceiverCustomerCustomerAccountNumber = customerViewmodelReceiverCustomerGetValue.getCustomerAccountNumber();
                    }


                    // read Integer.toString(customerViewmodel.receiverCustomer.getValue().accountBalance)
                    integerToStringCustomerViewmodelReceiverCustomerAccountBalance = java.lang.Integer.toString(customerViewmodelReceiverCustomerAccountBalance);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.receiverAccountBalanceTextView, integerToStringCustomerViewmodelReceiverCustomerAccountBalance);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.receiverAccountNumberTextView, customerViewmodelReceiverCustomerCustomerAccountNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.receiverCustomerNameTextView, customerViewmodelReceiverCustomerCustomerName);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.senderAccountBalanceTextView, integerToStringCustomerViewmodelSenderCustomerAccountBalance);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.senderAccountNumberTextView, customerViewmodelSenderCustomerCustomerAccountNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.senderCustomerNameTextView, customerViewmodelSenderCustomerCustomerName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): customerViewmodel.senderCustomer
        flag 1 (0x2L): customerViewmodel.receiverCustomer
        flag 2 (0x3L): customerViewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}