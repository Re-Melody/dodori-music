package Ca;

import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.offline.OfflineRegion;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements OfflineManager.ListOfflineRegionsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p150n8.o f1574b;

    public z(long j10, p150n8.o oVar) {
        this.f1573a = j10;
        this.f1574b = oVar;
    }

    @Override // org.maplibre.android.offline.OfflineManager.ListOfflineRegionsCallback
    public final void onError(String str) {
        p150n8.o oVar = this.f1574b;
        if (oVar == null) {
            return;
        }
        oVar.d(null, "RegionListError", str);
    }

    @Override // org.maplibre.android.offline.OfflineManager.ListOfflineRegionsCallback
    public final void onList(OfflineRegion[] offlineRegionArr) {
        for (OfflineRegion offlineRegion : offlineRegionArr) {
            if (offlineRegion.f25085c == this.f1573a) {
                offlineRegion.a(new y(this));
                return;
            }
        }
        p150n8.o oVar = this.f1574b;
        if (oVar == null) {
            return;
        }
        oVar.d(null, "DeleteRegionError", "There is no region with given id to delete.");
    }
}
