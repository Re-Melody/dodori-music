package D5;

import B5.c;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I5.a {
    public static final Parcelable.Creator<b> CREATOR = new c(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f2132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f2136f;

    public b(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f2135e = i10;
        this.f2131a = i11;
        this.f2133c = i12;
        this.f2136f = bundle;
        this.f2134d = bArr;
        this.f2132b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f2131a);
        p242x0.c.V(parcel, 2, this.f2132b, i10, false);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f2133c);
        p242x0.c.O(parcel, 4, this.f2136f, false);
        p242x0.c.P(parcel, 5, this.f2134d, false);
        p242x0.c.b0(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, 4);
        parcel.writeInt(this.f2135e);
        p242x0.c.d0(iC0, parcel);
    }
}
