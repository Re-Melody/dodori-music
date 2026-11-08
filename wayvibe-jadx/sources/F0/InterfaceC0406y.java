package F0;

import D0.C0186l;
import D0.C0194u;
import D0.InterfaceC0190p;
import D0.InterfaceC0191q;

/* JADX INFO: renamed from: F0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0406y extends InterfaceC0394l {
    default int maxIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return mo2measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), new C0186l(interfaceC0190p, j0.Max, k0.Height, 2), D7.W.b(i10, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return mo2measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), new C0186l(interfaceC0190p, j0.Max, k0.Width, 2), D7.W.b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    D0.N mo2measure3p2s80s(D0.O o10, D0.L l10, long j10);

    default int minIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return mo2measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), new C0186l(interfaceC0190p, j0.Min, k0.Height, 2), D7.W.b(i10, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return mo2measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), new C0186l(interfaceC0190p, j0.Min, k0.Width, 2), D7.W.b(0, i10, 7)).getWidth();
    }
}
