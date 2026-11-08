package E9;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0350k f3335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0348i f3336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f3337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3340f;

    public D(InterfaceC0350k interfaceC0350k) {
        this.f3335a = interfaceC0350k;
        C0348i c0348iM = interfaceC0350k.m();
        this.f3336b = c0348iM;
        H h10 = c0348iM.f3386a;
        this.f3337c = h10;
        this.f3338d = h10 != null ? h10.f3349b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3339e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f3349b) goto L15;
     */
    @Override // E9.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(long r9, E9.C0348i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.m.f(r11, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f3339e
            if (r3 != 0) goto L63
            E9.H r3 = r8.f3337c
            E9.i r4 = r8.f3336b
            if (r3 == 0) goto L2b
            E9.H r5 = r4.f3386a
            if (r3 != r5) goto L23
            int r3 = r8.f3338d
            kotlin.jvm.internal.m.c(r5)
            int r5 = r5.f3349b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f3340f
            r2 = 1
            long r0 = r0 + r2
            E9.k r2 = r8.f3335a
            boolean r0 = r2.s(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            E9.H r0 = r8.f3337c
            if (r0 != 0) goto L4c
            E9.H r0 = r4.f3386a
            if (r0 == 0) goto L4c
            r8.f3337c = r0
            int r0 = r0.f3349b
            r8.f3338d = r0
        L4c:
            long r0 = r4.f3387b
            long r2 = r8.f3340f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            E9.i r2 = r8.f3336b
            long r4 = r8.f3340f
            r3 = r11
            r2.e(r3, r4, r6)
            long r9 = r8.f3340f
            long r9 = r9 + r6
            r8.f3340f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r9 = V0.p.j(r9, r11)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.D.d(long, E9.i):long");
    }

    @Override // E9.M
    public final O f() {
        return this.f3335a.f();
    }
}
