package p097i9;

import M8.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p013a9.a;
import p064f9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20565a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f20568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f20570f;

    public b(c cVar) {
        this.f20570f = cVar;
        cVar.getClass();
        int iN = R3.a.n(0, 0, cVar.f20571a.length());
        this.f20566b = iN;
        this.f20567c = iN;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        l lVar;
        int i10 = this.f20567c;
        if (i10 < 0) {
            this.f20565a = 0;
            this.f20568d = null;
            return;
        }
        c cVar = this.f20570f;
        int i11 = cVar.f20572b;
        String str = cVar.f20571a;
        if (i11 > 0) {
            int i12 = this.f20569e + 1;
            this.f20569e = i12;
            if (i12 >= i11) {
                this.f20568d = new g(this.f20566b, k.s0(str), 1);
                this.f20567c = -1;
            } else if (i10 > str.length() && (lVar = (l) cVar.f20573c.invoke(str, Integer.valueOf(this.f20567c))) != null) {
                int iIntValue = ((Number) lVar.f8413a).intValue();
                int iIntValue2 = ((Number) lVar.f8414b).intValue();
                this.f20568d = R3.a.j0(this.f20566b, iIntValue);
                int i13 = iIntValue + iIntValue2;
                this.f20566b = i13;
                this.f20567c = i13 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f20568d = new g(this.f20566b, k.s0(str), 1);
                this.f20567c = -1;
            }
        } else if (i10 > str.length()) {
            this.f20568d = new g(this.f20566b, k.s0(str), 1);
            this.f20567c = -1;
        } else {
            int iIntValue3 = ((Number) lVar.f8413a).intValue();
            int iIntValue4 = ((Number) lVar.f8414b).intValue();
            this.f20568d = R3.a.j0(this.f20566b, iIntValue3);
            int i14 = iIntValue3 + iIntValue4;
            this.f20566b = i14;
            this.f20567c = i14 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f20565a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20565a == -1) {
            a();
        }
        return this.f20565a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20565a == -1) {
            a();
        }
        if (this.f20565a == 0) {
            throw new NoSuchElementException();
        }
        g gVar = this.f20568d;
        m.d(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f20568d = null;
        this.f20565a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
