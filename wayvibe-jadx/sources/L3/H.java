package L3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new H5.m(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f7684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7685d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f7682a + ", mGapDir=" + this.f7683b + ", mHasUnwantedGapAfter=" + this.f7685d + ", mGapPerSpan=" + Arrays.toString(this.f7684c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7682a);
        parcel.writeInt(this.f7683b);
        parcel.writeInt(this.f7685d ? 1 : 0);
        int[] iArr = this.f7684c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7684c);
        }
    }
}
