package E9;

import java.io.Closeable;

/* JADX INFO: renamed from: E9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0347h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Closeable f3385b;

    public C0347h(p103j4.d dVar) {
        this.f3385b = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3384a) {
            case 0:
                if (((C0348i) this.f3385b) == null) {
                    throw new IllegalStateException("not attached to a buffer");
                }
                this.f3385b = null;
                return;
            default:
                ((p103j4.d) this.f3385b).close();
                return;
        }
    }

    public C0347h() {
    }
}
