package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P[] f15029a;

    @Override // androidx.datastore.preferences.protobuf.P
    public final b0 a(Class cls) {
        for (P p10 : this.f15029a) {
            if (p10.b(cls)) {
                return p10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        for (P p10 : this.f15029a) {
            if (p10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
