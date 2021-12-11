package com.itsamankrsingh.bankingapp.databinding;
import com.itsamankrsingh.bankingapp.R;
import com.itsamankrsingh.bankingapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomerItemBindingImpl extends CustomerItemBinding implements com.itsamankrsingh.bankingapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linear_layout, 3);
        sViewsWithIds.put(R.id.circular_image_view, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CustomerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            );
        this.cardView.setTag(null);
        this.customerAccountNumberTv.setTag(null);
        this.customerNameTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.itsamankrsingh.bankingapp.generated.callback.OnClickListener(this, 1);
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
            setClicklistener((com.itsamankrsingh.bankingapp.ui.fragment.customer.CustomerItemClickListener) variable);
        }
        else if (BR.customer == variableId) {
            setCustomer((com.itsamankrsingh.bankingapp.database.Customer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClicklistener(@Nullable com.itsamankrsingh.bankingapp.ui.fragment.customer.CustomerItemClickListener Clicklistener) {
        this.mClicklistener = Clicklistener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clicklistener);
        super.requestRebind();
    }
    public void setCustomer(@Nullable com.itsamankrsingh.bankingapp.database.Customer Customer) {
        this.mCustomer = Customer;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.customer);
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
        com.itsamankrsingh.bankingapp.ui.fragment.customer.CustomerItemClickListener clicklistener = mClicklistener;
        java.lang.String customerCustomerAccountNumber = null;
        java.lang.String customerCustomerName = null;
        com.itsamankrsingh.bankingapp.database.Customer customer = mCustomer;

        if ((dirtyFlags & 0x6L) != 0) {



                if (customer != null) {
                    // read customer.customerAccountNumber
                    customerCustomerAccountNumber = customer.getCustomerAccountNumber();
                    // read customer.customerName
                    customerCustomerName = customer.getCustomerName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardView.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.customerAccountNumberTv, customerCustomerAccountNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.customerNameTv, customerCustomerName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clicklistener != null
        boolean clicklistenerJavaLangObjectNull = false;
        // clicklistener
        com.itsamankrsingh.bankingapp.ui.fragment.customer.CustomerItemClickListener clicklistener = mClicklistener;
        // customer
        com.itsamankrsingh.bankingapp.database.Customer customer = mCustomer;



        clicklistenerJavaLangObjectNull = (clicklistener) != (null);
        if (clicklistenerJavaLangObjectNull) {



            clicklistener.onClick(customer);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clicklistener
        flag 1 (0x2L): customer
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}