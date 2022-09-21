// Generated by data binding compiler. Do not edit!
package com.tps.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tps.challenge.R;
import com.tps.challenge.network.model.StoreResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemStoreBinding extends ViewDataBinding {
  @NonNull
  public final TextView description;

  @NonNull
  public final TextView name;

  @Bindable
  protected StoreResponse mStoreItem;

  protected ItemStoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView description, TextView name) {
    super(_bindingComponent, _root, _localFieldCount);
    this.description = description;
    this.name = name;
  }

  public abstract void setStoreItem(@Nullable StoreResponse storeItem);

  @Nullable
  public StoreResponse getStoreItem() {
    return mStoreItem;
  }

  @NonNull
  public static ItemStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_store, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemStoreBinding>inflateInternal(inflater, R.layout.item_store, root, attachToRoot, component);
  }

  @NonNull
  public static ItemStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_store, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemStoreBinding>inflateInternal(inflater, R.layout.item_store, null, false, component);
  }

  public static ItemStoreBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemStoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemStoreBinding)bind(component, view, R.layout.item_store);
  }
}
