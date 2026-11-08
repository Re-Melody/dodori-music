package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1072c implements Parcelable {
    public static final Parcelable.Creator<C1072c> CREATOR = new Z6.J(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15280b;

    public C1072c(Parcel parcel) {
        this.f15279a = parcel.createStringArrayList();
        this.f15280b = parcel.createTypedArrayList(C1070b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f15279a);
        parcel.writeTypedList(this.f15280b);
    }
}
