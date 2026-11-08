package p195s4;

import kotlin.jvm.internal.m;
import org.slf4j.helpers.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f26119c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f26120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26121b;

    static {
        b bVar = b.f26117e;
        f26119c = new g(bVar, bVar);
    }

    public g(i iVar, i iVar2) {
        this.f26120a = iVar;
        this.f26121b = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.b(this.f26120a, gVar.f26120a) && m.b(this.f26121b, gVar.f26121b);
    }

    public final int hashCode() {
        return this.f26121b.hashCode() + (this.f26120a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f26120a + ", height=" + this.f26121b + ')';
    }
}
