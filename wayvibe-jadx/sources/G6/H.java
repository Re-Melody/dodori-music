package G6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0516c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0524k f5499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0524k f5501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0516c f5502d;

    public H(C0524k c0524k, String str, C0524k c0524k2, AbstractC0516c abstractC0516c) {
        this.f5499a = c0524k;
        this.f5500b = str;
        this.f5501c = c0524k2;
        this.f5502d = abstractC0516c;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f5499a != C0524k.f5557F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return h10.f5501c.equals(this.f5501c) && h10.f5502d.equals(this.f5502d) && h10.f5500b.equals(this.f5500b) && h10.f5499a.equals(this.f5499a);
    }

    public final int hashCode() {
        return Objects.hash(H.class, this.f5500b, this.f5501c, this.f5502d, this.f5499a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f5500b + ", dekParsingStrategy: " + this.f5501c + ", dekParametersForNewKeys: " + this.f5502d + ", variant: " + this.f5499a + ")";
    }
}
