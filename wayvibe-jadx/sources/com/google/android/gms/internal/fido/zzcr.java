package com.google.android.gms.internal.fido;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzcr {
    public static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(b.j(i10, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
