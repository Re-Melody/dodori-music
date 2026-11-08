package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1259o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f18668b = new F(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18669a;

    public /* synthetic */ F(int i10) {
        this.f18669a = i10;
    }

    @Override // com.google.protobuf.InterfaceC1259o0
    public final B0 a(Class cls) {
        switch (this.f18669a) {
            case 0:
                if (!J.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (B0) J.i(cls.asSubclass(J.class)).h(I.BUILD_MESSAGE_INFO);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC1259o0
    public final boolean b(Class cls) {
        switch (this.f18669a) {
            case 0:
                return J.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
