package p102j3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import p134m1.b;
import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR = new v(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21453b;

    public a(int i10, String str) {
        this.f21452a = i10;
        this.f21453b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f21452a);
        sb.append(",url=");
        return b.m(sb, this.f21453b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21453b);
        parcel.writeInt(this.f21452a);
    }
}
