// Generated by view binder compiler. Do not edit!
package com.itsamankrsingh.bankingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.itsamankrsingh.bankingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SplashScreenBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView appName;

  @NonNull
  public final TextView designed;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView name;

  private SplashScreenBinding(@NonNull RelativeLayout rootView, @NonNull TextView appName,
      @NonNull TextView designed, @NonNull ImageView logo, @NonNull TextView name) {
    this.rootView = rootView;
    this.appName = appName;
    this.designed = designed;
    this.logo = logo;
    this.name = name;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SplashScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SplashScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.splash_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SplashScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_name;
      TextView appName = rootView.findViewById(id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.designed;
      TextView designed = rootView.findViewById(id);
      if (designed == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = rootView.findViewById(id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      return new SplashScreenBinding((RelativeLayout) rootView, appName, designed, logo, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
