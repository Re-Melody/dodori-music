package H7;

import B2.AbstractC0112b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: H7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0549a implements E7.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6165a;

    public /* synthetic */ C0549a(int i10) {
        this.f6165a = i10;
    }

    @Override // E7.z
    public final E7.y create(E7.l lVar, L7.a aVar) {
        switch (this.f6165a) {
            case 0:
                Type type = aVar.f7910b;
                boolean z10 = type instanceof GenericArrayType;
                if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0550b(lVar, lVar.c(new L7.a(genericComponentType)), G7.d.g(genericComponentType));
            case 1:
                if (aVar.f7909a == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                Class superclass = aVar.f7909a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new w(superclass);
            case 3:
                if (aVar.f7909a == java.sql.Date.class) {
                    return new K7.a(0);
                }
                return null;
            case 4:
                if (aVar.f7909a == Time.class) {
                    return new K7.a(1);
                }
                return null;
            default:
                if (aVar.f7909a == Timestamp.class) {
                    return new K7.a(AbstractC0112b.b(lVar, Date.class));
                }
                return null;
        }
    }
}
