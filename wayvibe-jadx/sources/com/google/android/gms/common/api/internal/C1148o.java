package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1148o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17951b;

    public C1148o(Object obj, String str) {
        this.f17950a = obj;
        this.f17951b = str;
    }

    public final String a() {
        return this.f17951b + "@" + System.identityHashCode(this.f17950a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148o)) {
            return false;
        }
        C1148o c1148o = (C1148o) obj;
        return this.f17950a == c1148o.f17950a && this.f17951b.equals(c1148o.f17951b);
    }

    public final int hashCode() {
        return this.f17951b.hashCode() + (System.identityHashCode(this.f17950a) * 31);
    }
}
