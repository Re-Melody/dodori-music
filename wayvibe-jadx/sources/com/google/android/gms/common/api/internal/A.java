package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.d[] f17842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17844c;

    public A(H5.d[] dVarArr, boolean z10, int i10) {
        this.f17842a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f17843b = z11;
        this.f17844c = i10;
    }

    public static C1158z a() {
        C1158z c1158z = new C1158z();
        c1158z.f17961b = true;
        c1158z.f17960a = 0;
        return c1158z;
    }
}
