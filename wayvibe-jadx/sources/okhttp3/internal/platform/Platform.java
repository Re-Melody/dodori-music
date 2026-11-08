package okhttp3.internal.platform;

import E9.C0348i;
import N8.o;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f24547a = new Companion(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Platform f24548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f24549c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static ArrayList a(List protocols) {
            m.f(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(o.o0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            m.f(protocols, "protocols");
            C0348i c0348i = new C0348i();
            for (String str : a(protocols)) {
                c0348i.K(str.length());
                c0348i.R(str);
            }
            return c0348i.z(c0348i.f3387b);
        }

        private Companion() {
        }
    }

    static {
        PlatformRegistry.f24550a.getClass();
        AndroidLog.f24555a.getClass();
        try {
            for (Map.Entry entry : AndroidLog.f24557c.entrySet()) {
                AndroidLog.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        } catch (UnsatisfiedLinkError e4) {
            System.err.println("Possibly running android unit test without robolectric");
            e4.printStackTrace();
        }
        Android10Platform.f24535f.getClass();
        Platform android10Platform = Android10Platform.f24536g ? new Android10Platform() : null;
        if (android10Platform == null) {
            AndroidPlatform.f24539f.getClass();
            android10Platform = AndroidPlatform.f24541h ? new AndroidPlatform() : null;
        }
        if (android10Platform == null) {
            throw new IllegalStateException(b.j(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f24548b = android10Platform;
        f24549c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List protocols) {
        m.f(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        m.f(address, "address");
        socket.connect(address, i10);
    }

    public String g(SSLSocket sSLSocket) {
        return null;
    }

    public Object h() {
        if (f24549c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean i(String hostname) {
        m.f(hostname, "hostname");
        return true;
    }

    public void j(String message, int i10, Throwable th) {
        m.f(message, "message");
        f24549c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void k(Object obj, String message) {
        m.f(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        m.e(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
