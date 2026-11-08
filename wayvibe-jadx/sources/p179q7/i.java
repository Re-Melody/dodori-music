package p179q7;

import B2.AbstractC0112b;
import W6.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p170p7.n;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f25692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f25694d;

    public i(int i10, p pVar, ArrayList arrayList, List list) {
        c.z("Cannot create an empty mutation batch", !list.isEmpty(), new Object[0]);
        this.f25691a = i10;
        this.f25692b = pVar;
        this.f25693c = arrayList;
        this.f25694d = list;
    }

    public final f a(n nVar, f fVar) {
        p pVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25693c;
            int size = arrayList.size();
            pVar = this.f25692b;
            if (i11 >= size) {
                break;
            }
            h hVar = (h) arrayList.get(i11);
            if (hVar.f25688a.equals(nVar.f25269a)) {
                fVar = hVar.a(nVar, fVar, pVar);
            }
            i11++;
        }
        while (true) {
            List list = this.f25694d;
            if (i10 >= list.size()) {
                return fVar;
            }
            h hVar2 = (h) list.get(i10);
            if (hVar2.f25688a.equals(nVar.f25269a)) {
                fVar = hVar2.a(nVar, fVar, pVar);
            }
            i10++;
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f25694d.iterator();
        while (it.hasNext()) {
            hashSet.add(((h) it.next()).f25688a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25691a == iVar.f25691a && this.f25692b.equals(iVar.f25692b) && this.f25693c.equals(iVar.f25693c) && this.f25694d.equals(iVar.f25694d);
    }

    public final int hashCode() {
        return this.f25694d.hashCode() + ((this.f25693c.hashCode() + ((this.f25692b.hashCode() + (this.f25691a * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutationBatch(batchId=");
        sb.append(this.f25691a);
        sb.append(", localWriteTime=");
        sb.append(this.f25692b);
        sb.append(", baseMutations=");
        sb.append(this.f25693c);
        sb.append(", mutations=");
        return AbstractC0112b.m(sb, this.f25694d, ')');
    }
}
