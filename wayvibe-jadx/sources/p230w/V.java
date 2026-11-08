package p230w;

import N8.o;
import R3.a;
import U.C0899m0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import oa.e;
import org.maplibre.android.location.v;
import p064f9.f;
import p064f9.g;
import p134m1.b;
import p140m7.C2061m;

/* JADX INFO: loaded from: classes.dex */
public final class V implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f27603c;

    public V(float f10, float f11, Object obj) {
        this.f27601a = f10;
        this.f27602b = f11;
        this.f27603c = obj;
    }

    @Override // p230w.InterfaceC2280m
    public final q0 a(o0 o0Var) {
        Object eVar;
        Object obj = this.f27603c;
        AbstractC2285s abstractC2285s = obj == null ? null : (AbstractC2285s) o0Var.f27755a.invoke(obj);
        float f10 = this.f27601a;
        float f11 = this.f27602b;
        if (abstractC2285s != null) {
            C0899m0 c0899m0 = new C0899m0();
            g gVarJ0 = a.j0(0, abstractC2285s.b());
            ArrayList arrayList = new ArrayList(o.o0(gVarJ0, 10));
            Iterator it = gVarJ0.iterator();
            while (((f) it).f19897c) {
                arrayList.add(new E(f10, f11, abstractC2285s.a(((f) it).a())));
            }
            c0899m0.f11887a = arrayList;
            eVar = c0899m0;
        } else {
            eVar = new e(f10, f11);
        }
        v vVar = new v();
        vVar.f24715a = new C2061m(eVar);
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            V v3 = (V) obj;
            if (v3.f27601a == this.f27601a && v3.f27602b == this.f27602b && m.b(v3.f27603c, this.f27603c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f27603c;
        return Float.hashCode(this.f27602b) + b.b(this.f27601a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ V(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
