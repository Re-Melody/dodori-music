package p064f9;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f19885a == cVar.f19885a && this.f19886b == cVar.f19886b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19885a * 31) + this.f19886b;
    }

    public final boolean isEmpty() {
        return m.g(this.f19885a, this.f19886b) > 0;
    }

    public final String toString() {
        return this.f19885a + ".." + this.f19886b;
    }
}
