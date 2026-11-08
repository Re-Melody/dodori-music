package com.google.android.gms.internal.common;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(AbstractC0112b.k(new StringBuilder(String.valueOf(i11).length() + 9), "at index ", i11));
            }
        }
        return objArr;
    }
}
