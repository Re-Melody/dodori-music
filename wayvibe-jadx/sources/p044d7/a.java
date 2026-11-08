package p044d7;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19295a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f19297c;

    public a(b bVar, int i10) {
        this.f19297c = bVar;
        this.f19296b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19295a) {
            case 0:
                return this.f19296b < ((b) this.f19297c).f19298a.length;
            default:
                return this.f19296b >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19295a) {
            case 0:
                b bVar = (b) this.f19297c;
                Object[] objArr = bVar.f19298a;
                int i10 = this.f19296b;
                Object obj = objArr[i10];
                Object obj2 = bVar.f19299b[i10];
                this.f19296b = i10 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            default:
                int i11 = this.f19296b;
                g gVar = new g();
                Math.pow(2.0d, i11);
                this.f19296b--;
                return gVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19295a) {
            case 0:
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            default:
                return;
        }
    }

    public a(l lVar) {
        this.f19297c = lVar;
        this.f19296b = lVar.f19311b - 1;
    }

    private final void a() {
    }
}
