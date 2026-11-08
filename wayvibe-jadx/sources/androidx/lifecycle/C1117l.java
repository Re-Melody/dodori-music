package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1117l {
    public static EnumC1119n a(EnumC1120o state) {
        kotlin.jvm.internal.m.f(state, "state");
        int i10 = AbstractC1116k.f15562a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1119n.ON_DESTROY;
        }
        if (i10 == 2) {
            return EnumC1119n.ON_STOP;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC1119n.ON_PAUSE;
    }

    public static EnumC1119n b(EnumC1120o state) {
        kotlin.jvm.internal.m.f(state, "state");
        int i10 = AbstractC1116k.f15562a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1119n.ON_START;
        }
        if (i10 == 2) {
            return EnumC1119n.ON_RESUME;
        }
        if (i10 != 5) {
            return null;
        }
        return EnumC1119n.ON_CREATE;
    }

    public static EnumC1119n c(EnumC1120o state) {
        kotlin.jvm.internal.m.f(state, "state");
        int i10 = AbstractC1116k.f15562a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1119n.ON_CREATE;
        }
        if (i10 == 2) {
            return EnumC1119n.ON_START;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC1119n.ON_RESUME;
    }
}
