package Z;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n[] f13417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13419c = true;

    public d(m mVar, n[] nVarArr) {
        this.f13417a = nVarArr;
        nVarArr[0].a(mVar.f13442d, Integer.bitCount(mVar.f13439a) * 2, 0);
        this.f13418b = 0;
        a();
    }

    public final void a() {
        int i10 = this.f13418b;
        n[] nVarArr = this.f13417a;
        n nVar = nVarArr[i10];
        if (nVar.f13445c < nVar.f13444b) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                n nVar2 = nVarArr[i10];
                int i11 = nVar2.f13445c;
                Object[] objArr = nVar2.f13443a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f13445c = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f13418b = iB;
                return;
            }
            if (i10 > 0) {
                n nVar3 = nVarArr[i10 - 1];
                int i12 = nVar3.f13445c;
                int length2 = nVar3.f13443a.length;
                nVar3.f13445c = i12 + 1;
            }
            nVarArr[i10].a(m.f13438e.f13442d, 0, 0);
            i10--;
        }
        this.f13419c = false;
    }

    public final int b(int i10) {
        n[] nVarArr = this.f13417a;
        n nVar = nVarArr[i10];
        int i11 = nVar.f13445c;
        if (i11 < nVar.f13444b) {
            return i10;
        }
        Object[] objArr = nVar.f13443a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i10 == 6) {
            n nVar2 = nVarArr[i10 + 1];
            Object[] objArr2 = mVar.f13442d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i10 + 1].a(mVar.f13442d, Integer.bitCount(mVar.f13439a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13419c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f13419c) {
            throw new NoSuchElementException();
        }
        Object next = this.f13417a[this.f13418b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
