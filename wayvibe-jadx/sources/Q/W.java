package Q;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f9991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.b f9992b;

    public W(L0 l10, c0.b bVar) {
        this.f9991a = l10;
        this.f9992b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return kotlin.jvm.internal.m.b(this.f9991a, w10.f9991a) && this.f9992b.equals(w10.f9992b);
    }

    public final int hashCode() {
        L0 l10 = this.f9991a;
        return this.f9992b.hashCode() + ((l10 == null ? 0 : l10.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f9991a + ", transition=" + this.f9992b + ')';
    }
}
