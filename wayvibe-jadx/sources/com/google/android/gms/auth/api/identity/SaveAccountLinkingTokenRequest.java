package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends I5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new J(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f17712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17717f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i10) {
        this.f17712a = pendingIntent;
        this.f17713b = str;
        this.f17714c = str2;
        this.f17715d = arrayList;
        this.f17716e = str3;
        this.f17717f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f17715d;
        int size = arrayList.size();
        ArrayList arrayList2 = saveAccountLinkingTokenRequest.f17715d;
        return size == arrayList2.size() && arrayList.containsAll(arrayList2) && E.k(this.f17712a, saveAccountLinkingTokenRequest.f17712a) && E.k(this.f17713b, saveAccountLinkingTokenRequest.f17713b) && E.k(this.f17714c, saveAccountLinkingTokenRequest.f17714c) && E.k(this.f17716e, saveAccountLinkingTokenRequest.f17716e) && this.f17717f == saveAccountLinkingTokenRequest.f17717f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17712a, this.f17713b, this.f17714c, this.f17715d, this.f17716e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17712a, i10, false);
        p242x0.c.W(parcel, 2, this.f17713b, false);
        p242x0.c.W(parcel, 3, this.f17714c, false);
        p242x0.c.X(parcel, 4, this.f17715d);
        p242x0.c.W(parcel, 5, this.f17716e, false);
        p242x0.c.b0(parcel, 6, 4);
        parcel.writeInt(this.f17717f);
        p242x0.c.d0(iC0, parcel);
    }
}
