package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f21874a;

    static {
        A a10 = null;
        try {
            a10 = (A) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a10 == null) {
            a10 = new A();
        }
        f21874a = a10;
    }

    public static e a(Class cls) {
        f21874a.getClass();
        return new e(cls);
    }
}
