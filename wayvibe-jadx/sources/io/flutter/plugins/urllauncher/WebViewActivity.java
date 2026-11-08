package io.flutter.plugins.urllauncher;

import B2.r;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p254y1.a;
import p269z8.g;
import p269z8.i;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21044e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f21047c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21045a = new r(this, 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21046b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntentFilter f21048d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f21047c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map2 = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map2.put(str, bundleExtra.getString(str));
            }
            map = map2;
        }
        this.f21047c.loadUrl(stringExtra, map);
        this.f21047c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f21047c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f21047c.setWebViewClient(this.f21046b);
        this.f21047c.getSettings().setSupportMultipleWindows(true);
        this.f21047c.setWebChromeClient(new i(this));
        a.registerReceiver(this, this.f21045a, this.f21048d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f21045a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f21047c.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f21047c.goBack();
        return true;
    }
}
