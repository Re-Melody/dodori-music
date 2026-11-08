package A6;

import java.util.Comparator;

/* JADX INFO: renamed from: A6.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095u extends AbstractC0097w {
    public static AbstractC0097w f(int i10) {
        if (i10 < 0) {
            return AbstractC0097w.f401b;
        }
        return i10 > 0 ? AbstractC0097w.f402c : AbstractC0097w.f400a;
    }

    @Override // A6.AbstractC0097w
    public final AbstractC0097w a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        return f(i12);
    }

    @Override // A6.AbstractC0097w
    public final AbstractC0097w b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // A6.AbstractC0097w
    public final AbstractC0097w c(boolean z10, boolean z11) {
        int i10;
        if (z10 == z11) {
            i10 = 0;
        } else {
            i10 = z10 ? 1 : -1;
        }
        return f(i10);
    }

    @Override // A6.AbstractC0097w
    public final AbstractC0097w d(boolean z10, boolean z11) {
        int i10;
        if (z11 == z10) {
            i10 = 0;
        } else {
            i10 = z11 ? 1 : -1;
        }
        return f(i10);
    }

    @Override // A6.AbstractC0097w
    public final int e() {
        return 0;
    }
}
