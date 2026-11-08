package R3;

import android.os.Parcel;
import android.util.SparseIntArray;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f10897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f10898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10903j;
    public int k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2230e(0), new C2230e(0), new C2230e(0));
    }

    @Override // R3.b
    public final c a() {
        Parcel parcel = this.f10898e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f10903j;
        if (i10 == this.f10899f) {
            i10 = this.f10900g;
        }
        return new c(parcel, iDataPosition, i10, p134m1.b.m(new StringBuilder(), this.f10901h, "  "), this.f10894a, this.f10895b, this.f10896c);
    }

    @Override // R3.b
    public final boolean e(int i10) {
        while (this.f10903j < this.f10900g) {
            int i11 = this.k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f10903j;
            Parcel parcel = this.f10898e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.k = parcel.readInt();
            this.f10903j += i13;
        }
        return this.k == i10;
    }

    @Override // R3.b
    public final void i(int i10) {
        int i11 = this.f10902i;
        SparseIntArray sparseIntArray = this.f10897d;
        Parcel parcel = this.f10898e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f10902i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, C2230e c2230e, C2230e c2230e2, C2230e c2230e3) {
        super(c2230e, c2230e2, c2230e3);
        this.f10897d = new SparseIntArray();
        this.f10902i = -1;
        this.k = -1;
        this.f10898e = parcel;
        this.f10899f = i10;
        this.f10900g = i11;
        this.f10903j = i10;
        this.f10901h = str;
    }
}
