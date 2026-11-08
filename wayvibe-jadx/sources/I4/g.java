package I4;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6422j;
    public final int k;

    public g(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f6413a = j10;
        this.f6414b = z10;
        this.f6415c = z11;
        this.f6416d = z12;
        this.f6418f = Collections.unmodifiableList(arrayList);
        this.f6417e = j11;
        this.f6419g = z13;
        this.f6420h = j12;
        this.f6421i = i10;
        this.f6422j = i11;
        this.k = i12;
    }

    public g(Parcel parcel) {
        this.f6413a = parcel.readLong();
        this.f6414b = parcel.readByte() == 1;
        this.f6415c = parcel.readByte() == 1;
        this.f6416d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new f(parcel.readInt(), parcel.readLong()));
        }
        this.f6418f = Collections.unmodifiableList(arrayList);
        this.f6417e = parcel.readLong();
        this.f6419g = parcel.readByte() == 1;
        this.f6420h = parcel.readLong();
        this.f6421i = parcel.readInt();
        this.f6422j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
