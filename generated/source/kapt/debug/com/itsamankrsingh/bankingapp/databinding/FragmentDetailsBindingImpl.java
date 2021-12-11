package com.itsamankrsingh.bankingapp.databinding;
import com.itsamankrsingh.bankingapp.R;
import com.itsamankrsingh.bankingapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.details_image_view, 1);
        sViewsWithIds.put(R.id.name_linear_layout, 2);
        sViewsWithIds.put(R.id.details_customer_name_text_view, 3);
        sViewsWithIds.put(R.id.account_number_linear_layout, 4);
        sViewsWithIds.put(R.id.details_account_number_text_view, 5);
        sViewsWithIds.put(R.id.email_linear_layout, 6);
        sViewsWithIds.put(R.id.details_email_text_view, 7);
        sViewsWithIds.put(R.id.ifsc_linear_layout, 8);
        sViewsWithIds.put(R.id.details_ifsc_text_view, 9);
        sViewsWithIds.put(R.id.mobile_number_linear_layout, 10);
        sViewsWithIds.put(R.id.details_mobile_number_text_view, 11);
        sViewsWithIds.put(R.id.account_balance_linear_layout, 12);
        sViewsWithIds.put(R.id.details_account_balance_text_view, 13);
        sViewsWithIds.put(R.id.transfer_button, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[13]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[11]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.Button) bindings[14]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}