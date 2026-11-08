package U;

/* JADX INFO: loaded from: classes.dex */
public final class H implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0891i0 f11733a;

    public H(C0891i0 c0891i0) {
        this.f11733a = c0891i0;
    }

    @Override // U.b1
    public final Object a(InterfaceC0897l0 interfaceC0897l0) {
        return this.f11733a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.f11733a.equals(((H) obj).f11733a);
    }

    public final int hashCode() {
        return this.f11733a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f11733a + ')';
    }
}
