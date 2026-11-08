package p083h7;

import java.util.Date;
import java.util.HashMap;
import p062f7.f;
import p062f7.g;
import p073g7.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f20324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f20325g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20323e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20326h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [h7.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h7.b] */
    static {
        final int i10 = 0;
        f20324f = new f() { // from class: h7.b
            @Override // p062f7.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f20325g = new f() { // from class: h7.b
            @Override // p062f7.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f20327a = map;
        HashMap map2 = new HashMap();
        this.f20328b = map2;
        this.f20329c = f20323e;
        this.f20330d = false;
        map2.put(String.class, f20324f);
        map.remove(String.class);
        map2.put(Boolean.class, f20325g);
        map.remove(Boolean.class);
        map2.put(Date.class, f20326h);
        map.remove(Date.class);
    }

    public final a a(Class cls, p062f7.d dVar) {
        this.f20327a.put(cls, dVar);
        this.f20328b.remove(cls);
        return this;
    }
}
