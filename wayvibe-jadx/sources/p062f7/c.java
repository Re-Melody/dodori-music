package p062f7;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19847b;

    public c(String str, Map map) {
        this.f19846a = str;
        this.f19847b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19846a.equals(cVar.f19846a) && this.f19847b.equals(cVar.f19847b);
    }

    public final int hashCode() {
        return this.f19847b.hashCode() + (this.f19846a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f19846a + ", properties=" + this.f19847b.values() + "}";
    }
}
