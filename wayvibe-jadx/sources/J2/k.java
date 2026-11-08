package J2;

import A6.E;
import java.util.ArrayList;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements I2.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f6518f;

    public k(C2339o c2339o, E e2, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c2339o, e2, nVar, arrayList, arrayList2, arrayList3);
        this.f6518f = nVar;
    }

    @Override // I2.j
    public final long a(long j10) {
        return this.f6518f.g(j10);
    }

    @Override // J2.m
    public final String b() {
        return null;
    }

    @Override // I2.j
    public final long c(long j10, long j11) {
        return this.f6518f.e(j10, j11);
    }

    @Override // I2.j
    public final long e(long j10, long j11) {
        return this.f6518f.c(j10, j11);
    }

    @Override // J2.m
    public final j f() {
        return null;
    }

    @Override // I2.j
    public final long g(long j10, long j11) {
        n nVar = this.f6518f;
        if (nVar.f6528f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(jB, j10) + nVar.g(jB)) - nVar.f6531i;
    }

    @Override // I2.j
    public final j h(long j10) {
        return this.f6518f.h(this, j10);
    }

    @Override // I2.j
    public final long k(long j10, long j11) {
        return this.f6518f.f(j10, j11);
    }

    @Override // I2.j
    public final boolean q() {
        return this.f6518f.i();
    }

    @Override // I2.j
    public final long t() {
        return this.f6518f.f6526d;
    }

    @Override // I2.j
    public final long u(long j10) {
        return this.f6518f.d(j10);
    }

    @Override // I2.j
    public final long v(long j10, long j11) {
        return this.f6518f.b(j10, j11);
    }

    @Override // J2.m
    public final I2.j d() {
        return this;
    }
}
