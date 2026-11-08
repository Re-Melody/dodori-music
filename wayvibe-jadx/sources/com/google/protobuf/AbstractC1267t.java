package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1267t extends J0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f18812d = Logger.getLogger(AbstractC1267t.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f18813e = Y0.f18722e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1247i0 f18814c;

    public static int A(int i10) {
        if (i10 >= 0) {
            return D(i10);
        }
        return 10;
    }

    public static int B(String str) {
        int length;
        try {
            length = b1.c(str);
        } catch (a1 unused) {
            length = str.getBytes(V.f18703a).length;
        }
        return D(length) + length;
    }

    public static int C(int i10) {
        return D(i10 << 3);
    }

    public static int D(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int E(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int y(int i10, AbstractC1252l abstractC1252l) {
        return z(abstractC1252l) + C(i10);
    }

    public static int z(AbstractC1252l abstractC1252l) {
        int size = abstractC1252l.size();
        return D(size) + size;
    }

    public final void F(String str, a1 a1Var) {
        f18812d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) a1Var);
        byte[] bytes = str.getBytes(V.f18703a);
        try {
            X(bytes.length);
            x(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new I2.a(e2);
        }
    }

    public abstract void G(byte b10);

    public abstract void H(int i10, boolean z10);

    public abstract void I(byte[] bArr, int i10);

    public abstract void J(int i10, AbstractC1252l abstractC1252l);

    public abstract void K(AbstractC1252l abstractC1252l);

    public abstract void L(int i10, int i11);

    public abstract void M(int i10);

    public abstract void N(int i10, long j10);

    public abstract void O(long j10);

    public abstract void P(int i10, int i11);

    public abstract void Q(int i10);

    public abstract void R(int i10, AbstractC1230a abstractC1230a, E0 e1);

    public abstract void S(AbstractC1230a abstractC1230a);

    public abstract void T(int i10, String str);

    public abstract void U(String str);

    public abstract void V(int i10, int i11);

    public abstract void W(int i10, int i11);

    public abstract void X(int i10);

    public abstract void Y(int i10, long j10);

    public abstract void Z(long j10);
}
