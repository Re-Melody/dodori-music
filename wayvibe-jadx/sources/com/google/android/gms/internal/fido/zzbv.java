package com.google.android.gms.internal.fido;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
final class zzbv {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(p.o("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
