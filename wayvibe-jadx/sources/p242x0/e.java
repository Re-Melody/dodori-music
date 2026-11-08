package p242x0;

import Z8.c;
import android.view.KeyEvent;
import kotlin.jvm.internal.n;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f28331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f28332b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // p242x0.d
    public final boolean d(KeyEvent keyEvent) {
        ?? r10 = this.f28332b;
        if (r10 != 0) {
            return ((Boolean) r10.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p242x0.d
    public final boolean q(KeyEvent keyEvent) {
        c cVar = this.f28331a;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
