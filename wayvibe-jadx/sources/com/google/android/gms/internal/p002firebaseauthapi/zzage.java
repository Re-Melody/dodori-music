package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.E;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzage {
    private final String zza;

    public zzage(String str) {
        E.e(str);
        this.zza = str;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
