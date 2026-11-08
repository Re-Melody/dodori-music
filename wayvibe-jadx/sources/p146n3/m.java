package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new b(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22947c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f22946b = str;
        this.f22947c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (C.a(this.f22946b, mVar.f22946b) && Arrays.equals(this.f22947c, mVar.f22947c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22946b;
        return Arrays.hashCode(this.f22947c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": owner=" + this.f22946b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22946b);
        parcel.writeByteArray(this.f22947c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22946b = string;
        this.f22947c = parcel.createByteArray();
    }
}
