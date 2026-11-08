package D4;

import B2.AbstractC0111a;
import F2.d0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2086e;

    public q(int i10, int i11) {
        switch (i11) {
            case 1:
                this.f2082a = i10;
                byte[] bArr = new byte[131];
                this.f2085d = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f2082a = i10;
                byte[] bArr2 = new byte[131];
                this.f2085d = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a() {
        this.f2083b = false;
        this.f2084c = false;
    }

    public void b(int i10) {
        X4.a.q(!this.f2083b);
        boolean z10 = i10 == this.f2082a;
        this.f2083b = z10;
        if (z10) {
            this.f2086e = 3;
            this.f2084c = false;
        }
    }

    public void c(byte[] bArr, int i10, int i11) {
        if (this.f2083b) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f2085d;
            int length = bArr2.length;
            int i13 = this.f2086e;
            if (length < i13 + i12) {
                this.f2085d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f2085d, this.f2086e, i12);
            this.f2086e += i12;
        }
    }

    public void d(byte[] bArr, int i10, int i11) {
        if (this.f2083b) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f2085d;
            int length = bArr2.length;
            int i13 = this.f2086e;
            if (length < i13 + i12) {
                this.f2085d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f2085d, this.f2086e, i12);
            this.f2086e += i12;
        }
    }

    public boolean e(int i10) {
        if (!this.f2083b) {
            return false;
        }
        this.f2086e -= i10;
        this.f2083b = false;
        this.f2084c = true;
        return true;
    }

    public boolean f(int i10) {
        if (!this.f2083b) {
            return false;
        }
        this.f2086e -= i10;
        this.f2083b = false;
        this.f2084c = true;
        return true;
    }

    public void g(int i10) {
        this.f2083b |= i10 > 0;
        this.f2082a += i10;
    }

    public void h() {
        this.f2083b = false;
        this.f2084c = false;
    }

    public void i(int i10) {
        AbstractC0111a.h(!this.f2083b);
        boolean z10 = i10 == this.f2082a;
        this.f2083b = z10;
        if (z10) {
            this.f2086e = 3;
            this.f2084c = false;
        }
    }

    public q(d0 d0Var) {
        this.f2085d = d0Var;
    }
}
