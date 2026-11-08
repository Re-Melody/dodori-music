package p246x4;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f28442b;

    public f(Handler handler, g gVar) {
        if (gVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f28441a = handler;
        this.f28442b = gVar;
    }

    public final void a() {
        if (this.f28442b != null) {
            this.f28441a.post(new Y4.f(7));
        }
    }

    public final void b() {
        if (this.f28442b != null) {
            this.f28441a.post(new Y4.f(9));
        }
    }
}
