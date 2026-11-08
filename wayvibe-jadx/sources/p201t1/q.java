package p201t1;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f26682a = new HashSet(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26683b = 0;

    public final void a(q qVar) {
        this.f26682a.add(qVar);
    }

    public final void b() {
        this.f26683b = 1;
        Iterator it = this.f26682a.iterator();
        while (it.hasNext()) {
            ((q) it.next()).e();
        }
    }

    public final void c() {
        this.f26683b = 0;
        Iterator it = this.f26682a.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c();
        }
    }

    public final boolean d() {
        return this.f26683b == 1;
    }

    public void e() {
    }
}
