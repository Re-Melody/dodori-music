package Y;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13300c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13301d;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f13301d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f13300c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f13296a;
                this.f13296a = i10 + 1;
                return ((Object[]) this.f13301d)[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f13296a++;
                return this.f13301d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f13300c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f13296a - 1;
                this.f13296a = i10;
                return ((Object[]) this.f13301d)[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f13296a--;
                return this.f13301d;
        }
    }

    public d(Object obj, int i10) {
        super(i10, 1);
        this.f13301d = obj;
    }
}
