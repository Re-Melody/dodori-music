package p127l5;

import p062f7.c;
import p062f7.d;
import p062f7.e;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f22003a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22004b = c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22005c = c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22006d = c.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22007e = c.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22008f = c.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f22009g = c.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22010h = c.a("qosTier");

    @Override // p062f7.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        l lVar = (l) ((s) obj);
        eVar.a(f22004b, lVar.f22035a);
        eVar.a(f22005c, lVar.f22036b);
        eVar.b(f22006d, lVar.f22037c);
        eVar.b(f22007e, lVar.f22038d);
        eVar.b(f22008f, lVar.f22039e);
        eVar.b(f22009g, lVar.f22040f);
        eVar.b(f22010h, lVar.f22041g);
    }
}
