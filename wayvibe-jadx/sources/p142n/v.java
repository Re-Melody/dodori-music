package p142n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import app.nagakiba.wayvibe.R;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f22695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f22698e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f22701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f22702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f22703j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22699f = 8388611;
    public final u k = new u(this);

    public v(int i10, Context context, View view, l lVar, boolean z10) {
        this.f22694a = context;
        this.f22695b = lVar;
        this.f22698e = view;
        this.f22696c = z10;
        this.f22697d = i10;
    }

    public final t a() {
        t c3;
        if (this.f22702i == null) {
            Context context = this.f22694a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c3 = new f(context, this.f22698e, this.f22697d, this.f22696c);
            } else {
                View view = this.f22698e;
                Context context2 = this.f22694a;
                boolean z10 = this.f22696c;
                c3 = new C(this.f22697d, context2, view, this.f22695b, z10);
            }
            c3.l(this.f22695b);
            c3.r(this.k);
            c3.n(this.f22698e);
            c3.j(this.f22701h);
            c3.o(this.f22700g);
            c3.p(this.f22699f);
            this.f22702i = c3;
        }
        return this.f22702i;
    }

    public final boolean b() {
        t tVar = this.f22702i;
        return tVar != null && tVar.b();
    }

    public void c() {
        this.f22702i = null;
        u uVar = this.f22703j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t tVarA = a();
        tVarA.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f22699f, this.f22698e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f22698e.getWidth();
            }
            tVarA.q(i10);
            tVarA.t(i11);
            int i12 = (int) ((this.f22694a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f22692a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        tVarA.f();
    }
}
