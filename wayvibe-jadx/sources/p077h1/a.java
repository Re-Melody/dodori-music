package p077h1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20156d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f20158b;

    static {
        if (h.f20170d) {
            f20156d = null;
            f20155c = null;
        } else {
            f20156d = new a(false, null);
            f20155c = new a(true, null);
        }
    }

    public a(boolean z10, CancellationException cancellationException) {
        this.f20157a = z10;
        this.f20158b = cancellationException;
    }
}
