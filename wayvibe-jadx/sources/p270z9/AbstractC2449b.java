package p270z9;

import A9.C;
import A9.C0105e;
import A9.G;
import A9.I;
import A9.J;
import A9.q;
import A9.s;
import A9.t;
import A9.u;
import A9.v;
import B8.V;
import B9.d;
import B9.f;
import N8.k;
import com.google.firebase.firestore.L;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import p219u9.a;
import p268z7.c;

/* JADX INFO: renamed from: z9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2449b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2448a f29915d = new C2448a(new L(false, true, "    ", "type", true), f.f907a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f29916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f29917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f29918c = new c(1);

    public AbstractC2449b(L l10, d dVar) {
        this.f29916a = l10;
        this.f29917b = dVar;
    }

    public final Object a(a deserializer, k element) {
        i sVar;
        m.f(deserializer, "deserializer");
        m.f(element, "element");
        if (element instanceof y) {
            sVar = new u(this, (y) element, null, null);
        } else if (element instanceof C2451d) {
            sVar = new v(this, (C2451d) element);
        } else {
            if (!(element instanceof s ? true : element.equals(v.INSTANCE))) {
                throw new V();
            }
            sVar = new s(this, (C) element);
        }
        return q.j(sVar, deserializer);
    }

    public final Object b(String string, a deserializer) {
        m.f(deserializer, "deserializer");
        m.f(string, "string");
        G g3 = new G(string);
        Object objO = new C(this, J.OBJ, g3, deserializer.getDescriptor(), null).o(deserializer);
        if (g3.g() == 10) {
            return objO;
        }
        G.p(g3, "Expected EOF after parsing, but had " + string.charAt(g3.f436b - 1) + " instead", 0, 6);
        throw null;
    }

    public final k c(a serializer, Object obj) {
        m.f(serializer, "serializer");
        y yVar = new y();
        new t(this, new I(yVar, 0), 1).y(serializer, obj);
        Object obj2 = yVar.f21873a;
        if (obj2 != null) {
            return (k) obj2;
        }
        m.l("result");
        throw null;
    }

    public final String d(a serializer, Object obj) {
        char[] cArr;
        m.f(serializer, "serializer");
        A1.d dVar = new A1.d(1, false);
        C0105e c0105e = C0105e.f456c;
        synchronized (c0105e) {
            k kVar = (k) c0105e.f458b;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                c0105e.f457a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        }
        dVar.f117c = cArr;
        try {
            q.k(this, dVar, serializer, obj);
            return dVar.toString();
        } finally {
            dVar.n();
        }
    }
}
