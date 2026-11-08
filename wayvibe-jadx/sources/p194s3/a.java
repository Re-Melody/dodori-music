package p194s3;

import Z2.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26076i;

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f26075h = i10;
        this.f26076i = j12 == -1 ? -1L : j12;
    }

    @Override // p194s3.f
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f13540b) * 8000000) / ((long) this.f13543e);
    }

    @Override // p194s3.f
    public final long c() {
        return this.f26076i;
    }

    @Override // p194s3.f
    public final int j() {
        return this.f26075h;
    }
}
