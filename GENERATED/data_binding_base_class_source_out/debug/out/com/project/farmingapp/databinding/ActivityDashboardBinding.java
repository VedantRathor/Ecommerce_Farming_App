// Generated by data binding compiler. Do not edit!
package com.project.farmingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.project.farmingapp.R;
import com.project.farmingapp.viewmodel.UserDataViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDashboardBinding extends ViewDataBinding {
  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navView;

  @Bindable
  protected UserDataViewModel mUserDataViewModel;

  protected ActivityDashboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DrawerLayout drawerLayout, NavigationView navView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.drawerLayout = drawerLayout;
    this.navView = navView;
  }

  public abstract void setUserDataViewModel(@Nullable UserDataViewModel userDataViewModel);

  @Nullable
  public UserDataViewModel getUserDataViewModel() {
    return mUserDataViewModel;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, null, false, component);
  }

  public static ActivityDashboardBinding bind(@NonNull View view) {
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
  public static ActivityDashboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDashboardBinding)bind(component, view, R.layout.activity_dashboard);
  }
}
