package p151n9;

import M8.D;
import Q5.b;
import Q8.d;
import S8.c;
import S8.i;
import Z8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import o9.g;
import p141m9.a;
import p141m9.q;
import p141m9.r;

/* JADX INFO: renamed from: n9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2101c extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f23098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f23099e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2101c(e eVar, Q8.i iVar, int i10, a aVar) {
        super(iVar, i10, aVar);
        i iVar2 = (i) eVar;
        this.f23098d = iVar2;
        this.f23099e = iVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [S8.i, Z8.e] */
    @Override // o9.g
    public final Object b(r rVar, d dVar) {
        C2100b c2100b;
        if (dVar instanceof C2100b) {
            c2100b = (C2100b) dVar;
            int i10 = c2100b.f23097d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2100b.f23097d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2100b = new C2100b(this, (c) dVar);
            }
        } else {
            c2100b = new C2100b(this, (c) dVar);
        }
        Object obj = c2100b.f23095b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = c2100b.f23097d;
        D d10 = D.f8402a;
        if (i11 == 0) {
            b.T(obj);
            c2100b.f23094a = rVar;
            c2100b.f23097d = 1;
            Object objInvoke = this.f23098d.invoke(rVar, c2100b);
            if (objInvoke != aVar) {
                objInvoke = d10;
            }
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = c2100b.f23094a;
            b.T(obj);
        }
        if (((q) rVar).f22539d.t()) {
            return d10;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S8.i, Z8.e] */
    @Override // o9.g
    public final g c(Q8.i iVar, int i10, a aVar) {
        return new C2101c(this.f23099e, iVar, i10, aVar);
    }

    @Override // o9.g
    public final String toString() {
        return "block[" + this.f23098d + "] -> " + super.toString();
    }
}
