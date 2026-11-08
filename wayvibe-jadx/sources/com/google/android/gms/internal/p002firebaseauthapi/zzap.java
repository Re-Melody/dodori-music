package com.google.android.gms.internal.p002firebaseauthapi;

import V0.p;
import com.amazon.a.a.o.b.f;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzap(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(p.r(b.q("Multiple entries with same key: ", strValueOf, f.f16452b, strValueOf2, " and "), String.valueOf(this.zza), f.f16452b, String.valueOf(this.zzc)));
    }
}
