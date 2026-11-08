package com.google.android.gms.internal.play_billing;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(b.j(i11, "at index "));
            }
        }
        return objArr;
    }
}
