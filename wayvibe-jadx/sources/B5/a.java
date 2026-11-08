package B5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I5.a {
    public static final Parcelable.Creator<a> CREATOR = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f674d;

    public a(int i10, boolean z10, long j10, boolean z11) {
        this.f671a = i10;
        this.f672b = z10;
        this.f673c = j10;
        this.f674d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f671a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f672b ? 1 : 0);
        p242x0.c.b0(parcel, 3, 8);
        parcel.writeLong(this.f673c);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f674d ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
