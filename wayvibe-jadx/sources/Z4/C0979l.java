package Z4;

import org.json.JSONObject;

/* JADX INFO: renamed from: Z4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13774b;

    public C0979l(JSONObject jSONObject) {
        this.f13773a = jSONObject.getInt("commitmentPaymentsCount");
        this.f13774b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
