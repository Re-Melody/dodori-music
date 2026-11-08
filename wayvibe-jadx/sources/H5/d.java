package H5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends I5.a {
    public static final Parcelable.Creator<d> CREATOR = new m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6039d;

    public d(String str, boolean z10, long j10, int i10) {
        this.f6036a = str;
        this.f6037b = i10;
        this.f6038c = j10;
        this.f6039d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (E.k(this.f6036a, dVar.f6036a) && u() == dVar.u() && this.f6039d == dVar.f6039d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6036a, Long.valueOf(u()), Boolean.valueOf(this.f6039d)});
    }

    public final String toString() {
        W9.j jVar = new W9.j(this);
        jVar.E(this.f6036a, "name");
        jVar.E(Long.valueOf(u()), DiagnosticsEntry.VERSION_KEY);
        jVar.E(Boolean.valueOf(this.f6039d), "is_fully_rolled_out");
        return jVar.toString();
    }

    public final long u() {
        long j10 = this.f6038c;
        return j10 == -1 ? this.f6037b : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f6036a, false);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f6037b);
        long jU = u();
        p242x0.c.b0(parcel, 3, 8);
        parcel.writeLong(jU);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f6039d ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }

    public d(String str, long j10) {
        this(str, false, j10, -1);
    }
}
