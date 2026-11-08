package org.maplibre.android.offline;

import Ca.w;
import Ca.y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import kotlin.jvm.internal.m;
import org.maplibre.android.MapLibre;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineRegion {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileSource f25084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OfflineRegionDefinition f25087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f25088f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25090h;

    @Keep
    private final long nativePtr;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f25089g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25083a = MapLibre.getApplicationContext();

    @Keep
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    @Keep
    public interface OfflineRegionInvalidateCallback {
        void onError(String str);

        void onInvalidate();
    }

    @Keep
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j10);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    static {
        p046da.a.a();
    }

    @Keep
    private OfflineRegion(long j10, FileSource fileSource, long j11, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.f25084b = fileSource;
        this.f25085c = j11;
        this.f25087e = offlineRegionDefinition;
        this.f25088f = bArr;
        initialize(j10, fileSource);
    }

    @Keep
    private final native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    @Keep
    private final native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    @Keep
    private final native void initialize(long j10, FileSource fileSource);

    @Keep
    private final native void invalidateOfflineRegion(OfflineRegionInvalidateCallback offlineRegionInvalidateCallback);

    @Keep
    private final native void setOfflineRegionDownloadState(int i10);

    @Keep
    private final native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    @Keep
    private final native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    public final void a(y yVar) {
        if (this.f25086d) {
            return;
        }
        this.f25086d = true;
        this.f25084b.activate();
        deleteOfflineRegion(new f(this, yVar));
    }

    public final void b(int i10) {
        if (this.f25090h == i10) {
            return;
        }
        FileSource fileSource = this.f25084b;
        Context context = this.f25083a;
        if (i10 == 1) {
            org.maplibre.android.net.b.c(context).a();
            fileSource.activate();
        } else {
            fileSource.deactivate();
            org.maplibre.android.net.b.c(context).b();
        }
        this.f25090h = i10;
        setOfflineRegionDownloadState(i10);
    }

    public final void c(OfflineRegionObserver offlineRegionObserver) {
        setOfflineRegionObserver(new g(this, offlineRegionObserver));
    }

    public final void d(byte[] bytes, w wVar) {
        m.f(bytes, "bytes");
        updateOfflineRegionMetadata(bytes, new h(this, wVar));
    }

    @Keep
    public final native void finalize();
}
