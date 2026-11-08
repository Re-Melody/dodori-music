package G7;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f5640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f5641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f5642c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z10 = true;
            boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z11) {
                z10 = false;
            }
            d.b(z10);
        }
        this.f5640a = type == null ? null : d.a(type);
        this.f5641b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f5642c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f5642c[i10]);
            d.c(this.f5642c[i10]);
            Type[] typeArr3 = this.f5642c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f5642c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f5640a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f5641b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f5642c) ^ this.f5641b.hashCode();
        Type type = this.f5640a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f5642c;
        int length = typeArr.length;
        Type type = this.f5641b;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.k(type));
        sb.append("<");
        sb.append(d.k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.k(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
