package p089i1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20457a;

    public l(Object obj) {
        this.f20457a = obj;
        new LinkedHashMap();
    }

    public Object a() {
        return this.f20457a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && m.b(a(), ((l) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
