package ra;

import E9.C0348i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.maplibre.android.MapLibre;
import p046da.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements la.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f26027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Call.Factory f26028c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Call f26029a;

    static {
        String str;
        Context applicationContext = MapLibre.getApplicationContext();
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            str = applicationContext.getPackageName() + "/" + packageInfo.versionName + " (" + packageInfo.versionCode + ")";
        } catch (Exception e2) {
            b.d0(e2);
            str = "";
        }
        String strD = str + " MapLibre Android/12.3.1 (ee9ddeb) Android/" + Build.VERSION.SDK_INT + " (" + Build.SUPPORTED_ABIS[0] + ")";
        int length = strD.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = strD.codePointAt(iCharCount);
            if (iCodePointAt <= 31 || iCodePointAt >= 127) {
                C0348i c0348i = new C0348i();
                c0348i.Q(0, iCharCount, strD);
                while (iCharCount < length) {
                    int iCodePointAt2 = strD.codePointAt(iCharCount);
                    c0348i.S((iCodePointAt2 <= 31 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                strD = c0348i.D();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        f26027b = strD;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Dispatcher dispatcher = new Dispatcher();
        synchronized (dispatcher) {
            dispatcher.f24014a = 20;
        }
        Dispatcher.c(dispatcher, null, null, null, 7);
        builder.f24083a = dispatcher;
        f26028c = new OkHttpClient(builder);
    }
}
