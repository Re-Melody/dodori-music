package p151n9;

import M8.D;
import Q5.b;
import Q8.d;
import R8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import o9.s;
import p039d2.C1920q;
import p039d2.C1921s;

/* JADX INFO: renamed from: n9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2110l implements InterfaceC2105g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1921s f23122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1920q f23123b;

    public C2110l(C1921s c1921s, C1920q c1920q) {
        this.f23122a = c1921s;
        this.f23123b = c1920q;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p151n9.InterfaceC2105g
    public final Object collect(InterfaceC2106h interfaceC2106h, d dVar) throws Throwable {
        C2109k c2109k;
        C2110l c2110l;
        W w10;
        C1920q c1920q;
        s sVar;
        Throwable th;
        s sVar2;
        C1920q c1920q2;
        if (dVar instanceof C2109k) {
            c2109k = (C2109k) dVar;
            int i10 = c2109k.f23118b;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2109k.f23118b = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2109k = new C2109k(this, dVar);
            }
        } else {
            c2109k = new C2109k(this, dVar);
        }
        Object obj = c2109k.f23117a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = c2109k.f23118b;
        if (i11 == 0) {
            b.T(obj);
            try {
                C1921s c1921s = this.f23122a;
                c2109k.f23120d = this;
                c2109k.f23121e = interfaceC2106h;
                c2109k.f23118b = 1;
                if (c1921s.collect(interfaceC2106h, c2109k) != aVar) {
                    c2110l = this;
                    sVar = new s(interfaceC2106h, c2109k.getContext());
                    c1920q2 = c2110l.f23123b;
                    c2109k.f23120d = sVar;
                    c2109k.f23121e = null;
                    c2109k.f23118b = 3;
                    if (c1920q2.invoke(sVar, null, c2109k) != aVar) {
                        sVar2 = sVar;
                        sVar2.releaseIntercepted();
                        return D.f8402a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c2110l = this;
                w10 = new W(th);
                c1920q = c2110l.f23123b;
                c2109k.f23120d = th;
                c2109k.f23121e = null;
                c2109k.f23118b = 2;
                if (J.c(w10, c1920q, th, c2109k) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th3 = (Throwable) c2109k.f23120d;
                b.T(obj);
                throw th3;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = (s) c2109k.f23120d;
            try {
                b.T(obj);
                sVar2.releaseIntercepted();
                return D.f8402a;
            } catch (Throwable th4) {
                th = th4;
                sVar2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC2106h = c2109k.f23121e;
        c2110l = (C2110l) c2109k.f23120d;
        try {
            b.T(obj);
            sVar = new s(interfaceC2106h, c2109k.getContext());
            try {
                c1920q2 = c2110l.f23123b;
                c2109k.f23120d = sVar;
                c2109k.f23121e = null;
                c2109k.f23118b = 3;
                if (c1920q2.invoke(sVar, null, c2109k) != aVar) {
                    sVar2 = sVar;
                    sVar2.releaseIntercepted();
                    return D.f8402a;
                }
                return aVar;
            } catch (Throwable th5) {
                th = th5;
                sVar2 = sVar;
                sVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            w10 = new W(th);
            c1920q = c2110l.f23123b;
            c2109k.f23120d = th;
            c2109k.f23121e = null;
            c2109k.f23118b = 2;
            if (J.c(w10, c1920q, th, c2109k) == aVar) {
                throw th;
            }
        }
    }
}
