package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.fragment.app.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1073c0 implements Parcelable {
    public static final Parcelable.Creator<C1073c0> CREATOR = new Z6.J(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15282b;

    public C1073c0(String str, int i10) {
        this.f15281a = str;
        this.f15282b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15281a);
        parcel.writeInt(this.f15282b);
    }
}
