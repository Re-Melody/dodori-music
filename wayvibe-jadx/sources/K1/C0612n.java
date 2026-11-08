package K1;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: K1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0612n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7321b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7322c = new HashMap();

    public C0612n(Runnable runnable) {
        this.f7320a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f7321b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.X) ((InterfaceC0613o) it.next())).f15240a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0613o interfaceC0613o) {
        this.f7321b.remove(interfaceC0613o);
        C0611m c0611m = (C0611m) this.f7322c.remove(interfaceC0613o);
        if (c0611m != null) {
            c0611m.f7318a.removeObserver(c0611m.f7319b);
            c0611m.f7319b = null;
        }
        this.f7320a.run();
    }
}
