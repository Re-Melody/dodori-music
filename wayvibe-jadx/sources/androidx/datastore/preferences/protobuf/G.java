package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f15026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f15027b;

    static {
        F f10;
        Z z10 = Z.f15060c;
        try {
            f10 = (F) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f10 = null;
        }
        f15026a = f10;
        f15027b = new F();
    }
}
