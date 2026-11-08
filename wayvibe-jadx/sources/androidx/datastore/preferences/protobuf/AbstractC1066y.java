package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1066y extends AbstractC1043a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1066y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC1066y() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j0.f15119f;
    }

    public static AbstractC1066y d(Class cls) {
        AbstractC1066y abstractC1066y = defaultInstanceMap.get(cls);
        if (abstractC1066y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1066y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC1066y != null) {
            return abstractC1066y;
        }
        AbstractC1066y abstractC1066y2 = (AbstractC1066y) ((AbstractC1066y) p0.d(cls)).c(EnumC1065x.GET_DEFAULT_INSTANCE);
        if (abstractC1066y2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1066y2);
        return abstractC1066y2;
    }

    public static Object e(Method method, AbstractC1043a abstractC1043a, Object... objArr) {
        try {
            return method.invoke(abstractC1043a, objArr);
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

    public static final boolean f(AbstractC1066y abstractC1066y, boolean z10) {
        byte bByteValue = ((Byte) abstractC1066y.c(EnumC1065x.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Z z11 = Z.f15060c;
        z11.getClass();
        boolean zC = z11.a(abstractC1066y.getClass()).c(abstractC1066y);
        if (z10) {
            abstractC1066y.c(EnumC1065x.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zC;
    }

    public static void j(Class cls, AbstractC1066y abstractC1066y) {
        abstractC1066y.h();
        defaultInstanceMap.put(cls, abstractC1066y);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1043a
    public final int a(c0 c0Var) {
        int iF;
        int iF2;
        if (g()) {
            if (c0Var == null) {
                Z z10 = Z.f15060c;
                z10.getClass();
                iF2 = z10.a(getClass()).f(this);
            } else {
                iF2 = c0Var.f(this);
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
        if (c0Var == null) {
            Z z11 = Z.f15060c;
            z11.getClass();
            iF = z11.a(getClass()).f(this);
        } else {
            iF = c0Var.f(this);
        }
        k(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1043a
    public final void b(C1053k c1053k) {
        Z z10 = Z.f15060c;
        z10.getClass();
        c0 c0VarA = z10.a(getClass());
        J j10 = c1053k.f15127a;
        if (j10 == null) {
            j10 = new J(c1053k);
        }
        c0VarA.d(this, j10);
    }

    public abstract Object c(EnumC1065x enumC1065x);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z z10 = Z.f15060c;
        z10.getClass();
        return z10.a(getClass()).h(this, (AbstractC1066y) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final int hashCode() {
        if (g()) {
            Z z10 = Z.f15060c;
            z10.getClass();
            return z10.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            Z z11 = Z.f15060c;
            z11.getClass();
            this.memoizedHashCode = z11.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC1066y i() {
        return (AbstractC1066y) c(EnumC1065x.NEW_MUTABLE_INSTANCE);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(p134m1.b.j(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = Q.f15040a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        Q.c(this, sb, 0);
        return sb.toString();
    }
}
