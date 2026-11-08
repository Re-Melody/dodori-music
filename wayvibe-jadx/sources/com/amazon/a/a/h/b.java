package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16121a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f16122b = new ArrayList();

    public boolean a() {
        return this.f16122b.isEmpty();
    }

    public Collection<a> b() {
        return this.f16122b;
    }

    public int c() {
        return this.f16122b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f16122b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f16122b + "]";
    }

    public void a(a aVar) {
        this.f16122b.add(aVar);
    }
}
