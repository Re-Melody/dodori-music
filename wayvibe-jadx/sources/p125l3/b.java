package p125l3;

import B2.AbstractC0112b;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.auth.api.identity.v;
import p224v4.i;
import p255y2.A;
import p255y2.C2348y;

/* JADX INFO: loaded from: classes.dex */
public class b implements A {
    public static final Parcelable.Creator<b> CREATOR = new v(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21946b;

    public b(String str, String str2) {
        this.f21945a = i.f(str);
        this.f21946b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f21945a.equals(bVar.f21945a) && this.f21946b.equals(bVar.f21946b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21946b.hashCode() + AbstractC0112b.a(527, 31, this.f21945a);
    }

    @Override // p255y2.A
    public final void o(C2348y c2348y) {
        String str = this.f21945a;
        str.getClass();
        String str2 = this.f21946b;
        switch (str) {
            case "ALBUM":
                c2348y.f28993c = str2;
                break;
            case "TITLE":
                c2348y.f28991a = str2;
                break;
            case "DESCRIPTION":
                c2348y.f28995e = str2;
                break;
            case "ALBUMARTIST":
                c2348y.f28994d = str2;
                break;
            case "ARTIST":
                c2348y.f28992b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f21945a + f.f16452b + this.f21946b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21945a);
        parcel.writeString(this.f21946b);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f21945a = string;
        this.f21946b = parcel.readString();
    }
}
