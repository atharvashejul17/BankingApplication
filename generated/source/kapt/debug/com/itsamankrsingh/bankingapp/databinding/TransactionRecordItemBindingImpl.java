package com.itsamankrsingh.bankingapp.databinding;
import com.itsamankrsingh.bankingapp.R;
import com.itsamankrsingh.bankingapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TransactionRecordItemBindingImpl extends TransactionRecordItemBinding implements com.itsamankrsingh.bankingapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.from_linear_layout, 6);
        sViewsWithIds.put(R.id.to_linear_layout, 7);
        sViewsWithIds.put(R.id.transfer_amount_linear_layout, 8);
        sViewsWithIds.put(R.id.transfer_status_linear_layout, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TransactionRecordItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private TransactionRecordItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (android.widget.LinearLayout) bindings[7]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.LinearLayout) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            );
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.senderCustomerNameTextView.setTag(null);
        this.toCustomerNameTextView.setTag(null);
        this.transactionRecordCardView.setTag(null);
        this.transferAmountRecordTextView.setTag(null);
        this.transferStatusRecordTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.itsamankrsingh.bankingapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.clicklistener == variableId) {
            setClicklistener((com.itsamankrsingh.bankingapp.ui.fragment.transactionRecord.TransactionRecordClickListener) variable);
        }
        else if (BR.transactionRecord == variableId) {
            setTransactionRecord((com.itsamankrsingh.bankingapp.database.TransactionRecord) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClicklistener(@Nullable com.itsamankrsingh.bankingapp.ui.fragment.transactionRecord.TransactionRecordClickListener Clicklistener) {
        this.mClicklistener = Clicklistener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clicklistener);
        super.requestRebind();
    }
    public void setTransactionRecord(@Nullable com.itsamankrsingh.bankingapp.database.TransactionRecord TransactionRecord) {
        this.mTransactionRecord = TransactionRecord;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.transactionRecord);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String integerToStringTransactionRecordTransferredAmount = null;
        int transactionRecordTransferredAmount = 0;
        int transactionRecordStatusMboundView1AndroidColorGreenMboundView1AndroidColorRed = 0;
        java.lang.String transactionRecordStatusTransferStatusRecordTextViewAndroidStringSuccessTransferStatusRecordTextViewAndroidStringFailure = null;
        java.lang.String transactionRecordSenderCustomerName = null;
        com.itsamankrsingh.bankingapp.ui.fragment.transactionRecord.TransactionRecordClickListener clicklistener = mClicklistener;
        java.lang.String transactionRecordReceiverCustomerName = null;
        boolean transactionRecordStatus = false;
        com.itsamankrsingh.bankingapp.database.TransactionRecord transactionRecord = mTransactionRecord;

        if ((dirtyFlags & 0x6L) != 0) {



                if (transactionRecord != null) {
                    // read transactionRecord.transferredAmount
                    transactionRecordTransferredAmount = transactionRecord.getTransferredAmount();
                    // read transactionRecord.senderCustomerName
                    transactionRecordSenderCustomerName = transactionRecord.getSenderCustomerName();
                    // read transactionRecord.receiverCustomerName
                    transactionRecordReceiverCustomerName = transactionRecord.getReceiverCustomerName();
                    // read transactionRecord.status
                    transactionRecordStatus = transactionRecord.getStatus();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(transactionRecordStatus) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read Integer.toString(transactionRecord.transferredAmount)
                integerToStringTransactionRecordTransferredAmount = java.lang.Integer.toString(transactionRecordTransferredAmount);
                // read transactionRecord.status ? @android:color/green : @android:color/red
                transactionRecordStatusMboundView1AndroidColorGreenMboundView1AndroidColorRed = ((transactionRecordStatus) ? (getColorFromResource(mboundView1, R.color.green)) : (getColorFromResource(mboundView1, R.color.red)));
                // read transactionRecord.status ? @android:string/success : @android:string/failure
                transactionRecordStatusTransferStatusRecordTextViewAndroidStringSuccessTransferStatusRecordTextViewAndroidStringFailure = ((transactionRecordStatus) ? (transferStatusRecordTextView.getResources().getString(R.string.success)) : (transferStatusRecordTextView.getResources().getString(R.string.failure)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, androidx.databinding.adapters.Converters.convertColorToDrawable(transactionRecordStatusMboundView1AndroidColorGreenMboundView1AndroidColorRed));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.senderCustomerNameTextView, transactionRecordSenderCustomerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toCustomerNameTextView, transactionRecordReceiverCustomerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transferAmountRecordTextView, integerToStringTransactionRecordTransferredAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transferStatusRecordTextView, transactionRecordStatusTransferStatusRecordTextViewAndroidStringSuccessTransferStatusRecordTextViewAndroidStringFailure);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.transactionRecordCardView.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clicklistener != null
        boolean clicklistenerJavaLangObjectNull = false;
        // clicklistener
        com.itsamankrsingh.bankingapp.ui.fragment.transactionRecord.TransactionRecordClickListener clicklistener = mClicklistener;
        // transactionRecord
        com.itsamankrsingh.bankingapp.database.TransactionRecord transactionRecord = mTransactionRecord;



        clicklistenerJavaLangObjectNull = (clicklistener) != (null);
        if (clicklistenerJavaLangObjectNull) {



            clicklistener.onClick(transactionRecord);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clicklistener
        flag 1 (0x2L): transactionRecord
        flag 2 (0x3L): null
        flag 3 (0x4L): transactionRecord.status ? @android:color/green : @android:color/red
        flag 4 (0x5L): transactionRecord.status ? @android:color/green : @android:color/red
        flag 5 (0x6L): transactionRecord.status ? @android:string/success : @android:string/failure
        flag 6 (0x7L): transactionRecord.status ? @android:string/success : @android:string/failure
    flag mapping end*/
    //end
}