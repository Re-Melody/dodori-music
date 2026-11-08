package p096i8;

import Z2.r;
import Z2.z;
import na.a;
import p177q4.g;
import p213u3.f;
import p230w.AbstractC2285s;
import p230w.r0;
import p234w3.k;
import p234w3.m;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements a, g, f, r0, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f20555a;

    @Override // p234w3.k
    public boolean c(C2339o c2339o) {
        return false;
    }

    @Override // p230w.q0
    public AbstractC2285s e(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        return j10 < ((long) 0) * 1000000 ? abstractC2285s : abstractC2285s2;
    }

    @Override // p213u3.f
    public long f(Z2.k kVar) {
        return -1L;
    }

    @Override // p213u3.f
    public z h() {
        return new r(-9223372036854775807L);
    }

    @Override // p230w.r0
    public int i() {
        return 0;
    }

    @Override // p234w3.k
    public m j(C2339o c2339o) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p230w.r0
    public int l() {
        return 0;
    }

    @Override // p177q4.g
    public boolean m() {
        return true;
    }

    @Override // p234w3.k
    public int n(C2339o c2339o) {
        return 1;
    }

    public synchronized void o(oa.a aVar) {
        aVar.f23895b = true;
        notifyAll();
    }

    @Override // p177q4.g
    public void shutdown() {
    }

    @Override // p213u3.f
    public void k(long j10) {
    }

    @Override // p230w.q0
    public AbstractC2285s g(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        return abstractC2285s3;
    }
}
