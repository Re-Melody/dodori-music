package com.google.android.gms.fido.u2f.api.common;

import V5.e0;
import W5.c;
import W5.g;
import W5.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new e0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f18100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f18101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f18103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f18104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18105g;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        this.f18099a = num;
        this.f18100b = d10;
        this.f18101c = uri;
        E.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f18102d = arrayList;
        this.f18103e = arrayList2;
        this.f18104f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            E.a("register request has null appId and no request appId is provided", (uri == null && gVar.f12844d == null) ? false : true);
            String str2 = gVar.f12844d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            E.a("registered key has null appId and no request appId is provided", (uri == null && hVar.f12846b == null) ? false : true);
            String str3 = hVar.f12846b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        E.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f18105g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (!E.k(this.f18099a, registerRequestParams.f18099a) || !E.k(this.f18100b, registerRequestParams.f18100b) || !E.k(this.f18101c, registerRequestParams.f18101c) || !E.k(this.f18102d, registerRequestParams.f18102d)) {
            return false;
        }
        ArrayList arrayList = this.f18103e;
        ArrayList arrayList2 = registerRequestParams.f18103e;
        return ((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && E.k(this.f18104f, registerRequestParams.f18104f) && E.k(this.f18105g, registerRequestParams.f18105g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18099a, this.f18101c, this.f18100b, this.f18102d, this.f18103e, this.f18104f, this.f18105g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.T(parcel, 2, this.f18099a);
        p242x0.c.Q(parcel, 3, this.f18100b);
        p242x0.c.V(parcel, 4, this.f18101c, i10, false);
        p242x0.c.Z(parcel, 5, this.f18102d, false);
        p242x0.c.Z(parcel, 6, this.f18103e, false);
        p242x0.c.V(parcel, 7, this.f18104f, i10, false);
        p242x0.c.W(parcel, 8, this.f18105g, false);
        p242x0.c.d0(iC0, parcel);
    }
}
