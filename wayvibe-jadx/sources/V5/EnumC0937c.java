package V5;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;

/* JADX INFO: renamed from: V5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0937c implements Parcelable {
    PLATFORM(DeviceDimensionProvider.KEY_PLATFORM),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0937c> CREATOR = new H5.m(21);
    private final String zzb;

    EnumC0937c(String str) {
        this.zzb = str;
    }

    public static EnumC0937c a(String str) {
        for (EnumC0937c enumC0937c : values()) {
            if (str.equals(enumC0937c.zzb)) {
                return enumC0937c;
            }
        }
        throw new C0936b(V0.p.o("Attachment ", str, " not supported"));
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
