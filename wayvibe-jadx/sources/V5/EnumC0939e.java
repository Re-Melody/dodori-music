package V5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0939e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0939e> CREATOR = new W(11);
    private final String zzb;

    EnumC0939e(String str) {
        this.zzb = str;
    }

    public static EnumC0939e a(String str) {
        for (EnumC0939e enumC0939e : values()) {
            if (str.equals(enumC0939e.zzb)) {
                return enumC0939e;
            }
        }
        throw new C0938d(V0.p.o("Attestation conveyance preference ", str, " not supported"));
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
