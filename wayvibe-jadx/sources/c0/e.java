package c0;

import U.AbstractC0903o0;
import U.InterfaceC0897l0;
import U.b1;
import Z.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Z.c implements InterfaceC0897l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15838d = new e(m.f13438e, 0);

    @Override // Z.c
    /* JADX INFO: renamed from: a */
    public final Z.e m() {
        d dVar = new d(this);
        dVar.f15837g = this;
        return dVar;
    }

    @Override // Z.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0903o0) {
            return super.containsKey((AbstractC0903o0) obj);
        }
        return false;
    }

    @Override // N8.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof b1) {
            return super.containsValue((b1) obj);
        }
        return false;
    }

    @Override // Z.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0903o0) {
            return (b1) super.get((AbstractC0903o0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0903o0) ? obj2 : (b1) super.getOrDefault((AbstractC0903o0) obj, (b1) obj2);
    }

    @Override // Z.c, X.d
    public final X.c m() {
        d dVar = new d(this);
        dVar.f15837g = this;
        return dVar;
    }
}
