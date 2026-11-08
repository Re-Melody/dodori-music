package I4;

import H5.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public static final Parcelable.Creator<h> CREATOR = new m(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6423a;

    public h(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new g(parcel));
        }
        this.f6423a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6423a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) list.get(i11);
            parcel.writeLong(gVar.f6413a);
            parcel.writeByte(gVar.f6414b ? (byte) 1 : (byte) 0);
            parcel.writeByte(gVar.f6415c ? (byte) 1 : (byte) 0);
            parcel.writeByte(gVar.f6416d ? (byte) 1 : (byte) 0);
            List list2 = gVar.f6418f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                f fVar = (f) list2.get(i12);
                parcel.writeInt(fVar.f6411a);
                parcel.writeLong(fVar.f6412b);
            }
            parcel.writeLong(gVar.f6417e);
            parcel.writeByte(gVar.f6419g ? (byte) 1 : (byte) 0);
            parcel.writeLong(gVar.f6420h);
            parcel.writeInt(gVar.f6421i);
            parcel.writeInt(gVar.f6422j);
            parcel.writeInt(gVar.k);
        }
    }

    public h(ArrayList arrayList) {
        this.f6423a = Collections.unmodifiableList(arrayList);
    }
}
