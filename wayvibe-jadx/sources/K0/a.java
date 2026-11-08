package K0;

import V0.p;
import kotlin.jvm.internal.m;
import p200t0.C2239f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2239f f7222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7223b;

    public a(C2239f c2239f, int i10) {
        this.f7222a = c2239f;
        this.f7223b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.b(this.f7222a, aVar.f7222a) && this.f7223b == aVar.f7223b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7223b) + (this.f7222a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f7222a);
        sb.append(", configFlags=");
        return p.q(sb, this.f7223b, ')');
    }
}
