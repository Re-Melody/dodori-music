package P4;

import B2.AbstractC0111a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements N4.d, p234w3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9681a;

    @Override // N4.d
    public int a(long j10) {
        return -1;
    }

    @Override // N4.d
    public int b() {
        return 1;
    }

    @Override // p234w3.e
    public int f(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p234w3.e
    public long g(int i10) {
        AbstractC0111a.d(i10 == 0);
        return 0L;
    }

    @Override // p234w3.e
    public List n(long j10) {
        return j10 >= 0 ? this.f9681a : Collections.EMPTY_LIST;
    }

    @Override // p234w3.e
    public int r() {
        return 1;
    }

    @Override // N4.d
    public long a(int i10) {
        return 0L;
    }

    @Override // N4.d
    public List b(long j10) {
        return this.f9681a;
    }
}
