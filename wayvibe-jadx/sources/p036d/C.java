package p036d;

import Z8.a;
import Z8.c;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class C implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f18950d;

    public C(c cVar, c cVar2, a aVar, a aVar2) {
        this.f18947a = cVar;
        this.f18948b = cVar2;
        this.f18949c = aVar;
        this.f18950d = aVar2;
    }

    public final void onBackCancelled() {
        this.f18950d.invoke();
    }

    public final void onBackInvoked() {
        this.f18949c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        m.f(backEvent, "backEvent");
        this.f18948b.invoke(new C1894b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        m.f(backEvent, "backEvent");
        this.f18947a.invoke(new C1894b(backEvent));
    }
}
