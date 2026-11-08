package p214u4;

import android.graphics.drawable.Drawable;
import p080h4.q;
import p185r4.e;
import p185r4.j;
import p185r4.o;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f27221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f27222b;

    public d(q qVar, j jVar) {
        this.f27221a = qVar;
        this.f27222b = jVar;
    }

    @Override // p214u4.f
    public final void a() {
        j jVar = this.f27222b;
        boolean z10 = jVar instanceof o;
        q qVar = this.f27221a;
        if (z10) {
            Drawable drawable = ((o) jVar).f25962a;
            qVar.getClass();
        } else if (jVar instanceof e) {
            jVar.getClass();
            qVar.getClass();
        }
    }
}
