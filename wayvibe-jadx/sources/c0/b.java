package c0;

import D0.f0;
import M8.InterfaceC0643e;
import Q.A0;
import Q.C0738i;
import U.C0906q;
import U.C0908r0;
import U.InterfaceC0898m;
import Z8.h;
import Z8.i;
import Z8.j;
import java.util.ArrayList;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Z8.e, Z8.f, Z8.g, h, i, j, InterfaceC0643e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0908r0 f15834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f15835e;

    public b(int i10, Object obj, boolean z10) {
        this.f15831a = i10;
        this.f15832b = z10;
        this.f15833c = obj;
    }

    public final Object a(Object obj, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = c0906q.f(this) ? g.a(2, 1) : g.a(1, 1);
        Object obj2 = this.f15833c;
        m.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(3, obj2);
        Object objInvoke = ((Z8.f) obj2).invoke(obj, c0906q, Integer.valueOf(iA | i10));
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new D.i(this, i10, 9, obj);
        }
        return objInvoke;
    }

    public final Object b(Object obj, Object obj2, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = c0906q.f(this) ? g.a(2, 2) : g.a(1, 2);
        Object obj3 = this.f15833c;
        m.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(4, obj3);
        Object objInvoke = ((Z8.g) obj3).invoke(obj, obj2, c0906q, Integer.valueOf(iA | i10));
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new f0(i10, 5, this, obj, obj2);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, Object obj3, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = c0906q.f(this) ? g.a(2, 3) : g.a(1, 3);
        Object obj4 = this.f15833c;
        m.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(5, obj4);
        Object objInvoke = ((h) obj4).invoke(obj, obj2, obj3, c0906q, Integer.valueOf(iA | i10));
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new C0738i(this, obj, obj2, obj3, i10);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = c0906q.f(this) ? g.a(2, 4) : g.a(1, 4);
        Object obj5 = this.f15833c;
        m.d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(6, obj5);
        Object objD = ((b) ((i) obj5)).d(obj, obj2, obj3, obj4, c0906q, Integer.valueOf(iA | i10).intValue());
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new a(this, obj, obj2, obj3, obj4, i10);
        }
        return objD;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = c0906q.f(this) ? g.a(2, 5) : g.a(1, 5);
        Object obj6 = this.f15833c;
        m.d(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(7, obj6);
        Object objE = ((b) ((j) obj6)).e(obj, obj2, obj3, obj4, obj5, c0906q, Integer.valueOf(i10 | iA).intValue());
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new A0(this, obj, obj2, obj3, obj4, obj5, i10);
        }
        return objE;
    }

    public final void g(InterfaceC0898m interfaceC0898m) {
        C0906q c0906q;
        C0908r0 c0908r0X;
        if (!this.f15832b || (c0908r0X = (c0906q = (C0906q) interfaceC0898m).x()) == null) {
            return;
        }
        c0906q.getClass();
        c0908r0X.f11951a |= 1;
        if (g.c(this.f15834d, c0908r0X)) {
            this.f15834d = c0908r0X;
            return;
        }
        ArrayList arrayList = this.f15835e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f15835e = arrayList2;
            arrayList2.add(c0908r0X);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g.c((C0908r0) arrayList.get(i10), c0908r0X)) {
                arrayList.set(i10, c0908r0X);
                return;
            }
        }
        arrayList.add(c0908r0X);
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C0906q c0906q = (C0906q) ((InterfaceC0898m) obj);
        c0906q.V(this.f15831a);
        g(c0906q);
        int iA = iIntValue | (c0906q.f(this) ? g.a(2, 0) : g.a(1, 0));
        Object obj3 = this.f15833c;
        m.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        B.d(2, obj3);
        Object objInvoke = ((Z8.e) obj3).invoke(c0906q, Integer.valueOf(iA));
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            B.d(2, this);
            c0908r0S.f11954d = this;
        }
        return objInvoke;
    }

    @Override // Z8.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(obj, (InterfaceC0898m) obj2, ((Number) obj3).intValue());
    }

    @Override // Z8.g
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (InterfaceC0898m) obj3, ((Number) obj4).intValue());
    }

    @Override // Z8.h
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, (InterfaceC0898m) obj4, ((Number) obj5).intValue());
    }
}
