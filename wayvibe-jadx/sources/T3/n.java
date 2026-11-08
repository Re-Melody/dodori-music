package T3;

import android.webkit.WebView;
import com.revenuecat.purchases.ui.revenuecatui.components.webview.PaywallWebViewStartUp;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ProfileStoreBoundaryInterface getProfileStore();

    StaticsBoundaryInterface getStatics();

    String[] i();

    void j(S3.g gVar, A8.b bVar);

    void p(S3.g gVar, PaywallWebViewStartUp.AnonymousClass1 anonymousClass1);
}
