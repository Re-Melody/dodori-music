package Z;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends N8.i implements X.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13435b;

    public /* synthetic */ j(c cVar, int i10) {
        this.f13434a = i10;
        this.f13435b = cVar;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f13434a) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f13435b;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f13435b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13434a) {
            case 0:
                c cVar = this.f13435b;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(0);
                }
                return new k(cVar.f13415a, nVarArr);
            default:
                c cVar2 = this.f13435b;
                n[] nVarArr2 = new n[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    nVarArr2[i11] = new o(1);
                }
                return new k(cVar2.f13415a, nVarArr2);
        }
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        switch (this.f13434a) {
            case 0:
                c cVar = this.f13435b;
                cVar.getClass();
                return cVar.f13416b;
            default:
                c cVar2 = this.f13435b;
                cVar2.getClass();
                return cVar2.f13416b;
        }
    }
}
