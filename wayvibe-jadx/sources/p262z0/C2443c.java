package p262z0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: z0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2443c extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2443c f29734a = new C2443c();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(p.f29765c);
        return this;
    }
}
