package D5;

import B5.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I5.a {
    public static final Parcelable.Creator<a> CREATOR = new c(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f2130f;

    public a(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f2129e = i10;
        this.f2125a = str;
        this.f2126b = i11;
        this.f2127c = j10;
        this.f2128d = bArr;
        this.f2130f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f2125a + ", method: " + this.f2126b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f2125a, false);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f2126b);
        p242x0.c.b0(parcel, 3, 8);
        parcel.writeLong(this.f2127c);
        p242x0.c.P(parcel, 4, this.f2128d, false);
        p242x0.c.O(parcel, 5, this.f2130f, false);
        p242x0.c.b0(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, 4);
        parcel.writeInt(this.f2129e);
        p242x0.c.d0(iC0, parcel);
    }
}
