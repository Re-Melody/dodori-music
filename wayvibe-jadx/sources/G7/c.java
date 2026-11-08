package G7;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f5643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f5644b;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f5644b = null;
            this.f5643a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f5644b = d.a(typeArr2[0]);
        this.f5643a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f5644b;
        return type != null ? new Type[]{type} : d.f5645a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f5643a};
    }

    public final int hashCode() {
        Type type = this.f5644b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f5643a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f5644b;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f5643a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
