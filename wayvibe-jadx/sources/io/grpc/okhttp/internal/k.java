package io.grpc.okhttp.internal;

import E9.C0348i;
import U.W0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f21188b = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f21189c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f21190d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21191a;

    static {
        Logger logger;
        Object obj;
        int i10;
        Provider provider;
        Provider provider2;
        k kVar;
        j jVar;
        int i11 = 18;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i12 = 0;
        loop0: while (true) {
            logger = f21188b;
            obj = null;
            if (i12 >= length) {
                i10 = 1;
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i12];
            for (String str : f21189c) {
                i10 = 1;
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i12++;
        }
        if (provider != null) {
            W0 w10 = new W0(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i11);
            W0 w11 = new W0(obj, "setHostname", new Class[]{String.class}, i11);
            W0 w12 = new W0(byte[].class, "getAlpnSelectedProtocol", new Class[0], i11);
            W0 w13 = new W0(obj, "setAlpnProtocols", new Class[]{byte[].class}, i11);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                jVar = j.ALPN_AND_NPN;
            } else {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                    jVar = j.ALPN_AND_NPN;
                } catch (ClassNotFoundException e2) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        jVar = j.NPN;
                    } catch (ClassNotFoundException e4) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e4);
                        jVar = j.NONE;
                    }
                }
            }
            kVar = new g(w10, w11, w12, w13, provider, jVar);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new f(0))).invoke(sSLContext.createSSLEngine(), new Object[0]);
                        kVar = new h(provider4, (Method) AccessController.doPrivileged(new f(i10)), (Method) AccessController.doPrivileged(new f(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        try {
                            kVar = new g(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod(com.amazon.a.a.o.b.au, SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            provider2 = provider4;
                            kVar = new k(provider2);
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    provider2 = provider4;
                    kVar = new k(provider2);
                }
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(e7);
            }
        }
        f21190d = kVar;
    }

    public k(Provider provider) {
        this.f21191a = provider;
    }

    public static byte[] b(List list) {
        C0348i c0348i = new C0348i();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) list.get(i10);
            if (lVar != l.HTTP_1_0) {
                c0348i.K(lVar.toString().length());
                c0348i.R(lVar.toString());
            }
        }
        return c0348i.z(c0348i.f3387b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public j e() {
        return j.NONE;
    }
}
