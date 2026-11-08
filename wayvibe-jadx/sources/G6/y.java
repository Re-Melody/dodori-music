package G6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC0516c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0524k f5635a;

    public y(C0524k c0524k) {
        this.f5635a = c0524k;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f5635a != C0524k.f5580v;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).f5635a == this.f5635a;
    }

    public final int hashCode() {
        return Objects.hash(y.class, this.f5635a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f5635a + ")";
    }
}
