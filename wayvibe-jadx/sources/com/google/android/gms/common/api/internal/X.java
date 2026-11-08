package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class X extends com.google.android.gms.common.api.x implements com.google.android.gms.common.api.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X f17903a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17904b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f17905c;

    public X(WeakReference weakReference) {
        com.google.android.gms.common.internal.E.i(weakReference, "GoogleApiClient reference must not be null");
        this.f17905c = weakReference;
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) weakReference.get();
        new W(this, qVar != null ? ((J) qVar).f17874b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f17904b) {
            synchronized (this.f17904b) {
            }
        }
    }
}
