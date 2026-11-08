package F0;

import G0.K0;

/* JADX INFO: renamed from: F0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0382a0 implements p067g0.p {
    public static final int $stable = 0;
    private K0 _inspectorValues;

    public final K0 b() {
        K0 k10 = this._inspectorValues;
        if (k10 != null) {
            return k10;
        }
        K0 k11 = new K0();
        k11.f5040a = kotlin.jvm.internal.z.a(getClass()).c();
        inspectableProperties(k11);
        this._inspectorValues = k11;
        return k11;
    }

    public abstract p067g0.q create();

    public final p085h9.h getInspectableElements() {
        return b().f5042c;
    }

    public final String getNameFallback() {
        return b().f5040a;
    }

    public final Object getValueOverride() {
        return b().f5041b;
    }

    public abstract void inspectableProperties(K0 k10);

    public abstract void update(p067g0.q qVar);
}
