package p036d;

import N8.k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1895c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f18957b;

    public F(G g3, x onBackPressedCallback) {
        m.f(onBackPressedCallback, "onBackPressedCallback");
        this.f18957b = g3;
        this.f18956a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Z8.a, kotlin.jvm.internal.j] */
    @Override // p036d.InterfaceC1895c
    public final void cancel() {
        G g3 = this.f18957b;
        k kVar = g3.f18959b;
        x xVar = this.f18956a;
        kVar.remove(xVar);
        if (m.b(g3.f18960c, xVar)) {
            xVar.a();
            g3.f18960c = null;
        }
        xVar.f19003b.remove(this);
        ?? r10 = xVar.f19004c;
        if (r10 != 0) {
            r10.invoke();
        }
        xVar.f19004c = null;
    }
}
