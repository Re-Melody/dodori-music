package p023b7;

import Z2.l;
import p227v7.a;
import p227v7.b;

/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15804c = new l(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15805d = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f15806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f15807b;

    public o(l lVar, b bVar) {
        this.f15806a = lVar;
        this.f15807b = bVar;
    }

    public final void a(a aVar) {
        b bVar;
        b bVar2;
        b bVar3 = this.f15807b;
        e eVar = f15805d;
        if (bVar3 != eVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f15807b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.f15806a = new A7.a(8, this.f15806a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // p227v7.b
    public final Object get() {
        return this.f15807b.get();
    }
}
