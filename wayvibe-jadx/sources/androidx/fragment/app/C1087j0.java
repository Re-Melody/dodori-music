package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1087j0 implements Parcelable {
    public static final Parcelable.Creator<C1087j0> CREATOR = new Z6.J(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1070b[] f15348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f15351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f15352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f15353h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f15346a);
        parcel.writeStringList(this.f15347b);
        parcel.writeTypedArray(this.f15348c, i10);
        parcel.writeInt(this.f15349d);
        parcel.writeString(this.f15350e);
        parcel.writeStringList(this.f15351f);
        parcel.writeTypedList(this.f15352g);
        parcel.writeTypedList(this.f15353h);
    }
}
