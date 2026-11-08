package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {
    public static final Parcelable.Creator<y> CREATOR = new Z5.u(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14012d;

    public y(String str, String str2, String str3, long j10) {
        com.google.android.gms.common.internal.E.e(str);
        this.f14009a = str;
        this.f14010b = str2;
        this.f14011c = j10;
        com.google.android.gms.common.internal.E.e(str3);
        this.f14012d = str3;
    }

    public static y y(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new y(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"), jSONObject.optLong("enrollmentTimestamp"));
    }

    @Override // Z6.s
    public final String g() {
        return this.f14009a;
    }

    @Override // Z6.s
    public final String p() {
        return this.f14010b;
    }

    @Override // Z6.s
    public final long u() {
        return this.f14011c;
    }

    @Override // Z6.s
    public final String v() {
        return "phone";
    }

    @Override // Z6.s
    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f14009a);
            jSONObject.putOpt("displayName", this.f14010b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f14011c));
            jSONObject.putOpt("phoneNumber", this.f14012d);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f14009a, false);
        p242x0.c.W(parcel, 2, this.f14010b, false);
        p242x0.c.b0(parcel, 3, 8);
        parcel.writeLong(this.f14011c);
        p242x0.c.W(parcel, 4, this.f14012d, false);
        p242x0.c.d0(iC0, parcel);
    }
}
