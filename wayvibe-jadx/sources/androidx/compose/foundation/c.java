package androidx.compose.foundation;

import B.m;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.o;
import p067g0.q;
import p067g0.r;
import p241x.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    static {
        new AbstractC0382a0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // F0.AbstractC0382a0
            public final q create() {
                return new K();
            }

            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // F0.AbstractC0382a0
            public final void inspectableProperties(K0 k10) {
                k10.f5040a = "focusableInNonTouchMode";
            }

            @Override // F0.AbstractC0382a0
            public final /* bridge */ /* synthetic */ void update(q qVar) {
            }
        };
    }

    public static final r a(r rVar, boolean z10, m mVar) {
        return rVar.then(z10 ? new FocusableElement(mVar) : o.f19964a);
    }
}
