package com.google.android.gms.internal.play_billing;

import V0.p;
import com.amazon.a.a.o.b.f;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
final class zzbx {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbx(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(p.r(b.q("Multiple entries with same key: ", strValueOf, f.f16452b, strValueOf2, " and "), String.valueOf(obj3), f.f16452b, String.valueOf(obj)));
    }
}
