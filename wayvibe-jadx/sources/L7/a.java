package L7;

import G7.b;
import G7.d;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f7910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7911c;

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f7910b = typeA;
        this.f7909a = d.g(typeA);
        this.f7911c = typeA.hashCode();
    }

    public static a a(Type... typeArr) {
        TypeVariable[] typeParameters = List.class.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(List.class.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i10 = 0; i10 < length; i10++) {
            Type type = typeArr[i10];
            Class<?> clsG = d.g(type);
            TypeVariable typeVariable = typeParameters[i10];
            for (Type type2 : typeVariable.getBounds()) {
                if (!d.g(type2).isAssignableFrom(clsG)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + List.class);
                }
            }
        }
        return new a(new b(null, List.class, typeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return d.d(this.f7910b, ((a) obj).f7910b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7911c;
    }

    public final String toString() {
        return d.k(this.f7910b);
    }
}
