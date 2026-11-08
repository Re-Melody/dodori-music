package W6;

import java.util.concurrent.Executor;
import p023b7.q;
import p023b7.r;
import p119k9.F;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p023b7.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12851b = new b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12852c = new b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12853d = new b(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f12854e = new b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12855a;

    public /* synthetic */ b(int i10) {
        this.f12855a = i10;
    }

    public static final void a(int i10, long j10) {
        if (i10 < 0 || i10 >= 1000000000) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j10 || j10 >= 253402300800L) {
            throw new IllegalArgumentException(V0.p.j(j10, "Timestamp seconds out of range: ").toString());
        }
    }

    @Override // p023b7.d
    public Object b(r rVar) {
        switch (this.f12855a) {
            case 1:
                Object objG = rVar.g(new q(X6.a.class, Executor.class));
                kotlin.jvm.internal.m.e(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.l((Executor) objG);
            case 2:
                Object objG2 = rVar.g(new q(X6.c.class, Executor.class));
                kotlin.jvm.internal.m.e(objG2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.l((Executor) objG2);
            case 3:
                Object objG3 = rVar.g(new q(X6.b.class, Executor.class));
                kotlin.jvm.internal.m.e(objG3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.l((Executor) objG3);
            default:
                Object objG4 = rVar.g(new q(X6.d.class, Executor.class));
                kotlin.jvm.internal.m.e(objG4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return F.l((Executor) objG4);
        }
    }
}
