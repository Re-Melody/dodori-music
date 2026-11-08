package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1200v f18385b = new C1200v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18386a;

    public N(C1191l c1191l) {
        E.a(c1191l, "output");
        this.f18386a = c1191l;
        c1191l.f18463c = this;
    }

    public void a(int i10, AbstractC1188i abstractC1188i) {
        C1191l c1191l = (C1191l) this.f18386a;
        c1191l.k0(i10, 2);
        c1191l.m0(abstractC1188i.size());
        C1187h c1187h = (C1187h) abstractC1188i;
        c1191l.d0(c1187h.f18435d, c1187h.m(), c1187h.size());
    }

    public void b(int i10, Object obj, e0 e0Var) {
        C1191l c1191l = (C1191l) this.f18386a;
        c1191l.k0(i10, 3);
        e0Var.i((AbstractC1180a) obj, c1191l.f18463c);
        c1191l.k0(i10, 4);
    }

    public void c(int i10, Object obj, e0 e0Var) {
        AbstractC1180a abstractC1180a = (AbstractC1180a) obj;
        C1191l c1191l = (C1191l) this.f18386a;
        c1191l.k0(i10, 2);
        c1191l.m0(abstractC1180a.b(e0Var));
        e0Var.i(abstractC1180a, this);
    }

    public N() {
        b0 b0Var = b0.f18412c;
        S s8 = f18385b;
        try {
            s8 = (S) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        S[] sArr = {C1200v.f18485b, s8};
        M m8 = new M();
        m8.f18384a = sArr;
        Charset charset = E.f18377a;
        this.f18386a = m8;
    }
}
