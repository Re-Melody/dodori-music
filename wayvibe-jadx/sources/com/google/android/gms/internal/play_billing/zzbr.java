package com.google.android.gms.internal.play_billing;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
final class zzbr {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(p.o("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
