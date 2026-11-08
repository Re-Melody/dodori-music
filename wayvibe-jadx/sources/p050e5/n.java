package p050e5;

import X4.g;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import com.amazon.a.a.o.b.f;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f19607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f19608c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f19612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f19613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Calendar f19614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19615j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f19609d = new OnNmeaMessageListener() { // from class: e5.l
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j10) {
            n nVar = this.f19604a;
            nVar.getClass();
            if (str.trim().matches("^\\$..GGA.*$")) {
                nVar.f19611f = str;
                nVar.f19614i = Calendar.getInstance();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f19610e = new m(this);

    /* JADX WARN: Type inference failed for: r2v3, types: [e5.l] */
    public n(Context context, g gVar) {
        this.f19606a = context;
        this.f19608c = gVar;
        this.f19607b = (LocationManager) context.getSystemService("location");
    }

    public final void a(Location location) {
        g gVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f19612g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f19613h);
        if (this.f19611f == null || (gVar = this.f19608c) == null || !this.f19615j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f19614i;
        if ((calendar2 == null || !calendar2.before(calendar)) && gVar.f13225c) {
            String[] strArrSplit = this.f19611f.split(f.f16451a);
            String str = strArrSplit[0];
            if (!this.f19611f.trim().matches("^\\$..GGA.*$") || strArrSplit.length <= 9 || strArrSplit[9].isEmpty()) {
                return;
            }
            double d10 = Double.parseDouble(strArrSplit[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", d10);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.f19615j || this.f19608c == null || (locationManager = this.f19607b) == null || this.f19606a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f19609d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.f19610e, (Handler) null);
        this.f19615j = true;
    }
}
