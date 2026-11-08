package D8;

import B2.AbstractC0112b;
import B8.AbstractC0124k;
import B8.C0125l;
import B8.InterfaceC0126m;
import com.google.protobuf.AbstractC1230a;
import com.google.protobuf.AbstractC1267t;
import com.google.protobuf.C1265s;
import com.google.protobuf.C1273w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: D8.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0315t1 implements InterfaceC0282i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0263c f2788a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E8.x f2790c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.firebase.firestore.Z f2794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v2 f2795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2797j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2798l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2789b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0126m f2791d = C0125l.f832b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0312s1 f2792e = new C0312s1(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteBuffer f2793f = ByteBuffer.allocate(5);
    public int k = -1;

    public C0315t1(AbstractC0263c abstractC0263c, com.google.firebase.firestore.Z z10, v2 v2Var) {
        this.f2788a = abstractC0263c;
        this.f2794g = z10;
        this.f2795h = v2Var;
    }

    public static int i(H8.a aVar, OutputStream outputStream) throws IOException {
        AbstractC1230a abstractC1230a = aVar.f6233a;
        if (abstractC1230a != null) {
            int iC = ((com.google.protobuf.J) abstractC1230a).c(null);
            AbstractC1230a abstractC1230a2 = aVar.f6233a;
            abstractC1230a2.getClass();
            int iC2 = ((com.google.protobuf.J) abstractC1230a2).c(null);
            Logger logger = AbstractC1267t.f18812d;
            if (iC2 > 4096) {
                iC2 = 4096;
            }
            C1265s c1265s = new C1265s(outputStream, iC2);
            abstractC1230a2.e(c1265s);
            if (c1265s.f18807h > 0) {
                c1265s.f0();
            }
            aVar.f6233a = null;
            return iC;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f6235c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C1273w c1273w = H8.c.f6240a;
        p229v9.a.k(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = byteArrayInputStream.read(bArr);
            if (i10 == -1) {
                int i11 = (int) j10;
                aVar.f6235c = null;
                return i11;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        E8.x xVar = this.f2790c;
        this.f2790c = null;
        this.f2788a.v(xVar, z10, z11, this.f2797j);
        this.f2797j = 0;
    }

    @Override // D8.InterfaceC0282i0
    public final InterfaceC0282i0 b(InterfaceC0126m interfaceC0126m) {
        this.f2791d = interfaceC0126m;
        return this;
    }

    @Override // D8.InterfaceC0282i0
    public final void c(int i10) {
        p229v9.a.o("max size already set", this.f2789b == -1);
        this.f2789b = i10;
    }

    @Override // D8.InterfaceC0282i0
    public final void close() {
        if (this.f2796i) {
            return;
        }
        this.f2796i = true;
        E8.x xVar = this.f2790c;
        if (xVar != null && xVar.f3324c == 0) {
            this.f2790c = null;
        }
        a(true, true);
    }

    @Override // D8.InterfaceC0282i0
    public final boolean d() {
        return this.f2796i;
    }

    @Override // D8.InterfaceC0282i0
    public final void e(H8.a aVar) {
        if (this.f2796i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f2797j++;
        int i10 = this.k + 1;
        this.k = i10;
        this.f2798l = 0L;
        v2 v2Var = this.f2795h;
        for (AbstractC0124k abstractC0124k : v2Var.f2824a) {
            abstractC0124k.i(i10);
        }
        boolean z10 = this.f2791d != C0125l.f832b;
        try {
            int iAvailable = aVar.available();
            int iJ = (iAvailable == 0 || !z10) ? j(aVar, iAvailable) : g(aVar);
            if (iAvailable != -1 && iJ != iAvailable) {
                throw new B8.t0(B8.r0.f855m.g(AbstractC0112b.e("Message length inaccurate ", iJ, iAvailable, " != ")));
            }
            long j10 = iJ;
            AbstractC0124k[] abstractC0124kArr = v2Var.f2824a;
            for (AbstractC0124k abstractC0124k2 : abstractC0124kArr) {
                abstractC0124k2.k(j10);
            }
            long j11 = this.f2798l;
            for (AbstractC0124k abstractC0124k3 : abstractC0124kArr) {
                abstractC0124k3.l(j11);
            }
            int i11 = this.k;
            long j12 = this.f2798l;
            AbstractC0124k[] abstractC0124kArr2 = v2Var.f2824a;
            int length = abstractC0124kArr2.length;
            int i12 = 0;
            while (i12 < length) {
                long j13 = j10;
                abstractC0124kArr2[i12].j(i11, j12, j13);
                i12++;
                j10 = j13;
            }
        } catch (B8.t0 e2) {
            throw e2;
        } catch (IOException e4) {
            throw new B8.t0(B8.r0.f855m.g("Failed to frame message").f(e4));
        } catch (RuntimeException e7) {
            throw new B8.t0(B8.r0.f855m.g("Failed to frame message").f(e7));
        }
    }

    public final void f(C0309r1 c0309r1, boolean z10) {
        ArrayList arrayList = c0309r1.f2771a;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((E8.x) it.next()).f3324c;
        }
        int i11 = this.f2789b;
        if (i11 >= 0 && i10 > i11) {
            B8.r0 r0Var = B8.r0.k;
            Locale locale = Locale.US;
            throw new B8.t0(r0Var.g("message too large " + i10 + " > " + i11));
        }
        ByteBuffer byteBuffer = this.f2793f;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(i10);
        this.f2794g.getClass();
        E8.x xVarG = com.google.firebase.firestore.Z.g(5);
        xVarG.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i10 == 0) {
            this.f2790c = xVarG;
            return;
        }
        int i12 = this.f2797j - 1;
        AbstractC0263c abstractC0263c = this.f2788a;
        abstractC0263c.v(xVarG, false, false, i12);
        this.f2797j = 1;
        for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
            abstractC0263c.v((E8.x) arrayList.get(i13), false, false, 0);
        }
        this.f2790c = (E8.x) p134m1.b.i(1, arrayList);
        this.f2798l = i10;
    }

    @Override // D8.InterfaceC0282i0
    public final void flush() {
        E8.x xVar = this.f2790c;
        if (xVar == null || xVar.f3324c <= 0) {
            return;
        }
        a(false, true);
    }

    public final int g(H8.a aVar) throws IOException {
        C0309r1 c0309r1 = new C0309r1(this);
        OutputStream outputStreamF = this.f2791d.f(c0309r1);
        try {
            int i10 = i(aVar, outputStreamF);
            outputStreamF.close();
            int i11 = this.f2789b;
            if (i11 < 0 || i10 <= i11) {
                f(c0309r1, true);
                return i10;
            }
            B8.r0 r0Var = B8.r0.k;
            Locale locale = Locale.US;
            throw new B8.t0(r0Var.g("message too large " + i10 + " > " + i11));
        } catch (Throwable th) {
            outputStreamF.close();
            throw th;
        }
    }

    public final void h(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            E8.x xVar = this.f2790c;
            if (xVar != null && xVar.f3323b == 0) {
                a(false, false);
            }
            if (this.f2790c == null) {
                this.f2794g.getClass();
                this.f2790c = com.google.firebase.firestore.Z.g(i11);
            }
            int iMin = Math.min(i11, this.f2790c.f3323b);
            this.f2790c.a(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    public final int j(H8.a aVar, int i10) throws IOException {
        if (i10 == -1) {
            C0309r1 c0309r1 = new C0309r1(this);
            int i11 = i(aVar, c0309r1);
            f(c0309r1, false);
            return i11;
        }
        this.f2798l = i10;
        int i12 = this.f2789b;
        if (i12 >= 0 && i10 > i12) {
            B8.r0 r0Var = B8.r0.k;
            Locale locale = Locale.US;
            throw new B8.t0(r0Var.g("message too large " + i10 + " > " + i12));
        }
        ByteBuffer byteBuffer = this.f2793f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i10);
        if (this.f2790c == null) {
            int iPosition = byteBuffer.position() + i10;
            this.f2794g.getClass();
            this.f2790c = com.google.firebase.firestore.Z.g(iPosition);
        }
        h(byteBuffer.array(), 0, byteBuffer.position());
        return i(aVar, this.f2792e);
    }
}
