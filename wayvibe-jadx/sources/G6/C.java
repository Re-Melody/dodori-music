package G6;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0515b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f5486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V6.a f5487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f5488c;

    public C(D d10, V6.a aVar, Integer num) {
        this.f5486a = d10;
        this.f5487b = aVar;
        this.f5488c = num;
    }

    public static C o0(D d10, Integer num) throws GeneralSecurityException {
        V6.a aVarA;
        C0524k c0524k = d10.f5490b;
        if (c0524k == C0524k.f5581w) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarA = V6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c0524k != C0524k.f5582x) {
                throw new GeneralSecurityException("Unknown Variant: " + c0524k);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarA = V6.a.a(new byte[0]);
        }
        return new C(d10, aVarA, num);
    }

    @Override // R3.a
    public final Integer M() {
        return this.f5488c;
    }

    @Override // R3.a
    public final F6.j N() {
        return this.f5486a;
    }

    @Override // G6.AbstractC0515b
    public final V6.a n0() {
        return this.f5487b;
    }
}
