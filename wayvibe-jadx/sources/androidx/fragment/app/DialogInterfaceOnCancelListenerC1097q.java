package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1097q implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1099t f15405a;

    public DialogInterfaceOnCancelListenerC1097q(DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t) {
        this.f15405a = dialogInterfaceOnCancelListenerC1099t;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t = this.f15405a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1099t.f15436j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1099t.onCancel(dialog);
        }
    }
}
