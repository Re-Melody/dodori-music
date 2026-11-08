package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098s extends N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f15416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1099t f15417b;

    public C1098s(DialogInterfaceOnCancelListenerC1099t dialogInterfaceOnCancelListenerC1099t, N n6) {
        this.f15417b = dialogInterfaceOnCancelListenerC1099t;
        this.f15416a = n6;
    }

    @Override // androidx.fragment.app.N
    public final View b(int i10) {
        N n6 = this.f15416a;
        if (n6.c()) {
            return n6.b(i10);
        }
        Dialog dialog = this.f15417b.f15436j;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        return this.f15416a.c() || this.f15417b.f15439n;
    }
}
