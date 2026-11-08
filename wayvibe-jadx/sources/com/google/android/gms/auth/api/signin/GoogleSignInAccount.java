package com.google.android.gms.auth.api.signin;

import E5.d;
import I5.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f17791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f17795j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f17797m = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f17786a = i10;
        this.f17787b = str;
        this.f17788c = str2;
        this.f17789d = str3;
        this.f17790e = str4;
        this.f17791f = uri;
        this.f17792g = str5;
        this.f17793h = j10;
        this.f17794i = str6;
        this.f17795j = arrayList;
        this.k = str7;
        this.f17796l = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString(DiagnosticsEntry.ID_KEY);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        E.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j10, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f17792g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f17794i.equals(this.f17794i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f17795j);
        hashSet.addAll(googleSignInAccount.f17797m);
        HashSet hashSet2 = new HashSet(this.f17795j);
        hashSet2.addAll(this.f17797m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f17794i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f17795j);
        hashSet.addAll(this.f17797m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17786a);
        c.W(parcel, 2, this.f17787b, false);
        c.W(parcel, 3, this.f17788c, false);
        c.W(parcel, 4, this.f17789d, false);
        c.W(parcel, 5, this.f17790e, false);
        c.V(parcel, 6, this.f17791f, i10, false);
        c.W(parcel, 7, this.f17792g, false);
        c.b0(parcel, 8, 8);
        parcel.writeLong(this.f17793h);
        c.W(parcel, 9, this.f17794i, false);
        c.Z(parcel, 10, this.f17795j, false);
        c.W(parcel, 11, this.k, false);
        c.W(parcel, 12, this.f17796l, false);
        c.d0(iC0, parcel);
    }
}
