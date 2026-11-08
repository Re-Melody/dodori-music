package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18013c;

    public N(String str, String str2, boolean z10) {
        E.e(str);
        this.f18011a = str;
        E.e(str2);
        this.f18012b = str2;
        this.f18013c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return E.k(this.f18011a, n6.f18011a) && E.k(this.f18012b, n6.f18012b) && E.k(null, null) && this.f18013c == n6.f18013c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18011a, this.f18012b, null, 4225, Boolean.valueOf(this.f18013c)});
    }

    public final String toString() {
        String str = this.f18011a;
        if (str != null) {
            return str;
        }
        E.h(null);
        throw null;
    }
}
