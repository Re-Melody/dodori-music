package M3;

import androidx.lifecycle.EnumC1119n;
import androidx.lifecycle.InterfaceC1123s;
import androidx.lifecycle.InterfaceC1125u;
import kotlin.jvm.internal.m;
import p151n9.U;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1123s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8262b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f8261a = i10;
        this.f8262b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1123s
    public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        switch (this.f8261a) {
            case 0:
                f this$0 = (f) this.f8262b;
                m.f(this$0, "this$0");
                if (enumC1119n == EnumC1119n.ON_START) {
                    this$0.f8268f = true;
                } else if (enumC1119n == EnumC1119n.ON_STOP) {
                    this$0.f8268f = false;
                }
                break;
            default:
                ((U) this.f8262b).h(enumC1119n.f());
                break;
        }
    }
}
