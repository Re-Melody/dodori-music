package O6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f9272b;

    public Q(Class cls, Class cls2) {
        this.f9271a = cls;
        this.f9272b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q5 = (Q) obj;
        return q5.f9271a.equals(this.f9271a) && q5.f9272b.equals(this.f9272b);
    }

    public final int hashCode() {
        return Objects.hash(this.f9271a, this.f9272b);
    }

    public final String toString() {
        return this.f9271a.getSimpleName() + " with serialization type: " + this.f9272b.getSimpleName();
    }
}
