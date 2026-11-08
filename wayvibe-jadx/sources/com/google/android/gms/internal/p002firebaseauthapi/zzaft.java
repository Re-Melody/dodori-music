package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.w;
import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class zzaft {
    private static final Map<String, zzafv> zza = new C2230e(0);

    public static w zza(String str, w wVar, zzaex zzaexVar) {
        zza(str, zzaexVar);
        return new zzafs(wVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaex zzaexVar) {
        zza.put(str, new zzafv(zzaexVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, w wVar, Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (map.containsKey(str)) {
            zzafv zzafvVar = map.get(str);
            if (System.currentTimeMillis() - zzafvVar.zzb < 120000) {
                zzaex zzaexVar = zzafvVar.zza;
                if (zzaexVar == null) {
                    return true;
                }
                zzaexVar.zza(wVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
