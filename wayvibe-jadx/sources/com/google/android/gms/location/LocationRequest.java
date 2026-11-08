package com.google.android.gms.location;

import B2.AbstractC0112b;
import I5.a;
import O5.d;
import Z5.A;
import Z5.u;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new u(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18131j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkSource f18133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zze f18134n;

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, zze zzeVar) {
        this.f18122a = i10;
        if (i10 == 105) {
            this.f18123b = Long.MAX_VALUE;
        } else {
            this.f18123b = j10;
        }
        this.f18124c = j11;
        this.f18125d = j12;
        this.f18126e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f18127f = i11;
        this.f18128g = f10;
        this.f18129h = z10;
        this.f18130i = j15 != -1 ? j15 : j10;
        this.f18131j = i12;
        this.k = i13;
        this.f18132l = z11;
        this.f18133m = workSource;
        this.f18134n = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i10 = this.f18122a;
        if (i10 != locationRequest.f18122a) {
            return false;
        }
        if ((i10 == 105 || this.f18123b == locationRequest.f18123b) && this.f18124c == locationRequest.f18124c && u() == locationRequest.u()) {
            return (!u() || this.f18125d == locationRequest.f18125d) && this.f18126e == locationRequest.f18126e && this.f18127f == locationRequest.f18127f && this.f18128g == locationRequest.f18128g && this.f18129h == locationRequest.f18129h && this.f18131j == locationRequest.f18131j && this.k == locationRequest.k && this.f18132l == locationRequest.f18132l && this.f18133m.equals(locationRequest.f18133m) && E.k(this.f18134n, locationRequest.f18134n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18122a), Long.valueOf(this.f18123b), Long.valueOf(this.f18124c), this.f18133m});
    }

    public final String toString() {
        String str;
        StringBuilder sbO = AbstractC0112b.o("Request[");
        int i10 = this.f18122a;
        boolean z10 = i10 == 105;
        long j10 = this.f18125d;
        if (z10) {
            sbO.append(A.c(i10));
            if (j10 > 0) {
                sbO.append("/");
                zzeo.zzc(j10, sbO);
            }
        } else {
            sbO.append("@");
            if (u()) {
                zzeo.zzc(this.f18123b, sbO);
                sbO.append("/");
                zzeo.zzc(j10, sbO);
            } else {
                zzeo.zzc(this.f18123b, sbO);
            }
            sbO.append(StringUtils.SPACE);
            sbO.append(A.c(this.f18122a));
        }
        if (this.f18122a == 105 || this.f18124c != this.f18123b) {
            sbO.append(", minUpdateInterval=");
            long j11 = this.f18124c;
            sbO.append(j11 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j11));
        }
        if (this.f18128g > 0.0d) {
            sbO.append(", minUpdateDistance=");
            sbO.append(this.f18128g);
        }
        if (!(this.f18122a == 105) ? this.f18130i != this.f18123b : this.f18130i != Long.MAX_VALUE) {
            sbO.append(", maxUpdateAge=");
            long j12 = this.f18130i;
            sbO.append(j12 != Long.MAX_VALUE ? zzeo.zzb(j12) : "∞");
        }
        long j13 = this.f18126e;
        if (j13 != Long.MAX_VALUE) {
            sbO.append(", duration=");
            zzeo.zzc(j13, sbO);
        }
        int i11 = this.f18127f;
        if (i11 != Integer.MAX_VALUE) {
            sbO.append(", maxUpdates=");
            sbO.append(i11);
        }
        int i12 = this.k;
        if (i12 != 0) {
            sbO.append(", ");
            if (i12 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i12 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            sbO.append(str);
        }
        int i13 = this.f18131j;
        if (i13 != 0) {
            sbO.append(", ");
            sbO.append(A.d(i13));
        }
        if (this.f18129h) {
            sbO.append(", waitForAccurateLocation");
        }
        if (this.f18132l) {
            sbO.append(", bypass");
        }
        WorkSource workSource = this.f18133m;
        if (!d.a(workSource)) {
            sbO.append(", ");
            sbO.append(workSource);
        }
        zze zzeVar = this.f18134n;
        if (zzeVar != null) {
            sbO.append(", impersonation=");
            sbO.append(zzeVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    public final boolean u() {
        long j10 = this.f18125d;
        return j10 > 0 && (j10 >> 1) >= this.f18123b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        int i11 = this.f18122a;
        c.b0(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.f18123b;
        c.b0(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f18124c;
        c.b0(parcel, 3, 8);
        parcel.writeLong(j11);
        c.b0(parcel, 6, 4);
        parcel.writeInt(this.f18127f);
        float f10 = this.f18128g;
        c.b0(parcel, 7, 4);
        parcel.writeFloat(f10);
        c.b0(parcel, 8, 8);
        parcel.writeLong(this.f18125d);
        c.b0(parcel, 9, 4);
        parcel.writeInt(this.f18129h ? 1 : 0);
        c.b0(parcel, 10, 8);
        parcel.writeLong(this.f18126e);
        long j12 = this.f18130i;
        c.b0(parcel, 11, 8);
        parcel.writeLong(j12);
        c.b0(parcel, 12, 4);
        parcel.writeInt(this.f18131j);
        c.b0(parcel, 13, 4);
        parcel.writeInt(this.k);
        c.b0(parcel, 15, 4);
        parcel.writeInt(this.f18132l ? 1 : 0);
        c.V(parcel, 16, this.f18133m, i10, false);
        c.V(parcel, 17, this.f18134n, i10, false);
        c.d0(iC0, parcel);
    }
}
