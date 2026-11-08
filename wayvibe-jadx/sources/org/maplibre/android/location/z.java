package org.maplibre.android.location;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Parcelable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f24801A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f24802B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RectF f24803C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f24804D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f24805E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f24806F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f24807G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f24808H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Boolean f24809I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Boolean f24810J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Integer f24811K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f24812L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f24813M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f24814N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24824j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f24828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f24829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f24830q;
    public Integer r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f24831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f24832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f24834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f24835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f24836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f24837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24838z;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f24800O = {0, 0, 0, 0};
    public static final Parcelable.Creator<z> CREATOR = new p146n3.b(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (Float.compare(zVar.f24815a, this.f24815a) != 0 || this.f24816b != zVar.f24816b || this.f24817c != zVar.f24817c || this.f24819e != zVar.f24819e || this.f24821g != zVar.f24821g || this.f24823i != zVar.f24823i || this.k != zVar.k || this.f24826m != zVar.f24826m || Float.compare(zVar.f24832t, this.f24832t) != 0 || this.f24833u != zVar.f24833u || this.f24834v != zVar.f24834v || Float.compare(zVar.f24836x, this.f24836x) != 0 || Float.compare(zVar.f24837y, this.f24837y) != 0 || this.f24838z != zVar.f24838z || Float.compare(zVar.f24801A, this.f24801A) != 0 || Float.compare(zVar.f24802B, this.f24802B) != 0 || Float.compare(zVar.f24806F, this.f24806F) != 0) {
                return false;
            }
            RectF rectF = zVar.f24803C;
            RectF rectF2 = this.f24803C;
            if (rectF2 == null ? rectF != null : !rectF2.equals(rectF)) {
                return false;
            }
            if (this.f24807G != zVar.f24807G || this.f24808H != zVar.f24808H) {
                return false;
            }
            String str = zVar.f24818d;
            String str2 = this.f24818d;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = zVar.f24820f;
            String str4 = this.f24820f;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = zVar.f24822h;
            String str6 = this.f24822h;
            if (str6 == null ? str5 != null : !str6.equals(str5)) {
                return false;
            }
            String str7 = zVar.f24824j;
            String str8 = this.f24824j;
            if (str8 == null ? str7 != null : !str8.equals(str7)) {
                return false;
            }
            String str9 = zVar.f24825l;
            String str10 = this.f24825l;
            if (str10 == null ? str9 != null : !str10.equals(str9)) {
                return false;
            }
            String str11 = zVar.f24827n;
            String str12 = this.f24827n;
            if (str12 == null ? str11 != null : !str12.equals(str11)) {
                return false;
            }
            Integer num = zVar.f24828o;
            Integer num2 = this.f24828o;
            if (num2 == null ? num != null : !num2.equals(num)) {
                return false;
            }
            Integer num3 = zVar.f24829p;
            Integer num4 = this.f24829p;
            if (num4 == null ? num3 != null : !num4.equals(num3)) {
                return false;
            }
            Integer num5 = zVar.f24830q;
            Integer num6 = this.f24830q;
            if (num6 == null ? num5 != null : !num6.equals(num5)) {
                return false;
            }
            Integer num7 = zVar.r;
            Integer num8 = this.r;
            if (num8 == null ? num7 != null : !num8.equals(num7)) {
                return false;
            }
            Integer num9 = zVar.f24831s;
            Integer num10 = this.f24831s;
            if (num10 == null ? num9 != null : !num10.equals(num9)) {
                return false;
            }
            if (!Arrays.equals(this.f24835w, zVar.f24835w)) {
                return false;
            }
            String str13 = zVar.f24804D;
            String str14 = this.f24804D;
            if (str14 == null ? str13 != null : !str14.equals(str13)) {
                return false;
            }
            if (this.f24809I != zVar.f24809I || this.f24810J != zVar.f24810J) {
                return false;
            }
            Integer num11 = zVar.f24811K;
            Integer num12 = this.f24811K;
            if (num12 == null ? num11 != null : !num12.equals(num11)) {
                return false;
            }
            if (Float.compare(zVar.f24812L, this.f24812L) != 0 || Float.compare(zVar.f24813M, this.f24813M) != 0 || Float.compare(zVar.f24814N, this.f24814N) != 0) {
                return false;
            }
            String str15 = zVar.f24805E;
            String str16 = this.f24805E;
            if (str16 != null) {
                return str16.equals(str15);
            }
            if (str15 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f10 = this.f24815a;
        int iFloatToIntBits = (((((f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31) + this.f24816b) * 31) + this.f24817c) * 31;
        String str = this.f24818d;
        int iHashCode = (((iFloatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f24819e) * 31;
        String str2 = this.f24820f;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f24821g) * 31;
        String str3 = this.f24822h;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f24823i) * 31;
        String str4 = this.f24824j;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.k) * 31;
        String str5 = this.f24825l;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f24826m) * 31;
        String str6 = this.f24827n;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f24828o;
        int iHashCode7 = (iHashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f24829p;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f24830q;
        int iHashCode9 = (iHashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.r;
        int iHashCode10 = (iHashCode9 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f24831s;
        int iHashCode11 = (iHashCode10 + (num5 != null ? num5.hashCode() : 0)) * 31;
        float f11 = this.f24832t;
        int iFloatToIntBits2 = (((iHashCode11 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f24833u ? 1 : 0)) * 31;
        long j10 = this.f24834v;
        int iHashCode12 = (Arrays.hashCode(this.f24835w) + ((iFloatToIntBits2 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        float f12 = this.f24836x;
        int iFloatToIntBits3 = (iHashCode12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
        float f13 = this.f24837y;
        int iFloatToIntBits4 = (((iFloatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31) + (this.f24838z ? 1 : 0)) * 31;
        float f14 = this.f24801A;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
        float f15 = this.f24802B;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
        RectF rectF = this.f24803C;
        int iHashCode13 = (iFloatToIntBits6 + (rectF != null ? rectF.hashCode() : 0)) * 31;
        String str7 = this.f24804D;
        int iHashCode14 = (iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f24805E;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        float f16 = this.f24806F;
        int iFloatToIntBits7 = ((this.f24810J.booleanValue() ? 1 : 0) + (((this.f24809I.booleanValue() ? 1 : 0) + ((((((iHashCode15 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31) + (this.f24807G ? 1 : 0)) * 31) + (this.f24808H ? 1 : 0)) * 31)) * 31)) * 31;
        Integer num6 = this.f24811K;
        int iHashCode16 = (iFloatToIntBits7 + (num6 != null ? num6.hashCode() : 0)) * 31;
        float f17 = this.f24812L;
        int iFloatToIntBits8 = (iHashCode16 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0)) * 31;
        float f18 = this.f24813M;
        int iFloatToIntBits9 = (iFloatToIntBits8 + (f18 != 0.0f ? Float.floatToIntBits(f18) : 0)) * 31;
        float f19 = this.f24814N;
        return iFloatToIntBits9 + (f19 != 0.0f ? Float.floatToIntBits(f19) : 0);
    }

    public final String toString() {
        return "LocationComponentOptions{accuracyAlpha=" + this.f24815a + ", accuracyColor=" + this.f24816b + ", backgroundDrawableStale=" + this.f24817c + ", backgroundStaleName=" + this.f24818d + ", foregroundDrawableStale=" + this.f24819e + ", foregroundStaleName=" + this.f24820f + ", gpsDrawable=" + this.f24821g + ", gpsName=" + this.f24822h + ", foregroundDrawable=" + this.f24823i + ", foregroundName=" + this.f24824j + ", backgroundDrawable=" + this.k + ", backgroundName=" + this.f24825l + ", bearingDrawable=" + this.f24826m + ", bearingName=" + this.f24827n + ", bearingTintColor=" + this.f24828o + ", foregroundTintColor=" + this.f24829p + ", backgroundTintColor=" + this.f24830q + ", foregroundStaleTintColor=" + this.r + ", backgroundStaleTintColor=" + this.f24831s + ", elevation=" + this.f24832t + ", enableStaleState=" + this.f24833u + ", staleStateTimeout=" + this.f24834v + ", padding=" + Arrays.toString(this.f24835w) + ", maxZoomIconScale=" + this.f24836x + ", minZoomIconScale=" + this.f24837y + ", trackingGesturesManagement=" + this.f24838z + ", trackingInitialMoveThreshold=" + this.f24801A + ", trackingMultiFingerMoveThreshold=" + this.f24802B + ", trackingMultiFingerProtectedMoveArea=" + this.f24803C + ", layerAbove=" + this.f24804D + "layerBelow=" + this.f24805E + "trackingAnimationDurationMultiplier=" + this.f24806F + "pulseEnabled=" + this.f24809I + "pulseFadeEnabled=" + this.f24810J + "pulseColor=" + this.f24811K + "pulseSingleDuration=" + this.f24812L + "pulseMaxRadius=" + this.f24813M + "pulseAlpha=" + this.f24814N + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f24815a);
        parcel.writeInt(this.f24816b);
        parcel.writeInt(this.f24817c);
        parcel.writeString(this.f24818d);
        parcel.writeInt(this.f24819e);
        parcel.writeString(this.f24820f);
        parcel.writeInt(this.f24821g);
        parcel.writeString(this.f24822h);
        parcel.writeInt(this.f24823i);
        parcel.writeString(this.f24824j);
        parcel.writeInt(this.k);
        parcel.writeString(this.f24825l);
        parcel.writeInt(this.f24826m);
        parcel.writeString(this.f24827n);
        parcel.writeValue(this.f24828o);
        parcel.writeValue(this.f24829p);
        parcel.writeValue(this.f24830q);
        parcel.writeValue(this.r);
        parcel.writeValue(this.f24831s);
        parcel.writeFloat(this.f24832t);
        parcel.writeByte(this.f24833u ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24834v);
        parcel.writeIntArray(this.f24835w);
        parcel.writeFloat(this.f24836x);
        parcel.writeFloat(this.f24837y);
        parcel.writeByte(this.f24838z ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f24801A);
        parcel.writeFloat(this.f24802B);
        parcel.writeParcelable(this.f24803C, i10);
        parcel.writeString(this.f24804D);
        parcel.writeString(this.f24805E);
        parcel.writeFloat(this.f24806F);
        parcel.writeByte(this.f24807G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24808H ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.f24809I);
        parcel.writeValue(this.f24810J);
        parcel.writeValue(this.f24811K);
        parcel.writeFloat(this.f24812L);
        parcel.writeFloat(this.f24813M);
        parcel.writeFloat(this.f24814N);
    }
}
