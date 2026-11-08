package p048e0;

import U.C0882e;

/* JADX INFO: loaded from: classes.dex */
public abstract class B implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0882e f19452a = new C0882e(0);

    public final boolean e(int i10) {
        return (i10 & this.f19452a.get()) != 0;
    }

    public final void f(int i10) {
        C0882e c0882e;
        int i11;
        do {
            c0882e = this.f19452a;
            i11 = c0882e.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!c0882e.compareAndSet(i11, i11 | i10));
    }
}
