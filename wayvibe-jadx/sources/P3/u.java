package P3;

import java.util.ArrayList;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class u extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2230e f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9613b;

    public u(v vVar, C2230e c2230e) {
        this.f9613b = vVar;
        this.f9612a = c2230e;
    }

    @Override // P3.r
    public final void a(s sVar) {
        ((ArrayList) this.f9612a.get(this.f9613b.f9615b)).remove(sVar);
        sVar.w(this);
    }
}
