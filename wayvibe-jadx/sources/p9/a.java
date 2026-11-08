package p9;

import A9.A;
import B2.AbstractC0112b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119k9.AbstractC2040y;
import p119k9.C2038w;
import p119k9.C2041z;
import p119k9.E0;
import p119k9.F;
import p119k9.F0;
import p119k9.InterfaceC2019i0;
import p119k9.L0;
import p119k9.Z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f25299a = new A("CLOSED", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f25300b = new A("UNDEFINED", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f25301c = new A("REUSABLE_CLAIMED", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f25302d = new A("NO_THREAD_ELEMENTS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q8.b f25303e = new Q8.b(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Q8.b f25304f = new Q8.b(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Q8.b f25305g = new Q8.b(11);

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j10, Z8.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (qVar.f25339c >= j10 && !qVar.d()) {
                return qVar;
            }
            Object obj = b.f25306a.get(qVar);
            A a10 = f25299a;
            if (obj == a10) {
                return a10;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) eVar.invoke(Long.valueOf(qVar.f25339c + 1), qVar);
                do {
                    atomicReferenceFieldUpdater = b.f25306a;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.d()) {
                            qVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != f25299a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Q8.i iVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = d.f25309a.iterator();
        while (it.hasNext()) {
            try {
                ((p119k9.A) it.next()).e(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p242x0.c.e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            p242x0.c.e(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f25299a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(Q8.i iVar, Object obj) {
        if (obj == f25302d) {
            return;
        }
        if (!(obj instanceof u)) {
            Object objFold = iVar.fold(null, f25304f);
            kotlin.jvm.internal.m.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0112b.t(objFold);
            throw null;
        }
        u uVar = (u) obj;
        E0[] e0Arr = uVar.f25345b;
        int length = e0Arr.length - 1;
        if (length < 0) {
            return;
        }
        E0 e1 = e0Arr[length];
        kotlin.jvm.internal.m.c(null);
        Object obj2 = uVar.f25344a[length];
        throw null;
    }

    public static final void h(Q8.d dVar, Object obj) {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable thA = M8.o.a(obj);
        Object c2038w = thA == null ? obj : new C2038w(false, thA);
        AbstractC2040y abstractC2040y = fVar.f25312d;
        S8.c cVar = fVar.f25313e;
        if (abstractC2040y.w(cVar.getContext())) {
            fVar.f25314f = c2038w;
            fVar.f21694c = 1;
            abstractC2040y.l(cVar.getContext(), fVar);
            return;
        }
        Z zA = F0.a();
        if (zA.f21713c >= 4294967296L) {
            fVar.f25314f = c2038w;
            fVar.f21694c = 1;
            zA.A(fVar);
            return;
        }
        zA.C(true);
        try {
            InterfaceC2019i0 interfaceC2019i0 = (InterfaceC2019i0) cVar.getContext().get(C2041z.f21793b);
            if (interfaceC2019i0 == null || interfaceC2019i0.isActive()) {
                Object obj2 = fVar.f25315g;
                Q8.i context = cVar.getContext();
                Object objL = l(context, obj2);
                L0 l0F = objL != f25302d ? F.F(cVar, context, objL) : null;
                try {
                    cVar.resumeWith(obj);
                    if (l0F == null || l0F.Z()) {
                        g(context, objL);
                    }
                } catch (Throwable th) {
                    if (l0F == null || l0F.Z()) {
                        g(context, objL);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(Q5.b.r(interfaceC2019i0.getCancellationException()));
            }
            while (zA.E()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.g(th2);
            } finally {
                zA.z(true);
            }
        }
    }

    public static final long i(String str, long j10, long j11, long j12) {
        String property;
        int i10 = s.f25341a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lL0 = p097i9.r.l0(property);
        if (lL0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lL0.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object k(Q8.i iVar) {
        Object objFold = iVar.fold(0, f25303e);
        kotlin.jvm.internal.m.c(objFold);
        return objFold;
    }

    public static final Object l(Q8.i iVar, Object obj) {
        if (obj == null) {
            obj = k(iVar);
        }
        if (obj == 0) {
            return f25302d;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new u(((Number) obj).intValue(), iVar), f25305g);
        }
        AbstractC0112b.t(obj);
        throw null;
    }
}
