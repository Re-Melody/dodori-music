package p257y5;

import I5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import p255y2.J;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new J(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29088b;

    public c(int i10, ArrayList arrayList) {
        this.f29087a = i10;
        E.h(arrayList);
        this.f29088b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f29087a);
        p242x0.c.Z(parcel, 2, this.f29088b, false);
        p242x0.c.d0(iC0, parcel);
    }
}
