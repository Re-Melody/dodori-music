package L3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new H5.m(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f7690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f7692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f7693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7696j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7687a);
        parcel.writeInt(this.f7688b);
        parcel.writeInt(this.f7689c);
        if (this.f7689c > 0) {
            parcel.writeIntArray(this.f7690d);
        }
        parcel.writeInt(this.f7691e);
        if (this.f7691e > 0) {
            parcel.writeIntArray(this.f7692f);
        }
        parcel.writeInt(this.f7694h ? 1 : 0);
        parcel.writeInt(this.f7695i ? 1 : 0);
        parcel.writeInt(this.f7696j ? 1 : 0);
        parcel.writeList(this.f7693g);
    }
}
