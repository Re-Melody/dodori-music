package p079h3;

import D8.C0272f;
import Z2.A;
import Z2.t;
import Z2.y;
import Z2.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f20238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0272f f20239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0272f c0272f, z zVar, z zVar2) {
        super(zVar);
        this.f20239c = c0272f;
        this.f20238b = zVar2;
    }

    @Override // Z2.t, Z2.z
    public final y i(long j10) {
        y yVarI = this.f20238b.i(j10);
        A a10 = yVarI.f13603a;
        long j11 = a10.f13456a;
        long j12 = this.f20239c.f2596b;
        A a11 = new A(j11, a10.f13457b + j12);
        A a12 = yVarI.f13604b;
        return new y(a11, new A(a12.f13456a, a12.f13457b + j12));
    }
}
