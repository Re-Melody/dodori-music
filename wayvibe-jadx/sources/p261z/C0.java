package p261z;

import D7.W;
import F0.AbstractC0388f;
import M8.D;
import Q5.b;
import U.C0914u0;
import Z8.e;
import androidx.compose.foundation.gestures.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.x;
import p028c1.o;
import p133m0.c;
import p241x.k0;
import p241x.r0;
import p253y0.d;
import p253y0.g;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2432v0 f29364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f29365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X f29366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC2391a0 f29367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f29369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29370g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2399e0 f29371h = a.f14674a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2440z0 f29372i = new C2440z0(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0914u0 f29373j = new C0914u0(this, 24);

    public C0(InterfaceC2432v0 interfaceC2432v0, r0 r0Var, X x10, EnumC2391a0 enumC2391a0, boolean z10, d dVar) {
        this.f29364a = interfaceC2432v0;
        this.f29365b = r0Var;
        this.f29366c = x10;
        this.f29367d = enumC2391a0;
        this.f29368e = z10;
        this.f29369f = dVar;
    }

    public static final long a(C0 c3, InterfaceC2399e0 interfaceC2399e0, long j10, int i10) {
        g gVar = c3.f29369f.f28735a;
        g gVar2 = null;
        g gVar3 = (gVar == null || !gVar.isAttached()) ? null : (g) AbstractC0388f.k(gVar);
        long jW = gVar3 != null ? gVar3.w(i10, j10) : 0L;
        long jG = c.g(j10, jW);
        long jD = c3.d(c3.g(interfaceC2399e0.a(c3.f(c3.d(c.a(jG, 0.0f, c3.f29367d == EnumC2391a0.Horizontal ? 1 : 2))))));
        long jG2 = c.g(jG, jD);
        g gVar4 = c3.f29369f.f28735a;
        if (gVar4 != null && gVar4.isAttached()) {
            gVar2 = (g) AbstractC0388f.k(gVar4);
        }
        g gVar5 = gVar2;
        return c.h(c.h(jW, jD), gVar5 != null ? gVar5.W(i10, jD, jG2) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, S8.c cVar) {
        C2434w0 c2434w0;
        x xVar;
        if (cVar instanceof C2434w0) {
            c2434w0 = (C2434w0) cVar;
            int i10 = c2434w0.f29692d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2434w0.f29692d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2434w0 = new C2434w0(this, cVar);
            }
        } else {
            c2434w0 = new C2434w0(this, cVar);
        }
        Object obj = c2434w0.f29690b;
        Object obj2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = c2434w0.f29692d;
        if (i11 == 0) {
            b.T(obj);
            x xVar2 = new x();
            xVar2.f21872a = j10;
            k0 k0Var = k0.Default;
            e c2438y0 = new C2438y0(this, xVar2, j10, null);
            c2434w0.f29689a = xVar2;
            c2434w0.f29692d = 1;
            if (e(k0Var, c2438y0, c2434w0) == obj2) {
                return obj2;
            }
            xVar = xVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = c2434w0.f29689a;
            b.T(obj);
        }
        return new o(xVar.f21872a);
    }

    public final float c(float f10) {
        return this.f29368e ? f10 * (-1) : f10;
    }

    public final long d(long j10) {
        return this.f29368e ? c.i(-1.0f, j10) : j10;
    }

    public final Object e(k0 k0Var, e eVar, S8.c cVar) {
        Object objB = this.f29364a.b(k0Var, new B0(this, eVar, null), cVar);
        return objB == R8.a.COROUTINE_SUSPENDED ? objB : D.f8402a;
    }

    public final float f(long j10) {
        return this.f29367d == EnumC2391a0.Horizontal ? c.d(j10) : c.e(j10);
    }

    public final long g(float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        return this.f29367d == EnumC2391a0.Horizontal ? W.c(f10, 0.0f) : W.c(0.0f, f10);
    }
}
