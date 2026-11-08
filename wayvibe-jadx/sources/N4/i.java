package N4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends E2.a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f8609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8610e;

    @Override // N4.d
    public final long a(int i10) {
        return this.f8609d.a(i10) + this.f8610e;
    }

    @Override // N4.d
    public final int b() {
        return this.f8609d.b();
    }

    public abstract void i();

    @Override // N4.d
    public final int a(long j10) {
        return this.f8609d.a(j10 - this.f8610e);
    }

    @Override // N4.d
    public final List b(long j10) {
        return this.f8609d.b(j10 - this.f8610e);
    }
}
