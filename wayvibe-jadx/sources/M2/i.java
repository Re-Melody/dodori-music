package M2;

import A6.AbstractC0093s;
import A6.E;
import A6.b0;
import java.util.List;
import java.util.Map;
import p255y2.C2336l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8169j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f8171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f8172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f8173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2336l f8175q;
    public final E r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E f8176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f8177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f8178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f8179v;

    public i(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, C2336l c2336l, List list2, List list3, h hVar, Map map) {
        super(str, list, z12);
        this.f8163d = i10;
        this.f8167h = j11;
        this.f8166g = z10;
        this.f8168i = z11;
        this.f8169j = i11;
        this.k = j12;
        this.f8170l = i12;
        this.f8171m = j13;
        this.f8172n = j14;
        this.f8173o = z13;
        this.f8174p = z14;
        this.f8175q = c2336l;
        this.r = E.r(list2);
        this.f8176s = E.r(list3);
        this.f8177t = b0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) AbstractC0093s.h(list3);
            this.f8178u = dVar.f8152e + dVar.f8150c;
        } else if (list2.isEmpty()) {
            this.f8178u = 0L;
        } else {
            f fVar = (f) AbstractC0093s.h(list2);
            this.f8178u = fVar.f8152e + fVar.f8150c;
        }
        this.f8164e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f8178u, j10) : Math.max(0L, this.f8178u + j10) : -9223372036854775807L;
        this.f8165f = j10 >= 0;
        this.f8179v = hVar;
    }

    @Override // Q2.a
    public final Object a(List list) {
        return this;
    }
}
