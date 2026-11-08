package I4;

import H5.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new m(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6408j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6410m;

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f6399a = j10;
        this.f6400b = z10;
        this.f6401c = z11;
        this.f6402d = z12;
        this.f6403e = z13;
        this.f6404f = j11;
        this.f6405g = j12;
        this.f6406h = Collections.unmodifiableList(list);
        this.f6407i = z14;
        this.f6408j = j13;
        this.k = i10;
        this.f6409l = i11;
        this.f6410m = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6399a);
        parcel.writeByte(this.f6400b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6401c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6402d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6403e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6404f);
        parcel.writeLong(this.f6405g);
        List list = this.f6406h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) list.get(i11);
            parcel.writeInt(cVar.f6396a);
            parcel.writeLong(cVar.f6397b);
            parcel.writeLong(cVar.f6398c);
        }
        parcel.writeByte(this.f6407i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6408j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f6409l);
        parcel.writeInt(this.f6410m);
    }

    public d(Parcel parcel) {
        this.f6399a = parcel.readLong();
        this.f6400b = parcel.readByte() == 1;
        this.f6401c = parcel.readByte() == 1;
        this.f6402d = parcel.readByte() == 1;
        this.f6403e = parcel.readByte() == 1;
        this.f6404f = parcel.readLong();
        this.f6405g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new c(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f6406h = Collections.unmodifiableList(arrayList);
        this.f6407i = parcel.readByte() == 1;
        this.f6408j = parcel.readLong();
        this.k = parcel.readInt();
        this.f6409l = parcel.readInt();
        this.f6410m = parcel.readInt();
    }
}
