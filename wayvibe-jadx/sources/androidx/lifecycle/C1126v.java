package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC1120o f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1123s f15566b;

    public final void a(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        EnumC1120o enumC1120oF = enumC1119n.f();
        EnumC1120o state1 = this.f15565a;
        kotlin.jvm.internal.m.f(state1, "state1");
        if (enumC1120oF != null && enumC1120oF.compareTo(state1) < 0) {
            state1 = enumC1120oF;
        }
        this.f15565a = state1;
        this.f15566b.c(interfaceC1125u, enumC1119n);
        this.f15565a = enumC1120oF;
    }
}
