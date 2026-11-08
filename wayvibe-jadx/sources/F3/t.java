package F3;

import B2.AbstractC0111a;
import F.C0356a;
import Z2.C0963d;
import Z2.C0964e;
import Z2.C0966g;
import Z2.InterfaceC0965f;
import Z2.InterfaceC0967h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0963d f4467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0967h f4468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0964e f4469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4470d;

    public t(InterfaceC0965f interfaceC0965f, InterfaceC0967h interfaceC0967h, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f4468b = interfaceC0967h;
        this.f4470d = i10;
        this.f4467a = new C0963d(interfaceC0965f, j10, j11, j12, j13, j14);
    }

    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & ForkServer.ERROR) | ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
    }

    public static int c(Z2.k kVar, long j10, C0356a c0356a) {
        if (j10 == kVar.f13549d) {
            return 0;
        }
        c0356a.f3516a = j10;
        return 1;
    }

    public final int b(Z2.k kVar, C0356a c0356a) throws EOFException, InterruptedIOException {
        while (true) {
            C0964e c0964e = this.f4469c;
            AbstractC0111a.i(c0964e);
            long j10 = c0964e.f13526f;
            long j11 = c0964e.f13527g;
            long j12 = c0964e.f13528h;
            long j13 = j11 - j10;
            long j14 = this.f4470d;
            InterfaceC0967h interfaceC0967h = this.f4468b;
            if (j13 <= j14) {
                this.f4469c = null;
                interfaceC0967h.p();
                return c(kVar, j10, c0356a);
            }
            long j15 = j12 - kVar.f13549d;
            if (j15 < 0 || j15 > 262144) {
                return c(kVar, j12, c0356a);
            }
            kVar.p((int) j15);
            kVar.f13551f = 0;
            C0966g c0966gD = interfaceC0967h.d(kVar, c0964e.f13522b);
            int i10 = c0966gD.f13530a;
            if (i10 == -3) {
                this.f4469c = null;
                interfaceC0967h.p();
                return c(kVar, j12, c0356a);
            }
            long j16 = c0966gD.f13531b;
            long j17 = c0966gD.f13532c;
            if (i10 == -2) {
                c0964e.f13524d = j16;
                c0964e.f13526f = j17;
                c0964e.f13528h = C0964e.a(c0964e.f13522b, j16, c0964e.f13525e, j17, c0964e.f13527g, c0964e.f13523c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j18 = j17 - kVar.f13549d;
                    if (j18 >= 0 && j18 <= 262144) {
                        kVar.p((int) j18);
                    }
                    this.f4469c = null;
                    interfaceC0967h.p();
                    return c(kVar, j17, c0356a);
                }
                c0964e.f13525e = j16;
                c0964e.f13527g = j17;
                c0964e.f13528h = C0964e.a(c0964e.f13522b, c0964e.f13524d, j16, c0964e.f13526f, j17, c0964e.f13523c);
            }
        }
    }

    public final void d(long j10) {
        C0964e c0964e = this.f4469c;
        if (c0964e == null || c0964e.f13521a != j10) {
            C0963d c0963d = this.f4467a;
            this.f4469c = new C0964e(j10, c0963d.f13515a.e(j10), c0963d.f13517c, c0963d.f13518d, c0963d.f13519e, c0963d.f13520f);
        }
    }
}
