package Z2;

import B2.AbstractC0111a;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13469a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13475g;

    public final void a(F f10, E e2) {
        if (this.f13471c > 0) {
            f10.a(this.f13472d, this.f13473e, this.f13474f, this.f13475g, e2);
            this.f13471c = 0;
        }
    }

    public final void b(F f10, long j10, int i10, int i11, int i12, E e2) {
        AbstractC0111a.g("TrueHD chunk samples must be contiguous in the sample queue.", this.f13475g <= i11 + i12);
        if (this.f13470b) {
            int i13 = this.f13471c;
            int i14 = i13 + 1;
            this.f13471c = i14;
            if (i13 == 0) {
                this.f13472d = j10;
                this.f13473e = i10;
                this.f13474f = 0;
            }
            this.f13474f += i11;
            this.f13475g = i12;
            if (i14 >= 16) {
                a(f10, e2);
            }
        }
    }

    public final void c(p pVar) {
        if (this.f13470b) {
            return;
        }
        byte[] bArr = this.f13469a;
        int i10 = 0;
        pVar.w(bArr, 0, 10);
        pVar.o();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i10 = 40 << ((bArr[(b10 & ForkServer.ERROR) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f13470b = true;
    }
}
