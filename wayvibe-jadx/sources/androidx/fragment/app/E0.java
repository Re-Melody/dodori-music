package androidx.fragment.app;

import android.view.ViewGroup;
import p036d.C1894b;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15195b;

    public boolean a() {
        return this instanceof C1082h;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(C1894b backEvent, ViewGroup container) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        kotlin.jvm.internal.m.f(container, "container");
    }

    public void e(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
    }
}
