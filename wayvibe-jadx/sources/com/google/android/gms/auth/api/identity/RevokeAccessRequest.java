package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RevokeAccessRequest extends I5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new J(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zbbj f17709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f17710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17711c;

    public RevokeAccessRequest(List list, Account account, String str) {
        this.f17709a = zbbj.zbi(list);
        this.f17710b = account;
        this.f17711c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbj zbbjVar = this.f17709a;
            int size = zbbjVar.size();
            zbbj zbbjVar2 = revokeAccessRequest.f17709a;
            if (size == zbbjVar2.size() && zbbjVar.containsAll(zbbjVar2) && E.k(this.f17710b, revokeAccessRequest.f17710b) && E.k(this.f17711c, revokeAccessRequest.f17711c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17709a, this.f17710b, this.f17711c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.Z(parcel, 1, this.f17709a, false);
        p242x0.c.V(parcel, 2, this.f17710b, i10, false);
        p242x0.c.W(parcel, 3, this.f17711c, false);
        p242x0.c.d0(iC0, parcel);
    }
}
