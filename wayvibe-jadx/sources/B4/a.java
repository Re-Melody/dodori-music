package B4;

import B2.AbstractC0111a;
import B2.u;
import Z2.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f651b;

    public /* synthetic */ a(int i10, long j10, boolean z10) {
        this.f650a = i10;
        this.f651b = j10;
    }

    public static a c(k kVar, u uVar) {
        kVar.f(uVar.f630a, 0, 8, false);
        uVar.F(0);
        return new a(uVar.g(), uVar.k(), false);
    }

    @Override // B4.b
    public long a(long j10) {
        return (Math.max(0L, j10 - this.f651b) * 8000000) / ((long) this.f650a);
    }

    public boolean b() {
        int i10 = this.f650a;
        return i10 == 0 || i10 == 1;
    }

    public a(int i10, long j10, long j11) {
        this.f651b = j10;
        this.f650a = i10;
        if (j11 == -1) {
            return;
        }
        a(j11);
    }

    public a(int i10, long j10) {
        AbstractC0111a.d(j10 >= 0);
        this.f650a = i10;
        this.f651b = j10;
    }
}
