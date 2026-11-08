package p077h1;

import V0.p;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
import p025b9.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Future {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20170d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", b.ag));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f20171e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f20173g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f20174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f20175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f20176c;

    static {
        a fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f20172f = fVar;
        if (th != null) {
            f20171e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20173g = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        do {
            gVar = hVar.f20176c;
        } while (!f20172f.r(hVar, gVar, g.f20167c));
        while (gVar != null) {
            Thread thread = gVar.f20168a;
            if (thread != null) {
                gVar.f20168a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f20169b;
        }
        hVar.b();
        do {
            dVar = hVar.f20175b;
        } while (!f20172f.p(hVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f20161a;
            dVar.f20161a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f20161a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f20171e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f20158b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f20159a);
        }
        if (obj == f20173g) {
            return null;
        }
        return obj;
    }

    public static Object e(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objE == this ? "this future" : String.valueOf(objE));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f20174a;
        if (obj != null) {
            return false;
        }
        if (f20170d) {
            aVar = new a(z10, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z10 ? a.f20155c : a.f20156d;
        }
        if (!f20172f.q(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void f(g gVar) {
        gVar.f20168a = null;
        while (true) {
            g gVar2 = this.f20176c;
            if (gVar2 == g.f20167c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f20169b;
                if (gVar2.f20168a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f20169b = gVar4;
                    if (gVar3.f20168a == null) {
                    }
                } else if (!f20172f.r(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f20174a;
        if (obj != null) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f20176c;
            g gVar2 = g.f20167c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                while (true) {
                    a aVar = f20172f;
                    aVar.R(gVar3, gVar);
                    if (aVar.r(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f20174a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(gVar3);
                        break;
                    }
                    gVar = this.f20176c;
                    if (gVar == gVar2) {
                    }
                }
            }
            return d(this.f20174a);
        }
        while (nanos > 0) {
            Object obj3 = this.f20174a;
            if (obj3 != null) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbS = p.s("Waited ", j10, StringUtils.SPACE);
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strN = p.n(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strN2 = strN + jConvert + StringUtils.SPACE + lowerCase;
                if (z10) {
                    strN2 = p.n(strN2, f.f16451a);
                }
                strN = p.n(strN2, StringUtils.SPACE);
            }
            if (z10) {
                strN = strN + nanos2 + " nanoseconds ";
            }
            string3 = p.n(strN, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(p.n(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(p.B(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20174a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20174a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f20174a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                p.x(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20174a;
            if (obj2 != null) {
                return d(obj2);
            }
            g gVar = this.f20176c;
            g gVar2 = g.f20167c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f20172f;
                    aVar.R(gVar3, gVar);
                    if (aVar.r(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20174a;
                            } else {
                                f(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    gVar = this.f20176c;
                } while (gVar != gVar2);
            }
            return d(this.f20174a);
        }
        throw new InterruptedException();
    }
}
