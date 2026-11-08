package T0;

/* JADX INFO: renamed from: T0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0812o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0816t f11529a;

    public C0812o(InterfaceC0816t interfaceC0816t) {
        this.f11529a = interfaceC0816t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0812o) {
            return kotlin.jvm.internal.m.b(this.f11529a, ((C0812o) obj).f11529a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11529a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f11529a + ", loaderKey=null)";
    }
}
