package okhttp3.internal.http2;

import E9.C0348i;
import E9.InterfaceC0349j;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Writer implements Closeable, Lockable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f24494f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0349j f24495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0348i f24496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Hpack.Writer f24499e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f24494f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(InterfaceC0349j sink) {
        m.f(sink, "sink");
        this.f24495a = sink;
        C0348i c0348i = new C0348i();
        this.f24496b = c0348i;
        this.f24497c = 16384;
        this.f24499e = new Hpack.Writer(c0348i);
    }

    public final void b(Settings peerSettings) {
        m.f(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f24498d) {
                    throw new IOException("closed");
                }
                int i10 = this.f24497c;
                int i11 = peerSettings.f24509a;
                if ((i11 & 32) != 0) {
                    i10 = peerSettings.f24510b[5];
                }
                this.f24497c = i10;
                if (((i11 & 2) != 0 ? peerSettings.f24510b[1] : -1) != -1) {
                    Hpack.Writer writer = this.f24499e;
                    int i12 = (i11 & 2) != 0 ? peerSettings.f24510b[1] : -1;
                    writer.getClass();
                    int iMin = Math.min(i12, 16384);
                    int i13 = writer.f24406d;
                    if (i13 != iMin) {
                        if (iMin < i13) {
                            writer.f24404b = Math.min(writer.f24404b, iMin);
                        }
                        writer.f24405c = true;
                        writer.f24406d = iMin;
                        int i14 = writer.f24410h;
                        if (iMin < i14) {
                            if (iMin == 0) {
                                Header[] headerArr = writer.f24407e;
                                N8.m.p0(headerArr, 0, headerArr.length);
                                writer.f24408f = writer.f24407e.length - 1;
                                writer.f24409g = 0;
                                writer.f24410h = 0;
                            } else {
                                writer.a(i14 - iMin);
                            }
                        }
                    }
                }
                e(0, 0, 4, 1);
                this.f24495a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z10, int i10, C0348i c0348i, int i11) {
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            e(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                m.c(c0348i);
                this.f24495a.r(i11, c0348i);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f24498d = true;
            this.f24495a.close();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        if (i12 != 8) {
            Level level = Level.FINE;
            Logger logger = f24494f;
            if (logger.isLoggable(level)) {
                Http2.f24411a.getClass();
                logger.fine(Http2.b(false, i10, i11, i12, i13));
            }
        }
        if (i11 > this.f24497c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f24497c + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = _UtilCommonKt.f24159a;
        InterfaceC0349j interfaceC0349j = this.f24495a;
        m.f(interfaceC0349j, "<this>");
        interfaceC0349j.j((i11 >>> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        interfaceC0349j.j((i11 >>> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        interfaceC0349j.j(i11 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        interfaceC0349j.j(i12 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        interfaceC0349j.j(i13 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        interfaceC0349j.i(i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void flush() {
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            this.f24495a.flush();
        }
    }

    public final void g(int i10, ErrorCode errorCode, byte[] bArr) {
        m.f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            if (errorCode.f() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, bArr.length + 8, 7, 0);
            this.f24495a.i(i10);
            this.f24495a.i(errorCode.f());
            if (bArr.length != 0) {
                this.f24495a.u(bArr);
            }
            this.f24495a.flush();
        }
    }

    public final void l(boolean z10, int i10, ArrayList arrayList) {
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            this.f24499e.d(arrayList);
            long j10 = this.f24496b.f3387b;
            long jMin = Math.min(this.f24497c, j10);
            int i11 = j10 == jMin ? 4 : 0;
            if (z10) {
                i11 |= 1;
            }
            e(i10, (int) jMin, 1, i11);
            this.f24495a.r(jMin, this.f24496b);
            if (j10 > jMin) {
                long j11 = j10 - jMin;
                while (j11 > 0) {
                    long jMin2 = Math.min(this.f24497c, j11);
                    j11 -= jMin2;
                    e(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                    this.f24495a.r(jMin2, this.f24496b);
                }
            }
        }
    }

    public final void q(int i10, int i11, boolean z10) {
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            e(0, 8, 6, z10 ? 1 : 0);
            this.f24495a.i(i10);
            this.f24495a.i(i11);
            this.f24495a.flush();
        }
    }

    public final void v(int i10, ErrorCode errorCode) {
        m.f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f24498d) {
                throw new IOException("closed");
            }
            if (errorCode.f() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(i10, 4, 3, 0);
            this.f24495a.i(errorCode.f());
            this.f24495a.flush();
        }
    }

    public final void w(int i10, long j10) {
        synchronized (this) {
            try {
                if (this.f24498d) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f24494f;
                if (logger.isLoggable(Level.FINE)) {
                    Http2.f24411a.getClass();
                    logger.fine(Http2.c(i10, 4, j10, false));
                }
                e(i10, 4, 8, 0);
                this.f24495a.i((int) j10);
                this.f24495a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
