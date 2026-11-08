package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f15058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f15059b;

    static {
        U u10;
        Z z10 = Z.f15060c;
        try {
            u10 = (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u10 = null;
        }
        f15058a = u10;
        f15059b = new U();
    }
}
