package p185r4;

import N8.t;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f25969b = new p(t.f8651a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25970a;

    public p(Map map) {
        this.f25970a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return m.b(this.f25970a, ((p) obj).f25970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25970a.hashCode();
    }

    public final String toString() {
        return b.n(new StringBuilder("Tags(tags="), this.f25970a, ')');
    }
}
