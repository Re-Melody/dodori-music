package O0;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8899a;

    public O(String str) {
        this.f8899a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return kotlin.jvm.internal.m.b(this.f8899a, ((O) obj).f8899a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8899a.hashCode();
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f8899a, ')');
    }
}
