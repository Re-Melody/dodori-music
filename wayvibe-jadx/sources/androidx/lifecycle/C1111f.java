package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1111f implements InterfaceC1123s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15554a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15556c;

    public C1111f(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1123s interfaceC1123s) {
        kotlin.jvm.internal.m.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f15555b = defaultLifecycleObserver;
        this.f15556c = interfaceC1123s;
    }

    @Override // androidx.lifecycle.InterfaceC1123s
    public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        switch (this.f15554a) {
            case 0:
                int i10 = AbstractC1110e.f15552a[enumC1119n.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f15555b;
                switch (i10) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC1125u);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC1125u);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC1125u);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC1125u);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC1125u);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC1125u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC1123s interfaceC1123s = (InterfaceC1123s) this.f15556c;
                if (interfaceC1123s != null) {
                    interfaceC1123s.c(interfaceC1125u, enumC1119n);
                    return;
                }
                return;
            case 1:
                if (enumC1119n == EnumC1119n.ON_START) {
                    ((AbstractC1121p) this.f15555b).removeObserver(this);
                    ((M3.f) this.f15556c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C1107b) this.f15556c).f15545a;
                List list = (List) map.get(enumC1119n);
                InterfaceC1124t interfaceC1124t = (InterfaceC1124t) this.f15555b;
                C1107b.a(list, interfaceC1125u, enumC1119n, interfaceC1124t);
                C1107b.a((List) map.get(EnumC1119n.ON_ANY), interfaceC1125u, enumC1119n, interfaceC1124t);
                return;
        }
    }

    public C1111f(InterfaceC1124t interfaceC1124t) {
        this.f15555b = interfaceC1124t;
        C1109d c1109d = C1109d.f15549c;
        Class<?> cls = interfaceC1124t.getClass();
        C1107b c1107b = (C1107b) c1109d.f15550a.get(cls);
        this.f15556c = c1107b == null ? c1109d.a(cls, null) : c1107b;
    }

    public C1111f(M3.f fVar, AbstractC1121p abstractC1121p) {
        this.f15555b = abstractC1121p;
        this.f15556c = fVar;
    }
}
