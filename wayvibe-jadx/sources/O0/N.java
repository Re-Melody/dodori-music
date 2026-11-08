package O0;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8898a;

    public N(String str) {
        this.f8898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return kotlin.jvm.internal.m.b(this.f8898a, ((N) obj).f8898a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8898a.hashCode();
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("UrlAnnotation(url="), this.f8898a, ')');
    }
}
