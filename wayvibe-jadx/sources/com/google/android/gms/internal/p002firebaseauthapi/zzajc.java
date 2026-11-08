package com.google.android.gms.internal.p002firebaseauthapi;

import B2.AbstractC0112b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzajc {
    public static zzaci zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbQ = b.q("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbQ.append(message);
        Log.e(str, sbQ.toString());
        return new zzaci(AbstractC0112b.h("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws JSONException {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
