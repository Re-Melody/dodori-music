package p213u3;

import B2.AbstractC0111a;
import B2.u;
import Z2.k;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f27198f = new int[ColorExtractionConstants.COLOR_COMPONENT_MASK];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f27199g = new u(ColorExtractionConstants.COLOR_COMPONENT_MASK);

    public final boolean a(k kVar, boolean z10) throws D, EOFException {
        boolean zF;
        boolean zF2;
        this.f27193a = 0;
        this.f27194b = 0L;
        this.f27195c = 0;
        this.f27196d = 0;
        this.f27197e = 0;
        u uVar = this.f27199g;
        uVar.C(27);
        try {
            zF = kVar.f(uVar.f630a, 0, 27, z10);
        } catch (EOFException e2) {
            if (!z10) {
                throw e2;
            }
            zF = false;
        }
        if (zF && uVar.v() == 1332176723) {
            if (uVar.t() == 0) {
                this.f27193a = uVar.t();
                this.f27194b = uVar.j();
                uVar.k();
                uVar.k();
                uVar.k();
                int iT = uVar.t();
                this.f27195c = iT;
                this.f27196d = iT + 27;
                uVar.C(iT);
                try {
                    zF2 = kVar.f(uVar.f630a, 0, this.f27195c, z10);
                } catch (EOFException e4) {
                    if (!z10) {
                        throw e4;
                    }
                    zF2 = false;
                }
                if (zF2) {
                    for (int i10 = 0; i10 < this.f27195c; i10++) {
                        int iT2 = uVar.t();
                        this.f27198f[i10] = iT2;
                        this.f27197e += iT2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw D.d("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(k kVar, long j10) throws EOFException, InterruptedIOException {
        boolean zF;
        AbstractC0111a.d(kVar.f13549d == kVar.i());
        u uVar = this.f27199g;
        uVar.C(4);
        while (true) {
            if (j10 != -1 && kVar.f13549d + 4 >= j10) {
                break;
            }
            try {
                zF = kVar.f(uVar.f630a, 0, 4, true);
            } catch (EOFException unused) {
                zF = false;
            }
            if (!zF) {
                break;
            }
            uVar.F(0);
            if (uVar.v() == 1332176723) {
                kVar.f13551f = 0;
                return true;
            }
            kVar.p(1);
        }
        do {
            if (j10 != -1 && kVar.f13549d >= j10) {
                break;
            }
        } while (kVar.g(1) != -1);
        return false;
    }
}
