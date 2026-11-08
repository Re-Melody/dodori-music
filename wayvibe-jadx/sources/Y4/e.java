package Y4;

import X2.q;
import X4.j;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f13361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f13363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f13370j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13371l;

    public e(Context context) {
        DisplayManager displayManager;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f13361a = windowManager;
        q qVar = null;
        if (windowManager != null) {
            if (j.f13232a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                qVar = new q(this, displayManager, 1);
            }
            this.f13363c = qVar;
            this.f13362b = d.f13356e;
        } else {
            this.f13363c = null;
            this.f13362b = null;
        }
        this.f13364d = -9223372036854775807L;
        this.f13365e = -9223372036854775807L;
    }

    public final void a() {
        Display defaultDisplay = this.f13361a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f13364d = refreshRate;
            this.f13365e = (refreshRate * 80) / 100;
        }
    }
}
