package G;

import A9.C0102b;
import com.apple.android.music.playback.model.MediaPlayerException;
import p261z.C2436x0;
import p261z.X;

/* JADX INFO: loaded from: classes.dex */
public final class O implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.h f4745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0439d f4746b;

    public O(A.h hVar, C0439d c0439d) {
        this.f4745a = hVar;
        this.f4746b = c0439d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p261z.X
    public final Object a(C2436x0 c2436x0, float f10, Q8.d dVar) throws Throwable {
        N n6;
        if (dVar instanceof N) {
            n6 = (N) dVar;
            int i10 = n6.f4744c;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                n6.f4744c = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                n6 = new N(this, (S8.c) dVar);
            }
        } else {
            n6 = new N(this, (S8.c) dVar);
        }
        Object objD = n6.f4742a;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = n6.f4744c;
        if (i11 == 0) {
            Q5.b.T(objD);
            C0102b c0102b = new C0102b(10, this, c2436x0);
            n6.f4744c = 1;
            objD = this.f4745a.d(c2436x0, f10, c0102b, n6);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q5.b.T(objD);
        }
        return new Float(((Number) objD).floatValue());
    }
}
