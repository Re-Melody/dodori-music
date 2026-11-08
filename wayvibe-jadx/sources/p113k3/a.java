package p113k3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import java.util.Arrays;
import p255y2.A;
import p255y2.C;
import p255y2.C2338n;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2339o f21625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2339o f21626h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21632f;

    static {
        C2338n c2338n = new C2338n();
        c2338n.f28918l = C.l("application/id3");
        f21625g = new C2339o(c2338n);
        C2338n c2338n2 = new C2338n();
        c2338n2.f28918l = C.l("application/x-scte35");
        f21626h = new C2339o(c2338n2);
        CREATOR = new v(24);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f21627a = str;
        this.f21628b = str2;
        this.f21629c = j10;
        this.f21630d = j11;
        this.f21631e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f21629c == aVar.f21629c && this.f21630d == aVar.f21630d && B2.C.a(this.f21627a, aVar.f21627a) && B2.C.a(this.f21628b, aVar.f21628b) && Arrays.equals(this.f21631e, aVar.f21631e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f21632f == 0) {
            String str = this.f21627a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21628b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f21629c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f21630d;
            this.f21632f = Arrays.hashCode(this.f21631e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f21632f;
    }

    @Override // p255y2.A
    public final C2339o n() {
        String str = this.f21627a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f21626h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f21625g;
            default:
                return null;
        }
    }

    @Override // p255y2.A
    public final byte[] t() {
        if (n() != null) {
            return this.f21631e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f21627a + ", id=" + this.f21630d + ", durationMs=" + this.f21629c + ", value=" + this.f21628b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21627a);
        parcel.writeString(this.f21628b);
        parcel.writeLong(this.f21629c);
        parcel.writeLong(this.f21630d);
        parcel.writeByteArray(this.f21631e);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = B2.C.f560a;
        this.f21627a = string;
        this.f21628b = parcel.readString();
        this.f21629c = parcel.readLong();
        this.f21630d = parcel.readLong();
        this.f21631e = parcel.createByteArray();
    }
}
