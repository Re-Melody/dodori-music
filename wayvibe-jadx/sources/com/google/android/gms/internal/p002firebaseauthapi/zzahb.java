package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.E;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahb implements zzaes {
    private String zza = zzagz.REFRESH_TOKEN.toString();
    private String zzb;

    public zzahb(String str) {
        E.e(str);
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
