package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200v implements S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1200v f18485b = new C1200v(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18486a;

    public /* synthetic */ C1200v(int i10) {
        this.f18486a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final d0 a(Class cls) {
        switch (this.f18486a) {
            case 0:
                if (!AbstractC1204z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (d0) AbstractC1204z.k(cls.asSubclass(AbstractC1204z.class)).j(EnumC1203y.BUILD_MESSAGE_INFO);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final boolean b(Class cls) {
        switch (this.f18486a) {
            case 0:
                return AbstractC1204z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
