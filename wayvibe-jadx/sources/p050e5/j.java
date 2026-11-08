package p050e5;

import E1.c;
import J1.e;
import X4.g;
import Y7.d;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.slf4j.helpers.i;
import p042d5.a;
import p042d5.b;
import p045d8.AbstractActivityC1932d;
import p150n8.o;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h, LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f19595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f19596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f19597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f19598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19599e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Location f19600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f19602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f19603i;

    public j(Context context, g gVar) {
        this.f19595a = (LocationManager) context.getSystemService("location");
        this.f19597c = gVar;
        this.f19598d = context;
        this.f19596b = new n(context, gVar);
    }

    public static boolean g(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > 120000;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0.0f;
        boolean z14 = accuracy < 0.0f;
        boolean z15 = accuracy > 200.0f;
        boolean zEquals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && zEquals;
        }
        return true;
    }

    @Override // p050e5.h
    public final void a(AbstractActivityC1932d abstractActivityC1932d, o oVar, a aVar) {
        long j10;
        float f10;
        int i10;
        String str;
        if (!h.b(this.f19598d)) {
            aVar.b(b.locationServicesDisabled);
            return;
        }
        this.f19602h = oVar;
        this.f19603i = aVar;
        e eVar = e.best;
        g gVar = this.f19597c;
        if (gVar != null) {
            float f11 = gVar.f13223a;
            e eVar2 = e.lowest;
            e eVar3 = (e) gVar.f13226d;
            j10 = eVar3 == eVar2 ? Long.MAX_VALUE : gVar.f13224b;
            int i11 = i.f19594a[eVar3.ordinal()];
            if (i11 == 1 || i11 == 2) {
                i10 = 104;
            } else {
                i10 = (i11 == 3 || i11 == 4 || i11 == 5) ? 100 : 102;
            }
            f10 = f11;
            eVar = eVar3;
        } else {
            j10 = 0;
            f10 = 0.0f;
            i10 = 102;
        }
        long j11 = j10;
        List<String> providers = this.f19595a.getProviders(true);
        if (eVar == e.lowest) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f19601g = str;
        if (str == null) {
            aVar.b(b.locationServicesDisabled);
            return;
        }
        e.a(j11, "intervalMillis");
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        if (f10 > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        e.a(j11, "minUpdateIntervalMillis");
        boolean z10 = i10 == 104 || i10 == 102 || i10 == 100;
        Object[] objArr = {Integer.valueOf(i10)};
        if (!z10) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        if (!((j11 == Long.MAX_VALUE && j11 == -1) ? false : true)) {
            throw new IllegalStateException("passive location requests must have an explicit minimum update interval");
        }
        c cVar = new c(j11, i10, Math.min(j11, j11), f10);
        this.f19599e = true;
        this.f19596b.b();
        String str2 = this.f19601g;
        Looper mainLooper = Looper.getMainLooper();
        int i12 = E1.b.f3011a;
        int i13 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f19595a;
        if (i13 >= 31) {
            E1.a.b(locationManager, str2, E1.a.c(cVar), new G1.c(new Handler(mainLooper), 0), this);
            return;
        }
        try {
            if (i.f25135c == null) {
                i.f25135c = Class.forName("android.location.LocationRequest");
            }
            if (i.f25136d == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", i.f25135c, LocationListener.class, Looper.class);
                i.f25136d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest locationRequestA = cVar.a(str2);
            if (locationRequestA != null) {
                i.f25136d.invoke(locationManager, locationRequestA, this, mainLooper);
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str2, cVar.f3013b, cVar.f3015d, this, mainLooper);
    }

    @Override // p050e5.h
    public final boolean c(int i10, int i11) {
        return false;
    }

    @Override // p050e5.h
    public final void d(d dVar, d dVar2) {
        LocationManager locationManager = this.f19595a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && g(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        dVar.a(location);
    }

    @Override // p050e5.h
    public final void e() {
        LocationManager locationManager;
        this.f19599e = false;
        n nVar = this.f19596b;
        if (nVar.f19608c != null && (locationManager = nVar.f19607b) != null) {
            locationManager.removeNmeaListener(nVar.f19609d);
            locationManager.unregisterGnssStatusCallback(nVar.f19610e);
            nVar.f19615j = false;
        }
        this.f19595a.removeUpdates(this);
    }

    @Override // p050e5.h
    public final void f(p012a8.b bVar) {
        if (this.f19595a == null) {
            ((o) bVar.f14302b).b(Boolean.FALSE);
        } else {
            ((o) bVar.f14302b).b(Boolean.valueOf(h.b(this.f19598d)));
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            onLocationChanged((Location) list.get(i10));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f19601g)) {
            if (this.f19599e) {
                this.f19595a.removeUpdates(this);
            }
            a aVar = this.f19603i;
            if (aVar != null) {
                aVar.b(b.locationServicesDisabled);
            }
            this.f19601g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 != 2 && i10 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (g(location, this.f19600f)) {
            this.f19600f = location;
            if (this.f19602h != null) {
                this.f19596b.a(location);
                this.f19602h.a(this.f19600f);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i10) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }
}
