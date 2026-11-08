package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1057o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1056n f15136a = new C1056n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1056n f15137b;

    static {
        C1056n c1056n;
        Z z10 = Z.f15060c;
        try {
            c1056n = (C1056n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1056n = null;
        }
        f15137b = c1056n;
    }
}
