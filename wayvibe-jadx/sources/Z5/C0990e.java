package Z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzer;
import java.util.Arrays;

/* JADX INFO: renamed from: Z5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990e extends I5.a {
    public static final Parcelable.Creator<C0990e> CREATOR = new u(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f13842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f13846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13848g;

    public C0990e(float[] fArr, float f10, float f11, long j10, byte b10, float f12, float f13) {
        zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        zzer.zzb((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
        zzer.zza(f10 >= 0.0f && f10 < 360.0f);
        zzer.zza(f11 >= 0.0f && f11 <= 180.0f);
        zzer.zza(f13 >= 0.0f && f13 <= 180.0f);
        zzer.zza(j10 >= 0);
        this.f13842a = fArr;
        this.f13843b = f10;
        this.f13844c = f11;
        this.f13847f = f12;
        this.f13848g = f13;
        this.f13845d = j10;
        this.f13846e = (byte) (((byte) (((byte) (b10 | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0990e) {
                C0990e c0990e = (C0990e) obj;
                byte b10 = this.f13846e;
                boolean z10 = ((b10 & 32) != 0) == ((c0990e.f13846e & 32) != 0) && ((b10 & 32) == 0 || Float.compare(this.f13847f, c0990e.f13847f) == 0);
                boolean z11 = ((b10 & 64) != 0) == ((c0990e.f13846e & 64) != 0) && ((b10 & 64) == 0 || Float.compare(this.f13848g, c0990e.f13848g) == 0);
                if (Float.compare(this.f13843b, c0990e.f13843b) != 0 || Float.compare(this.f13844c, c0990e.f13844c) != 0 || !z10 || !z11 || this.f13845d != c0990e.f13845d || !Arrays.equals(this.f13842a, c0990e.f13842a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13843b), Float.valueOf(this.f13844c), Float.valueOf(this.f13848g), Long.valueOf(this.f13845d), this.f13842a, Byte.valueOf(this.f13846e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.f13842a));
        sb.append(", headingDegrees=");
        sb.append(this.f13843b);
        sb.append(", headingErrorDegrees=");
        sb.append(this.f13844c);
        if ((this.f13846e & 64) != 0) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.f13848g);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.f13845d);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        float[] fArr = (float[]) this.f13842a.clone();
        int iC1 = p242x0.c.c0(1, parcel);
        parcel.writeFloatArray(fArr);
        p242x0.c.d0(iC1, parcel);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeFloat(this.f13843b);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeFloat(this.f13844c);
        p242x0.c.b0(parcel, 6, 8);
        parcel.writeLong(this.f13845d);
        p242x0.c.b0(parcel, 7, 4);
        parcel.writeInt(this.f13846e);
        p242x0.c.b0(parcel, 8, 4);
        parcel.writeFloat(this.f13847f);
        p242x0.c.b0(parcel, 9, 4);
        parcel.writeFloat(this.f13848g);
        p242x0.c.d0(iC0, parcel);
    }
}
