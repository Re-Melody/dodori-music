package O6;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import p160o7.InterfaceC2172a;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC2172a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9255b;

    public H(int i10) {
        switch (i10) {
            case 1:
                this.f9254a = new HashMap();
                this.f9255b = new HashMap();
                break;
            default:
                this.f9254a = new HashMap();
                this.f9255b = new HashMap();
                break;
        }
    }

    @Override // p160o7.InterfaceC2172a
    public p129l7.e a(String str) {
        return (p129l7.e) this.f9254a.get(str);
    }

    @Override // p160o7.InterfaceC2172a
    public void b(p129l7.i iVar) {
        this.f9255b.put(iVar.f22106a, iVar);
    }

    public void c(F f10) throws GeneralSecurityException {
        if (f10 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        I i10 = new I(f10.f9251a, f10.f9252b);
        HashMap map = this.f9254a;
        if (!map.containsKey(i10)) {
            map.put(i10, f10);
            return;
        }
        F f11 = (F) map.get(i10);
        if (f11.equals(f10) && f10.equals(f11)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + i10);
    }

    public void d(K k) throws GeneralSecurityException {
        Class clsB = k.b();
        HashMap map = this.f9255b;
        if (!map.containsKey(clsB)) {
            map.put(clsB, k);
            return;
        }
        K k10 = (K) map.get(clsB);
        if (k10.equals(k) && k.equals(k10)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
    }

    @Override // p160o7.InterfaceC2172a
    public p129l7.i f(String str) {
        return (p129l7.i) this.f9255b.get(str);
    }

    @Override // p160o7.InterfaceC2172a
    public void g(p129l7.e eVar) {
        this.f9254a.put(eVar.f22089a, eVar);
    }

    public H(J j10) {
        this.f9254a = new HashMap(j10.f9258a);
        this.f9255b = new HashMap(j10.f9259b);
    }
}
