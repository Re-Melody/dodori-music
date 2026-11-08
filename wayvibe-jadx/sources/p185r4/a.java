package p185r4;

import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1125u;
import p119k9.InterfaceC2019i0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1121p f25883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2019i0 f25884b;

    public a(AbstractC1121p abstractC1121p, InterfaceC2019i0 interfaceC2019i0) {
        this.f25883a = abstractC1121p;
        this.f25884b = interfaceC2019i0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1125u interfaceC1125u) {
        this.f25884b.cancel(null);
    }
}
