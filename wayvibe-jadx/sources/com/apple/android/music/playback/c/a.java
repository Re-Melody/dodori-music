package com.apple.android.music.playback.c;

import V0.p;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.WindowManager;
import com.apple.android.music.playback.model.PlayerMediaItem;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
abstract class a implements d, com.apple.android.music.playback.d.a.InterfaceC0015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f17021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.d.a f17022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f17023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager f17024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f17025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<d.a> f17026f;

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17021a = applicationContext;
        this.f17023c = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f17024d = (WindowManager) applicationContext.getSystemService("window");
        this.f17025e = new Rect();
        this.f17026f = new CopyOnWriteArraySet();
        com.apple.android.music.playback.d.a aVarA = com.apple.android.music.playback.d.a.a(applicationContext);
        this.f17022b = aVarA;
        aVarA.a(this);
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean a() {
        return this.f17022b.e() > 0;
    }

    @Override // com.apple.android.music.playback.c.d
    public File b() {
        File file = new File(n(), "foothill");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Override // com.apple.android.music.playback.c.d
    public File c() {
        File file = new File(n(), "playback_assets");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Override // com.apple.android.music.playback.c.d
    public long d() {
        return this.f17022b.e();
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean e() {
        return this.f17022b.d() == 1;
    }

    @Override // com.apple.android.music.playback.c.d
    public Context f() {
        return this.f17021a;
    }

    @Override // com.apple.android.music.playback.c.d
    public File g() {
        File file = new File(n(), "playback_queue");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Override // com.apple.android.music.playback.c.d
    public File h() {
        File file = new File(this.f17021a.getCacheDir(), "player");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean i() {
        NetworkInfo activeNetworkInfo = this.f17023c.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        if (activeNetworkInfo.getType() != 0) {
            return true;
        }
        return this.f17022b.f();
    }

    @Override // com.apple.android.music.playback.c.d
    public String j() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return country.isEmpty() ? language : p.B(language, "-", country);
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean k() {
        return this.f17022b.g();
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean l() {
        return this.f17022b.d() != 0;
    }

    @Override // com.apple.android.music.playback.c.d
    public int m() {
        NetworkInfo activeNetworkInfo = this.f17023c.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public abstract File n();

    @Override // com.apple.android.music.playback.d.a.InterfaceC0015a
    public void o() {
        Iterator<d.a> it = this.f17026f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.apple.android.music.playback.d.a.InterfaceC0015a
    public void p() {
        Iterator<d.a> it = this.f17026f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.apple.android.music.playback.c.d
    public long q() {
        return -1L;
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean r() {
        try {
            return Runtime.getRuntime().exec("/system/bin/ping -c 1 captive.apple.com").waitFor() == 0;
        } catch (Exception e2) {
            e2.toString();
            return false;
        }
    }

    @Override // com.apple.android.music.playback.c.d
    public String s() {
        return null;
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean a(PlayerMediaItem playerMediaItem) {
        int iE = playerMediaItem.e();
        int type = playerMediaItem.getType();
        if (type == 3) {
            return iE <= this.f17022b.k();
        }
        if (type != 4) {
            return !playerMediaItem.isExplicitContent() || this.f17022b.i();
        }
        return iE <= this.f17022b.j();
    }

    @Override // com.apple.android.music.playback.c.d
    public boolean b(String str) {
        if ("480p".equals(str) || "sdmv".equals(str)) {
            return true;
        }
        if (!"720p".equals(str) && !"hdmv".equals(str)) {
            return false;
        }
        this.f17024d.getDefaultDisplay().getRectSize(this.f17025e);
        int iWidth = this.f17025e.width();
        int iHeight = this.f17025e.height();
        if (iWidth > iHeight) {
            return iWidth >= 1280 && iHeight >= 720;
        }
        return iHeight >= 1280 && iWidth >= 720;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // com.apple.android.music.playback.c.d
    public boolean a(String str) throws Throwable {
        IOException e2;
        HttpURLConnection httpURLConnection;
        ?? r10 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(PipesIterator.DEFAULT_QUEUE_SIZE);
                    httpURLConnection.setReadTimeout(PipesIterator.DEFAULT_QUEUE_SIZE);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.getInputStream();
                    boolean z10 = httpURLConnection.getResponseCode() == 200;
                    httpURLConnection.disconnect();
                    return z10;
                } catch (IOException e4) {
                    e2 = e4;
                    e2.toString();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                }
            } catch (IOException e7) {
                e2 = e7;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                if (r10 != 0) {
                    r10.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r10 = str;
            if (r10 != 0) {
                r10.disconnect();
            }
            throw th;
        }
    }

    @Override // com.apple.android.music.playback.c.d
    public void b(d.a aVar) {
        this.f17026f.remove(aVar);
    }

    @Override // com.apple.android.music.playback.c.d
    public void a(d.a aVar) {
        this.f17026f.add(aVar);
    }
}
