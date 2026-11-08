package p241x;

import F0.J;
import M0.f;
import M0.t;
import M0.u;
import M0.v;
import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;
import p075g9.j;

/* JADX INFO: loaded from: classes.dex */
public final class r extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f28281b = new r(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f28282c = new r(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f28283d = new r(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f28284e = new r(1, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f28285f = new r(1, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28286a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f28286a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        D d10 = D.f8402a;
        switch (this.f28286a) {
            case 0:
                ((J) ((p163p0.c) obj)).b();
                return d10;
            case 1:
                return d10;
            case 2:
                ((Number) obj).longValue();
                return d10;
            case 3:
                f fVar = f.f8017b;
                j[] jVarArr = t.f8107a;
                u uVar = M0.r.f8084c;
                j jVar = t.f8107a[1];
                uVar.a((v) obj, fVar);
                return d10;
            default:
                return new B0(((Number) obj).intValue());
        }
    }
}
