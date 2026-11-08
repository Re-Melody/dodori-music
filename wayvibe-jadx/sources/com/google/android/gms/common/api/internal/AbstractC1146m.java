package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractC1083h0;
import androidx.fragment.app.C1068a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1146m {
    protected final InterfaceC1147n mLifecycleFragment;

    public AbstractC1146m(InterfaceC1147n interfaceC1147n) {
        this.mLifecycleFragment = interfaceC1147n;
    }

    public static InterfaceC1147n getFragment(Activity activity) {
        return getFragment(new C1145l(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityC = this.mLifecycleFragment.c();
        com.google.android.gms.common.internal.E.h(activityC);
        return activityC;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public abstract void onStop();

    public static InterfaceC1147n getFragment(C1145l c1145l) {
        g0 g0Var;
        h0 h0Var;
        Activity activity = c1145l.f17949a;
        if (!(activity instanceof androidx.fragment.app.K)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = g0.f17928b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (g0Var = (g0) weakReference.get()) != null) {
                return g0Var;
            }
            try {
                g0 g0Var2 = (g0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (g0Var2 == null || g0Var2.isRemoving()) {
                    g0Var2 = new g0();
                    activity.getFragmentManager().beginTransaction().add(g0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(g0Var2));
                return g0Var2;
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            }
        }
        androidx.fragment.app.K k = (androidx.fragment.app.K) activity;
        WeakHashMap weakHashMap2 = h0.f17930b;
        AbstractC1083h0 supportFragmentManager = k.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = h0.f17930b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(k);
        if (weakReference2 != null && (h0Var = (h0) weakReference2.get()) != null) {
            return h0Var;
        }
        try {
            h0 h0Var2 = (h0) supportFragmentManager.C("SLifecycleFragmentImpl");
            if (h0Var2 == null || h0Var2.isRemoving()) {
                h0Var2 = new h0();
                C1068a c1068a = new C1068a(supportFragmentManager);
                c1068a.e(0, h0Var2, "SLifecycleFragmentImpl");
                c1068a.d(true);
            }
            weakHashMap3.put(k, new WeakReference(h0Var2));
            return h0Var2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e4);
        }
    }

    public static InterfaceC1147n getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
