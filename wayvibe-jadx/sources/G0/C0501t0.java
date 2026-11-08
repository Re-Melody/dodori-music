package G0;

import U.C0906q;
import U.InterfaceC0898m;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: G0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0501t0 extends kotlin.jvm.internal.n implements Z8.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0501t0 f5289b = new C0501t0(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0501t0 f5290c = new C0501t0(2, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0501t0 f5291d = new C0501t0(2, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0501t0(int i10, int i11) {
        super(i10);
        this.f5292a = i11;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5292a) {
            case 0:
                InterfaceC0898m interfaceC0898m = (InterfaceC0898m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0906q c0906q = (C0906q) interfaceC0898m;
                    if (c0906q.z()) {
                        c0906q.N();
                    }
                }
                break;
            case 1:
                ((InterfaceC0511y0) obj).I((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return M8.D.f8402a;
    }
}
