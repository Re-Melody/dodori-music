package O6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V6.a f9270b;

    public P(Class cls, V6.a aVar) {
        this.f9269a = cls;
        this.f9270b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return p10.f9269a.equals(this.f9269a) && p10.f9270b.equals(this.f9270b);
    }

    public final int hashCode() {
        return Objects.hash(this.f9269a, this.f9270b);
    }

    public final String toString() {
        return this.f9269a.getSimpleName() + ", object identifier: " + this.f9270b;
    }
}
