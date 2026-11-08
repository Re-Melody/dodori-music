package T0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.apple.android.music.playback.model.MediaPlayerException;
import p119k9.C2028n;

/* JADX INFO: renamed from: T0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0802e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11496a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(InterfaceC0816t interfaceC0816t, S8.c cVar) {
        C0801d c0801d;
        C0802e c0802e;
        if (cVar instanceof C0801d) {
            c0801d = (C0801d) cVar;
            int i10 = c0801d.f11495e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c0801d.f11495e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c0801d = new C0801d(this, cVar);
            }
        } else {
            c0801d = new C0801d(this, cVar);
        }
        Object objR = c0801d.f11493c;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = c0801d.f11495e;
        if (i11 == 0) {
            Q5.b.T(objR);
            boolean z10 = interfaceC0816t instanceof AbstractC0800c;
            Context context = this.f11496a;
            if (z10) {
                AbstractC0800c abstractC0800c = (AbstractC0800c) interfaceC0816t;
                InterfaceC0799b typefaceLoader = abstractC0800c.getTypefaceLoader();
                c0801d.f11495e = 1;
                Object objAwaitLoad = typefaceLoader.awaitLoad(context, abstractC0800c, c0801d);
                if (objAwaitLoad != aVar) {
                    return objAwaitLoad;
                }
            } else {
                if (!(interfaceC0816t instanceof P)) {
                    throw new IllegalArgumentException("Unknown font type: " + interfaceC0816t);
                }
                P p10 = (P) interfaceC0816t;
                c0801d.f11491a = this;
                c0801d.f11492b = (P) interfaceC0816t;
                c0801d.f11495e = 2;
                C2028n c2028n = new C2028n(1, D7.W.K(c0801d));
                c2028n.s();
                int i12 = p10.f11469a;
                C0803f c0803f = new C0803f(c2028n, p10);
                ThreadLocal threadLocal = A1.n.f140a;
                if (context.isRestricted()) {
                    c0803f.a(-4);
                } else {
                    A1.n.a(context, i12, new TypedValue(), 0, c0803f, false);
                }
                objR = c2028n.r();
                if (objR != aVar) {
                    c0802e = this;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            Q5.b.T(objR);
            return objR;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0816t = c0801d.f11492b;
        c0802e = c0801d.f11491a;
        Q5.b.T(objR);
        return p206t6.b.b0((Typeface) objR, ((P) interfaceC0816t).f11472d, c0802e.f11496a);
    }

    public Bitmap b(int i10, Integer num) {
        return p046da.b.z(p046da.b.B(this.f11496a, i10, num));
    }

    public Typeface c(InterfaceC0816t interfaceC0816t) {
        boolean z10 = interfaceC0816t instanceof AbstractC0800c;
        Context context = this.f11496a;
        if (z10) {
            AbstractC0800c abstractC0800c = (AbstractC0800c) interfaceC0816t;
            return abstractC0800c.getTypefaceLoader().loadBlocking(context, abstractC0800c);
        }
        Typeface typefaceA = null;
        if (!(interfaceC0816t instanceof P)) {
            return null;
        }
        P p10 = (P) interfaceC0816t;
        ThreadLocal threadLocal = A1.n.f140a;
        if (!context.isRestricted()) {
            typefaceA = A1.n.a(context, p10.f11469a, new TypedValue(), 0, null, false);
        }
        kotlin.jvm.internal.m.c(typefaceA);
        return p206t6.b.b0(typefaceA, ((P) interfaceC0816t).f11472d, context);
    }

    public C0802e(Context context) {
        this.f11496a = context.getApplicationContext();
    }
}
