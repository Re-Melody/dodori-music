package Z;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends N8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13431b;

    public /* synthetic */ g(int i10, e eVar) {
        this.f13430a = i10;
        this.f13431b = eVar;
    }

    @Override // N8.h
    public final int a() {
        switch (this.f13430a) {
            case 0:
                e eVar = this.f13431b;
                eVar.getClass();
                return eVar.f13425f;
            default:
                e eVar2 = this.f13431b;
                eVar2.getClass();
                return eVar2.f13425f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f13430a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13430a) {
            case 0:
                this.f13431b.clear();
                break;
            default:
                this.f13431b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f13430a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.f13431b;
                Object obj2 = eVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f13431b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13430a) {
            case 0:
                return new h(this.f13431b);
            default:
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(1);
                }
                return new i(this.f13431b, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f13430a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f13431b.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f13431b;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
