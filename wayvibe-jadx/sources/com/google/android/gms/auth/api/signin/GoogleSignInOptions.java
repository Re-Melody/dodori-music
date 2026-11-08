package com.google.android.gms.auth.api.signin;

import E5.c;
import E5.d;
import I5.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Scope f17798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Scope f17799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f17800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f17801o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f17804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f17810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17811j;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f17798l = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f17799m = scope3;
        f17800n = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f17800n)) {
            Scope scope4 = f17799m;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f17800n)) {
            Scope scope5 = f17799m;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d(1);
        f17801o = new c(1);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap map, String str3) {
        this.f17802a = i10;
        this.f17803b = arrayList;
        this.f17804c = account;
        this.f17805d = z10;
        this.f17806e = z11;
        this.f17807f = z12;
        this.f17808g = str;
        this.f17809h = str2;
        this.f17810i = new ArrayList(map.values());
        this.f17811j = str3;
    }

    public static GoogleSignInOptions a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap b(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                F5.a aVar = (F5.a) it.next();
                map.put(Integer.valueOf(aVar.f4521b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f17808g;
        ArrayList arrayList = this.f17803b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f17803b;
            String str2 = googleSignInOptions.f17808g;
            Account account = googleSignInOptions.f17804c;
            if (this.f17810i.isEmpty() && googleSignInOptions.f17810i.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f17804c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f17807f == googleSignInOptions.f17807f && this.f17805d == googleSignInOptions.f17805d && this.f17806e == googleSignInOptions.f17806e && TextUtils.equals(this.f17811j, googleSignInOptions.f17811j);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f17803b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f17828b);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f17804c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f17808g;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f17807f ? 1 : 0)) * 31) + (this.f17805d ? 1 : 0)) * 31) + (this.f17806e ? 1 : 0);
        String str2 = this.f17811j;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17802a);
        p242x0.c.Z(parcel, 2, new ArrayList(this.f17803b), false);
        p242x0.c.V(parcel, 3, this.f17804c, i10, false);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f17805d ? 1 : 0);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(this.f17806e ? 1 : 0);
        p242x0.c.b0(parcel, 6, 4);
        parcel.writeInt(this.f17807f ? 1 : 0);
        p242x0.c.W(parcel, 7, this.f17808g, false);
        p242x0.c.W(parcel, 8, this.f17809h, false);
        p242x0.c.Z(parcel, 9, this.f17810i, false);
        p242x0.c.W(parcel, 10, this.f17811j, false);
        p242x0.c.d0(iC0, parcel);
    }
}
