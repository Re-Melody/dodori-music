package com.google.android.gms.fido.u2f.api.common;

import V5.e0;
import W5.c;
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
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new e0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f18107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f18108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f18110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f18111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18112g;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        this.f18106a = num;
        this.f18107b = d10;
        this.f18108c = uri;
        this.f18109d = bArr;
        this.f18110e = arrayList;
        this.f18111f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                E.a("registered key has null appId and no request appId is provided", (hVar.f12846b == null && uri == null) ? false : true);
                String str2 = hVar.f12846b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        E.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f18112g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (!E.k(this.f18106a, signRequestParams.f18106a) || !E.k(this.f18107b, signRequestParams.f18107b) || !E.k(this.f18108c, signRequestParams.f18108c) || !Arrays.equals(this.f18109d, signRequestParams.f18109d)) {
            return false;
        }
        ArrayList arrayList = this.f18110e;
        ArrayList arrayList2 = signRequestParams.f18110e;
        return arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && E.k(this.f18111f, signRequestParams.f18111f) && E.k(this.f18112g, signRequestParams.f18112g);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.f18109d));
        return Arrays.hashCode(new Object[]{this.f18106a, this.f18108c, this.f18107b, this.f18110e, this.f18111f, this.f18112g, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.T(parcel, 2, this.f18106a);
        p242x0.c.Q(parcel, 3, this.f18107b);
        p242x0.c.V(parcel, 4, this.f18108c, i10, false);
        p242x0.c.P(parcel, 5, this.f18109d, false);
        p242x0.c.Z(parcel, 6, this.f18110e, false);
        p242x0.c.V(parcel, 7, this.f18111f, i10, false);
        p242x0.c.W(parcel, 8, this.f18112g, false);
        p242x0.c.d0(iC0, parcel);
    }
}
