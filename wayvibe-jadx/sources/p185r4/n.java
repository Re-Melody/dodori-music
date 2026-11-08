package p185r4;

import M8.l;
import N8.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import p013a9.a;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f25960b = new n(t.f8651a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25961a;

    public n(Map map) {
        this.f25961a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return m.b(this.f25961a, ((n) obj).f25961a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25961a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f25961a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new l(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return b.n(new StringBuilder("Parameters(entries="), this.f25961a, ')');
    }
}
