package com.apple.android.music.playback.c.e;

import N4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<a> f17219a = new CopyOnWriteArraySet();

    public interface a {
        void b(List<Object> list);
    }

    private List<Object> b(List<N4.a> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<N4.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.apple.android.music.playback.c.e.a(it.next()));
        }
        return arrayList;
    }

    public void a(a aVar) {
        this.f17219a.add(aVar);
    }

    @Override // N4.j
    public void a(List<N4.a> list) {
        Iterator<a> it = this.f17219a.iterator();
        while (it.hasNext()) {
            it.next().b(b(list));
        }
    }
}
