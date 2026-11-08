package p136m3;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p255y2.A;
import p255y2.C2348y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A {
    public static final Parcelable.Creator<b> CREATOR = new v(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22216f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        AbstractC0111a.d(i11 == -1 || i11 > 0);
        this.f22211a = i10;
        this.f22212b = str;
        this.f22213c = str2;
        this.f22214d = str3;
        this.f22215e = z10;
        this.f22216f = i11;
    }

    public static b a(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str4) * PipesIterator.DEFAULT_QUEUE_SIZE;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        AbstractC0111a.x("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0112b.u("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        AbstractC0111a.x("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        AbstractC0112b.u("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            return new b(i10, str, str2, str3, zEquals, i14);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f22211a == bVar.f22211a && C.a(this.f22212b, bVar.f22212b) && C.a(this.f22213c, bVar.f22213c) && C.a(this.f22214d, bVar.f22214d) && this.f22215e == bVar.f22215e && this.f22216f == bVar.f22216f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f22211a) * 31;
        String str = this.f22212b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22213c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22214d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f22215e ? 1 : 0)) * 31) + this.f22216f;
    }

    @Override // p255y2.A
    public final void o(C2348y c2348y) {
        String str = this.f22213c;
        if (str != null) {
            c2348y.f29010v = str;
        }
        String str2 = this.f22212b;
        if (str2 != null) {
            c2348y.f29009u = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f22213c + "\", genre=\"" + this.f22212b + "\", bitrate=" + this.f22211a + ", metadataInterval=" + this.f22216f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22211a);
        parcel.writeString(this.f22212b);
        parcel.writeString(this.f22213c);
        parcel.writeString(this.f22214d);
        int i11 = C.f560a;
        parcel.writeInt(this.f22215e ? 1 : 0);
        parcel.writeInt(this.f22216f);
    }

    public b(Parcel parcel) {
        this.f22211a = parcel.readInt();
        this.f22212b = parcel.readString();
        this.f22213c = parcel.readString();
        this.f22214d = parcel.readString();
        int i10 = C.f560a;
        this.f22215e = parcel.readInt() != 0;
        this.f22216f = parcel.readInt();
    }
}
