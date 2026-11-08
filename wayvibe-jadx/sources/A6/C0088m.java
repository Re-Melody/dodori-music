package A6;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: A6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088m extends C0080e implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0089n f384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088m(C0089n c0089n) {
        super(c0089n);
        this.f384e = c0089n;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0089n c0089n = this.f384e;
        boolean zIsEmpty = c0089n.isEmpty();
        b().add(obj);
        c0089n.f390f.f324e++;
        if (zIsEmpty) {
            c0089n.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f364b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088m(C0089n c0089n, int i10) {
        super(c0089n, ((List) c0089n.f386b).listIterator(i10));
        this.f384e = c0089n;
    }
}
