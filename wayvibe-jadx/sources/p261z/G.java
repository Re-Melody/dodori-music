package p261z;

import Q5.b;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.y;
import p262z0.D;
import p262z0.InterfaceC2442b;
import p262z0.i;
import p262z0.k;
import p262z0.q;
import p262z0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f29407a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[LOOP:0: B:23:0x0075->B:27:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008d A[EDGE_INSN: B:54:0x008d->B:29:0x008d BREAK  A[LOOP:0: B:23:0x0075->B:27:0x0089], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:22:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p262z0.InterfaceC2442b r17, long r18, S8.c r20) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p261z.G.a(z0.b, long, S8.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    public static final Object b(InterfaceC2442b interfaceC2442b, long j10, c cVar) {
        B b10;
        Object obj;
        r rVar;
        y yVar;
        if (cVar instanceof B) {
            b10 = (B) cVar;
            int i10 = b10.f29353d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                b10.f29353d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                b10 = new B(cVar);
            }
        } else {
            b10 = new B(cVar);
        }
        Object obj2 = b10.f29352c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = b10.f29353d;
        if (i11 == 0) {
            b.T(obj2);
            D d10 = (D) interfaceC2442b;
            if (!d(d10.f29720e.f29728e, j10)) {
                ?? r12 = d10.f29720e.f29728e.f29755a;
                int size = r12.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        obj = null;
                        break;
                    }
                    obj = r12.get(i12);
                    if (q.a(((r) obj).f29767a, j10)) {
                        break;
                    }
                    i12++;
                }
                rVar = (r) obj;
                if (rVar != null) {
                    y yVar2 = new y();
                    y yVar3 = new y();
                    yVar3.f21873a = rVar;
                    long jB = d10.m().b();
                    try {
                        C c3 = new C(yVar3, yVar2, null);
                        b10.f29350a = rVar;
                        b10.f29351b = yVar2;
                        b10.f29353d = 1;
                        if (d10.q(jB, c3, b10) == aVar) {
                            return aVar;
                        }
                    } catch (k unused) {
                        yVar = yVar2;
                    }
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yVar = b10.f29351b;
        rVar = b10.f29350a;
        try {
            b.T(obj2);
            return null;
        } catch (k unused2) {
        }
        r rVar2 = (r) yVar.f21873a;
        return rVar2 == null ? rVar : rVar2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(p262z0.InterfaceC2442b r4, long r5, Z8.c r7, S8.c r8) {
        /*
            boolean r0 = r8 instanceof p261z.F
            if (r0 == 0) goto L13
            r0 = r8
            z.F r0 = (p261z.F) r0
            int r1 = r0.f29403d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29403d = r1
            goto L18
        L13:
            z.F r0 = new z.F
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29402c
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.f29403d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Z8.c r4 = r0.f29401b
            z0.b r5 = r0.f29400a
            Q5.b.T(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Q5.b.T(r8)
        L38:
            r0.f29400a = r4
            r0.f29401b = r7
            r0.f29403d = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            z0.r r8 = (p262z0.r) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p262z0.p.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f29767a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: p261z.G.c(z0.b, long, Z8.c, S8.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(i iVar, long j10) {
        Object obj;
        ?? r10 = iVar.f29755a;
        int size = r10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r10.get(i10);
            if (q.a(((r) obj).f29767a, j10)) {
                break;
            }
            i10++;
        }
        r rVar = (r) obj;
        if (rVar != null && rVar.f29770d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
