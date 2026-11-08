package p136m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import java.util.Arrays;
import p255y2.A;
import p255y2.C2348y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements A {
    public static final Parcelable.Creator<c> CREATOR = new v(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22219c;

    public c(byte[] bArr, String str, String str2) {
        this.f22217a = bArr;
        this.f22218b = str;
        this.f22219c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22217a, ((c) obj).f22217a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22217a);
    }

    @Override // p255y2.A
    public final void o(C2348y c2348y) {
        String str = this.f22218b;
        if (str != null) {
            c2348y.f28991a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.f22218b + "\", url=\"" + this.f22219c + "\", rawMetadata.length=\"" + this.f22217a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f22217a);
        parcel.writeString(this.f22218b);
        parcel.writeString(this.f22219c);
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f22217a = bArrCreateByteArray;
        this.f22218b = parcel.readString();
        this.f22219c = parcel.readString();
    }
}
