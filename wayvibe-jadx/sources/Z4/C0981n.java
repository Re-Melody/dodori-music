package Z4;

import org.json.JSONObject;

/* JADX INFO: renamed from: Z4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13787f;

    public C0981n(JSONObject jSONObject) {
        this.f13785d = jSONObject.optString("billingPeriod");
        this.f13784c = jSONObject.optString("priceCurrencyCode");
        this.f13782a = jSONObject.optString("formattedPrice");
        this.f13783b = jSONObject.optLong("priceAmountMicros");
        this.f13787f = jSONObject.optInt("recurrenceMode");
        this.f13786e = jSONObject.optInt("billingCycleCount");
    }
}
