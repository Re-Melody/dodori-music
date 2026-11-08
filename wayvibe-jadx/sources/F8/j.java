package F8;

import E9.C0351l;
import E9.G;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f4610a = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0351l f4611b;

    static {
        C0351l c0351l = C0351l.f3388d;
        f4611b = p217u7.d.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(G g3) {
        return (g3.readByte() & ForkServer.ERROR) | ((g3.readByte() & ForkServer.ERROR) << 16) | ((g3.readByte() & ForkServer.ERROR) << 8);
    }

    public static int b(int i10, byte b10, short s8) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s8 <= i10) {
            return (short) (i10 - s8);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s8), Integer.valueOf(i10));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
