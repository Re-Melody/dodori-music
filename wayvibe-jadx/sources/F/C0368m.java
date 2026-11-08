package F;

import D0.AbstractC0180f;
import p261z.EnumC2391a0;

/* JADX INFO: renamed from: F.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368m implements E0.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0365j f3542e = new C0365j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0369n f3543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268z7.c f3544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p028c1.k f3545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC2391a0 f3546d;

    public C0368m(InterfaceC0369n interfaceC0369n, p268z7.c cVar, p028c1.k kVar, EnumC2391a0 enumC2391a0) {
        this.f3543a = interfaceC0369n;
        this.f3544b = cVar;
        this.f3545c = kVar;
        this.f3546d = enumC2391a0;
    }

    public final boolean b(C0364i c0364i, int i10) {
        EnumC2391a0 enumC2391a0 = this.f3546d;
        if (i10 == 5 || i10 == 6) {
            if (enumC2391a0 == EnumC2391a0.Horizontal) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (enumC2391a0 == EnumC2391a0.Vertical) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (j(i10)) {
            if (c0364i.f3537b >= this.f3543a.b() - 1) {
                return false;
            }
        } else if (c0364i.f3536a <= 0) {
            return false;
        }
        return true;
    }

    @Override // E0.f
    public final E0.h getKey() {
        return AbstractC0180f.f1790a;
    }

    public final boolean j(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 != 6) {
                    p028c1.k kVar = this.f3545c;
                    if (i10 == 3) {
                        int i11 = AbstractC0366k.f3538a[kVar.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new B8.V();
                            }
                        }
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int i12 = AbstractC0366k.f3538a[kVar.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new B8.V();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // E0.f
    public final Object getValue() {
        return this;
    }
}
