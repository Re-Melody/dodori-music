package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class r implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1099t f15411a;

    public r(DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t) {
        this.f15411a = dialogInterfaceOnCancelListenerC1099t;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t = this.f15411a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1099t.f15436j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1099t.onDismiss(dialog);
        }
    }
}
