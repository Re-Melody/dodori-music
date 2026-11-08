package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import p097i9.a;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f24559e = new Companion(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f24560f = new AndroidSocketAdapter$Companion$factory$1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f24562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f24563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f24564d;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException {
        this.f24561a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        m.e(declaredMethod, "getDeclaredMethod(...)");
        this.f24562b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f24563c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f24564d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.f24561a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        AndroidPlatform.f24539f.getClass();
        return AndroidPlatform.f24541h;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (!this.f24561a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f24563c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, a.f20563a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof NullPointerException) && m.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e4);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        m.f(protocols, "protocols");
        if (this.f24561a.isInstance(sSLSocket)) {
            try {
                this.f24562b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f24564d;
                Platform.f24547a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }
}
