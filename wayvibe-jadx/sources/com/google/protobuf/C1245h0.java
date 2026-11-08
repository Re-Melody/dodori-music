package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1245h0 implements InterfaceC1259o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1259o0[] f18740a;

    @Override // com.google.protobuf.InterfaceC1259o0
    public final B0 a(Class cls) {
        for (InterfaceC1259o0 interfaceC1259o0 : this.f18740a) {
            if (interfaceC1259o0.b(cls)) {
                return interfaceC1259o0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC1259o0
    public final boolean b(Class cls) {
        for (InterfaceC1259o0 interfaceC1259o0 : this.f18740a) {
            if (interfaceC1259o0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
