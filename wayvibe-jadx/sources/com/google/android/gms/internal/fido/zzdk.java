package com.google.android.gms.internal.fido;

import B2.AbstractC0112b;
import V0.p;

/* JADX INFO: loaded from: classes.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzdk(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return AbstractC0112b.l(p.t(name, "/"), this.zza, "[", cls.getName(), "]");
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z10, boolean z11) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
