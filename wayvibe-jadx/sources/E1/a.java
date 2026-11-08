package E1;

import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import com.google.android.gms.common.api.f;
import p050e5.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a(Location location) {
        return location.isMock();
    }

    public static void b(LocationManager locationManager, String str, LocationRequest locationRequest, G1.c cVar, j jVar) {
        locationManager.requestLocationUpdates(str, locationRequest, cVar, jVar);
    }

    public static LocationRequest c(c cVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(cVar.f3013b).setQuality(cVar.f3012a);
        long j10 = cVar.f3014c;
        if (j10 == -1) {
            j10 = cVar.f3013b;
        }
        return quality.setMinUpdateIntervalMillis(j10).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(f.API_PRIORITY_OTHER).setMinUpdateDistanceMeters(cVar.f3015d).setMaxUpdateDelayMillis(0L).build();
    }
}
