package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class M implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S[] f18384a;

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final d0 a(Class cls) {
        for (S s8 : this.f18384a) {
            if (s8.b(cls)) {
                return s8.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.S
    public final boolean b(Class cls) {
        for (S s8 : this.f18384a) {
            if (s8.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
