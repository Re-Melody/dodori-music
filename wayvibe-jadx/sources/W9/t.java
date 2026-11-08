package W9;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements p035ca.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f13015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13016b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f13017c = new LinkedList();

    public t(char c3) {
        this.f13015a = c3;
    }

    @Override // p035ca.a
    public final char a() {
        return this.f13015a;
    }

    @Override // p035ca.a
    public final int b() {
        return this.f13016b;
    }

    @Override // p035ca.a
    public final int c(c cVar, c cVar2) {
        int size = cVar.f12943a.size();
        LinkedList<p035ca.a> linkedList = this.f13017c;
        for (p035ca.a aVar : linkedList) {
            if (aVar.b() <= size) {
                return aVar.c(cVar, cVar2);
            }
        }
        aVar = (p035ca.a) linkedList.getFirst();
        return aVar.c(cVar, cVar2);
    }

    @Override // p035ca.a
    public final char d() {
        return this.f13015a;
    }

    public final void e(p035ca.a aVar) {
        int iB = aVar.b();
        LinkedList linkedList = this.f13017c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            p035ca.a aVar2 = (p035ca.a) listIterator.next();
            int iB2 = aVar2.b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f13015a + "' and minimum length " + iB + "; conflicting processors: " + aVar2 + ", " + aVar);
            }
        }
        linkedList.add(aVar);
        this.f13016b = iB;
    }
}
