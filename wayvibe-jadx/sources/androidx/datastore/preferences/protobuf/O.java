package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f15038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f15039b;

    static {
        N n6;
        Z z10 = Z.f15060c;
        try {
            n6 = (N) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n6 = null;
        }
        f15038a = n6;
        f15039b = new N();
    }
}
