package com.google.android.gms.internal.p002firebaseauthapi;

import O5.a;
import com.amazon.a.a.o.c.a.b;
import com.google.android.gms.common.internal.E;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzahoVarZzb = zzb(str);
        return zzahoVarZzb.zza().longValue() - zzahoVarZzb.zzb().longValue();
    }

    private static zzaho zzb(String str) {
        E.e(str);
        List<String> listZza = zzv.zza(b.f16463a).zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(p134m1.b.k("Invalid idToken ", str));
        }
        try {
            return zzaho.zza(new String(a.b(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }
}
