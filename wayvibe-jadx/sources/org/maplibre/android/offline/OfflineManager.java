package org.maplibre.android.offline;

import Ca.k;
import Ca.l;
import Ca.s;
import Ca.u;
import V0.p;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import app.nagakiba.wayvibe.R;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.storage.FileSource;
import p098j.I;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p090i2.c f25078d = new p090i2.c(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static OfflineManager f25079e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileSource f25080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f25081b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f25082c;

    @Keep
    private final long nativePtr;

    @Keep
    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String str);
    }

    @Keep
    public interface FileSourceCallback {
        void onError(String str);

        void onSuccess();
    }

    @Keep
    public interface GetOfflineRegionCallback {
        void onError(String str);

        void onRegion(OfflineRegion offlineRegion);

        void onRegionNotFound();
    }

    @Keep
    public interface ListOfflineRegionsCallback {
        void onError(String str);

        void onList(OfflineRegion[] offlineRegionArr);
    }

    @Keep
    public interface MergeOfflineRegionsCallback {
        void onError(String str);

        void onMerge(OfflineRegion[] offlineRegionArr);
    }

    static {
        p046da.a.a();
    }

    public OfflineManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f25082c = applicationContext;
        FileSource fileSourceB = FileSource.b(applicationContext);
        this.f25080a = fileSourceB;
        initialize(fileSourceB);
        new Thread(new I(p.B(FileSource.c(applicationContext), File.separator, "mbgl-cache.db"), 5)).start();
    }

    @Keep
    private final native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, CreateOfflineRegionCallback createOfflineRegionCallback);

    @Keep
    private final native void getOfflineRegion(FileSource fileSource, long j10, GetOfflineRegionCallback getOfflineRegionCallback);

    @Keep
    private final native void initialize(FileSource fileSource);

    @Keep
    private final native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback listOfflineRegionsCallback);

    @Keep
    private final native void mergeOfflineRegions(FileSource fileSource, String str, MergeOfflineRegionsCallback mergeOfflineRegionsCallback);

    @Keep
    private final native void nativeClearAmbientCache(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeInvalidateAmbientCache(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativePackDatabase(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeResetDatabase(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeSetMaximumAmbientCacheSize(long j10, FileSourceCallback fileSourceCallback);

    public final void a(l lVar) {
        this.f25080a.activate();
        nativeClearAmbientCache(new a(this, lVar));
    }

    public final void b(OfflineTilePyramidRegionDefinition offlineTilePyramidRegionDefinition, byte[] metadata, u uVar) {
        m.f(metadata, "metadata");
        LatLngBounds.Companion.getClass();
        p109ja.a.a(90.0d, 180.0d, -90.0d, -180.0d);
        LatLngBounds latLngBounds = new LatLngBounds(90.0d, 180.0d, -90.0d, -180.0d);
        LatLngBounds bounds = offlineTilePyramidRegionDefinition.getBounds();
        m.c(bounds);
        boolean zContains = latLngBounds.contains(bounds);
        Context context = this.f25082c;
        if (!zContains) {
            String string = context.getString(R.string.maplibre_offline_error_region_definition_invalid);
            m.e(string, "getString(...)");
            uVar.onError(String.format(string, Arrays.copyOf(new Object[]{offlineTilePyramidRegionDefinition.getBounds()}, 1)));
        } else {
            org.maplibre.android.net.b.c(context).a();
            FileSource.b(context).activate();
            createOfflineRegion(this.f25080a, offlineTilePyramidRegionDefinition, metadata, new b(this, uVar));
        }
    }

    public final void c(k kVar) {
        this.f25080a.activate();
        nativeInvalidateAmbientCache(new c(this, kVar));
    }

    public final void d(ListOfflineRegionsCallback listOfflineRegionsCallback) {
        FileSource fileSource = this.f25080a;
        fileSource.activate();
        listOfflineRegions(fileSource, new d(this, listOfflineRegionsCallback));
    }

    public final void e(File file, s sVar, boolean z10) {
        FileSource fileSource = this.f25080a;
        fileSource.activate();
        String absolutePath = file.getAbsolutePath();
        m.e(absolutePath, "getAbsolutePath(...)");
        mergeOfflineRegions(fileSource, absolutePath, new e(z10, file, this, sVar));
    }

    @Keep
    public final native void finalize();

    @Keep
    public final native void putResourceWithUrl(String str, byte[] bArr, long j10, long j11, String str2, boolean z10);

    @Keep
    public final native void runPackDatabaseAutomatically(boolean z10);

    @Keep
    public final native void setOfflineMapboxTileCountLimit(long j10);
}
