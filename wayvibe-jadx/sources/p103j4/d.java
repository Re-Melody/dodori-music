package p103j4;

import java.io.Closeable;
import p097i9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21473c;

    public d(g gVar, c cVar) {
        this.f21473c = gVar;
        this.f21471a = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21472b) {
            return;
        }
        this.f21472b = true;
        g gVar = this.f21473c;
        synchronized (gVar) {
            c cVar = this.f21471a;
            int i10 = cVar.f21469h - 1;
            cVar.f21469h = i10;
            if (i10 == 0 && cVar.f21467f) {
                j jVar = g.f21475q;
                gVar.x(cVar);
            }
        }
    }
}
