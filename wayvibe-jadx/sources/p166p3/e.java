package p166p3;

import V0.p;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new b(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f25193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25195j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f25196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f25197m;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f25186a = j10;
        this.f25187b = z10;
        this.f25188c = z11;
        this.f25189d = z12;
        this.f25190e = z13;
        this.f25191f = j11;
        this.f25192g = j12;
        this.f25193h = Collections.unmodifiableList(list);
        this.f25194i = z14;
        this.f25195j = j13;
        this.k = i10;
        this.f25196l = i11;
        this.f25197m = i12;
    }

    @Override // p166p3.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f25191f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return p.k(this.f25192g, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25186a);
        parcel.writeByte(this.f25187b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25188c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25189d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25190e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25191f);
        parcel.writeLong(this.f25192g);
        List list = this.f25193h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f25183a);
            parcel.writeLong(dVar.f25184b);
            parcel.writeLong(dVar.f25185c);
        }
        parcel.writeByte(this.f25194i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25195j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f25196l);
        parcel.writeInt(this.f25197m);
    }

    public e(Parcel parcel) {
        this.f25186a = parcel.readLong();
        this.f25187b = parcel.readByte() == 1;
        this.f25188c = parcel.readByte() == 1;
        this.f25189d = parcel.readByte() == 1;
        this.f25190e = parcel.readByte() == 1;
        this.f25191f = parcel.readLong();
        this.f25192g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f25193h = Collections.unmodifiableList(arrayList);
        this.f25194i = parcel.readByte() == 1;
        this.f25195j = parcel.readLong();
        this.k = parcel.readInt();
        this.f25196l = parcel.readInt();
        this.f25197m = parcel.readInt();
    }
}
