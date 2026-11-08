package V5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum E implements Parcelable {
    PUBLIC_KEY;

    public static final Parcelable.Creator<E> CREATOR = new W(5);
    private final String zzb = "public-key";

    public static E a(String str) throws D {
        for (E e2 : values()) {
            if (str.equals(e2.zzb)) {
                return e2;
            }
        }
        throw new D(V0.p.o("PublicKeyCredentialType ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
