package Z4;

import D8.C0314t0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0314t0 f13791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0979l f13793f;

    public C0982o(JSONObject jSONObject) throws JSONException {
        this.f13788a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f13789b = true == strOptString.isEmpty() ? null : strOptString;
        this.f13790c = jSONObject.getString("offerIdToken");
        this.f13791d = new C0314t0(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f13793f = jSONObjectOptJSONObject != null ? new C0979l(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString(com.amazon.a.a.o.b.f16393S);
            jSONObjectOptJSONObject2.optString("name");
            jSONObjectOptJSONObject2.optString(com.amazon.a.a.o.b.f16404c);
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        this.f13792e = arrayList;
    }
}
