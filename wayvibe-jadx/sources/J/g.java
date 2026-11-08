package J;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6452a = a();

    public static final f a() {
        d dVar = new d(50);
        return new f(dVar, dVar, dVar, dVar);
    }

    public static final f b(float f10) {
        b bVar = new b(f10);
        return new f(bVar, bVar, bVar, bVar);
    }

    public static final f c(float f10, float f11, float f12, float f13) {
        return new f(new b(f10), new b(f11), new b(f12), new b(f13));
    }

    public static f d(float f10, float f11) {
        return c(f10, f11, 0, 0);
    }
}
