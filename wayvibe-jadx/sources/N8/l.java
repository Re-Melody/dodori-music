package N8;

import java.util.Iterator;
import p260y9.C2384u;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterable, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8648b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f8647a = i10;
        this.f8648b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8647a) {
            case 0:
                return kotlin.jvm.internal.m.i((Object[]) this.f8648b);
            case 1:
                return new w(kotlin.jvm.internal.m.i((Object[]) ((F9.h) this.f8648b).f4637b));
            case 2:
                return new p097i9.b((p097i9.c) this.f8648b);
            default:
                return new M8.t((C2384u) this.f8648b);
        }
    }
}
