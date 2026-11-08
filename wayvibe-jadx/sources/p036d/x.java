package p036d;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19003b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f19004c;

    public x(boolean z10) {
        this.f19002a = z10;
    }

    public abstract void b();

    public void c(C1894b backEvent) {
        m.f(backEvent, "backEvent");
    }

    public void d(C1894b backEvent) {
        m.f(backEvent, "backEvent");
    }

    public void a() {
    }
}
