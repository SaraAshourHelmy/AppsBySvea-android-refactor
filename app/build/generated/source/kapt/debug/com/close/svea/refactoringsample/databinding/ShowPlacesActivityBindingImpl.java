package com.close.svea.refactoringsample.databinding;
import com.close.svea.refactoringsample.R;
import com.close.svea.refactoringsample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ShowPlacesActivityBindingImpl extends ShowPlacesActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button, 2);
        sViewsWithIds.put(R.id.message, 3);
        sViewsWithIds.put(R.id.places_recycler_view, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShowPlacesActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ShowPlacesActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            );
        this.parentLayout.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.close.svea.refactoringsample.ui.ShowPlacesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.close.svea.refactoringsample.ui.ShowPlacesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelHasVisibleProgressLiveData((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelHasVisibleProgressLiveData(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelHasVisibleProgressLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasVisibleProgressLiveDataGetValue = false;
        java.lang.Boolean viewModelHasVisibleProgressLiveDataGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelHasVisibleProgressLiveData = null;
        com.close.svea.refactoringsample.ui.ShowPlacesViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.hasVisibleProgressLiveData
                    viewModelHasVisibleProgressLiveData = viewModel.getHasVisibleProgressLiveData();
                }
                updateLiveDataRegistration(0, viewModelHasVisibleProgressLiveData);


                if (viewModelHasVisibleProgressLiveData != null) {
                    // read viewModel.hasVisibleProgressLiveData.getValue()
                    viewModelHasVisibleProgressLiveDataGetValue = viewModelHasVisibleProgressLiveData.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasVisibleProgressLiveData.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelHasVisibleProgressLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasVisibleProgressLiveDataGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.close.svea.refactoringsample.util.BindingAdapterUtilKt.setErrorVisibility(this.progress, androidxDatabindingViewDataBindingSafeUnboxViewModelHasVisibleProgressLiveDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.hasVisibleProgressLiveData
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}