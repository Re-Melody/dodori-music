package D2;

import A6.AbstractC0093s;
import A6.P;
import A6.f0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1890b;

    public o() {
        this.f1889a = 1;
        this.f1890b = new HashMap();
    }

    public final boolean a(Object obj) {
        return c().containsKey(obj);
    }

    public final boolean b(Object obj) {
        return c().containsValue(obj);
    }

    public final Map c() {
        switch (this.f1889a) {
            case 0:
                return this.f1890b;
            default:
                return (HashMap) this.f1890b;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f1889a) {
            case 0:
                return obj != null && a(obj);
            default:
                return a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f1889a) {
            case 0:
                P p10 = new P(((f0) entrySet()).iterator());
                if (obj == null) {
                    while (p10.hasNext()) {
                        if (p10.next() == null) {
                            return true;
                        }
                    }
                    return false;
                }
                while (p10.hasNext()) {
                    if (obj.equals(p10.next())) {
                        return true;
                    }
                }
                return false;
            default:
                return b(obj);
        }
    }

    public double d() {
        HashMap map = (HashMap) this.f1890b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (((J8.k) it.next()).d()) {
                i10++;
            }
        }
        return (((double) i10) / ((double) i11)) * 100.0d;
    }

    public final Set e() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.f1889a) {
            case 0:
                return AbstractC0093s.f(e(), new n(0));
            default:
                return e();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f1889a) {
            case 0:
                return obj != null && AbstractC0093s.d(obj, this);
            default:
                return g(obj);
        }
    }

    public final boolean g(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.f1889a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) h(obj);
            default:
                return h(obj);
        }
    }

    public final Object h(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f1889a) {
            case 0:
                return AbstractC0093s.i(entrySet());
            default:
                return i();
        }
    }

    public final int i() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.f1889a) {
            case 0:
                if (j()) {
                    return true;
                }
                return l() == 1 && a(null);
            default:
                return j();
        }
    }

    public final boolean j() {
        return c().isEmpty();
    }

    public final Set k() {
        return c().keySet();
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.f1889a) {
            case 0:
                return AbstractC0093s.f(k(), new n(1));
            default:
                return k();
        }
    }

    public final int l() {
        return c().size();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.f1889a) {
            case 0:
                return l() - (a(null) ? 1 : 0);
            default:
                return l();
        }
    }

    public final String toString() {
        Object obj;
        switch (this.f1889a) {
            case 0:
                obj = this.f1890b;
                break;
            default:
                obj = (HashMap) this.f1890b;
                break;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return c().values();
    }

    public o(Map map) {
        this.f1889a = 0;
        this.f1890b = map;
    }
}
