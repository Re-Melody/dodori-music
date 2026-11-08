package Ca;

import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements OfflineManager.FileSourceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p150n8.o f1526a;

    public l(p150n8.o oVar) {
        this.f1526a = oVar;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        this.f1526a.d(null, "MAPBOX CACHE ERROR", str);
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        this.f1526a.b(null);
    }
}
