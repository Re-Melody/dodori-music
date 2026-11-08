package G0;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: G0.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0485l0 implements InterfaceC0486l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f5245a;

    public C0485l0(ViewConfiguration viewConfiguration) {
        this.f5245a = viewConfiguration;
    }

    @Override // G0.InterfaceC0486l1
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // G0.InterfaceC0486l1
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // G0.InterfaceC0486l1
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0490n0.f5252a.b(this.f5245a);
        }
        return 2.0f;
    }

    @Override // G0.InterfaceC0486l1
    public final float e() {
        return this.f5245a.getScaledMaximumFlingVelocity();
    }

    @Override // G0.InterfaceC0486l1
    public final float f() {
        return this.f5245a.getScaledTouchSlop();
    }

    @Override // G0.InterfaceC0486l1
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0490n0.f5252a.a(this.f5245a);
        }
        return 16.0f;
    }
}
