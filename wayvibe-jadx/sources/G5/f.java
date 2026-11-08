package G5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends I5.a {
    public static final Parcelable.Creator<f> CREATOR = new B5.c(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5477c;

    public f(String str, boolean z10, byte[] bArr) {
        this.f5475a = bArr;
        this.f5476b = z10;
        this.f5477c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.P(parcel, 1, this.f5475a, false);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f5476b ? 1 : 0);
        p242x0.c.W(parcel, 3, this.f5477c, false);
        p242x0.c.d0(iC0, parcel);
    }
}
