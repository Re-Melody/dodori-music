package Z3;

import D7.W;
import M8.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f13626a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f13627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13628c;

    static {
        z.a(h.class).c();
        f13627b = W.S(f.f13625a);
        f13628c = a.f13605a;
    }

    public static b a(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        p008a4.a aVar = (p008a4.a) f13627b.getValue();
        if (aVar == null) {
            p030c4.k kVar = p030c4.k.f15902c;
            if (p030c4.k.f15902c == null) {
                ReentrantLock reentrantLock = p030c4.k.f15903d;
                reentrantLock.lock();
                try {
                    if (p030c4.k.f15902c == null) {
                        p030c4.i iVar = null;
                        try {
                            V3.k kVarB = p030c4.h.b();
                            if (kVarB != null) {
                                V3.k other = V3.k.f12565f;
                                kotlin.jvm.internal.m.f(other, "other");
                                Object value = kVarB.f12570e.getValue();
                                kotlin.jvm.internal.m.e(value, "<get-bigInteger>(...)");
                                Object value2 = other.f12570e.getValue();
                                kotlin.jvm.internal.m.e(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    p030c4.i iVar2 = new p030c4.i(context);
                                    if (iVar2.e()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        p030c4.k.f15902c = new p030c4.k(iVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = p030c4.k.f15902c;
            kotlin.jvm.internal.m.c(aVar);
        }
        o oVar = o.f13644b;
        b bVar = new b(aVar);
        f13628c.getClass();
        return bVar;
    }
}
