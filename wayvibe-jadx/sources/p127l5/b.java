package p127l5;

import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import com.revenuecat.purchases.common.localrules.StoreDimensionProvider;
import p062f7.c;
import p062f7.d;
import p062f7.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21978a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21979b = c.a("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21980c = c.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21981d = c.a("hardware");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21982e = c.a("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21983f = c.a("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f21984g = c.a("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f21985h = c.a("manufacturer");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f21986i = c.a("fingerprint");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f21987j = c.a(DeviceDimensionProvider.KEY_LOCALE);
    public static final c k = c.a(StoreDimensionProvider.KEY_COUNTRY);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f21988l = c.a("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f21989m = c.a("applicationBuild");

    @Override // p062f7.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        h hVar = (h) ((a) obj);
        eVar.b(f21979b, hVar.f22014a);
        eVar.b(f21980c, hVar.f22015b);
        eVar.b(f21981d, hVar.f22016c);
        eVar.b(f21982e, hVar.f22017d);
        eVar.b(f21983f, hVar.f22018e);
        eVar.b(f21984g, hVar.f22019f);
        eVar.b(f21985h, hVar.f22020g);
        eVar.b(f21986i, hVar.f22021h);
        eVar.b(f21987j, hVar.f22022i);
        eVar.b(k, hVar.f22023j);
        eVar.b(f21988l, hVar.k);
        eVar.b(f21989m, hVar.f22024l);
    }
}
