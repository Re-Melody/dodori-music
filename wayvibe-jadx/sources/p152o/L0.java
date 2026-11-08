package p152o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p012a8.b;
import p142n.l;
import p142n.n;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Method f23232C;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f23233B;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f23232C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p152o.H0
    public final void n(l lVar, n nVar) {
        b bVar = this.f23233B;
        if (bVar != null) {
            bVar.n(lVar, nVar);
        }
    }

    @Override // p152o.G0
    public final C2161u0 p(Context context, boolean z10) {
        K0 k10 = new K0(context, z10);
        k10.setHoverListener(this);
        return k10;
    }

    @Override // p152o.H0
    public final void t(l lVar, n nVar) {
        b bVar = this.f23233B;
        if (bVar != null) {
            bVar.t(lVar, nVar);
        }
    }
}
