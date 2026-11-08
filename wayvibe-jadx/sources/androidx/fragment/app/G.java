package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC1119n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements M3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15208b;

    public /* synthetic */ G(Object obj, int i10) {
        this.f15207a = i10;
        this.f15208b = obj;
    }

    @Override // M3.e
    public final Bundle a() {
        switch (this.f15207a) {
            case 0:
                K k = (K) this.f15208b;
                k.markFragmentsCreated();
                k.mFragmentLifecycleRegistry.c(EnumC1119n.ON_STOP);
                return new Bundle();
            default:
                return ((AbstractC1083h0) this.f15208b).U();
        }
    }
}
