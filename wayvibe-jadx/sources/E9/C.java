package E9;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3333b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351l f3334a;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.m.e(separator, "separator");
        f3333b = separator;
    }

    public C(C0351l bytes) {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        this.f3334a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = F9.c.a(this);
        C0351l c0351l = this.f3334a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < c0351l.k() && c0351l.p(iA) == 92) {
            iA++;
        }
        int iK = c0351l.k();
        int i10 = iA;
        while (iA < iK) {
            if (c0351l.p(iA) == 47 || c0351l.p(iA) == 92) {
                arrayList.add(c0351l.w(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < c0351l.k()) {
            arrayList.add(c0351l.w(i10, c0351l.k()));
        }
        return arrayList;
    }

    public final C b() {
        C0351l c0351l = F9.c.f4623d;
        C0351l c0351l2 = this.f3334a;
        if (kotlin.jvm.internal.m.b(c0351l2, c0351l)) {
            return null;
        }
        C0351l c0351l3 = F9.c.f4620a;
        if (kotlin.jvm.internal.m.b(c0351l2, c0351l3)) {
            return null;
        }
        C0351l c0351l4 = F9.c.f4621b;
        if (kotlin.jvm.internal.m.b(c0351l2, c0351l4)) {
            return null;
        }
        C0351l suffix = F9.c.f4624e;
        c0351l2.getClass();
        kotlin.jvm.internal.m.f(suffix, "suffix");
        int iK = c0351l2.k();
        byte[] bArr = suffix.f3389a;
        if (c0351l2.s(iK - bArr.length, suffix, bArr.length) && (c0351l2.k() == 2 || c0351l2.s(c0351l2.k() - 3, c0351l3, 1) || c0351l2.s(c0351l2.k() - 3, c0351l4, 1))) {
            return null;
        }
        int iR = C0351l.r(c0351l2, c0351l3);
        if (iR == -1) {
            iR = C0351l.r(c0351l2, c0351l4);
        }
        if (iR == 2 && g() != null) {
            if (c0351l2.k() == 3) {
                return null;
            }
            return new C(C0351l.x(c0351l2, 0, 3, 1));
        }
        if (iR == 1 && c0351l2.u(c0351l4)) {
            return null;
        }
        if (iR != -1 || g() == null) {
            if (iR == -1) {
                return new C(c0351l);
            }
            return iR == 0 ? new C(C0351l.x(c0351l2, 0, 1, 1)) : new C(C0351l.x(c0351l2, 0, iR, 1));
        }
        if (c0351l2.k() == 2) {
            return null;
        }
        return new C(C0351l.x(c0351l2, 0, 2, 1));
    }

    public final C c(C other) {
        kotlin.jvm.internal.m.f(other, "other");
        int iA = F9.c.a(this);
        C0351l c0351l = this.f3334a;
        C c3 = iA == -1 ? null : new C(c0351l.w(0, iA));
        int iA2 = F9.c.a(other);
        C0351l c0351l2 = other.f3334a;
        if (!kotlin.jvm.internal.m.b(c3, iA2 != -1 ? new C(c0351l2.w(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.m.b(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && c0351l.k() == c0351l2.k()) {
            return K8.c.p(".");
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(F9.c.f4624e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.m.b(c0351l2, F9.c.f4623d)) {
            return this;
        }
        C0348i c0348i = new C0348i();
        C0351l c0351lC = F9.c.c(other);
        if (c0351lC == null && (c0351lC = F9.c.c(this)) == null) {
            c0351lC = F9.c.f(f3333b);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c0348i.H(F9.c.f4624e);
            c0348i.H(c0351lC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            c0348i.H((C0351l) arrayListA.get(i10));
            c0348i.H(c0351lC);
            i10++;
        }
        return F9.c.d(c0348i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C other = (C) obj;
        kotlin.jvm.internal.m.f(other, "other");
        return this.f3334a.compareTo(other.f3334a);
    }

    public final C d(String child) {
        kotlin.jvm.internal.m.f(child, "child");
        C0348i c0348i = new C0348i();
        c0348i.R(child);
        return F9.c.b(this, F9.c.d(c0348i, false), false);
    }

    public final File e() {
        return new File(this.f3334a.A());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C) && kotlin.jvm.internal.m.b(((C) obj).f3334a, this.f3334a);
    }

    public final Path f() {
        Path path = Paths.get(this.f3334a.A(), new String[0]);
        kotlin.jvm.internal.m.e(path, "get(...)");
        return path;
    }

    public final Character g() {
        C0351l c0351l = F9.c.f4620a;
        C0351l c0351l2 = this.f3334a;
        if (C0351l.n(c0351l2, c0351l) != -1 || c0351l2.k() < 2 || c0351l2.p(1) != 58) {
            return null;
        }
        char cP = (char) c0351l2.p(0);
        if (('a' > cP || cP >= '{') && ('A' > cP || cP >= '[')) {
            return null;
        }
        return Character.valueOf(cP);
    }

    public final int hashCode() {
        return this.f3334a.hashCode();
    }

    public final String toString() {
        return this.f3334a.A();
    }
}
