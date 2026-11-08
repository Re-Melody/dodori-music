package p224v4;

import M8.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1125u;
import p119k9.C2028n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2028n f27506a;

    public c(C2028n c2028n) {
        this.f27506a = c2028n;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1125u interfaceC1125u) {
        this.f27506a.resumeWith(D.f8402a);
    }
}
