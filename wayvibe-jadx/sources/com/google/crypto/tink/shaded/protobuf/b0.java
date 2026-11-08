package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f18412c = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18414b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f18413a = new N();

    public final e0 a(Class cls) {
        e0 e0VarZ;
        Class cls2;
        E.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f18414b;
        e0 e0Var = (e0) concurrentHashMap.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        N n6 = this.f18413a;
        n6.getClass();
        Class cls3 = f0.f18430a;
        if (!AbstractC1204z.class.isAssignableFrom(cls) && (cls2 = f0.f18430a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        d0 d0VarA = ((M) n6.f18386a).a(cls);
        if ((d0VarA.f18428d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1204z.class.isAssignableFrom(cls);
            AbstractC1180a abstractC1180a = d0VarA.f18425a;
            if (zIsAssignableFrom) {
                e0VarZ = new W(f0.f18432c, AbstractC1196q.f18480a, abstractC1180a);
            } else {
                i0 i0Var = f0.f18431b;
                C1195p c1195p = AbstractC1196q.f18481b;
                if (c1195p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                e0VarZ = new W(i0Var, c1195p, abstractC1180a);
            }
        } else if (AbstractC1204z.class.isAssignableFrom(cls)) {
            C1195p c1195p2 = null;
            X x10 = Y.f18410b;
            I i10 = J.f18381b;
            i0 i0Var2 = f0.f18432c;
            if (L.f18383a[d0VarA.a().ordinal()] != 1) {
                c1195p2 = AbstractC1196q.f18480a;
            }
            C1195p c1195p3 = c1195p2;
            P p10 = Q.f18390b;
            int[] iArr = V.f18392n;
            if (!(d0VarA instanceof d0)) {
                d0VarA.getClass();
                throw new ClassCastException();
            }
            e0VarZ = V.z(d0VarA, x10, i10, i0Var2, c1195p3, p10);
        } else {
            C1195p c1195p4 = null;
            X x11 = Y.f18409a;
            I i11 = J.f18380a;
            i0 i0Var3 = f0.f18431b;
            if (L.f18383a[d0VarA.a().ordinal()] != 1 && (c1195p4 = AbstractC1196q.f18481b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C1195p c1195p5 = c1195p4;
            P p11 = Q.f18389a;
            int[] iArr2 = V.f18392n;
            if (!(d0VarA instanceof d0)) {
                d0VarA.getClass();
                throw new ClassCastException();
            }
            e0VarZ = V.z(d0VarA, x11, i11, i0Var3, c1195p5, p11);
        }
        e0 e0Var2 = (e0) concurrentHashMap.putIfAbsent(cls, e0VarZ);
        return e0Var2 != null ? e0Var2 : e0VarZ;
    }
}
