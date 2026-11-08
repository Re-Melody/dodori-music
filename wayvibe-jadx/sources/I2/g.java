package I2;

import R2.C0793v;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements V2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6304a;

    public /* synthetic */ g(i iVar) {
        this.f6304a = iVar;
    }

    @Override // V2.i
    public void h(V2.k kVar, long j10, long j11) {
        V2.q qVar = (V2.q) kVar;
        i iVar = this.f6304a;
        iVar.getClass();
        long j12 = qVar.f12529a;
        Uri uri = qVar.f12532d.f1829c;
        C0793v c0793v = new C0793v(j11);
        iVar.f6326m.getClass();
        iVar.f6330q.e(c0793v, qVar.f12531c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        iVar.f6317L = ((Long) qVar.f12534f).longValue() - j10;
        iVar.x(true);
    }

    @Override // V2.i
    public B4.a n(V2.k kVar, long j10, long j11, IOException iOException, int i10) {
        V2.q qVar = (V2.q) kVar;
        i iVar = this.f6304a;
        iVar.getClass();
        long j12 = qVar.f12529a;
        Uri uri = qVar.f12532d.f1829c;
        iVar.f6330q.h(new C0793v(j11), qVar.f12531c, iOException, true);
        iVar.f6326m.getClass();
        iVar.w(iOException);
        return V2.n.f12524e;
    }

    @Override // V2.i
    public void r(V2.k kVar, long j10, long j11, boolean z10) {
        this.f6304a.v((V2.q) kVar, j11);
    }
}
