package G6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0516c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0524k f5490b;

    public D(String str, C0524k c0524k) {
        this.f5489a = str;
        this.f5490b = c0524k;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f5490b != C0524k.f5582x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return d10.f5489a.equals(this.f5489a) && d10.f5490b.equals(this.f5490b);
    }

    public final int hashCode() {
        return Objects.hash(D.class, this.f5489a, this.f5490b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f5489a + ", variant: " + this.f5490b + ")";
    }
}
