package O6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f9257b;

    public I(Class cls, Class cls2) {
        this.f9256a = cls;
        this.f9257b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return i10.f9256a.equals(this.f9256a) && i10.f9257b.equals(this.f9257b);
    }

    public final int hashCode() {
        return Objects.hash(this.f9256a, this.f9257b);
    }

    public final String toString() {
        return this.f9256a.getSimpleName() + " with primitive type: " + this.f9257b.getSimpleName();
    }
}
