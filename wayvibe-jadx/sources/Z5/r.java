package Z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class r extends I5.a implements com.google.android.gms.common.api.u {
    public static final Parcelable.Creator<r> CREATOR = new u(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f13875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f13876b;

    public r(Status status, s sVar) {
        this.f13875a = status;
        this.f13876b = sVar;
    }

    @Override // com.google.android.gms.common.api.u
    public final Status getStatus() {
        return this.f13875a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f13875a, i10, false);
        p242x0.c.V(parcel, 2, this.f13876b, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
