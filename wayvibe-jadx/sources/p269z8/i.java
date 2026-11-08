package p269z8;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f29910a;

    public i(WebViewActivity webViewActivity) {
        this.f29910a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        h hVar = new h(this);
        WebView webView2 = new WebView(this.f29910a.f21047c.getContext());
        webView2.setWebViewClient(hVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
