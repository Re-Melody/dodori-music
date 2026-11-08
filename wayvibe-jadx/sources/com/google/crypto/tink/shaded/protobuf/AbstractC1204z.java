package com.google.crypto.tink.shaded.protobuf;

import A9.AbstractC0106f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1204z extends AbstractC1180a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC1204z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected h0 unknownFields;

    public AbstractC1204z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = h0.f18436f;
    }

    public static void h(AbstractC1204z abstractC1204z) throws G {
        if (abstractC1204z != null && !o(abstractC1204z, true)) {
            throw new G(new g0().getMessage());
        }
    }

    public static AbstractC1204z k(Class cls) {
        AbstractC1204z abstractC1204z = defaultInstanceMap.get(cls);
        if (abstractC1204z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1204z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC1204z != null) {
            return abstractC1204z;
        }
        AbstractC1204z abstractC1204zA = ((AbstractC1204z) n0.b(cls)).a();
        if (abstractC1204zA == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1204zA);
        return abstractC1204zA;
    }

    public static Object n(Method method, AbstractC1180a abstractC1180a, Object... objArr) {
        try {
            return method.invoke(abstractC1180a, objArr);
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

    public static final boolean o(AbstractC1204z abstractC1204z, boolean z10) {
        byte bByteValue = ((Byte) abstractC1204z.j(EnumC1203y.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        b0 b0Var = b0.f18412c;
        b0Var.getClass();
        boolean zC = b0Var.a(abstractC1204z.getClass()).c(abstractC1204z);
        if (z10) {
            abstractC1204z.j(EnumC1203y.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zC;
    }

    public static AbstractC1204z t(AbstractC1204z abstractC1204z, AbstractC1188i abstractC1188i, C1194o c1194o) throws G {
        C1187h c1187h = (C1187h) abstractC1188i;
        C1189j c1189jH = AbstractC0106f.h(c1187h.f18435d, c1187h.m(), c1187h.size(), true);
        AbstractC1204z abstractC1204zV = v(abstractC1204z, c1189jH, c1194o);
        c1189jH.b(0);
        h(abstractC1204zV);
        return abstractC1204zV;
    }

    public static AbstractC1204z u(AbstractC1204z abstractC1204z, byte[] bArr, C1194o c1194o) throws G {
        int length = bArr.length;
        if (length != 0) {
            AbstractC1204z abstractC1204zS = abstractC1204z.s();
            try {
                b0 b0Var = b0.f18412c;
                b0Var.getClass();
                e0 e0VarA = b0Var.a(abstractC1204zS.getClass());
                C1183d c1183d = new C1183d();
                c1194o.getClass();
                e0VarA.g(abstractC1204zS, bArr, 0, length, c1183d);
                e0VarA.b(abstractC1204zS);
                abstractC1204z = abstractC1204zS;
            } catch (G e2) {
                if (e2.f18379a) {
                    throw new G(e2.getMessage(), e2);
                }
                throw e2;
            } catch (g0 e4) {
                throw new G(e4.getMessage());
            } catch (IOException e7) {
                if (e7.getCause() instanceof G) {
                    throw ((G) e7.getCause());
                }
                throw new G(e7.getMessage(), e7);
            } catch (IndexOutOfBoundsException unused) {
                throw G.o();
            }
        }
        h(abstractC1204z);
        return abstractC1204z;
    }

    public static AbstractC1204z v(AbstractC1204z abstractC1204z, AbstractC0106f abstractC0106f, C1194o c1194o) throws G {
        AbstractC1204z abstractC1204zS = abstractC1204z.s();
        try {
            b0 b0Var = b0.f18412c;
            b0Var.getClass();
            e0 e0VarA = b0Var.a(abstractC1204zS.getClass());
            B2.n nVar = (B2.n) abstractC0106f.f458b;
            if (nVar == null) {
                nVar = new B2.n(abstractC0106f, (byte) 0);
            }
            e0VarA.h(abstractC1204zS, nVar, c1194o);
            e0VarA.b(abstractC1204zS);
            return abstractC1204zS;
        } catch (G e2) {
            if (e2.f18379a) {
                throw new G(e2.getMessage(), e2);
            }
            throw e2;
        } catch (g0 e4) {
            throw new G(e4.getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof G) {
                throw ((G) e7.getCause());
            }
            throw new G(e7.getMessage(), e7);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof G) {
                throw ((G) e10.getCause());
            }
            throw e10;
        }
    }

    public static void w(Class cls, AbstractC1204z abstractC1204z) {
        abstractC1204z.q();
        defaultInstanceMap.put(cls, abstractC1204z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1180a
    public final int b(e0 e0Var) {
        int iF;
        int iF2;
        if (p()) {
            if (e0Var == null) {
                b0 b0Var = b0.f18412c;
                b0Var.getClass();
                iF2 = b0Var.a(getClass()).f(this);
            } else {
                iF2 = e0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(p134m1.b.j(iF2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (e0Var == null) {
            b0 b0Var2 = b0.f18412c;
            b0Var2.getClass();
            iF = b0Var2.a(getClass()).f(this);
        } else {
            iF = e0Var.f(this);
        }
        x(iF);
        return iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b0 b0Var = b0.f18412c;
        b0Var.getClass();
        return b0Var.a(getClass()).d(this, (AbstractC1204z) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1180a
    public final void g(C1191l c1191l) {
        b0 b0Var = b0.f18412c;
        b0Var.getClass();
        e0 e0VarA = b0Var.a(getClass());
        N n6 = c1191l.f18463c;
        if (n6 == null) {
            n6 = new N(c1191l);
        }
        e0VarA.i(this, n6);
    }

    public final int hashCode() {
        if (p()) {
            b0 b0Var = b0.f18412c;
            b0Var.getClass();
            return b0Var.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            b0 b0Var2 = b0.f18412c;
            b0Var2.getClass();
            this.memoizedHashCode = b0Var2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC1201w i() {
        return (AbstractC1201w) j(EnumC1203y.NEW_BUILDER);
    }

    public abstract Object j(EnumC1203y enumC1203y);

    @Override // com.google.crypto.tink.shaded.protobuf.T
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC1204z a() {
        return (AbstractC1204z) j(EnumC1203y.GET_DEFAULT_INSTANCE);
    }

    public final Z m() {
        return (Z) j(EnumC1203y.GET_PARSER);
    }

    public final boolean p() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void q() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1180a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC1201w d() {
        return (AbstractC1201w) j(EnumC1203y.NEW_BUILDER);
    }

    public final AbstractC1204z s() {
        return (AbstractC1204z) j(EnumC1203y.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = U.f18391a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        U.c(this, sb, 0);
        return sb.toString();
    }

    public final void x(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(p134m1.b.j(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final AbstractC1201w y() {
        AbstractC1201w abstractC1201w = (AbstractC1201w) j(EnumC1203y.NEW_BUILDER);
        abstractC1201w.f(this);
        return abstractC1201w;
    }
}
