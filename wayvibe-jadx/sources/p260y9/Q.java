package p260y9;

import D7.W;
import M8.j;
import N8.n;
import N8.s;
import N8.t;
import U.C0914u0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public class Q implements g, InterfaceC2374j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2389z f29249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29251d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f29252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f29253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f29254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f29255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f29256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f29257j;
    public final Object k;

    public Q(String str, InterfaceC2389z interfaceC2389z, int i10) {
        this.f29248a = str;
        this.f29249b = interfaceC2389z;
        this.f29250c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f29252e = strArr;
        int i12 = this.f29250c;
        this.f29253f = new List[i12];
        this.f29254g = new boolean[i12];
        this.f29255h = t.f8651a;
        j jVar = j.PUBLICATION;
        this.f29256i = W.R(jVar, new P(this, 1));
        this.f29257j = W.R(jVar, new P(this, 2));
        this.k = W.R(jVar, new P(this, 0));
    }

    @Override // p240w9.g
    public final String a() {
        return this.f29248a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p260y9.InterfaceC2374j
    public final Set b() {
        return this.f29255h.keySet();
    }

    @Override // p240w9.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        Integer num = (Integer) this.f29255h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p240w9.g
    public l e() {
        return p240w9.m.f28084b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M8.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [M8.h, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            g gVar = (g) obj;
            if (this.f29248a.equals(gVar.a()) && Arrays.equals((g[]) this.f29257j.getValue(), (g[]) ((Q) obj).f29257j.getValue())) {
                int iF = gVar.f();
                int i10 = this.f29250c;
                if (i10 == iF) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (m.b(i(i11).a(), gVar.i(i11).a()) && m.b(i(i11).e(), gVar.i(i11).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p240w9.g
    public final int f() {
        return this.f29250c;
    }

    @Override // p240w9.g
    public final String g(int i10) {
        return this.f29252e[i10];
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return s.f8650a;
    }

    @Override // p240w9.g
    public final List h(int i10) {
        List list = this.f29253f[i10];
        return list == null ? s.f8650a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M8.h, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M8.h, java.lang.Object] */
    @Override // p240w9.g
    public g i(int i10) {
        return ((a[]) this.f29256i.getValue())[i10].getDescriptor();
    }

    @Override // p240w9.g
    public boolean isInline() {
        return false;
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        return this.f29254g[i10];
    }

    public final void k(String name, boolean z10) {
        m.f(name, "name");
        int i10 = this.f29251d + 1;
        this.f29251d = i10;
        String[] strArr = this.f29252e;
        strArr[i10] = name;
        this.f29254g[i10] = z10;
        this.f29253f[i10] = null;
        if (i10 == this.f29250c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f29255h = map;
        }
    }

    public String toString() {
        return n.H0(R3.a.j0(0, this.f29250c), ", ", this.f29248a.concat("("), ")", new C0914u0(this, 21), 24);
    }
}
