package Z4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.google.android.gms.internal.play_billing.zzax;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;
import p248x6.C2324b;

/* JADX INFO: loaded from: classes.dex */
public final class M implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13682b;

    public /* synthetic */ M(Object obj, int i10) {
        this.f13681a = i10;
        this.f13682b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f13681a) {
            case 0:
                zzc.zzn("BillingClientTesting", "Billing Override Service connected.");
                N n6 = (N) this.f13682b;
                n6.f13685J = zzax.zzb(iBinder);
                n6.f13684I = 2;
                n6.T(26);
                break;
            case 1:
                if (iBinder instanceof p031c5.b) {
                    GeolocatorLocationService geolocatorLocationService = ((p031c5.b) iBinder).f15908a;
                    p031c5.c cVar = (p031c5.c) this.f13682b;
                    cVar.f15912d = geolocatorLocationService;
                    geolocatorLocationService.f17690f = cVar.f15910b;
                    geolocatorLocationService.f17687c++;
                    Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f17687c);
                    p031c5.f fVar = cVar.f15914f;
                    if (fVar != null) {
                        fVar.f15931e = geolocatorLocationService;
                    }
                }
                break;
            case 2:
                p216u6.o oVar = (p216u6.o) this.f13682b;
                oVar.f27241b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                oVar.a().post(new p216u6.n(this, iBinder));
                break;
            default:
                p248x6.d dVar = (p248x6.d) this.f13682b;
                dVar.f28608b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new C2324b(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f13681a) {
            case 0:
                zzc.zzo("BillingClientTesting", "Billing Override Service disconnected.");
                N n6 = (N) this.f13682b;
                n6.f13685J = null;
                n6.f13684I = 0;
                break;
            case 1:
                p031c5.c cVar = (p031c5.c) this.f13682b;
                GeolocatorLocationService geolocatorLocationService = cVar.f15912d;
                if (geolocatorLocationService != null) {
                    geolocatorLocationService.f17689e = null;
                    cVar.f15912d = null;
                }
                break;
            case 2:
                p216u6.o oVar = (p216u6.o) this.f13682b;
                oVar.f27241b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                oVar.a().post(new p216u6.m(this, 1));
                break;
            default:
                p248x6.d dVar = (p248x6.d) this.f13682b;
                dVar.f28608b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new p248x6.c(this, 0));
                break;
        }
    }

    public /* synthetic */ M(N n6) {
        this.f13681a = 0;
        Objects.requireNonNull(n6);
        this.f13682b = n6;
    }
}
