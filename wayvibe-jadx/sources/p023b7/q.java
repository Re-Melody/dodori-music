package p023b7;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f15809b;

    public q(Class cls, Class cls2) {
        this.f15808a = cls;
        this.f15809b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15809b.equals(qVar.f15809b)) {
            return this.f15808a.equals(qVar.f15808a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15808a.hashCode() + (this.f15809b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f15809b;
        Class cls2 = this.f15808a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + StringUtils.SPACE + cls.getName();
    }
}
