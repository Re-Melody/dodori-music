package za;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import p161o8.p;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g[] f29961b;

    public g() {
        this.f29960a = null;
        this.f29961b = null;
    }

    public static g b(String str) {
        return new g(com.amazon.a.a.o.b.au, new b(str));
    }

    public static g[] c(g[] gVarArr, g[] gVarArr2) {
        g[] gVarArr3 = new g[gVarArr.length + gVarArr2.length];
        System.arraycopy(gVarArr, 0, gVarArr3, 0, gVarArr.length);
        System.arraycopy(gVarArr2, 0, gVarArr3, gVarArr.length, gVarArr2.length);
        return gVarArr3;
    }

    public static g d(Object obj) {
        if (!obj.getClass().isArray()) {
            if (obj instanceof g) {
                throw new RuntimeException("Can't convert an expression to a literal");
            }
            return new b(obj);
        }
        int length = Array.getLength(obj);
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            objArr[i10] = Array.get(obj, i10);
        }
        return new g("literal", new c(objArr));
    }

    public static g e(b bVar, g gVar, p... pVarArr) {
        return new g("match", c(c(new g[]{bVar}, p.g(pVarArr)), new g[]{gVar}));
    }

    public static p f(Object obj, Object obj2) {
        p pVar = new p();
        pVar.f23829a = obj;
        pVar.f23830b = obj2;
        return pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f29960a;
        String str2 = this.f29960a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return Arrays.deepEquals(this.f29961b, gVar.f29961b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f29960a);
        g[] gVarArr = this.f29961b;
        if (gVarArr != 0) {
            for (c cVar : gVarArr) {
                if (cVar instanceof f) {
                    arrayList.add(cVar.a());
                } else {
                    arrayList.add(cVar.g());
                }
            }
        }
        return arrayList.toArray();
    }

    public int hashCode() {
        String str = this.f29960a;
        return Arrays.hashCode(this.f29961b) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[\"");
        sb.append(this.f29960a);
        sb.append("\"");
        g[] gVarArr = this.f29961b;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                sb.append(", ");
                sb.append(gVar.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public g(String str, g... gVarArr) {
        this.f29960a = str;
        this.f29961b = gVarArr;
    }
}
