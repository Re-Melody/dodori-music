package X2;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class q implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f13151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13152c;

    public /* synthetic */ q(Object obj, DisplayManager displayManager, int i10) {
        this.f13150a = i10;
        this.f13152c = obj;
        this.f13151b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
        int i11 = this.f13150a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        switch (this.f13150a) {
            case 0:
                if (i10 == 0) {
                    s.a((s) this.f13152c, this.f13151b.getDisplay(0));
                }
                break;
            case 1:
                if (i10 == 0) {
                    ((Y4.e) this.f13152c).a();
                }
                break;
            default:
                if (i10 == 0) {
                    float refreshRate = this.f13151b.getDisplay(0).getRefreshRate();
                    io.flutter.view.y yVar = (io.flutter.view.y) this.f13152c;
                    yVar.f21154a = (long) (1.0E9d / ((double) refreshRate));
                    yVar.f21155b.setRefreshRateFPS(refreshRate);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
        int i11 = this.f13150a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
