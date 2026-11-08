package Z;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements p013a9.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13413d;

    public b(h hVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f13412c = hVar;
        this.f13413d = obj2;
    }

    @Override // Z.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f13413d;
    }

    @Override // Z.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f13413d;
        this.f13413d = obj;
        f fVar = (f) this.f13412c.f13433b;
        e eVar = fVar.f13426d;
        Object obj3 = this.f13410a;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = fVar.f13419c;
        if (!z10) {
            eVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = fVar.f13417a[fVar.f13418b];
            Object obj4 = nVar.f13443a[nVar.f13445c];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f13422c, obj4, 0);
        }
        fVar.f13429g = eVar.f13424e;
        return obj2;
    }
}
