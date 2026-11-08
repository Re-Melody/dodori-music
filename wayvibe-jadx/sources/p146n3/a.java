package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import java.util.Arrays;
import p255y2.C2348y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new v(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f22913e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f22910b = str;
        this.f22911c = str2;
        this.f22912d = i10;
        this.f22913e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f22912d == aVar.f22912d && C.a(this.f22910b, aVar.f22910b) && C.a(this.f22911c, aVar.f22911c) && Arrays.equals(this.f22913e, aVar.f22913e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f22912d) * 31;
        String str = this.f22910b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22911c;
        return Arrays.hashCode(this.f22913e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p255y2.A
    public final void o(C2348y c2348y) {
        c2348y.a(this.f22913e, this.f22912d);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": mimeType=" + this.f22910b + ", description=" + this.f22911c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22910b);
        parcel.writeString(this.f22911c);
        parcel.writeInt(this.f22912d);
        parcel.writeByteArray(this.f22913e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22910b = string;
        this.f22911c = parcel.readString();
        this.f22912d = parcel.readInt();
        this.f22913e = parcel.createByteArray();
    }
}
