// Generated by view binder compiler. Do not edit!
package com.mesflit.meslinux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mesflit.meslinux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button gentoo;

  @NonNull
  public final Button kalilinux;

  @NonNull
  public final TextView linuxdistrostext;

  @NonNull
  public final Button raspberrypi;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button gentoo,
      @NonNull Button kalilinux, @NonNull TextView linuxdistrostext, @NonNull Button raspberrypi) {
    this.rootView = rootView;
    this.gentoo = gentoo;
    this.kalilinux = kalilinux;
    this.linuxdistrostext = linuxdistrostext;
    this.raspberrypi = raspberrypi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gentoo;
      Button gentoo = ViewBindings.findChildViewById(rootView, id);
      if (gentoo == null) {
        break missingId;
      }

      id = R.id.kalilinux;
      Button kalilinux = ViewBindings.findChildViewById(rootView, id);
      if (kalilinux == null) {
        break missingId;
      }

      id = R.id.linuxdistrostext;
      TextView linuxdistrostext = ViewBindings.findChildViewById(rootView, id);
      if (linuxdistrostext == null) {
        break missingId;
      }

      id = R.id.raspberrypi;
      Button raspberrypi = ViewBindings.findChildViewById(rootView, id);
      if (raspberrypi == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, gentoo, kalilinux, linuxdistrostext,
          raspberrypi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
