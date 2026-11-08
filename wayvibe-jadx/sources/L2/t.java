package L2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class t implements A {
    public static final Parcelable.Creator<t> CREATOR = new H5.m(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7655c;

    public t(String str, String str2, List list) {
        this.f7653a = str;
        this.f7654b = str2;
        this.f7655c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f7653a, tVar.f7653a) && TextUtils.equals(this.f7654b, tVar.f7654b) && this.f7655c.equals(tVar.f7655c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7653a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7654b;
        return this.f7655c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f7653a;
        sb.append(str != null ? p134m1.b.m(V0.p.u(" [", str, ", "), this.f7654b, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7653a);
        parcel.writeString(this.f7654b);
        List list = this.f7655c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public t(Parcel parcel) {
        this.f7653a = parcel.readString();
        this.f7654b = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((s) parcel.readParcelable(s.class.getClassLoader()));
        }
        this.f7655c = Collections.unmodifiableList(arrayList);
    }
}
