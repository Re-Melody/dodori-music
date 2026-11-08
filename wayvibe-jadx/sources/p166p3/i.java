package p166p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new b(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25210a;

    public i(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new h(parcel));
        }
        this.f25210a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f25210a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f25200a);
            parcel.writeByte(hVar.f25201b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f25202c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f25203d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f25205f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f25198a);
                parcel.writeLong(gVar.f25199b);
            }
            parcel.writeLong(hVar.f25204e);
            parcel.writeByte(hVar.f25206g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f25207h);
            parcel.writeInt(hVar.f25208i);
            parcel.writeInt(hVar.f25209j);
            parcel.writeInt(hVar.k);
        }
    }

    public i(ArrayList arrayList) {
        this.f25210a = Collections.unmodifiableList(arrayList);
    }
}
