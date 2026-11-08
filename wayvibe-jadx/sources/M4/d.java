package M4;

import G0.AbstractC0454b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0454b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8299j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p265z4.b f8302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f8303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f8304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f8305q;

    public d(int i10, String str, List list, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, boolean z13, p265z4.b bVar, c cVar, List list2) {
        super(str, list);
        this.f8292c = i10;
        this.f8294e = j11;
        this.f8295f = z10;
        this.f8296g = i11;
        this.f8297h = i12;
        this.f8298i = i13;
        this.f8299j = j12;
        this.k = z11;
        this.f8300l = z12;
        this.f8301m = z13;
        this.f8302n = bVar;
        this.f8303o = cVar;
        this.f8304p = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f8305q = 0L;
        } else {
            c cVar2 = (c) list2.get(list2.size() - 1);
            this.f8305q = cVar2.f8285d + cVar2.f8283b;
        }
        if (j10 == -9223372036854775807L) {
            j10 = -9223372036854775807L;
        } else if (j10 < 0) {
            j10 += this.f8305q;
        }
        this.f8293d = j10;
    }
}
