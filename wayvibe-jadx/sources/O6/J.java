package O6;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9259b;

    public J(H h10) {
        this.f9258a = new HashMap(h10.f9254a);
        this.f9259b = new HashMap(h10.f9255b);
    }

    public final Object a(R3.a aVar, Class cls) throws GeneralSecurityException {
        I i10 = new I(aVar.getClass(), cls);
        HashMap map = this.f9258a;
        if (map.containsKey(i10)) {
            return ((F) map.get(i10)).f9253c.e(aVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + i10 + " available, see https://developers.google.com/tink/faq/registration_errors");
    }
}
