package org.maplibre.android.maps;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.maplibre.android.camera.CameraPosition;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new p146n3.b(16);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f25032D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String[] f25033E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f25034F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f25035G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f25036H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f25037I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f25038J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CameraPosition f25045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25046b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f25050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f25051g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f25054j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f25057n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25047c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25048d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25049e = 8388661;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25052h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25053i = 8388691;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25055l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25056m = 8388691;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f25058o = 0.0d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f25059p = 25.5d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f25060q = 0.0d;
    public double r = 60.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25061s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25062t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25063u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f25064v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25065w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f25066x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f25067y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f25068z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f25029A = 4;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f25030B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f25031C = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f25039K = true;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f25040L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f25041M = "";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f25042N = 1048576;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f25043O = 5;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f25044P = 60;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f25046b != xVar.f25046b || this.f25047c != xVar.f25047c || this.f25048d != xVar.f25048d) {
                return false;
            }
            Drawable drawable = this.f25051g;
            if (drawable == null ? xVar.f25051g != null : !drawable.equals(xVar.f25051g)) {
                return false;
            }
            if (this.f25049e != xVar.f25049e || this.f25052h != xVar.f25052h || this.f25053i != xVar.f25053i || this.k != xVar.k || this.f25055l != xVar.f25055l || this.f25056m != xVar.f25056m || Double.compare(xVar.f25058o, this.f25058o) != 0 || Double.compare(xVar.f25059p, this.f25059p) != 0 || Double.compare(xVar.f25060q, this.f25060q) != 0 || Double.compare(xVar.r, this.r) != 0 || this.f25061s != xVar.f25061s || this.f25062t != xVar.f25062t || this.f25063u != xVar.f25063u || this.f25064v != xVar.f25064v || this.f25065w != xVar.f25065w || this.f25066x != xVar.f25066x || this.f25067y != xVar.f25067y) {
                return false;
            }
            CameraPosition cameraPosition = this.f25045a;
            if (cameraPosition == null ? xVar.f25045a != null : !cameraPosition.equals(xVar.f25045a)) {
                return false;
            }
            if (!Arrays.equals(this.f25050f, xVar.f25050f) || !Arrays.equals(this.f25054j, xVar.f25054j) || !Arrays.equals(this.f25057n, xVar.f25057n)) {
                return false;
            }
            String str = this.f25034F;
            if (str == null ? xVar.f25034F != null : !str.equals(xVar.f25034F)) {
                return false;
            }
            if (this.f25068z != xVar.f25068z || this.f25029A != xVar.f25029A || this.f25030B != xVar.f25030B || this.f25031C != xVar.f25031C || !this.f25032D.equals(xVar.f25032D) || !Arrays.equals(this.f25033E, xVar.f25033E) || this.f25038J != xVar.f25038J || this.f25039K != xVar.f25039K || this.f25040L != xVar.f25040L) {
                return false;
            }
            this.f25041M.equals(xVar.f25041M);
        }
        return false;
    }

    public final int hashCode() {
        CameraPosition cameraPosition = this.f25045a;
        int iHashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + (this.f25046b ? 1 : 0)) * 31) + (this.f25047c ? 1 : 0)) * 31) + (this.f25048d ? 1 : 0)) * 31) + this.f25049e) * 31;
        Drawable drawable = this.f25051g;
        int iHashCode2 = Arrays.hashCode(this.f25057n) + ((((((((Arrays.hashCode(this.f25054j) + ((((((Arrays.hashCode(this.f25050f) + ((iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31)) * 31) + (this.f25052h ? 1 : 0)) * 31) + this.f25053i) * 31)) * 31) + this.k) * 31) + (this.f25055l ? 1 : 0)) * 31) + this.f25056m) * 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f25058o);
        int i10 = (iHashCode2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f25059p);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f25060q);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.r);
        int i13 = ((((((((((((((((i12 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + (this.f25061s ? 1 : 0)) * 31) + (this.f25062t ? 1 : 0)) * 31) + (this.f25063u ? 1 : 0)) * 31) + (this.f25064v ? 1 : 0)) * 31) + (this.f25065w ? 1 : 0)) * 31) + (this.f25066x ? 1 : 0)) * 31) + (this.f25067y ? 1 : 0)) * 31;
        String str = this.f25034F;
        int iHashCode3 = (((((((((((((i13 + (str != null ? str.hashCode() : 0)) * 31) + (this.f25035G ? 1 : 0)) * 31) + (this.f25036H ? 1 : 0)) * 31) + (this.f25068z ? 1 : 0)) * 31) + this.f25029A) * 31) + (this.f25030B ? 1 : 0)) * 31) + (this.f25031C ? 1 : 0)) * 31;
        String str2 = this.f25032D;
        int iHashCode4 = (((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f25033E)) * 31) + ((int) this.f25038J)) * 31) + (this.f25039K ? 1 : 0)) * 31) + (this.f25040L ? 1 : 0)) * 31;
        String str3 = this.f25041M;
        return ((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + ((int) this.f25042N)) * 31) + ((int) this.f25043O)) * 31) + this.f25044P;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f25045a, i10);
        parcel.writeByte(this.f25046b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25047c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25049e);
        parcel.writeIntArray(this.f25050f);
        parcel.writeByte(this.f25048d ? (byte) 1 : (byte) 0);
        Drawable drawable = this.f25051g;
        parcel.writeParcelable(drawable != null ? p046da.b.z(drawable) : null, i10);
        parcel.writeByte(this.f25052h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25053i);
        parcel.writeIntArray(this.f25054j);
        parcel.writeByte(this.f25055l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25056m);
        parcel.writeIntArray(this.f25057n);
        parcel.writeInt(this.k);
        parcel.writeDouble(this.f25058o);
        parcel.writeDouble(this.f25059p);
        parcel.writeDouble(this.f25060q);
        parcel.writeDouble(this.r);
        parcel.writeByte(this.f25061s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25062t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25063u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25064v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25065w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25066x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25067y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f25034F);
        parcel.writeByte(this.f25035G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25036H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25068z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25029A);
        parcel.writeByte(this.f25030B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25031C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f25032D);
        parcel.writeStringArray(this.f25033E);
        parcel.writeFloat(this.f25038J);
        parcel.writeInt(this.f25037I);
        parcel.writeByte(this.f25039K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25040L ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f25041M);
        parcel.writeLong(this.f25042N);
        parcel.writeLong(this.f25043O);
        parcel.writeInt(this.f25044P);
    }
}
