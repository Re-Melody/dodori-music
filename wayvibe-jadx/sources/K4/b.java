package K4;

import W4.c;
import W4.e;
import X4.j;
import java.util.Arrays;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f7371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f7373i;

    public b(c cVar, e eVar, int i10, n nVar, int i11, Object obj, byte[] bArr) {
        super(cVar, eVar, i10, nVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f7371g = bArr;
    }

    @Override // K4.a
    public final long a() {
        return this.f7372h;
    }

    public abstract void b(byte[] bArr, int i10);

    @Override // W4.k
    public final void d() {
        this.f7373i = true;
    }

    @Override // W4.k
    public final boolean e() {
        return this.f7373i;
    }

    @Override // W4.k
    public final void f() {
        try {
            this.f7370f.a(this.f7365a);
            int iA = 0;
            this.f7372h = 0;
            while (iA != -1 && !this.f7373i) {
                byte[] bArr = this.f7371g;
                if (bArr == null) {
                    this.f7371g = new byte[16384];
                } else if (bArr.length < this.f7372h + 16384) {
                    this.f7371g = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iA = this.f7370f.a(this.f7371g, this.f7372h, 16384);
                if (iA != -1) {
                    this.f7372h += iA;
                }
            }
            if (!this.f7373i) {
                b(this.f7371g, this.f7372h);
            }
        } finally {
            j.e(this.f7370f);
        }
    }
}
