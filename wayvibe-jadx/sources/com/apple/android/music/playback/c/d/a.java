package com.apple.android.music.playback.c.d;

import F4.g;
import H4.j;
import H4.k;
import H4.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC0014a> f17214a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.apple.android.music.playback.c.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0014a {
        void a(List<b> list);
    }

    public void a(InterfaceC0014a interfaceC0014a) {
        this.f17214a.add(interfaceC0014a);
    }

    @Override // F4.g
    public void a(F4.c cVar) {
        int length = cVar.f4506a.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            b bVarA = a(cVar.f4506a[i10]);
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator<InterfaceC0014a> it = this.f17214a.iterator();
        while (it.hasNext()) {
            it.next().a(arrayList);
        }
    }

    private b a(F4.b bVar) {
        if (bVar instanceof k) {
            return new d((k) bVar);
        }
        if (bVar instanceof j) {
            return new c((j) bVar);
        }
        if (bVar instanceof l) {
            return new e((l) bVar);
        }
        return null;
    }
}
