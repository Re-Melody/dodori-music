package p167p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.m;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<a> CREATOR = new b(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25214b;

    public a(String str, Map map) {
        this.f25213a = str;
        this.f25214b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.b(this.f25213a, aVar.f25213a) && m.b(this.f25214b, aVar.f25214b);
    }

    public final int hashCode() {
        return this.f25214b.hashCode() + (this.f25213a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.f25213a);
        sb.append(", extras=");
        return p134m1.b.n(sb, this.f25214b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25213a);
        Map map = this.f25214b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
