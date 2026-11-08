package G6;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0515b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f5496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V6.a f5497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f5498c;

    public G(H h10, V6.a aVar, Integer num) {
        this.f5496a = h10;
        this.f5497b = aVar;
        this.f5498c = num;
    }

    public static G o0(H h10, Integer num) throws GeneralSecurityException {
        V6.a aVarB;
        C0524k c0524k = h10.f5499a;
        if (c0524k == C0524k.f5557F) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = O6.x.f9330a;
        } else {
            if (c0524k != C0524k.f5556E) {
                throw new GeneralSecurityException("Unknown Variant: " + c0524k);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = O6.x.b(num.intValue());
        }
        return new G(h10, aVarB, num);
    }

    @Override // R3.a
    public final Integer M() {
        return this.f5498c;
    }

    @Override // R3.a
    public final F6.j N() {
        return this.f5496a;
    }

    @Override // G6.AbstractC0515b
    public final V6.a n0() {
        return this.f5497b;
    }
}
