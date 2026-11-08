package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f24022a;

    public static final class AggregateEventListener extends EventListener {
        @Override // okhttp3.EventListener
        public final void a(Call call, Response response) {
            m.f(call, "call");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void b(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            m.f(call, "call");
            m.f(inetSocketAddress, "inetSocketAddress");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void c(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
            m.f(call, "call");
            m.f(inetSocketAddress, "inetSocketAddress");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void d(Call call, Connection connection) {
            m.f(call, "call");
            m.f(connection, "connection");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void e(Call call, Connection connection) {
            m.f(call, "call");
            m.f(connection, "connection");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void f(Call call) {
            m.f(call, "call");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void g(Call call, IOException ioe) {
            m.f(call, "call");
            m.f(ioe, "ioe");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void h(Call call) {
            m.f(call, "call");
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void i(Call call, IOException ioe) {
            m.f(call, "call");
            m.f(ioe, "ioe");
            throw null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.EventListener$Companion$NONE$1] */
    static {
        new Companion(0);
        f24022a = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
        };
    }

    public void a(Call call, Response response) {
        m.f(call, "call");
    }

    public void b(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        m.f(call, "call");
        m.f(inetSocketAddress, "inetSocketAddress");
    }

    public void c(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        m.f(call, "call");
        m.f(inetSocketAddress, "inetSocketAddress");
    }

    public void d(Call call, Connection connection) {
        m.f(call, "call");
        m.f(connection, "connection");
    }

    public void e(Call call, Connection connection) {
        m.f(call, "call");
        m.f(connection, "connection");
    }

    public void f(Call call) {
        m.f(call, "call");
    }

    public void g(Call call, IOException ioe) {
        m.f(call, "call");
        m.f(ioe, "ioe");
    }

    public void h(Call call) {
        m.f(call, "call");
    }

    public void i(Call call, IOException ioe) {
        m.f(call, "call");
        m.f(ioe, "ioe");
    }
}
