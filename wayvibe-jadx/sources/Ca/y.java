package Ca;

import org.maplibre.android.offline.OfflineRegion;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements OfflineRegion.OfflineRegionDeleteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1572a;

    public y(z zVar) {
        this.f1572a = zVar;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionDeleteCallback
    public final void onDelete() {
        p150n8.o oVar = this.f1572a.f1574b;
        if (oVar == null) {
            return;
        }
        oVar.b(null);
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionDeleteCallback
    public final void onError(String str) {
        p150n8.o oVar = this.f1572a.f1574b;
        if (oVar == null) {
            return;
        }
        oVar.d(null, "DeleteRegionError", str);
    }
}
