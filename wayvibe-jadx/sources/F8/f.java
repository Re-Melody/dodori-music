package F8;

import E9.C0348i;
import E9.G;
import E9.M;
import E9.O;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f4595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f4598f;

    public f(G g3) {
        this.f4593a = g3;
    }

    @Override // E9.M
    public final long d(long j10, C0348i c0348i) throws IOException {
        int i10;
        int i11;
        do {
            int i12 = this.f4597e;
            G g3 = this.f4593a;
            if (i12 == 0) {
                g3.skip(this.f4598f);
                this.f4598f = (short) 0;
                if ((this.f4595c & 4) == 0) {
                    i10 = this.f4596d;
                    int iA = j.a(g3);
                    this.f4597e = iA;
                    this.f4594b = iA;
                    byte b10 = (byte) (g3.readByte() & ForkServer.ERROR);
                    this.f4595c = (byte) (g3.readByte() & ForkServer.ERROR);
                    Logger logger = j.f4610a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(g.a(true, this.f4596d, this.f4594b, b10, this.f4595c));
                    }
                    i11 = g3.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    this.f4596d = i11;
                    if (b10 != 9) {
                        j.c("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                        throw null;
                    }
                }
            } else {
                long jD = g3.d(Math.min(j10, i12), c0348i);
                if (jD != -1) {
                    this.f4597e -= (int) jD;
                    return jD;
                }
            }
            return -1L;
        } while (i11 == i10);
        j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // E9.M
    public final O f() {
        return this.f4593a.f3345a.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
