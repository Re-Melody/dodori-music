package p146n3;

import B2.AbstractC0112b;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22915b;

    public c(String str, byte[] bArr) {
        super(str);
        this.f22915b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f22936a.equals(cVar.f22936a) && Arrays.equals(this.f22915b, cVar.f22915b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22915b) + AbstractC0112b.a(527, 31, this.f22936a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22936a);
        parcel.writeByteArray(this.f22915b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C.f560a;
        super(string);
        this.f22915b = parcel.createByteArray();
    }
}
