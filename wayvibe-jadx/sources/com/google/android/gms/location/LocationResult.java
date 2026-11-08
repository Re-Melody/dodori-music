package com.google.android.gms.location;

import I5.a;
import Z5.u;
import Z5.w;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zzeo;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f18135b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new u(4);

    public LocationResult(List list) {
        this.f18136a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i10 = Build.VERSION.SDK_INT;
        List<Location> list = this.f18136a;
        if (i10 >= 31) {
            return list.equals(locationResult.f18136a);
        }
        if (list.size() != locationResult.f18136a.size()) {
            return false;
        }
        Iterator it = locationResult.f18136a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !E.k(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18136a});
    }

    public final String toString() {
        boolean zG;
        boolean zH;
        float fE;
        boolean zI;
        float f10;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = w.f13888a;
        List<Location> list = this.f18136a;
        int i10 = 100;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z10 = false;
        for (Location location : list) {
            sb.ensureCapacity(i10);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31 ? E1.a.a(location) : location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = w.f13888a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(f.f16451a);
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean zHasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = w.f13889b;
                if (zHasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format(location.getAccuracy()));
                    sb.append("m");
                }
                float fB = 0.0f;
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    if (i11 >= 26) {
                        zI = C1.a.i(location);
                    } else {
                        Bundle extras = location.getExtras();
                        zI = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (zI) {
                        sb.append("±");
                        if (i11 >= 26) {
                            f10 = C1.a.f(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            f10 = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", 0.0f);
                        }
                        sb.append(decimalFormat3.format(f10));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format(location.getSpeed()));
                    if (i11 >= 26) {
                        zH = C1.a.h(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        zH = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (zH) {
                        sb.append("±");
                        if (i11 >= 26) {
                            fE = C1.a.e(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            fE = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                        }
                        sb.append(decimalFormat3.format(fE));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format(location.getBearing()));
                    if (i11 >= 26) {
                        zG = C1.a.g(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        zG = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (zG) {
                        sb.append("±");
                        if (i11 >= 26) {
                            fB = C1.a.b(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                fB = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb.append(decimalFormat3.format(fB));
                    }
                    sb.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                Bundle extras8 = location.getExtras();
                String string2 = extras8 != null ? extras8.getString("levelId") : null;
                if (string2 != null) {
                    sb.append(", lv=");
                    sb.append(string2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                sb.append(zzeo.zza(TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis));
                sb.append('}');
            }
            sb.append(", ");
            z10 = true;
            i10 = 100;
        }
        if (z10) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.Z(parcel, 1, this.f18136a, false);
        c.d0(iC0, parcel);
    }
}
