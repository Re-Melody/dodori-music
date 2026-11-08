package B8;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r0 f851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0 f852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r0 f853j;
    public static final r0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r0 f854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r0 f855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r0 f856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c0 f857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c0 f858p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f861c;

    static {
        TreeMap treeMap = new TreeMap();
        for (q0 q0Var : q0.values()) {
            r0 r0Var = (r0) treeMap.put(Integer.valueOf(q0Var.g()), new r0(q0Var, null, null));
            if (r0Var != null) {
                throw new IllegalStateException("Code value duplication between " + r0Var.f859a.name() + " & " + q0Var.name());
            }
        }
        f847d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f848e = q0.OK.f();
        f849f = q0.CANCELLED.f();
        f850g = q0.UNKNOWN.f();
        q0.INVALID_ARGUMENT.f();
        f851h = q0.DEADLINE_EXCEEDED.f();
        q0.NOT_FOUND.f();
        q0.ALREADY_EXISTS.f();
        f852i = q0.PERMISSION_DENIED.f();
        f853j = q0.UNAUTHENTICATED.f();
        k = q0.RESOURCE_EXHAUSTED.f();
        f854l = q0.FAILED_PRECONDITION.f();
        q0.ABORTED.f();
        q0.OUT_OF_RANGE.f();
        q0.UNIMPLEMENTED.f();
        f855m = q0.INTERNAL.f();
        f856n = q0.UNAVAILABLE.f();
        q0.DATA_LOSS.f();
        f857o = new c0("grpc-status", false, new C0125l(10));
        f858p = new c0("grpc-message", false, new C0125l(1));
    }

    public r0(q0 q0Var, String str, Throwable th) {
        p229v9.a.k(q0Var, "code");
        this.f859a = q0Var;
        this.f860b = str;
        this.f861c = th;
    }

    public static String b(r0 r0Var) {
        String str = r0Var.f860b;
        q0 q0Var = r0Var.f859a;
        if (str == null) {
            return q0Var.toString();
        }
        return q0Var + ": " + r0Var.f860b;
    }

    public static r0 c(int i10) {
        if (i10 >= 0) {
            List list = f847d;
            if (i10 < list.size()) {
                return (r0) list.get(i10);
            }
        }
        return f850g.g("Unknown code " + i10);
    }

    public static r0 d(Throwable th) {
        p229v9.a.k(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof s0) {
                return ((s0) cause).f864a;
            }
            if (cause instanceof t0) {
                return ((t0) cause).f873a;
            }
        }
        return f850g.f(th);
    }

    public final r0 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f861c;
        q0 q0Var = this.f859a;
        String str2 = this.f860b;
        return str2 == null ? new r0(q0Var, str, th) : new r0(q0Var, V0.p.B(str2, "\n", str), th);
    }

    public final boolean e() {
        return q0.OK == this.f859a;
    }

    public final r0 f(Throwable th) {
        return p228v8.c.d(this.f861c, th) ? this : new r0(this.f859a, this.f860b, th);
    }

    public final r0 g(String str) {
        return p228v8.c.d(this.f860b, str) ? this : new r0(this.f859a, str, this.f861c);
    }

    public final String toString() {
        U.P pF = p228v8.a.f(this);
        pF.c(this.f859a.name(), "code");
        pF.c(this.f860b, com.amazon.a.a.o.b.f16404c);
        Throwable th = this.f861c;
        Object string = th;
        if (th != null) {
            Object obj = p267z6.r.f29892a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        pF.c(string, "cause");
        return pF.toString();
    }
}
