package p119k9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: k9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2038w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21785b = AtomicIntegerFieldUpdater.newUpdater(C2038w.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f21786a;

    public C2038w(boolean z10, Throwable th) {
        this.f21786a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f21786a + ']';
    }
}
