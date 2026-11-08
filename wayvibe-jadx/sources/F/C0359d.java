package F;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: F.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359d implements p067g0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q8.k f3530b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(S8.c cVar) {
        C0358c c0358c;
        Q8.k kVar;
        if (cVar instanceof C0358c) {
            c0358c = (C0358c) cVar;
            int i10 = c0358c.f3528d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c0358c.f3528d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c0358c = new C0358c(this, cVar);
            }
        } else {
            c0358c = new C0358c(this, cVar);
        }
        Object obj = c0358c.f3526b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = c0358c.f3528d;
        M8.D d10 = M8.D.f8402a;
        if (i11 == 0) {
            Q5.b.T(obj);
            if (!this.f3529a) {
                Q8.k kVar2 = this.f3530b;
                c0358c.f3525a = kVar2;
                c0358c.f3528d = 1;
                Q8.k kVar3 = new Q8.k(D7.W.K(c0358c), R8.a.UNDECIDED);
                this.f3530b = kVar3;
                if (kVar3.a() == aVar) {
                    return aVar;
                }
                kVar = kVar2;
            }
            return d10;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar = c0358c.f3525a;
        Q5.b.T(obj);
        if (kVar != null) {
            kVar.resumeWith(d10);
        }
        return d10;
    }
}
