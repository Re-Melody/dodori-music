package G7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f5658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f5659b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f5661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5662e;

    public j(m mVar, int i10) {
        this.f5662e = i10;
        this.f5661d = mVar;
        this.f5658a = mVar.f5680f.f5668d;
        this.f5660c = mVar.f5679e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f5658a;
        m mVar = this.f5661d;
        if (lVar == mVar.f5680f) {
            throw new NoSuchElementException();
        }
        if (mVar.f5679e != this.f5660c) {
            throw new ConcurrentModificationException();
        }
        this.f5658a = lVar.f5668d;
        this.f5659b = lVar;
        return lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5658a != this.f5661d.f5680f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f5662e) {
            case 1:
                return b().f5670f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        l lVar = this.f5659b;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        m mVar = this.f5661d;
        mVar.d(lVar, true);
        this.f5659b = null;
        this.f5660c = mVar.f5679e;
    }
}
