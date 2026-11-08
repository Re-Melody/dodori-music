package p085h9;

import B2.AbstractC0112b;
import D7.W;
import F9.h;
import G0.C0480j1;
import N8.s;
import R3.a;
import Z8.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p021b5.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a {
    public static h n0(Iterator it) {
        m.f(it, "<this>");
        return new a(new C0480j1(it, 5));
    }

    public static int o0(h hVar) {
        m.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i10;
    }

    public static h p0(h hVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return hVar;
        }
        return hVar instanceof c ? ((c) hVar).b(i10) : new b(hVar, i10, 0);
    }

    public static Object q0(f fVar) {
        e eVar = new e(fVar);
        if (eVar.hasNext()) {
            return eVar.next();
        }
        return null;
    }

    public static h r0(c cVar, Object obj) {
        return obj == null ? d.f20344a : new X8.j(new h(obj, 7), cVar);
    }

    public static g s0(h hVar, c transform) {
        m.f(transform, "transform");
        return new g(hVar, transform, 1);
    }

    public static f t0(h hVar, c transform) {
        m.f(transform, "transform");
        return new f(new g(hVar, transform, 1), false, new b(7));
    }

    public static h u0(h hVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return d.f20344a;
        }
        return hVar instanceof c ? ((c) hVar).a(i10) : new b(hVar, i10, 1);
    }

    public static List v0(h hVar) {
        m.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return s.f8650a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return W.T(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
