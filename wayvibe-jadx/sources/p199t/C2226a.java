package p199t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013a9.a;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2226a implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26276e;

    public C2226a(int i10) {
        this.f26272a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26273b < this.f26272a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26273b;
        switch (this.f26275d) {
            case 0:
                objG = ((C2230e) this.f26276e).g(i10);
                break;
            case 1:
                objG = ((C2230e) this.f26276e).j(i10);
                break;
            default:
                objG = ((C2231f) this.f26276e).f26287b[i10];
                break;
        }
        this.f26273b++;
        this.f26274c = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26274c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f26273b - 1;
        this.f26273b = i10;
        switch (this.f26275d) {
            case 0:
                ((C2230e) this.f26276e).h(i10);
                break;
            case 1:
                ((C2230e) this.f26276e).h(i10);
                break;
            default:
                ((C2231f) this.f26276e).a(i10);
                break;
        }
        this.f26272a--;
        this.f26274c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2226a(C2231f c2231f) {
        this(c2231f.f26288c);
        this.f26275d = 2;
        this.f26276e = c2231f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2226a(C2230e c2230e, int i10) {
        this(c2230e.f26268c);
        this.f26275d = i10;
        switch (i10) {
            case 1:
                this.f26276e = c2230e;
                this(c2230e.f26268c);
                break;
            default:
                this.f26276e = c2230e;
                break;
        }
    }
}
