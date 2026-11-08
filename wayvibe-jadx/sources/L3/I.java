package L3;

import A6.AbstractC0093s;
import A6.W;
import B2.AbstractC0111a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class I implements T2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f7686a;

    public I(int i10) {
        this.f7686a = new ArrayList(i10);
    }

    @Override // T2.a
    public long a(long j10) {
        ArrayList arrayList = this.f7686a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((p234w3.a) arrayList.get(0)).f27848b) {
            return ((p234w3.a) arrayList.get(0)).f27848b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            p234w3.a aVar = (p234w3.a) arrayList.get(i10);
            if (j10 < aVar.f27848b) {
                long j11 = ((p234w3.a) arrayList.get(i10 - 1)).f27850d;
                long j12 = aVar.f27848b;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= j12) ? j12 : j11;
            }
        }
        long j13 = ((p234w3.a) AbstractC0093s.h(arrayList)).f27850d;
        if (j13 == -9223372036854775807L || j10 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // T2.a
    public boolean b(p234w3.a aVar, long j10) {
        boolean z10;
        long j11 = aVar.f27848b;
        AbstractC0111a.d(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.f27850d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.f7686a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((p234w3.a) arrayList.get(size)).f27848b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
            if (((p234w3.a) arrayList.get(size)).f27848b <= j10) {
                z10 = false;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // T2.a
    public A6.E c(long j10) {
        int iG = g(j10);
        if (iG == 0) {
            A6.C c3 = A6.E.f299b;
            return W.f329e;
        }
        p234w3.a aVar = (p234w3.a) this.f7686a.get(iG - 1);
        long j11 = aVar.f27850d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.f27847a;
        }
        A6.C c9 = A6.E.f299b;
        return W.f329e;
    }

    @Override // T2.a
    public void clear() {
        this.f7686a.clear();
    }

    @Override // T2.a
    public long d(long j10) {
        ArrayList arrayList = this.f7686a;
        if (arrayList.isEmpty() || j10 < ((p234w3.a) arrayList.get(0)).f27848b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((p234w3.a) arrayList.get(i10)).f27848b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                p234w3.a aVar = (p234w3.a) arrayList.get(i10 - 1);
                long j12 = aVar.f27850d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.f27848b : j12;
            }
        }
        p234w3.a aVar2 = (p234w3.a) AbstractC0093s.h(arrayList);
        long j13 = aVar2.f27850d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.f27848b : j13;
    }

    @Override // T2.a
    public void e(long j10) {
        int iG = g(j10);
        if (iG > 0) {
            this.f7686a.subList(0, iG).clear();
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f7686a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public int g(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7686a;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((p234w3.a) arrayList.get(i10)).f27848b) {
                return i10;
            }
            i10++;
        }
    }

    public I(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f7686a = new ArrayList(20);
                break;
            default:
                this.f7686a = new ArrayList();
                break;
        }
    }
}
