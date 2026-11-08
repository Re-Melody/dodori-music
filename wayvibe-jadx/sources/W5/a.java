package W5;

import V5.e0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum a implements Parcelable {
    ABSENT(0),
    STRING(1),
    OBJECT(2);

    public static final Parcelable.Creator<a> CREATOR = new e0(3);
    private final int zzb;

    a(int i10) {
        this.zzb = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
