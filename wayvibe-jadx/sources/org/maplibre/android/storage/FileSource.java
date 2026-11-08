package org.maplibre.android.storage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import androidx.annotation.Keep;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.log.Logger;
import org.maplibre.android.util.TileServerOptions;
import p046da.b;

/* JADX INFO: loaded from: classes2.dex */
public class FileSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReentrantLock f25115a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantLock f25116b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f25117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f25118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static FileSource f25119e;

    @Keep
    private long nativePtr;

    @Keep
    public interface ResourceTransformCallback {
        String onURL(int i10, String str);
    }

    @Keep
    public interface ResourcesCachePathChangeCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    public static String a(Context context) {
        boolean z10;
        boolean z11;
        File externalFilesDir;
        String string = context.getSharedPreferences("MapboxSharedPreferences", 0).getString("fileSourceResourcesCachePath", null);
        if (!((string == null || string.isEmpty()) ? false : new File(string).canWrite())) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD).metaData;
                z10 = bundle != null ? bundle.getBoolean("com.mapbox.SetStorageExternal", false) : false;
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.e("Mbgl-FileSource", "Failed to read the package metadata: ", e2);
                b.d0(e2);
            } catch (Exception e4) {
                Logger.e("Mbgl-FileSource", "Failed to read the storage key: ", e4);
                b.d0(e4);
            }
            if (z10) {
                String externalStorageState = Environment.getExternalStorageState();
                if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                    z11 = true;
                } else {
                    Logger.w("Mbgl-FileSource", "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).");
                    z11 = false;
                }
                if (!z11 || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
                    string = context.getFilesDir().getAbsolutePath();
                } else {
                    string = externalFilesDir.getAbsolutePath();
                }
            } else {
                string = context.getFilesDir().getAbsolutePath();
            }
            context.getSharedPreferences("MapboxSharedPreferences", 0).edit().remove("fileSourceResourcesCachePath").apply();
        }
        return string;
    }

    public static synchronized FileSource b(Context context) {
        try {
            if (f25119e == null) {
                String strD = d(context);
                FileSource fileSource = new FileSource();
                fileSource.initialize(MapLibre.getApiKey(), strD, MapLibre.getTileServerOptions());
                f25119e = fileSource;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25119e;
    }

    public static String c(Context context) {
        ReentrantLock reentrantLock = f25116b;
        reentrantLock.lock();
        try {
            if (f25118d == null) {
                f25118d = context.getCacheDir().getAbsolutePath();
            }
            return f25118d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static String d(Context context) {
        ReentrantLock reentrantLock = f25115a;
        reentrantLock.lock();
        try {
            if (f25117c == null) {
                f25117c = a(context);
            }
            return f25117c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Keep
    private native void initialize(String str, String str2, TileServerOptions tileServerOptions);

    @Keep
    private native void setResourceCachePath(String str, ResourcesCachePathChangeCallback resourcesCachePathChangeCallback);

    @Keep
    public native void activate();

    @Keep
    public native void deactivate();

    @Keep
    public native void finalize();

    @Keep
    public native String getApiBaseUrl();

    @Keep
    public native String getApiKey();

    @Keep
    public native boolean isActivated();

    @Keep
    public native void setApiBaseUrl(String str);

    @Keep
    public native void setApiKey(String str);

    @Keep
    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    @Keep
    public native void setTileServerOptions(TileServerOptions tileServerOptions);
}
