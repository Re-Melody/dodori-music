package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.C0997b;
import Z6.C0999d;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.E;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final C0999d zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(f.f16451a);
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i10 = 2; i10 <= 7 && !Log.isLoggable(zza, i10); i10++) {
        }
    }

    public zzagp(C0999d c0999d, String str, String str2) {
        E.h(c0999d);
        this.zzd = c0999d;
        String str3 = c0999d.f13974a;
        E.e(str3);
        this.zzb = str3;
        String str4 = c0999d.f13976c;
        E.e(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        C0997b c0997b;
        String str = this.zzc;
        zzan zzanVar = C0997b.f13970d;
        E.e(str);
        try {
            c0997b = new C0997b(str);
        } catch (IllegalArgumentException unused) {
            c0997b = null;
        }
        String str2 = c0997b != null ? c0997b.f13971a : null;
        String str3 = c0997b != null ? c0997b.f13973c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajc.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0999d zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
