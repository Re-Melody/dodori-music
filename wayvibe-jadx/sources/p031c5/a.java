package p031c5;

import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import p050e5.o;
import p161o8.h;
import p206t6.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements o, p042d5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f15907b;

    public /* synthetic */ a(h hVar, int i10) {
        this.f15906a = i10;
        this.f15907b = hVar;
    }

    @Override // p050e5.o
    public void a(Location location) {
        h hVar = this.f15907b;
        switch (this.f15906a) {
            case 0:
                int i10 = GeolocatorLocationService.k;
                hVar.c(b.i0(location));
                break;
            default:
                hVar.c(b.i0(location));
                break;
        }
    }

    @Override // p042d5.a
    public void b(p042d5.b bVar) {
        h hVar = this.f15907b;
        switch (this.f15906a) {
            case 1:
                int i10 = GeolocatorLocationService.k;
                hVar.b(null, bVar.toString(), bVar.f());
                break;
            default:
                hVar.b(null, bVar.toString(), bVar.f());
                break;
        }
    }
}
