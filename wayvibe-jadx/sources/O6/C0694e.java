package O6;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: O6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f9297c = Logger.getLogger(C0694e.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0694e f9298d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f9299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f9300b;

    static {
        C0694e c0694e = new C0694e();
        c0694e.f9299a = new ConcurrentHashMap();
        c0694e.f9300b = new ConcurrentHashMap();
        f9298d = c0694e;
    }

    public final C0699j a(Class cls, String str) throws GeneralSecurityException {
        C0699j c0699jB = b(str);
        if (c0699jB.f9306b.equals(cls)) {
            return c0699jB;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + C0699j.class + ", which only supports: " + c0699jB.f9306b);
    }

    public final synchronized C0699j b(String str) {
        if (!this.f9299a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (C0699j) this.f9299a.get(str);
    }

    public final synchronized void c(C0699j c0699j) {
        try {
            String str = c0699j.f9305a;
            if (this.f9300b.containsKey(str) && !((Boolean) this.f9300b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((C0699j) this.f9299a.get(str)) != null && !C0699j.class.equals(C0699j.class)) {
                f9297c.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + C0699j.class.getName() + ", cannot be re-registered with " + C0699j.class.getName());
            }
            this.f9299a.putIfAbsent(str, c0699j);
            this.f9300b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(C0699j c0699j) {
        e(c0699j, K6.c.ALGORITHM_NOT_FIPS);
    }

    public final synchronized void e(C0699j c0699j, K6.c cVar) {
        if (!cVar.f()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        c(c0699j);
    }
}
