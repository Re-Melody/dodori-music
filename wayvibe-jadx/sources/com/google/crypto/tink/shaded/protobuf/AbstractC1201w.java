package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1201w implements T, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1204z f18487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1204z f18488b;

    public AbstractC1201w(AbstractC1204z abstractC1204z) {
        this.f18487a = abstractC1204z;
        if (abstractC1204z.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18488b = abstractC1204z.s();
    }

    public static void g(Object obj, Object obj2) {
        b0 b0Var = b0.f18412c;
        b0Var.getClass();
        b0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC1204z b() {
        AbstractC1204z abstractC1204zC = c();
        abstractC1204zC.getClass();
        if (AbstractC1204z.o(abstractC1204zC, true)) {
            return abstractC1204zC;
        }
        throw new g0();
    }

    public final AbstractC1204z c() {
        if (!this.f18488b.p()) {
            return this.f18488b;
        }
        AbstractC1204z abstractC1204z = this.f18488b;
        abstractC1204z.getClass();
        b0 b0Var = b0.f18412c;
        b0Var.getClass();
        b0Var.a(abstractC1204z.getClass()).b(abstractC1204z);
        abstractC1204z.q();
        return this.f18488b;
    }

    public final AbstractC1201w d() {
        AbstractC1201w abstractC1201wR = this.f18487a.d();
        abstractC1201wR.f18488b = c();
        return abstractC1201wR;
    }

    public final void e() {
        if (this.f18488b.p()) {
            return;
        }
        AbstractC1204z abstractC1204zS = this.f18487a.s();
        g(abstractC1204zS, this.f18488b);
        this.f18488b = abstractC1204zS;
    }

    public final void f(AbstractC1204z abstractC1204z) {
        if (this.f18487a.equals(abstractC1204z)) {
            return;
        }
        e();
        g(this.f18488b, abstractC1204z);
    }
}
