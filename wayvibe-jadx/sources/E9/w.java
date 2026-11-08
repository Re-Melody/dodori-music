package E9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3426d;

    public w(G g3, Inflater inflater) {
        this.f3423a = g3;
        this.f3424b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3426d) {
            return;
        }
        this.f3424b.end();
        this.f3426d = true;
        this.f3423a.close();
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) throws IOException {
        long j11;
        kotlin.jvm.internal.m.f(sink, "sink");
        while (j10 >= 0) {
            if (this.f3426d) {
                throw new IllegalStateException("closed");
            }
            G g3 = this.f3423a;
            Inflater inflater = this.f3424b;
            if (j10 == 0) {
                j11 = 0;
            } else {
                try {
                    H hG = sink.G(1);
                    int iMin = (int) Math.min(j10, 8192 - hG.f3350c);
                    if (inflater.needsInput() && !g3.b()) {
                        H h10 = g3.f3346b.f3386a;
                        kotlin.jvm.internal.m.c(h10);
                        int i10 = h10.f3350c;
                        int i11 = h10.f3349b;
                        int i12 = i10 - i11;
                        this.f3425c = i12;
                        inflater.setInput(h10.f3348a, i11, i12);
                    }
                    int iInflate = inflater.inflate(hG.f3348a, hG.f3350c, iMin);
                    int i13 = this.f3425c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f3425c -= remaining;
                        g3.skip(remaining);
                    }
                    if (iInflate > 0) {
                        hG.f3350c += iInflate;
                        j11 = iInflate;
                        sink.f3387b += j11;
                    } else {
                        if (hG.f3349b == hG.f3350c) {
                            sink.f3386a = hG.a();
                            I.a(hG);
                        }
                        j11 = 0;
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            if (j11 > 0) {
                return j11;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (g3.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(V0.p.j(j10, "byteCount < 0: ").toString());
    }

    @Override // E9.M
    public final O f() {
        return this.f3423a.f3345a.f();
    }
}
