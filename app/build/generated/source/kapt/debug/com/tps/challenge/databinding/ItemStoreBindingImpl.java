package com.tps.challenge.databinding;
import com.tps.challenge.R;
import com.tps.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStoreBindingImpl extends ItemStoreBinding implements com.tps.challenge.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemStoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.description.setTag(null);
        this.name.setTag(null);
        this.storeItemLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.tps.challenge.generated.callback.OnClickListener(this, 1);
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
        if (BR.clickListener == variableId) {
            setClickListener((com.tps.challenge.features.storefeed.IClickListener) variable);
        }
        else if (BR.storeItem == variableId) {
            setStoreItem((com.tps.challenge.network.model.StoreResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable com.tps.challenge.features.storefeed.IClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setStoreItem(@Nullable com.tps.challenge.network.model.StoreResponse StoreItem) {
        this.mStoreItem = StoreItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.storeItem);
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
        com.tps.challenge.features.storefeed.IClickListener clickListener = mClickListener;
        java.lang.String storeItemName = null;
        com.tps.challenge.network.model.StoreResponse storeItem = mStoreItem;
        java.lang.String storeItemDescription = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (storeItem != null) {
                    // read storeItem.name
                    storeItemName = storeItem.getName();
                    // read storeItem.description
                    storeItemDescription = storeItem.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, storeItemDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, storeItemName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.storeItemLayout.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        com.tps.challenge.features.storefeed.IClickListener clickListener = mClickListener;
        // storeItem
        com.tps.challenge.network.model.StoreResponse storeItem = mStoreItem;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onStoreItemClick(storeItem);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): storeItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}