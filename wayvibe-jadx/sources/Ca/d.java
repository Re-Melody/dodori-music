package Ca;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma.a f1507a;

    public d(ma.a aVar) {
        this.f1507a = aVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f1507a.f(U4.c.c(location));
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.f1507a.onFailure(new Exception("Current provider disabled"));
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
