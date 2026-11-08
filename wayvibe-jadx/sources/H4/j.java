package H4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new B5.c(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6020c;

    public j(String str, byte[] bArr) {
        super("PRIV");
        this.f6019b = str;
        this.f6020c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (X4.j.h(this.f6019b, jVar.f6019b) && Arrays.equals(this.f6020c, jVar.f6020c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6019b;
        return Arrays.hashCode(this.f6020c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6019b);
        parcel.writeByteArray(this.f6020c);
    }

    public j(Parcel parcel) {
        super("PRIV");
        this.f6019b = parcel.readString();
        this.f6020c = parcel.createByteArray();
    }
}
