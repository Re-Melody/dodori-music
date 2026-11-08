package H4;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5995b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f5995b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6018a.equals(bVar.f6018a) && Arrays.equals(this.f5995b, bVar.f5995b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5995b) + AbstractC0112b.a(527, 31, this.f6018a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6018a);
        parcel.writeByteArray(this.f5995b);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f5995b = parcel.createByteArray();
    }
}
