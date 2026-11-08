package p043d6;

import O1.i;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p097i9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f19293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19294h;

    public c(String id, String idToken, String str, String str2, String str3, Uri uri, String str4) {
        m.f(id, "id");
        m.f(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super(bundle, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
        this.f19289c = idToken;
        this.f19290d = str;
        this.f19291e = str2;
        this.f19292f = str3;
        this.f19293g = uri;
        if (id.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
        List listJ0 = k.J0(idToken, new String[]{"."}, 6);
        if (listJ0.size() != 3) {
            throw new IllegalArgumentException("Invalid token format");
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listJ0.get(1), 8);
            m.c(bArrDecode);
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.e(UTF_8, "UTF_8");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, UTF_8));
            String strOptString = jSONObject.optString("email");
            strOptString = strOptString.length() == 0 ? null : strOptString;
            String strOptString2 = jSONObject.optString("sub");
            if ((strOptString2.length() != 0 ? strOptString2 : null) == null) {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
            this.f19294h = strOptString;
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
