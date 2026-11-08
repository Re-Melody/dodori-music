package B4;

import X4.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f666b;

    public /* synthetic */ d(long[] jArr, long[] jArr2) {
        this.f665a = jArr;
        this.f666b = jArr2;
    }

    @Override // B4.b
    public long a(long j10) {
        return this.f665a[j.c(this.f666b, j10, true)];
    }
}
