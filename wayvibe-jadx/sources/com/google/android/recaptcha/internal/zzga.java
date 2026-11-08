package com.google.android.recaptcha.internal;

import N8.s;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!m.b(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? N8.m.e0(objArr) : s.f8650a);
        return true;
    }
}
