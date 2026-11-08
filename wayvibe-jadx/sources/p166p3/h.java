package p166p3;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f25209j;
    public final int k;

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f25200a = j10;
        this.f25201b = z10;
        this.f25202c = z11;
        this.f25203d = z12;
        this.f25205f = Collections.unmodifiableList(arrayList);
        this.f25204e = j11;
        this.f25206g = z13;
        this.f25207h = j12;
        this.f25208i = i10;
        this.f25209j = i11;
        this.k = i12;
    }

    public h(Parcel parcel) {
        this.f25200a = parcel.readLong();
        this.f25201b = parcel.readByte() == 1;
        this.f25202c = parcel.readByte() == 1;
        this.f25203d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f25205f = Collections.unmodifiableList(arrayList);
        this.f25204e = parcel.readLong();
        this.f25206g = parcel.readByte() == 1;
        this.f25207h = parcel.readLong();
        this.f25208i = parcel.readInt();
        this.f25209j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
