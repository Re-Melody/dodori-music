package Z4;

import org.json.JSONObject;

/* JADX INFO: renamed from: Z4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0972e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13755a;

    public C0972e(String str) {
        this.f13755a = new JSONObject(str).optString("countryCode");
    }
}
