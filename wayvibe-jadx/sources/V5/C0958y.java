package V5;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.fido.zzbl;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: V5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958y extends AbstractC0946l {
    public static final Parcelable.Creator<C0958y> CREATOR = new H5.m(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f12698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f12701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0947m f12703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f12704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f12705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EnumC0939e f12706j;
    public final C0940f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f12707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ResultReceiver f12708m;

    public C0958y(C c3, F f10, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, C0947m c0947m, Integer num, L l10, String str, C0940f c0940f, String str2, ResultReceiver resultReceiver) {
        this.f12708m = resultReceiver;
        if (str2 != null) {
            try {
                C0958y c0958yA = a(new JSONObject(str2));
                this.f12697a = c0958yA.f12697a;
                this.f12698b = c0958yA.f12698b;
                this.f12699c = c0958yA.f12699c;
                this.f12700d = c0958yA.f12700d;
                this.f12701e = c0958yA.f12701e;
                this.f12702f = c0958yA.f12702f;
                this.f12703g = c0958yA.f12703g;
                this.f12704h = c0958yA.f12704h;
                this.f12705i = c0958yA.f12705i;
                this.f12706j = c0958yA.f12706j;
                this.k = c0958yA.k;
                this.f12707l = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        com.google.android.gms.common.internal.E.h(c3);
        this.f12697a = c3;
        com.google.android.gms.common.internal.E.h(f10);
        this.f12698b = f10;
        com.google.android.gms.common.internal.E.h(bArr);
        this.f12699c = bArr;
        com.google.android.gms.common.internal.E.h(arrayList);
        this.f12700d = arrayList;
        this.f12701e = d10;
        this.f12702f = arrayList2;
        this.f12703g = c0947m;
        this.f12704h = num;
        this.f12705i = l10;
        if (str != null) {
            try {
                this.f12706j = EnumC0939e.a(str);
            } catch (C0938d e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            this.f12706j = null;
        }
        this.k = c0940f;
        this.f12707l = null;
    }

    public static C0958y a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        C0947m c0947m;
        EnumC0939e enumC0939eA;
        zzbl zzblVarZzc;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        C c3 = new C(jSONObject2.getString(DiagnosticsEntry.ID_KEY), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        F f10 = new F(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), O5.a.b(jSONObject3.getString(DiagnosticsEntry.ID_KEY)));
        byte[] bArrB = O5.a.b(jSONObject.getString("challenge"));
        com.google.android.gms.common.internal.E.h(bArrB);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                zzblVarZzc = zzbl.zzd(new A(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList2.add(zzblVarZzc.zza());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList3.add(C0959z.a(jSONArray2.getJSONObject(i11)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            c0947m = new C0947m(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        } else {
            c0947m = null;
        }
        C0940f c0940fA = jSONObject.has("extensions") ? C0940f.a(jSONObject.getJSONObject("extensions")) : null;
        if (jSONObject.has("attestation")) {
            try {
                enumC0939eA = EnumC0939e.a(jSONObject.getString("attestation"));
            } catch (C0938d e2) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e2);
                enumC0939eA = EnumC0939e.NONE;
            }
        } else {
            enumC0939eA = null;
        }
        return new C0958y(c3, f10, bArrB, arrayList2, dValueOf, arrayList, c0947m, null, null, enumC0939eA != null ? enumC0939eA.toString() : null, c0940fA, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0958y)) {
            return false;
        }
        C0958y c0958y = (C0958y) obj;
        if (!com.google.android.gms.common.internal.E.k(this.f12697a, c0958y.f12697a) || !com.google.android.gms.common.internal.E.k(this.f12698b, c0958y.f12698b) || !Arrays.equals(this.f12699c, c0958y.f12699c) || !com.google.android.gms.common.internal.E.k(this.f12701e, c0958y.f12701e)) {
            return false;
        }
        ArrayList arrayList = this.f12700d;
        ArrayList arrayList2 = c0958y.f12700d;
        if (!arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList)) {
            return false;
        }
        ArrayList arrayList3 = this.f12702f;
        ArrayList arrayList4 = c0958y.f12702f;
        return ((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && com.google.android.gms.common.internal.E.k(this.f12703g, c0958y.f12703g) && com.google.android.gms.common.internal.E.k(this.f12704h, c0958y.f12704h) && com.google.android.gms.common.internal.E.k(this.f12705i, c0958y.f12705i) && com.google.android.gms.common.internal.E.k(this.f12706j, c0958y.f12706j) && com.google.android.gms.common.internal.E.k(this.k, c0958y.k) && com.google.android.gms.common.internal.E.k(this.f12707l, c0958y.f12707l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12697a, this.f12698b, Integer.valueOf(Arrays.hashCode(this.f12699c)), this.f12700d, this.f12701e, this.f12702f, this.f12703g, this.f12704h, this.f12705i, this.f12706j, this.k, this.f12707l});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12697a);
        String strValueOf2 = String.valueOf(this.f12698b);
        String strC = O5.a.c(this.f12699c);
        String strValueOf3 = String.valueOf(this.f12700d);
        String strValueOf4 = String.valueOf(this.f12702f);
        String strValueOf5 = String.valueOf(this.f12703g);
        String strValueOf6 = String.valueOf(this.f12705i);
        String strValueOf7 = String.valueOf(this.f12706j);
        String strValueOf8 = String.valueOf(this.k);
        StringBuilder sbQ = p134m1.b.q("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        V0.p.y(sbQ, strC, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbQ.append(this.f12701e);
        sbQ.append(", \n excludeList=");
        sbQ.append(strValueOf4);
        sbQ.append(", \n authenticatorSelection=");
        sbQ.append(strValueOf5);
        sbQ.append(", \n requestId=");
        sbQ.append(this.f12704h);
        sbQ.append(", \n tokenBinding=");
        sbQ.append(strValueOf6);
        sbQ.append(", \n attestationConveyancePreference=");
        return AbstractC0112b.l(sbQ, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 2, this.f12697a, i10, false);
        p242x0.c.V(parcel, 3, this.f12698b, i10, false);
        p242x0.c.P(parcel, 4, this.f12699c, false);
        p242x0.c.Z(parcel, 5, this.f12700d, false);
        p242x0.c.Q(parcel, 6, this.f12701e);
        p242x0.c.Z(parcel, 7, this.f12702f, false);
        p242x0.c.V(parcel, 8, this.f12703g, i10, false);
        p242x0.c.T(parcel, 9, this.f12704h);
        p242x0.c.V(parcel, 10, this.f12705i, i10, false);
        EnumC0939e enumC0939e = this.f12706j;
        p242x0.c.W(parcel, 11, enumC0939e == null ? null : enumC0939e.toString(), false);
        p242x0.c.V(parcel, 12, this.k, i10, false);
        p242x0.c.W(parcel, 13, this.f12707l, false);
        p242x0.c.V(parcel, 14, this.f12708m, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
