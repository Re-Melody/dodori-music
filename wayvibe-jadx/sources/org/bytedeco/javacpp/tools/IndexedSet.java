package org.bytedeco.javacpp.tools;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class IndexedSet<E> extends LinkedHashMap<E, Integer> implements Iterable<E> {
    public int index(E e2) {
        Integer numValueOf = get(e2);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(size());
            put(e2, numValueOf);
        }
        return numValueOf.intValue();
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return keySet().iterator();
    }
}
