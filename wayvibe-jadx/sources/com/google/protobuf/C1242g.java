package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1242g extends AbstractC1244h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18736a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1252l f18738c;

    public C1242g(AbstractC1252l abstractC1252l) {
        this.f18738c = abstractC1252l;
        this.f18737b = abstractC1252l.size();
    }

    @Override // com.google.protobuf.AbstractC1244h
    public final byte a() {
        int i10 = this.f18736a;
        if (i10 >= this.f18737b) {
            throw new NoSuchElementException();
        }
        this.f18736a = i10 + 1;
        return this.f18738c.p(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18736a < this.f18737b;
    }
}
