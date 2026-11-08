package K1;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC1119n;
import androidx.lifecycle.InterfaceC1123s;
import androidx.lifecycle.InterfaceC1125u;
import p036d.C1899g;

/* JADX INFO: renamed from: K1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0610l implements InterfaceC1123s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7317c;

    public /* synthetic */ C0610l(int i10, Object obj, Object obj2) {
        this.f7315a = i10;
        this.f7316b = obj;
        this.f7317c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC1123s
    public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        switch (this.f7315a) {
            case 0:
                EnumC1119n enumC1119n2 = EnumC1119n.ON_DESTROY;
                C0612n c0612n = (C0612n) this.f7316b;
                if (enumC1119n != enumC1119n2) {
                    c0612n.getClass();
                } else {
                    c0612n.b((InterfaceC0613o) this.f7317c);
                }
                break;
            default:
                p036d.G dispatcher = (p036d.G) this.f7316b;
                kotlin.jvm.internal.m.f(dispatcher, "$dispatcher");
                p036d.n nVar = (p036d.n) this.f7317c;
                if (enumC1119n == EnumC1119n.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = C1899g.f18982a.a(nVar);
                    kotlin.jvm.internal.m.f(invoker, "invoker");
                    dispatcher.f18962e = invoker;
                    dispatcher.d(dispatcher.f18964g);
                }
                break;
        }
    }
}
