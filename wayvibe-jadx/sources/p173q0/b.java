package p173q0;

import B2.s;
import B8.f0;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import kotlin.jvm.internal.n;
import p025b9.a;
import p028c1.k;
import p133m0.c;
import p133m0.e;
import p133m0.f;
import p143n0.C2083j;
import p143n0.N;
import p143n0.O;
import p143n0.P;
import p143n0.Q;
import p163p0.d;
import p199t.B;
import p199t.F;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f25381a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f25385e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f25389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Q f25390j;
    public C2083j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2083j f25391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f25393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25394o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25396q;
    public long r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f25397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25398t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p028c1.b f25382b = d.f25150a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f25383c = k.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f25384d = a.f25378b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25386f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25387g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25388h = 9205357640488583168L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f25395p = new f0();

    public b(d dVar) {
        this.f25381a = dVar;
        dVar.E(false);
        this.r = 0L;
        this.f25397s = 0L;
        this.f25398t = 9205357640488583168L;
    }

    public final void a() {
        if (this.f25386f) {
            d dVar = this.f25381a;
            if (dVar.c() || dVar.K() > 0.0f) {
                C2083j c2083j = this.k;
                if (c2083j != null) {
                    Outline outline = this.f25385e;
                    if (outline == null) {
                        outline = new Outline();
                        this.f25385e = outline;
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    Path path = c2083j.f22776a;
                    if (i10 > 28 || path.isConvex()) {
                        if (i10 > 30) {
                            j.f25472a.a(outline, c2083j);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f25392m = !outline.canClip();
                    } else {
                        Outline outline2 = this.f25385e;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f25392m = true;
                    }
                    this.k = c2083j;
                    outline.setAlpha(dVar.a());
                    dVar.i(outline);
                } else {
                    Outline outline3 = this.f25385e;
                    if (outline3 == null) {
                        outline3 = new Outline();
                        this.f25385e = outline3;
                    }
                    Outline outline4 = outline3;
                    long jB0 = a.b0(this.f25397s);
                    long j10 = this.f25387g;
                    long j11 = this.f25388h;
                    if (j11 != 9205357640488583168L) {
                        jB0 = j11;
                    }
                    outline4.setRoundRect(Math.round(c.d(j10)), Math.round(c.e(j10)), Math.round(f.d(jB0) + c.d(j10)), Math.round(f.b(jB0) + c.e(j10)), this.f25389i);
                    outline4.setAlpha(dVar.a());
                    dVar.i(outline4);
                }
            } else {
                dVar.i(null);
            }
        }
        this.f25386f = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.f25396q && this.f25394o == 0) {
            f0 f0Var = this.f25395p;
            b bVar = (b) f0Var.f801b;
            if (bVar != null) {
                bVar.d();
                f0Var.f801b = null;
            }
            B b10 = (B) f0Var.f803d;
            if (b10 != null) {
                Object[] objArr = b10.f26258b;
                long[] jArr = b10.f26257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    ((b) objArr[(i10 << 3) + i12]).d();
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                b10.b();
            }
            this.f25381a.f();
        }
    }

    public final Q c() {
        Q o10;
        Q q5 = this.f25390j;
        C2083j c2083j = this.k;
        if (q5 != null) {
            return q5;
        }
        if (c2083j != null) {
            N n6 = new N(c2083j);
            this.f25390j = n6;
            return n6;
        }
        long jB0 = a.b0(this.f25397s);
        long j10 = this.f25387g;
        long j11 = this.f25388h;
        if (j11 != 9205357640488583168L) {
            jB0 = j11;
        }
        float fD = c.d(j10);
        float fE = c.e(j10);
        float fD2 = f.d(jB0) + fD;
        float fB = f.b(jB0) + fE;
        float f10 = this.f25389i;
        if (f10 > 0.0f) {
            long jA = p206t6.b.a(f10, f10);
            long jA2 = p206t6.b.a(p133m0.a.b(jA), p133m0.a.c(jA));
            o10 = new P(new e(fD, fE, fD2, fB, jA2, jA2, jA2, jA2));
        } else {
            o10 = new O(new p133m0.d(fD, fE, fD2, fB));
        }
        this.f25390j = o10;
        return o10;
    }

    public final void d() {
        this.f25394o--;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005b->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[EDGE_INSN: B:34:0x0093->B:31:0x0093 BREAK  A[LOOP:0: B:20:0x005b->B:30:0x0091], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Z8.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        f0 f0Var = this.f25395p;
        f0Var.f802c = (b) f0Var.f801b;
        B b10 = (B) f0Var.f803d;
        if (b10 != null && b10.h()) {
            B b11 = (B) f0Var.f804e;
            if (b11 == null) {
                int i10 = F.f26265a;
                b11 = new B();
                f0Var.f804e = b11;
            }
            b11.i(b10);
            b10.b();
        }
        f0Var.f800a = true;
        this.f25381a.I(this.f25382b, this.f25383c, this, this.f25384d);
        f0Var.f800a = false;
        b bVar = (b) f0Var.f802c;
        if (bVar != null) {
            bVar.d();
        }
        B b12 = (B) f0Var.f804e;
        if (b12 == null || !b12.h()) {
            return;
        }
        Object[] objArr = b12.f26258b;
        long[] jArr = b12.f26257a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            ((b) objArr[(i11 << 3) + i13]).d();
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        b12.b();
    }

    public final void f(long j10, long j11, float f10) {
        if (c.b(this.f25387g, j10) && f.a(this.f25388h, j11) && this.f25389i == f10 && this.k == null) {
            return;
        }
        this.f25390j = null;
        this.k = null;
        this.f25386f = true;
        this.f25392m = false;
        this.f25387g = j10;
        this.f25388h = j11;
        this.f25389i = f10;
        a();
    }
}
