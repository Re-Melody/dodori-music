package Z4;

import B2.AbstractC0112b;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13816e;

    public z(String str) {
        this.f13812a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f13813b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f13814c = strOptString;
        this.f13815d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f13816e = jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return TextUtils.equals(this.f13812a, ((z) obj).f13812a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13812a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f13813b);
        sb.append("', productType='");
        sb.append(this.f13814c);
        sb.append("', statusCode=");
        return AbstractC0112b.i(sb, this.f13815d, "}");
    }
}
