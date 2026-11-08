package p259y8;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f29137b;

    public O(String str, M type) {
        m.f(type, "type");
        this.f29136a = str;
        this.f29137b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return m.b(this.f29136a, o10.f29136a) && this.f29137b == o10.f29137b;
    }

    public final int hashCode() {
        String str = this.f29136a;
        return this.f29137b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f29136a + ", type=" + this.f29137b + ")";
    }
}
