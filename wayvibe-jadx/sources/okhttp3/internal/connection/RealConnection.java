package okhttp3.internal.connection;

import E9.G;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskRunner f24278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Route f24279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f24280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f24281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handshake f24282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Protocol f24283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BufferedSocketKt$asBufferedSocket$1 f24284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectionListener$Companion$NONE$1 f24285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Http2Connection f24286j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f24292q;
    public long r;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket rawSocket, Socket javaNetSocket, Handshake handshake, Protocol protocol, BufferedSocketKt$asBufferedSocket$1 socket, ConnectionListener$Companion$NONE$1 connectionListener) {
        m.f(taskRunner, "taskRunner");
        m.f(connectionPool, "connectionPool");
        m.f(route, "route");
        m.f(rawSocket, "rawSocket");
        m.f(javaNetSocket, "javaNetSocket");
        m.f(protocol, "protocol");
        m.f(socket, "socket");
        m.f(connectionListener, "connectionListener");
        this.f24278b = taskRunner;
        this.f24279c = route;
        this.f24280d = rawSocket;
        this.f24281e = javaNetSocket;
        this.f24282f = handshake;
        this.f24283g = protocol;
        this.f24284h = socket;
        this.f24285i = connectionListener;
        this.f24291p = 1;
        this.f24292q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient client, Route failedRoute, IOException failure) {
        m.f(client, "client");
        m.f(failedRoute, "failedRoute");
        m.f(failure, "failure");
        if (failedRoute.f24148b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f24147a;
            address.f23933g.connectFailed(address.f23934h.h(), failedRoute.f24148b.address(), failure);
        }
        RouteDatabase routeDatabase = client.f24081y;
        synchronized (routeDatabase) {
            routeDatabase.f24317a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection connection, Settings settings) {
        m.f(connection, "connection");
        m.f(settings, "settings");
        synchronized (this) {
            this.f24291p = (settings.f24509a & 8) != 0 ? settings.f24510b[3] : f.API_PRIORITY_OTHER;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall call, IOException iOException) {
        boolean z10;
        m.f(call, "call");
        synchronized (this) {
            try {
                z10 = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f24286j != null) || (iOException instanceof ConnectionShutdownException)) {
                        z10 = !this.k;
                        this.k = true;
                        if (this.f24289n == 0) {
                            if (iOException != null) {
                                d(call.f24256a, this.f24279c, iOException);
                            }
                            this.f24288m++;
                        }
                    }
                } else if (((StreamResetException) iOException).f24511a == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.f24290o + 1;
                    this.f24290o = i10;
                    if (i10 > 1) {
                        z10 = !this.k;
                        this.k = true;
                        this.f24288m++;
                    }
                } else if (((StreamResetException) iOException).f24511a != ErrorCode.CANCEL || !call.f24271q) {
                    z10 = !this.k;
                    this.k = true;
                    this.f24288m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            getClass();
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.b(this.f24280d);
    }

    public final boolean e(Address address, ArrayList arrayList) {
        TimeZone timeZone = _UtilJvmKt.f24160a;
        if (this.f24292q.size() < this.f24291p && !this.k) {
            Route route = this.f24279c;
            if (route.f24147a.a(address)) {
                HttpUrl httpUrl = address.f23934h;
                String str = httpUrl.f24037d;
                Address address2 = route.f24147a;
                if (m.b(str, address2.f23934h.f24037d)) {
                    return true;
                }
                if (this.f24286j != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Route route2 = (Route) it.next();
                        Proxy.Type type = route2.f24148b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && route.f24148b.type() == type2) {
                            if (m.b(route.f24149c, route2.f24149c)) {
                                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f24595a;
                                if (address.f23930d != okHostnameVerifier) {
                                    break;
                                }
                                TimeZone timeZone2 = _UtilJvmKt.f24160a;
                                HttpUrl httpUrl2 = address2.f23934h;
                                if (httpUrl.f24038e != httpUrl2.f24038e) {
                                    break;
                                }
                                String str2 = httpUrl2.f24037d;
                                String hostname = httpUrl.f24037d;
                                boolean zB = m.b(hostname, str2);
                                Handshake handshake = this.f24282f;
                                if (!zB) {
                                    if (!this.f24287l && handshake != null) {
                                        List listA = handshake.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            m.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            okHostnameVerifier.getClass();
                                            if (!OkHostnameVerifier.c(hostname, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    CertificatePinner certificatePinner = address.f23931e;
                                    m.c(certificatePinner);
                                    m.c(handshake);
                                    List peerCertificates = handshake.a();
                                    m.f(hostname, "hostname");
                                    m.f(peerCertificates, "peerCertificates");
                                    Iterator it2 = certificatePinner.f23961a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    ((CertificatePinner.Pin) it2.next()).getClass();
                                    r.j0(null, "**.", false);
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f() {
        synchronized (this) {
            this.k = true;
        }
        getClass();
    }

    public final boolean g(boolean z10) {
        long j10;
        TimeZone timeZone = _UtilJvmKt.f24160a;
        long jNanoTime = System.nanoTime();
        if (this.f24280d.isClosed() || this.f24281e.isClosed() || this.f24281e.isInputShutdown() || this.f24281e.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f24286j;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f24423f) {
                    return false;
                }
                return http2Connection.f24430n >= http2Connection.f24429m || jNanoTime < http2Connection.f24431o;
            }
        }
        synchronized (this) {
            j10 = jNanoTime - this.r;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        Socket socket = this.f24281e;
        G source = this.f24284h.f24199b;
        m.f(socket, "<this>");
        m.f(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.f24279c;
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        Protocol protocol = this.f24283g;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f24281e.setSoTimeout(0);
            Object obj = this.f24285i;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.f24383a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.f24278b);
            BufferedSocketKt$asBufferedSocket$1 socket = this.f24284h;
            String peerName = this.f24279c.f24147a.f23934h.f24037d;
            m.f(socket, "socket");
            m.f(peerName, "peerName");
            builder.f24442b = socket;
            String str = _UtilJvmKt.f24161b + ' ' + peerName;
            m.f(str, "<set-?>");
            builder.f24443c = str;
            builder.f24444d = this;
            m.f(flowControlListener, "flowControlListener");
            builder.f24446f = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.f24286j = http2Connection;
            Http2Connection.f24417z.getClass();
            Settings settings = Http2Connection.f24416A;
            this.f24291p = (settings.f24509a & 8) != 0 ? settings.f24510b[3] : f.API_PRIORITY_OTHER;
            Http2Writer http2Writer = http2Connection.f24438w;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.f24498d) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.f24494f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.f24412b.l(), new Object[0]));
                    }
                    http2Writer.f24495a.o(Http2.f24412b);
                    http2Writer.f24495a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.f24438w;
            Settings settings2 = http2Connection.f24433q;
            http2Writer2.getClass();
            m.f(settings2, "settings");
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.f24498d) {
                        throw new IOException("closed");
                    }
                    http2Writer2.e(0, Integer.bitCount(settings2.f24509a) * 6, 4, 0);
                    for (int i10 = 0; i10 < 10; i10++) {
                        boolean z10 = true;
                        if (((1 << i10) & settings2.f24509a) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            http2Writer2.f24495a.h(i10);
                            http2Writer2.f24495a.i(settings2.f24510b[i10]);
                        }
                    }
                    http2Writer2.f24495a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = http2Connection.f24433q.a();
            if (iA != 65535) {
                http2Connection.f24438w.w(0, iA - 65535);
            }
            TaskQueue.b(http2Connection.f24424g.d(), http2Connection.f24420c, http2Connection.f24439x, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.f24279c;
        sb.append(route.f24147a.f23934h.f24037d);
        sb.append(':');
        sb.append(route.f24147a.f23934h.f24038e);
        sb.append(", proxy=");
        sb.append(route.f24148b);
        sb.append(" hostAddress=");
        sb.append(route.f24149c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f24282f;
        if (handshake == null || (obj = handshake.f24026b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f24283g);
        sb.append('}');
        return sb.toString();
    }
}
