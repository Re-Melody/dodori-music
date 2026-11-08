package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f15060c = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15062b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f15061a = new J();

    public final c0 a(Class cls) {
        c0 c0VarW;
        Class cls2;
        A.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f15062b;
        c0 c0Var = (c0) concurrentHashMap.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        J j10 = this.f15061a;
        j10.getClass();
        Class cls3 = d0.f15077a;
        if (!AbstractC1066y.class.isAssignableFrom(cls) && (cls2 = d0.f15077a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        b0 b0VarA = ((I) j10.f15031a).a(cls);
        if ((b0VarA.f15070d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1066y.class.isAssignableFrom(cls);
            AbstractC1066y abstractC1066y = b0VarA.f15067a;
            if (zIsAssignableFrom) {
                c0VarW = new T(d0.f15079c, AbstractC1057o.f15136a, abstractC1066y);
            } else {
                k0 k0Var = d0.f15078b;
                C1056n c1056n = AbstractC1057o.f15137b;
                if (c1056n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0VarW = new T(k0Var, c1056n, abstractC1066y);
            }
        } else if (AbstractC1066y.class.isAssignableFrom(cls)) {
            C1056n c1056n2 = null;
            U u10 = V.f15059b;
            F f10 = G.f15027b;
            k0 k0Var2 = d0.f15079c;
            if (H.f15028a[b0VarA.a().ordinal()] != 1) {
                c1056n2 = AbstractC1057o.f15136a;
            }
            C1056n c1056n3 = c1056n2;
            N n6 = O.f15039b;
            int[] iArr = S.f15041n;
            if (!(b0VarA instanceof b0)) {
                b0VarA.getClass();
                throw new ClassCastException();
            }
            c0VarW = S.w(b0VarA, u10, f10, k0Var2, c1056n3, n6);
        } else {
            C1056n c1056n4 = null;
            U u11 = V.f15058a;
            F f11 = G.f15026a;
            k0 k0Var3 = d0.f15078b;
            if (H.f15028a[b0VarA.a().ordinal()] != 1 && (c1056n4 = AbstractC1057o.f15137b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C1056n c1056n5 = c1056n4;
            N n10 = O.f15038a;
            int[] iArr2 = S.f15041n;
            if (!(b0VarA instanceof b0)) {
                b0VarA.getClass();
                throw new ClassCastException();
            }
            c0VarW = S.w(b0VarA, u11, f11, k0Var3, c1056n5, n10);
        }
        c0 c0Var2 = (c0) concurrentHashMap.putIfAbsent(cls, c0VarW);
        return c0Var2 != null ? c0Var2 : c0VarW;
    }
}
