package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062u implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1062u f15155b = new C1062u(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15156a;

    public /* synthetic */ C1062u(int i10) {
        this.f15156a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final b0 a(Class cls) {
        switch (this.f15156a) {
            case 0:
                if (!AbstractC1066y.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (b0) AbstractC1066y.d(cls.asSubclass(AbstractC1066y.class)).c(EnumC1065x.BUILD_MESSAGE_INFO);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean b(Class cls) {
        switch (this.f15156a) {
            case 0:
                return AbstractC1066y.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
