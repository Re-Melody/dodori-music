package S3;

import T3.k;
import T3.l;
import T3.m;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f11087a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f11087a = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set) {
        if (!k.f11609d.b()) {
            throw k.a();
        }
        m mVarD = d(webView);
    }

    public static void b(WebView webView, String str, Set set, d dVar) {
        if (!k.f11608c.b()) {
            throw k.a();
        }
        m mVarD = d(webView);
        mVarD.f11616a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new S9.a(new p268z7.c(dVar, 21)));
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static m d(WebView webView) {
        if (!k.f11614i.b()) {
            return new m(l.f11615a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f11087a;
        m mVar = (m) weakHashMap.get(webView);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(l.f11615a.createWebView(webView));
        weakHashMap.put(webView, mVar2);
        return mVar2;
    }
}
