package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ClearTokenRequest extends I5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new J(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17708b;

    public ClearTokenRequest(String str, String str2) {
        this.f17707a = str;
        this.f17708b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (E.k(this.f17707a, clearTokenRequest.f17707a) && E.k(this.f17708b, clearTokenRequest.f17708b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17707a, this.f17708b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f17707a, false);
        p242x0.c.W(parcel, 2, this.f17708b, false);
        p242x0.c.d0(iC0, parcel);
    }
}
