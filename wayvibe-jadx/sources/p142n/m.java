package p142n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p098j.DialogInterfaceC1996i;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterfaceC1996i f22653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f22654c;

    @Override // p142n.w
    public final void a(l lVar, boolean z10) {
        DialogInterfaceC1996i dialogInterfaceC1996i;
        if ((z10 || lVar == this.f22652a) && (dialogInterfaceC1996i = this.f22653b) != null) {
            dialogInterfaceC1996i.dismiss();
        }
    }

    @Override // p142n.w
    public final boolean b(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        h hVar = this.f22654c;
        if (hVar.f22622f == null) {
            hVar.f22622f = new g(hVar);
        }
        this.f22652a.q(hVar.f22622f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f22654c.a(this.f22652a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        D d10 = this.f22652a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f22653b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f22653b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d10.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d10.performShortcut(i10, keyEvent, 0);
    }
}
