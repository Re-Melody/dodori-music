package p011a7;

import K5.a;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.a.a.o.c.a.b;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14279a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objC = jSONArray.get(i10);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        E.e(str);
        List<String> listZza = zzv.zza(b.f16463a).zza((CharSequence) str);
        int size = listZza.size();
        a aVar = f14279a;
        if (size < 2) {
            aVar.c(p134m1.b.k("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            C2230e c2230eD = d(new String(O5.a.b(listZza.get(1)), "UTF-8"));
            return c2230eD == null ? new HashMap() : c2230eD;
        } catch (UnsupportedEncodingException e2) {
            aVar.b("Unable to decode token", e2, new Object[0]);
            return new HashMap();
        }
    }

    public static C2230e c(JSONObject jSONObject) throws JSONException {
        C2230e c2230e = new C2230e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            c2230e.put(next, objC);
        }
        return c2230e;
    }

    public static C2230e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e2);
        }
    }
}
