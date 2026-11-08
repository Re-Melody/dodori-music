package okhttp3;

import io.flutter.plugins.firebase.auth.C1956d;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Companion f24055B = new Companion(0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final List f24056C = _UtilJvmKt.j(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final List f24057D = _UtilJvmKt.j(new ConnectionSpec[]{ConnectionSpec.f23987g, ConnectionSpec.f23988h});

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ConnectionPool f24058A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dispatcher f24059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1956d f24062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Authenticator f24065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CookieJar f24068j;
    public final Dns k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProxySelector f24069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Authenticator f24070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f24071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f24072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X509TrustManager f24073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f24074q;
    public final List r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final OkHostnameVerifier f24075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CertificatePinner f24076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CertificateChainCleaner f24077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f24078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f24080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RouteDatabase f24081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TaskRunner f24082z;

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConnectionPool f24084b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1956d f24087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f24088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f24089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Authenticator f24090h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f24091i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f24092j;
        public final CookieJar k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Dns f24093l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Authenticator f24094m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final SocketFactory f24095n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final List f24096o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final List f24097p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final OkHostnameVerifier f24098q;
        public final CertificatePinner r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f24099s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f24100t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f24101u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Dispatcher f24083a = new Dispatcher();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24085c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f24086d = new ArrayList();

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f24022a;
            TimeZone timeZone = _UtilJvmKt.f24160a;
            m.f(eventListener$Companion$NONE$1, "<this>");
            this.f24087e = new C1956d(eventListener$Companion$NONE$1, 22);
            this.f24088f = true;
            this.f24089g = true;
            Authenticator authenticator = Authenticator.f23937a;
            this.f24090h = authenticator;
            this.f24091i = true;
            this.f24092j = true;
            this.k = CookieJar.f24011a;
            this.f24093l = Dns.f24020a;
            this.f24094m = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            m.e(socketFactory, "getDefault(...)");
            this.f24095n = socketFactory;
            OkHttpClient.f24055B.getClass();
            this.f24096o = OkHttpClient.f24057D;
            this.f24097p = OkHttpClient.f24056C;
            this.f24098q = OkHostnameVerifier.f24595a;
            this.r = CertificatePinner.f23960d;
            this.f24099s = 10000;
            this.f24100t = 10000;
            this.f24101u = 10000;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        this.f24059a = builder.f24083a;
        this.f24060b = _UtilJvmKt.i(builder.f24085c);
        this.f24061c = _UtilJvmKt.i(builder.f24086d);
        this.f24062d = builder.f24087e;
        this.f24063e = builder.f24088f;
        this.f24064f = builder.f24089g;
        this.f24065g = builder.f24090h;
        this.f24066h = builder.f24091i;
        this.f24067i = builder.f24092j;
        this.f24068j = builder.k;
        this.k = builder.f24093l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f24069l = proxySelector == null ? NullProxySelector.f24574a : proxySelector;
        this.f24070m = builder.f24094m;
        this.f24071n = builder.f24095n;
        List list = builder.f24096o;
        this.f24074q = list;
        this.r = builder.f24097p;
        this.f24075s = builder.f24098q;
        this.f24078v = builder.f24099s;
        this.f24079w = builder.f24100t;
        this.f24080x = builder.f24101u;
        this.f24081y = new RouteDatabase();
        this.f24082z = TaskRunner.f24185l;
        ConnectionPool connectionPool = builder.f24084b;
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            builder.f24084b = connectionPool;
        }
        this.f24058A = connectionPool;
        if (list != null && list.isEmpty()) {
            this.f24072o = null;
            this.f24077u = null;
            this.f24073p = null;
            this.f24076t = CertificatePinner.f23960d;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f24072o = null;
                this.f24077u = null;
                this.f24073p = null;
                this.f24076t = CertificatePinner.f23960d;
                break;
            }
            if (((ConnectionSpec) it.next()).f23989a) {
                Platform.f24547a.getClass();
                Platform.f24548b.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                m.c(trustManagers);
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        m.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        this.f24073p = x509TrustManager;
                        Platform platform = Platform.f24548b;
                        platform.getClass();
                        try {
                            SSLContext sSLContextL = platform.l();
                            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                            m.e(socketFactory, "getSocketFactory(...)");
                            this.f24072o = socketFactory;
                            CertificateChainCleaner.f24594a.getClass();
                            CertificateChainCleaner certificateChainCleanerC = Platform.f24548b.c(x509TrustManager);
                            this.f24077u = certificateChainCleanerC;
                            CertificatePinner certificatePinner = builder.r;
                            certificatePinner.getClass();
                            this.f24076t = m.b(certificatePinner.f23962b, certificateChainCleanerC) ? certificatePinner : new CertificatePinner(certificatePinner.f23961a, certificateChainCleanerC);
                            break;
                        } catch (GeneralSecurityException e2) {
                            throw new AssertionError("No System TLS: " + e2, e2);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                m.e(string, "toString(...)");
                throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
            }
        }
        List list2 = this.f24060b;
        m.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f24061c;
        m.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        X509TrustManager x509TrustManager2 = this.f24073p;
        CertificateChainCleaner certificateChainCleaner = this.f24077u;
        SSLSocketFactory sSLSocketFactory = this.f24072o;
        List list4 = this.f24074q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f23989a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!m.b(this.f24076t, CertificatePinner.f23960d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        m.f(request, "request");
        return new RealCall(this, request);
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
