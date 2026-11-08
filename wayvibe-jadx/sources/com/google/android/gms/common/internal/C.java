package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f17987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1164f f17989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f17991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC1164f f17992f;

    public C(AbstractC1164f abstractC1164f, int i10, Bundle bundle) {
        this.f17992f = abstractC1164f;
        Boolean bool = Boolean.TRUE;
        this.f17989c = abstractC1164f;
        this.f17987a = bool;
        this.f17988b = false;
        this.f17990d = i10;
        this.f17991e = bundle;
    }

    public abstract boolean a();

    public abstract void b(H5.b bVar);
}
