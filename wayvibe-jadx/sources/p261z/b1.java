package p261z;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f29550a = new Q(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x005f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p262z0.InterfaceC2442b r8, S8.a r9) {
        /*
            boolean r0 = r9 instanceof p261z.F0
            if (r0 == 0) goto L13
            r0 = r9
            z.F0 r0 = (p261z.F0) r0
            int r1 = r0.f29406c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29406c = r1
            goto L18
        L13:
            z.F0 r0 = new z.F0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29405b
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.f29406c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z0.b r8 = r0.f29404a
            Q5.b.T(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            Q5.b.T(r9)
        L34:
            r0.f29404a = r8
            r0.f29406c = r3
            java.lang.Object r9 = p262z0.InterfaceC2442b.H(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            z0.i r9 = (p262z0.i) r9
            java.lang.Object r2 = r9.f29755a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            z0.r r7 = (p262z0.r) r7
            r7.a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.lang.Object r9 = r9.f29755a
            int r2 = r9.size()
        L5d:
            if (r5 >= r2) goto L6d
            java.lang.Object r4 = r9.get(r5)
            z0.r r4 = (p262z0.r) r4
            boolean r4 = r4.f29770d
            if (r4 == 0) goto L6a
            goto L34
        L6a:
            int r5 = r5 + 1
            goto L5d
        L6d:
            M8.D r8 = M8.D.f8402a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p261z.b1.a(z0.b, S8.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[LOOP:0: B:19:0x0057->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p262z0.InterfaceC2442b r10, boolean r11, p262z0.j r12, S8.a r13) {
        /*
            boolean r0 = r13 instanceof p261z.D0
            if (r0 == 0) goto L13
            r0 = r13
            z.D0 r0 = (p261z.D0) r0
            int r1 = r0.f29379e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29379e = r1
            goto L18
        L13:
            z.D0 r0 = new z.D0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f29378d
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.f29379e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f29377c
            z0.j r11 = r0.f29376b
            z0.b r12 = r0.f29375a
            Q5.b.T(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4d
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            Q5.b.T(r13)
        L3c:
            r0.f29375a = r10
            r0.f29376b = r12
            r0.f29377c = r11
            r0.f29379e = r3
            z0.D r10 = (p262z0.D) r10
            java.lang.Object r13 = r10.b(r12, r0)
            if (r13 != r1) goto L4d
            return r1
        L4d:
            z0.i r13 = (p262z0.i) r13
            java.lang.Object r2 = r13.f29755a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L57:
            if (r6 >= r4) goto L7e
            java.lang.Object r7 = r2.get(r6)
            z0.r r7 = (p262z0.r) r7
            if (r11 == 0) goto L73
            boolean r8 = r7.b()
            if (r8 != 0) goto L71
            boolean r8 = r7.f29774h
            if (r8 != 0) goto L71
            boolean r7 = r7.f29770d
            if (r7 == 0) goto L71
            r7 = r3
            goto L77
        L71:
            r7 = r5
            goto L77
        L73:
            boolean r7 = p262z0.p.a(r7)
        L77:
            if (r7 != 0) goto L7b
            r2 = r5
            goto L7f
        L7b:
            int r6 = r6 + 1
            goto L57
        L7e:
            r2 = r3
        L7f:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f29755a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p261z.b1.b(z0.b, boolean, z0.j, S8.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[LOOP:2: B:28:0x0082->B:34:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[LOOP:1: B:23:0x006d->B:46:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b3 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x0090
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(p262z0.InterfaceC2442b r17, p262z0.j r18, S8.a r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p261z.b1.d(z0.b, z0.j, S8.a):java.lang.Object");
    }
}
