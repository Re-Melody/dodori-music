package org.maplibre.android;

import B8.V;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.Keep;
import com.google.firebase.firestore.Z;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;
import p046da.c;
import p046da.e;
import p206t6.b;
import ya.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MapLibre {
    private static MapLibre INSTANCE = null;
    private static final String TAG = "Mbgl-MapLibre";
    private static c moduleProvider;
    private String apiKey;
    private Context context;
    private TileServerOptions tileServerOptions;

    public MapLibre(Context context, String str) {
        this.context = context;
        this.apiKey = str;
    }

    public static String getApiKey() {
        validateMapLibre();
        return INSTANCE.apiKey;
    }

    public static Context getApplicationContext() {
        validateMapLibre();
        return INSTANCE.context;
    }

    private static AssetManager getAssetManager() {
        return getApplicationContext().getResources().getAssets();
    }

    public static synchronized MapLibre getInstance(Context context) {
        try {
            b.f26877i = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            b.l(TAG);
            if (INSTANCE == null) {
                Context applicationContext = context.getApplicationContext();
                ReentrantLock reentrantLock = FileSource.f25115a;
                b.l("Mbgl-FileSource");
                new a().execute(applicationContext);
                INSTANCE = new MapLibre(applicationContext, null);
                org.maplibre.android.net.b.c(applicationContext);
            }
            TileServerOptions tileServerOptionsA = TileServerOptions.a(e.MapLibre);
            MapLibre mapLibre = INSTANCE;
            mapLibre.tileServerOptions = tileServerOptionsA;
            mapLibre.apiKey = null;
            FileSource fileSourceB = FileSource.b(context);
            fileSourceB.setTileServerOptions(tileServerOptionsA);
            fileSourceB.setApiKey(null);
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    public static c getModuleProvider() {
        if (moduleProvider == null) {
            moduleProvider = new Z(26);
        }
        return moduleProvider;
    }

    public static DefaultStyle getPredefinedStyle(String str) {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions == null) {
            return null;
        }
        for (DefaultStyle defaultStyle : tileServerOptions.g()) {
            if (defaultStyle.getName().equalsIgnoreCase(str)) {
                return defaultStyle;
            }
        }
        return null;
    }

    public static DefaultStyle[] getPredefinedStyles() {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions != null) {
            return tileServerOptions.g();
        }
        return null;
    }

    public static TileServerOptions getTileServerOptions() {
        validateMapLibre();
        return INSTANCE.tileServerOptions;
    }

    public static boolean hasInstance() {
        return INSTANCE != null;
    }

    public static boolean isApiKeyValid(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().toLowerCase(p086ha.a.f20365a).isEmpty();
    }

    public static synchronized Boolean isConnected() {
        org.maplibre.android.net.b bVarC;
        Boolean bool;
        validateMapLibre();
        bVarC = org.maplibre.android.net.b.c(INSTANCE.context);
        bool = bVarC.f25077d;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : bVarC.d());
    }

    public static void setApiKey(String str) {
        validateMapLibre();
        throwIfApiKeyInvalid(str);
        INSTANCE.apiKey = str;
        FileSource.b(getApplicationContext()).setApiKey(str);
    }

    public static synchronized void setConnected(Boolean bool) {
        validateMapLibre();
        org.maplibre.android.net.b bVarC = org.maplibre.android.net.b.c(INSTANCE.context);
        bVarC.f25077d = bool;
        bVarC.e(bool != null ? bool.booleanValue() : bVarC.d());
    }

    public static void setModuleProvider(c cVar) {
        moduleProvider = cVar;
    }

    public static void throwIfApiKeyInvalid(String str) {
        if (!isApiKeyValid(str)) {
            throw new V(p134m1.b.k("A valid API key is required, currently provided key is: ", str));
        }
    }

    private static void validateMapLibre() {
        if (INSTANCE == null) {
            throw new V();
        }
    }

    public MapLibre(Context context, String str, TileServerOptions tileServerOptions) {
        this.context = context;
        this.apiKey = str;
        this.tileServerOptions = tileServerOptions;
    }

    public static synchronized MapLibre getInstance(Context context, String str, e eVar) {
        try {
            b.f26877i = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            b.l(TAG);
            MapLibre mapLibre = INSTANCE;
            if (mapLibre == null) {
                Ha.b.a(new Ha.a[0]);
                Context applicationContext = context.getApplicationContext();
                ReentrantLock reentrantLock = FileSource.f25115a;
                b.l("Mbgl-FileSource");
                new a().execute(applicationContext);
                INSTANCE = new MapLibre(applicationContext, str);
                org.maplibre.android.net.b.c(applicationContext);
            } else {
                mapLibre.apiKey = str;
            }
            TileServerOptions tileServerOptionsA = TileServerOptions.a(eVar);
            INSTANCE.tileServerOptions = tileServerOptionsA;
            FileSource fileSourceB = FileSource.b(context);
            fileSourceB.setTileServerOptions(tileServerOptionsA);
            fileSourceB.setApiKey(str);
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }
}
