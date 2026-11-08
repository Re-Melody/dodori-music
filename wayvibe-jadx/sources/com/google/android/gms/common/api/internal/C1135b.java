package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1135b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f17911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f17912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17913d;

    public C1135b(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f17911b = iVar;
        this.f17912c = eVar;
        this.f17913d = str;
        this.f17910a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1135b)) {
            return false;
        }
        C1135b c1135b = (C1135b) obj;
        return com.google.android.gms.common.internal.E.k(this.f17911b, c1135b.f17911b) && com.google.android.gms.common.internal.E.k(this.f17912c, c1135b.f17912c) && com.google.android.gms.common.internal.E.k(this.f17913d, c1135b.f17913d);
    }

    public final int hashCode() {
        return this.f17910a;
    }
}
