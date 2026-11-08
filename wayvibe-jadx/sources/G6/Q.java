package G6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0516c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0524k f5534a;

    public Q(C0524k c0524k) {
        this.f5534a = c0524k;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f5534a != C0524k.f5562K;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && ((Q) obj).f5534a == this.f5534a;
    }

    public final int hashCode() {
        return Objects.hash(Q.class, this.f5534a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f5534a + ")";
    }
}
