package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f15440a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A0 f15441b;

    static {
        A0 a10;
        try {
            a10 = (A0) P3.o.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            a10 = null;
        }
        f15441b = a10;
    }

    public static final void a(int i10, ArrayList views) {
        kotlin.jvm.internal.m.f(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
