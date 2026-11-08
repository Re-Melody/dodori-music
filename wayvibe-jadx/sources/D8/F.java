package D8;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC0266d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x2 f2238e = new x2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x2 f2239f = new x2(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x2 f2240g = new x2(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x2 f2241h = new x2(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x2 f2242i = new x2(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f2243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f2244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2246d;

    public F() {
        new ArrayDeque(2);
        this.f2243a = new ArrayDeque();
    }

    @Override // D8.AbstractC0266d
    public final void A(int i10) {
        E(f2239f, i10, null, 0);
    }

    public final void B(AbstractC0266d abstractC0266d) throws IOException {
        boolean z10 = this.f2246d;
        ArrayDeque arrayDeque = this.f2243a;
        boolean z11 = z10 && arrayDeque.isEmpty();
        if (abstractC0266d instanceof F) {
            F f10 = (F) abstractC0266d;
            while (!f10.f2243a.isEmpty()) {
                arrayDeque.add((AbstractC0266d) f10.f2243a.remove());
            }
            this.f2245c += f10.f2245c;
            f10.f2245c = 0;
            f10.close();
        } else {
            arrayDeque.add(abstractC0266d);
            this.f2245c = abstractC0266d.x() + this.f2245c;
        }
        if (z11) {
            ((AbstractC0266d) arrayDeque.peek()).c();
        }
    }

    public final void C() throws IOException {
        boolean z10 = this.f2246d;
        ArrayDeque arrayDeque = this.f2243a;
        if (!z10) {
            ((AbstractC0266d) arrayDeque.remove()).close();
            return;
        }
        this.f2244b.add((AbstractC0266d) arrayDeque.remove());
        AbstractC0266d abstractC0266d = (AbstractC0266d) arrayDeque.peek();
        if (abstractC0266d != null) {
            abstractC0266d.c();
        }
    }

    public final int D(E e2, int i10, Object obj, int i11) throws IOException {
        b(i10);
        ArrayDeque arrayDeque = this.f2243a;
        if (!arrayDeque.isEmpty() && ((AbstractC0266d) arrayDeque.peek()).x() == 0) {
            C();
        }
        while (i10 > 0 && !arrayDeque.isEmpty()) {
            AbstractC0266d abstractC0266d = (AbstractC0266d) arrayDeque.peek();
            int iMin = Math.min(i10, abstractC0266d.x());
            i11 = e2.b(abstractC0266d, iMin, obj, i11);
            i10 -= iMin;
            this.f2245c -= iMin;
            if (((AbstractC0266d) arrayDeque.peek()).x() == 0) {
                C();
            }
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int E(x2 x2Var, int i10, Object obj, int i11) {
        try {
            return D(x2Var, i10, obj, i11);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // D8.AbstractC0266d
    public final void c() throws IOException {
        ArrayDeque arrayDeque = this.f2244b;
        ArrayDeque arrayDeque2 = this.f2243a;
        if (arrayDeque == null) {
            this.f2244b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f2244b.isEmpty()) {
            ((AbstractC0266d) this.f2244b.remove()).close();
        }
        this.f2246d = true;
        AbstractC0266d abstractC0266d = (AbstractC0266d) arrayDeque2.peek();
        if (abstractC0266d != null) {
            abstractC0266d.c();
        }
    }

    @Override // D8.AbstractC0266d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f2243a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC0266d) arrayDeque.remove()).close();
            }
        }
        if (this.f2244b != null) {
            while (!this.f2244b.isEmpty()) {
                ((AbstractC0266d) this.f2244b.remove()).close();
            }
        }
    }

    @Override // D8.AbstractC0266d
    public final boolean e() {
        Iterator it = this.f2243a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0266d) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [D8.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [D8.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [D8.F] */
    /* JADX WARN: Type inference failed for: r1v3, types: [D8.F] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // D8.AbstractC0266d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final D8.AbstractC0266d g(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            D8.M1 r8 = D8.N1.f2301a
            return r8
        L5:
            r7.b(r8)
            int r0 = r7.f2245c
            int r0 = r0 - r8
            r7.f2245c = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f2243a
            java.lang.Object r3 = r2.peek()
            D8.d r3 = (D8.AbstractC0266d) r3
            int r4 = r3.x()
            if (r4 <= r8) goto L23
            D8.d r8 = r3.g(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f2246d
            if (r5 == 0) goto L2f
            D8.d r3 = r3.g(r4)
            r7.C()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            D8.d r3 = (D8.AbstractC0266d) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            D8.F r1 = new D8.F
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.B(r0)
            r0 = r1
        L57:
            r1.B(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.F.g(int):D8.d");
    }

    @Override // D8.AbstractC0266d
    public final void l(OutputStream outputStream, int i10) throws IOException {
        D(f2242i, i10, outputStream, 0);
    }

    @Override // D8.AbstractC0266d
    public final void q(ByteBuffer byteBuffer) {
        E(f2241h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // D8.AbstractC0266d
    public final void v(byte[] bArr, int i10, int i11) {
        E(f2240g, i11, bArr, i10);
    }

    @Override // D8.AbstractC0266d
    public final int w() {
        return E(f2238e, 1, null, 0);
    }

    @Override // D8.AbstractC0266d
    public final int x() {
        return this.f2245c;
    }

    @Override // D8.AbstractC0266d
    public final void z() {
        if (!this.f2246d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f2243a;
        AbstractC0266d abstractC0266d = (AbstractC0266d) arrayDeque.peek();
        if (abstractC0266d != null) {
            int iX = abstractC0266d.x();
            abstractC0266d.z();
            this.f2245c = (abstractC0266d.x() - iX) + this.f2245c;
        }
        while (true) {
            AbstractC0266d abstractC0266d2 = (AbstractC0266d) this.f2244b.pollLast();
            if (abstractC0266d2 == null) {
                return;
            }
            abstractC0266d2.z();
            arrayDeque.addFirst(abstractC0266d2);
            this.f2245c = abstractC0266d2.x() + this.f2245c;
        }
    }

    public F(int i10) {
        new ArrayDeque(2);
        this.f2243a = new ArrayDeque(i10);
    }
}
