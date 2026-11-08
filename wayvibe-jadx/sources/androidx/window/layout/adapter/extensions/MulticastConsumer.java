package androidx.window.layout.adapter.extensions;

import J1.a;
import Z3.l;
import Z3.o;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import p020b4.e;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements a, Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15697a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f15699c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f15698b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f15700d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f15697a = context;
    }

    public final void a(a aVar) {
        ReentrantLock reentrantLock = this.f15698b;
        reentrantLock.lock();
        try {
            l lVar = this.f15699c;
            if (lVar != null) {
                aVar.accept(lVar);
            }
            this.f15700d.add(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // J1.a
    public void accept(WindowLayoutInfo value) {
        l lVarB;
        m.f(value, "value");
        ReentrantLock reentrantLock = this.f15698b;
        reentrantLock.lock();
        try {
            Context context = this.f15697a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                lVarB = e.b(o.f13644b.b(context), value);
            } else {
                if (i10 < 29 || !(context instanceof Activity)) {
                    throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
                }
                lVarB = e.b(o.f13644b.a((Activity) context), value);
            }
            this.f15699c = lVarB;
            Iterator it = this.f15700d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(lVarB);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
