package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1180a implements T {
    protected int memoizedHashCode;

    public abstract int b(e0 e0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC1201w d();

    public final byte[] e() {
        try {
            int iB = ((AbstractC1204z) this).b(null);
            byte[] bArr = new byte[iB];
            C1191l c1191l = new C1191l(bArr, iB);
            g(c1191l);
            if (iB - c1191l.f18466f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(c("byte array"), e2);
        }
    }

    public final C1187h f() {
        try {
            int iB = ((AbstractC1204z) this).b(null);
            C1187h c1187h = AbstractC1188i.f18442b;
            byte[] bArr = new byte[iB];
            C1191l c1191l = new C1191l(bArr, iB);
            g(c1191l);
            if (c1191l.f18465e - c1191l.f18466f == 0) {
                return new C1187h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(c("ByteString"), e2);
        }
    }

    public abstract void g(C1191l c1191l);
}
