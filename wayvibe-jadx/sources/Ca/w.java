package Ca;

import java.util.HashMap;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.maplibre.android.offline.OfflineRegion;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements OfflineRegion.OfflineRegionUpdateMetadataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OfflineRegion f1567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1568b;

    public w(x xVar, OfflineRegion offlineRegion) {
        this.f1568b = xVar;
        this.f1567a = offlineRegion;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionUpdateMetadataCallback
    public final void onError(String str) {
        this.f1568b.f1571c.d(null, "UpdateMetadataError", str);
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionUpdateMetadataCallback
    public final void onUpdate(byte[] bArr) {
        HashMap mapA = A.a(this.f1567a);
        mapA.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, bArr != null ? (Map) new E7.l().b(HashMap.class, new String(bArr)) : new HashMap());
        this.f1568b.f1571c.b(new E7.l().g(mapA));
    }
}
