package J2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6532j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f6532j = list2;
    }

    @Override // J2.n
    public final long d(long j10) {
        return this.f6532j.size();
    }

    @Override // J2.n
    public final j h(k kVar, long j10) {
        return (j) this.f6532j.get((int) (j10 - this.f6526d));
    }

    @Override // J2.n
    public final boolean i() {
        return true;
    }
}
