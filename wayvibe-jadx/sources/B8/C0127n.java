package B8;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: B8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0127n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0127n f840b = new C0127n(new C0125l(2), C0125l.f832b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f841a = new ConcurrentHashMap();

    public C0127n(InterfaceC0126m... interfaceC0126mArr) {
        for (InterfaceC0126m interfaceC0126m : interfaceC0126mArr) {
            this.f841a.put(interfaceC0126m.d(), interfaceC0126m);
        }
    }
}
