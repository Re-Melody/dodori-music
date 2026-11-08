package com.google.protobuf;

import com.google.crypto.tink.shaded.protobuf.C1183d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends AbstractC1230a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, J> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected P0 unknownFields;

    public J() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = P0.f18694f;
    }

    public static void f(J j10) throws X {
        if (!k(j10, true)) {
            throw new X(new O0().getMessage());
        }
    }

    public static J i(Class cls) {
        J j10 = defaultInstanceMap.get(cls);
        if (j10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j10 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (j10 != null) {
            return j10;
        }
        J j11 = (J) ((J) Y0.b(cls)).h(I.GET_DEFAULT_INSTANCE);
        if (j11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, j11);
        return j11;
    }

    public static Object j(Method method, AbstractC1230a abstractC1230a, Object... objArr) {
        try {
            return method.invoke(abstractC1230a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean k(J j10, boolean z10) {
        byte bByteValue = ((Byte) j10.h(I.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C1280z0 c1280z0 = C1280z0.f18824c;
        c1280z0.getClass();
        boolean zC = c1280z0.a(j10.getClass()).c(j10);
        if (z10) {
            j10.h(I.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zC;
    }

    public static U n(U u10) {
        int size = u10.size();
        return u10.e(size == 0 ? 10 : size * 2);
    }

    public static J p(J j10, byte[] bArr) throws X {
        int length = bArr.length;
        C1273w c1273wA = C1273w.a();
        J jO = j10.o();
        try {
            C1280z0 c1280z0 = C1280z0.f18824c;
            c1280z0.getClass();
            E0 e0A = c1280z0.a(jO.getClass());
            C1183d c1183d = new C1183d();
            c1273wA.getClass();
            e0A.i(jO, bArr, 0, length, c1183d);
            e0A.b(jO);
            f(jO);
            return jO;
        } catch (O0 e2) {
            throw new X(e2.getMessage());
        } catch (X e4) {
            if (e4.f18707a) {
                throw new X(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e7) {
            if (e7.getCause() instanceof X) {
                throw ((X) e7.getCause());
            }
            throw new X(e7.getMessage(), e7);
        } catch (IndexOutOfBoundsException unused) {
            throw X.p();
        }
    }

    public static J q(J j10, AbstractC1260p abstractC1260p, C1273w c1273w) throws X {
        J jO = j10.o();
        try {
            C1280z0 c1280z0 = C1280z0.f18824c;
            c1280z0.getClass();
            E0 e0A = c1280z0.a(jO.getClass());
            B2.n nVar = abstractC1260p.f18784c;
            if (nVar == null) {
                nVar = new B2.n(abstractC1260p);
            }
            e0A.e(jO, nVar, c1273w);
            e0A.b(jO);
            return jO;
        } catch (O0 e2) {
            throw new X(e2.getMessage());
        } catch (X e4) {
            if (e4.f18707a) {
                throw new X(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e7) {
            if (e7.getCause() instanceof X) {
                throw ((X) e7.getCause());
            }
            throw new X(e7.getMessage(), e7);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof X) {
                throw ((X) e10.getCause());
            }
            throw e10;
        }
    }

    public static void r(Class cls, J j10) {
        j10.m();
        defaultInstanceMap.put(cls, j10);
    }

    @Override // com.google.protobuf.AbstractC1230a
    public final int c(E0 e1) {
        int iG;
        int iG2;
        if (l()) {
            if (e1 == null) {
                C1280z0 c1280z0 = C1280z0.f18824c;
                c1280z0.getClass();
                iG2 = c1280z0.a(getClass()).g(this);
            } else {
                iG2 = e1.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(p134m1.b.j(iG2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (e1 == null) {
            C1280z0 c1280z1 = C1280z0.f18824c;
            c1280z1.getClass();
            iG = c1280z1.a(getClass()).g(this);
        } else {
            iG = e1.g(this);
        }
        s(iG);
        return iG;
    }

    @Override // com.google.protobuf.AbstractC1230a
    public final void e(AbstractC1267t abstractC1267t) {
        C1280z0 c1280z0 = C1280z0.f18824c;
        c1280z0.getClass();
        E0 e0A = c1280z0.a(getClass());
        C1247i0 c1247i0 = abstractC1267t.f18814c;
        if (c1247i0 == null) {
            c1247i0 = new C1247i0(abstractC1267t);
        }
        e0A.d(this, c1247i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1280z0 c1280z0 = C1280z0.f18824c;
        c1280z0.getClass();
        return c1280z0.a(getClass()).h(this, (J) obj);
    }

    public final G g() {
        return (G) h(I.NEW_BUILDER);
    }

    public abstract Object h(I i10);

    public final int hashCode() {
        if (l()) {
            C1280z0 c1280z0 = C1280z0.f18824c;
            c1280z0.getClass();
            return c1280z0.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            C1280z0 c1280z1 = C1280z0.f18824c;
            c1280z1.getClass();
            this.memoizedHashCode = c1280z1.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean l() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void m() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final J o() {
        return (J) h(I.NEW_MUTABLE_INSTANCE);
    }

    public final void s(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(p134m1.b.j(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1261p0.f18785a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC1261p0.c(this, sb, 0);
        return sb.toString();
    }
}
