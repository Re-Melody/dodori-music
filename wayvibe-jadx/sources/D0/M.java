package D0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface M {
    default int maxIntrinsicHeight(InterfaceC0191q interfaceC0191q, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0186l((InterfaceC0190p) list.get(i11), r.Max, EnumC0192s.Height, 0));
        }
        return mo1measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), arrayList, D7.W.b(i10, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(InterfaceC0191q interfaceC0191q, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0186l((InterfaceC0190p) list.get(i11), r.Max, EnumC0192s.Width, 0));
        }
        return mo1measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), arrayList, D7.W.b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    N mo1measure3p2s80s(O o10, List list, long j10);

    default int minIntrinsicHeight(InterfaceC0191q interfaceC0191q, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0186l((InterfaceC0190p) list.get(i11), r.Min, EnumC0192s.Height, 0));
        }
        return mo1measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), arrayList, D7.W.b(i10, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(InterfaceC0191q interfaceC0191q, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0186l((InterfaceC0190p) list.get(i11), r.Min, EnumC0192s.Width, 0));
        }
        return mo1measure3p2s80s(new C0194u(interfaceC0191q, interfaceC0191q.getLayoutDirection()), arrayList, D7.W.b(0, i10, 7)).getWidth();
    }
}
