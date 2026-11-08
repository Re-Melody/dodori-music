package T4;

import N4.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11635b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11636a;

    public b(N4.a aVar) {
        this.f11636a = Collections.singletonList(aVar);
    }

    @Override // N4.d
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // N4.d
    public final int b() {
        return 1;
    }

    @Override // N4.d
    public final long a(int i10) {
        X4.a.k(i10 == 0);
        return 0L;
    }

    @Override // N4.d
    public final List b(long j10) {
        return j10 >= 0 ? this.f11636a : Collections.EMPTY_LIST;
    }

    public b() {
        this.f11636a = Collections.EMPTY_LIST;
    }
}
