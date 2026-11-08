package p050e5;

import android.location.GnssStatus;

/* JADX INFO: loaded from: classes.dex */
public final class m extends GnssStatus.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f19605a;

    public m(n nVar) {
        this.f19605a = nVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        double satelliteCount = gnssStatus.getSatelliteCount();
        n nVar = this.f19605a;
        nVar.f19612g = satelliteCount;
        nVar.f19613h = 0.0d;
        for (int i10 = 0; i10 < nVar.f19612g; i10++) {
            if (gnssStatus.usedInFix(i10)) {
                nVar.f19613h += 1.0d;
            }
        }
    }
}
