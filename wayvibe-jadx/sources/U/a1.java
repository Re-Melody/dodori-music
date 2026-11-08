package U;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11842a;

    public a1(Object obj) {
        this.f11842a = obj;
    }

    @Override // U.b1
    public final Object a(InterfaceC0897l0 interfaceC0897l0) {
        return this.f11842a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && kotlin.jvm.internal.m.b(this.f11842a, ((a1) obj).f11842a);
    }

    public final int hashCode() {
        Object obj = this.f11842a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f11842a + ')';
    }
}
