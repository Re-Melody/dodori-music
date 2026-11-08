package com.google.android.gms.internal.p002firebaseauthapi;

import V0.p;
import W6.h;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p134m1.b;
import p217u7.c;
import p217u7.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final h zzd;
    private boolean zze;
    private String zzf;

    public zzaew(Context context, h hVar, String str) {
        this.zze = false;
        E.h(context);
        this.zza = context;
        E.h(hVar);
        this.zzd = hVar;
        this.zzc = b.k("Android/Fallback/", str);
    }

    private static String zza(h hVar) {
        if (FirebaseAuth.getInstance(hVar).f18510v.get() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    private static String zzb(h hVar) {
        e eVar = (e) FirebaseAuth.getInstance(hVar).f18511w.get();
        if (eVar != null) {
            try {
                return (String) Tasks.await(((c) eVar).a());
            } catch (InterruptedException | ExecutionException e2) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e2.getMessage());
            }
        }
        return null;
    }

    public final void zza(URLConnection uRLConnection) {
        String strN;
        if (this.zze) {
            strN = p.n(this.zzc, "/FirebaseUI-Android");
        } else {
            strN = p.n(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strN);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        h hVar = this.zzd;
        hVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", hVar.f12866c.f12875b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaew(h hVar, String str) {
        this(hVar.f12864a, hVar, str);
        hVar.a();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
