package Z4;

import B2.AbstractC0112b;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f13795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f13803j;
    public final ArrayList k;

    public C0983p(String str) {
        this.f13794a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f13795b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f13796c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f13797d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f13798e = jSONObject.optString(com.amazon.a.a.o.b.f16393S);
        this.f13799f = jSONObject.optString("name");
        this.f13800g = jSONObject.optString(com.amazon.a.a.o.b.f16404c);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString(com.amazon.a.a.o.b.f16411j);
        this.f13801h = jSONObject.optString("skuDetailsToken");
        this.f13802i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new C0982o(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f13803j = arrayList;
        } else {
            this.f13803j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f13795b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f13795b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new C0980m(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.k = null;
        } else {
            arrayList2.add(new C0980m(jSONObjectOptJSONObject));
            this.k = arrayList2;
        }
    }

    public final C0980m a() {
        ArrayList arrayList = this.k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C0980m) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0983p) {
            return TextUtils.equals(this.f13794a, ((C0983p) obj).f13794a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13794a.hashCode();
    }

    public final String toString() {
        String string = this.f13795b.toString();
        String strValueOf = String.valueOf(this.f13803j);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        V0.p.y(sb, this.f13794a, "', parsedJson=", string, ", productId='");
        sb.append(this.f13796c);
        sb.append("', productType='");
        sb.append(this.f13797d);
        sb.append("', title='");
        sb.append(this.f13798e);
        sb.append("', productDetailsToken='");
        return AbstractC0112b.l(sb, this.f13801h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
