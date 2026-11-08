package p199t;

import N8.m;
import androidx.datastore.preferences.protobuf.h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2230e extends G implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f26283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2227b f26284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2229d f26285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2230e(G g3) {
        super(0);
        int i10 = g3.f26268c;
        b(this.f26268c + i10);
        if (this.f26268c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(g3.g(i11), g3.j(i11));
            }
        } else if (i10 > 0) {
            m.h0(0, 0, i10, g3.f26266a, this.f26266a);
            m.k0(g3.f26267b, 0, this.f26267b, 0, i10 << 1);
            this.f26268c = i10;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h0 h0Var = this.f26283d;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(2, this);
        this.f26283d = h0Var2;
        return h0Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2227b c2227b = this.f26284e;
        if (c2227b != null) {
            return c2227b;
        }
        C2227b c2227b2 = new C2227b(this);
        this.f26284e = c2227b2;
        return c2227b2;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f26268c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f26268c;
    }

    public final boolean n(Collection collection) {
        int i10 = this.f26268c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(g(i11))) {
                h(i11);
            }
        }
        return i10 != this.f26268c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f26268c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2229d c2229d = this.f26285f;
        if (c2229d != null) {
            return c2229d;
        }
        C2229d c2229d2 = new C2229d(this);
        this.f26285f = c2229d2;
        return c2229d2;
    }
}
