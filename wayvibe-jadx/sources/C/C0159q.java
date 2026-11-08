package C;

import java.util.List;

/* JADX INFO: renamed from: C.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0159q implements D0.M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0159q f1055b = new C0159q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0159q f1056c = new C0159q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1057a;

    public /* synthetic */ C0159q(int i10) {
        this.f1057a = i10;
    }

    @Override // D0.M
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final D0.N mo1measure3p2s80s(D0.O o10, List list, long j10) {
        switch (this.f1057a) {
            case 0:
                return o10.S(p028c1.a.j(j10), p028c1.a.i(j10), N8.t.f8651a, C0158p.f1045b);
            default:
                return o10.S(p028c1.a.f(j10) ? p028c1.a.h(j10) : 0, p028c1.a.e(j10) ? p028c1.a.g(j10) : 0, N8.t.f8651a, C0158p.f1048e);
        }
    }
}
