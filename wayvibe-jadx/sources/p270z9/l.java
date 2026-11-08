package p270z9;

import A9.H;
import com.amazon.a.a.o.b;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p097i9.q;
import p097i9.r;
import p260y9.A;
import p260y9.O;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f29931a = O.a("kotlinx.serialization.json.JsonUnquotedLiteral", c0.f29272a);

    public static final C a(Number number) {
        return new s(number, false, null);
    }

    public static final C b(String str) {
        return str == null ? v.INSTANCE : new s(str, true, null);
    }

    public static final void c(String str, k kVar) {
        throw new IllegalArgumentException("Element " + z.a(kVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(C c3) {
        m.f(c3, "<this>");
        String strA = c3.a();
        String[] strArr = H.f441a;
        m.f(strA, "<this>");
        if (strA.equalsIgnoreCase(b.af)) {
            return Boolean.TRUE;
        }
        if (strA.equalsIgnoreCase(b.ag)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String e(C c3) {
        if (c3 instanceof v) {
            return null;
        }
        return c3.a();
    }

    public static final Double f(C c3) {
        m.f(c3, "<this>");
        return q.Z(c3.a());
    }

    public static final Integer g(C c3) {
        m.f(c3, "<this>");
        return r.k0(c3.a());
    }

    public static final C2451d h(k kVar) {
        m.f(kVar, "<this>");
        C2451d c2451d = kVar instanceof C2451d ? (C2451d) kVar : null;
        if (c2451d != null) {
            return c2451d;
        }
        c("JsonArray", kVar);
        throw null;
    }

    public static final y i(k kVar) {
        m.f(kVar, "<this>");
        y yVar = kVar instanceof y ? (y) kVar : null;
        if (yVar != null) {
            return yVar;
        }
        c("JsonObject", kVar);
        throw null;
    }

    public static final C j(k kVar) {
        m.f(kVar, "<this>");
        C c3 = kVar instanceof C ? (C) kVar : null;
        if (c3 != null) {
            return c3;
        }
        c("JsonPrimitive", kVar);
        throw null;
    }

    public static final Long k(C c3) {
        m.f(c3, "<this>");
        return r.l0(c3.a());
    }
}
