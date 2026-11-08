package V5;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: renamed from: V5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0954u implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC0954u> CREATOR = new e0(1);
    private final int zzb;

    EnumC0954u(int i10) {
        this.zzb = i10;
    }

    public static EnumC0954u h(int i10) throws C0953t {
        for (EnumC0954u enumC0954u : values()) {
            if (i10 == enumC0954u.zzb) {
                return enumC0954u;
            }
        }
        Locale locale = Locale.US;
        throw new C0953t(AbstractC0112b.d(i10, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
