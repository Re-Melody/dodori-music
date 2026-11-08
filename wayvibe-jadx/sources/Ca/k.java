package Ca;

import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements OfflineManager.FileSourceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p150n8.o f1525a;

    public k(p150n8.o oVar) {
        this.f1525a = oVar;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        this.f1525a.d(null, "MAPBOX CACHE ERROR", str);
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        this.f1525a.b(null);
    }
}
