package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f18701a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18701a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f18701a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
