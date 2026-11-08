package p230w;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class X implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f27606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27607b;

    public X(q0 q0Var, long j10) {
        this.f27606a = q0Var;
        this.f27607b = j10;
    }

    @Override // p230w.q0
    public final long a(AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        return this.f27606a.a(abstractC2285s, abstractC2285s2, abstractC2285s3) + this.f27607b;
    }

    @Override // p230w.q0
    public final boolean d() {
        return this.f27606a.d();
    }

    @Override // p230w.q0
    public final AbstractC2285s e(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        long j11 = this.f27607b;
        return j10 < j11 ? abstractC2285s : this.f27606a.e(j10 - j11, abstractC2285s, abstractC2285s2, abstractC2285s3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return x10.f27607b == this.f27607b && m.b(x10.f27606a, this.f27606a);
    }

    @Override // p230w.q0
    public final AbstractC2285s g(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        long j11 = this.f27607b;
        return j10 < j11 ? abstractC2285s3 : this.f27606a.g(j10 - j11, abstractC2285s, abstractC2285s2, abstractC2285s3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27607b) + (this.f27606a.hashCode() * 31);
    }
}
