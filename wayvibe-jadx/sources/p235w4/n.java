package p235w4;

import B2.AbstractC0112b;
import F4.c;
import X4.j;
import Y4.a;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new b(26);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f27995A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f27999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f28003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p265z4.b f28004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28005j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f28006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f28007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f28008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f28009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f28010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f28011q;
    public final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f28012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f28013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f28014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f28015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f28016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f28017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f28018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f28019z;

    public n(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, a aVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, p265z4.b bVar, c cVar) {
        this.f27996a = str;
        this.f28000e = str2;
        this.f28001f = str3;
        this.f27998c = str4;
        this.f27997b = i10;
        this.f28002g = i11;
        this.f28005j = i12;
        this.k = i13;
        this.f28006l = f10;
        this.f28007m = i14;
        this.f28008n = f11;
        this.f28010p = bArr;
        this.f28009o = i15;
        this.f28011q = aVar;
        this.r = i16;
        this.f28012s = i17;
        this.f28013t = i18;
        this.f28014u = i19;
        this.f28015v = i20;
        this.f28017x = i21;
        this.f28018y = str5;
        this.f28019z = i22;
        this.f28016w = j10;
        this.f28003h = list == null ? Collections.EMPTY_LIST : list;
        this.f28004i = bVar;
        this.f27999d = cVar;
    }

    public static n c(long j10, String str) {
        return new n(null, null, str, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j10, null, null, null);
    }

    public static n d(String str, String str2) {
        return new n(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static n e(String str, String str2, int i10, int i11, int i12, int i13, int i14, List list, p265z4.b bVar, String str3) {
        return new n(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, -1, -1, 0, str3, -1, Long.MAX_VALUE, list, bVar, null);
    }

    public static n f(String str, String str2, int i10, String str3, int i11, long j10, List list) {
        return new n(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, null, null);
    }

    public static void g(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public final n a(int i10, int i11) {
        return new n(this.f27996a, this.f28000e, this.f28001f, this.f27998c, this.f27997b, this.f28002g, this.f28005j, this.k, this.f28006l, this.f28007m, this.f28008n, this.f28010p, this.f28009o, this.f28011q, this.r, this.f28012s, this.f28013t, i10, i11, this.f28017x, this.f28018y, this.f28019z, this.f28016w, this.f28003h, this.f28004i, this.f27999d);
    }

    public final n b(long j10) {
        return new n(this.f27996a, this.f28000e, this.f28001f, this.f27998c, this.f27997b, this.f28002g, this.f28005j, this.k, this.f28006l, this.f28007m, this.f28008n, this.f28010p, this.f28009o, this.f28011q, this.r, this.f28012s, this.f28013t, this.f28014u, this.f28015v, this.f28017x, this.f28018y, this.f28019z, j10, this.f28003h, this.f28004i, this.f27999d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f27997b == nVar.f27997b && this.f28002g == nVar.f28002g && this.f28005j == nVar.f28005j && this.k == nVar.k && this.f28006l == nVar.f28006l && this.f28007m == nVar.f28007m && this.f28008n == nVar.f28008n && this.f28009o == nVar.f28009o && this.r == nVar.r && this.f28012s == nVar.f28012s && this.f28013t == nVar.f28013t && this.f28014u == nVar.f28014u && this.f28015v == nVar.f28015v && this.f28016w == nVar.f28016w && this.f28017x == nVar.f28017x && j.h(this.f27996a, nVar.f27996a) && j.h(this.f28018y, nVar.f28018y) && this.f28019z == nVar.f28019z && j.h(this.f28000e, nVar.f28000e) && j.h(this.f28001f, nVar.f28001f) && j.h(this.f27998c, nVar.f27998c) && j.h(this.f28004i, nVar.f28004i) && j.h(this.f27999d, nVar.f27999d) && j.h(this.f28011q, nVar.f28011q) && Arrays.equals(this.f28010p, nVar.f28010p)) {
                List list = this.f28003h;
                int size = list.size();
                List list2 = nVar.f28003h;
                if (size == list2.size()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27995A == 0) {
            String str = this.f27996a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28000e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f28001f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f27998c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f27997b) * 31) + this.f28005j) * 31) + this.k) * 31) + this.r) * 31) + this.f28012s) * 31;
            String str5 = this.f28018y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f28019z) * 31;
            p265z4.b bVar = this.f28004i;
            int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            c cVar = this.f27999d;
            this.f27995A = iHashCode6 + (cVar != null ? Arrays.hashCode(cVar.f4506a) : 0);
        }
        return this.f27995A;
    }

    public final MediaFormat k() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f28001f);
        String str = this.f28018y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        g(mediaFormat, "max-input-size", this.f28002g);
        g(mediaFormat, "width", this.f28005j);
        g(mediaFormat, "height", this.k);
        float f10 = this.f28006l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        g(mediaFormat, "rotation-degrees", this.f28007m);
        g(mediaFormat, "channel-count", this.r);
        g(mediaFormat, "sample-rate", this.f28012s);
        int i10 = 0;
        while (true) {
            List list = this.f28003h;
            if (i10 >= list.size()) {
                break;
            }
            mediaFormat.setByteBuffer(p134m1.b.j(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
            i10++;
        }
        a aVar = this.f28011q;
        if (aVar != null) {
            g(mediaFormat, "color-transfer", aVar.f13340c);
            g(mediaFormat, "color-standard", aVar.f13338a);
            g(mediaFormat, "color-range", aVar.f13339b);
            byte[] bArr = aVar.f13341d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f27996a);
        sb.append(", ");
        sb.append(this.f28000e);
        sb.append(", ");
        sb.append(this.f28001f);
        sb.append(", ");
        sb.append(this.f27997b);
        sb.append(", ");
        sb.append(this.f28018y);
        sb.append(", [");
        sb.append(this.f28005j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.f28006l);
        sb.append("], [");
        sb.append(this.r);
        sb.append(", ");
        return AbstractC0112b.i(sb, this.f28012s, "])");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27996a);
        parcel.writeString(this.f28000e);
        parcel.writeString(this.f28001f);
        parcel.writeString(this.f27998c);
        parcel.writeInt(this.f27997b);
        parcel.writeInt(this.f28002g);
        parcel.writeInt(this.f28005j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.f28006l);
        parcel.writeInt(this.f28007m);
        parcel.writeFloat(this.f28008n);
        byte[] bArr = this.f28010p;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f28009o);
        parcel.writeParcelable(this.f28011q, i10);
        parcel.writeInt(this.r);
        parcel.writeInt(this.f28012s);
        parcel.writeInt(this.f28013t);
        parcel.writeInt(this.f28014u);
        parcel.writeInt(this.f28015v);
        parcel.writeInt(this.f28017x);
        parcel.writeString(this.f28018y);
        parcel.writeInt(this.f28019z);
        parcel.writeLong(this.f28016w);
        List list = this.f28003h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) list.get(i11));
        }
        parcel.writeParcelable(this.f28004i, 0);
        parcel.writeParcelable(this.f27999d, 0);
    }

    public n(Parcel parcel) {
        this.f27996a = parcel.readString();
        this.f28000e = parcel.readString();
        this.f28001f = parcel.readString();
        this.f27998c = parcel.readString();
        this.f27997b = parcel.readInt();
        this.f28002g = parcel.readInt();
        this.f28005j = parcel.readInt();
        this.k = parcel.readInt();
        this.f28006l = parcel.readFloat();
        this.f28007m = parcel.readInt();
        this.f28008n = parcel.readFloat();
        this.f28010p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f28009o = parcel.readInt();
        this.f28011q = (a) parcel.readParcelable(a.class.getClassLoader());
        this.r = parcel.readInt();
        this.f28012s = parcel.readInt();
        this.f28013t = parcel.readInt();
        this.f28014u = parcel.readInt();
        this.f28015v = parcel.readInt();
        this.f28017x = parcel.readInt();
        this.f28018y = parcel.readString();
        this.f28019z = parcel.readInt();
        this.f28016w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f28003h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f28003h.add(parcel.createByteArray());
        }
        this.f28004i = (p265z4.b) parcel.readParcelable(p265z4.b.class.getClassLoader());
        this.f27999d = (c) parcel.readParcelable(c.class.getClassLoader());
    }
}
