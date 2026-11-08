package p260y9;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import p075g9.c;
import p219u9.a;
import p219u9.b;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g[] f29244a = new g[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a[] f29245b = new a[0];

    public static final A a(String str, a aVar) {
        return new A(str, new B(aVar));
    }

    public static final Set b(g gVar) {
        m.f(gVar, "<this>");
        if (gVar instanceof InterfaceC2374j) {
            return ((InterfaceC2374j) gVar).b();
        }
        HashSet hashSet = new HashSet(gVar.f());
        int iF = gVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            hashSet.add(gVar.g(i10));
        }
        return hashSet;
    }

    public static final g[] c(List list) {
        g[] gVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (g[]) list.toArray(new g[0])) == null) ? f29244a : gVarArr;
    }

    public static final C2385v d(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        m.f(values, "values");
        C2384u c2384u = new C2384u(str, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) N8.m.u0(i11, strArr);
            if (strName == null) {
                strName = r10.name();
            }
            c2384u.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) N8.m.u0(i11, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    m.f(annotation, "annotation");
                    int i13 = c2384u.f29251d;
                    List[] listArr = c2384u.f29253f;
                    List arrayList = listArr[i13];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[c2384u.f29251d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        C2385v c2385v = new C2385v(str, values);
        c2385v.f29335c = c2384u;
        return c2385v;
    }

    public static final C2385v e(String str, Enum[] values) {
        m.f(values, "values");
        return new C2385v(str, values);
    }

    public static final int f(g gVar, g[] typeParams) {
        m.f(gVar, "<this>");
        m.f(typeParams, "typeParams");
        int iHashCode = (gVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iF = gVar.f();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i11 = iF - 1;
            int i12 = i10 * 31;
            String strA = gVar.i(gVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i10 = i12 + iHashCode2;
            iF = i11;
        }
        int iF2 = gVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iF2 - 1;
            int i14 = iHashCode3 * 31;
            l lVarE = gVar.i(gVar.f() - iF2).e();
            iHashCode3 = i14 + (lVarE != null ? lVarE.hashCode() : 0);
            iF2 = i13;
        }
    }

    public static final void g(int i10, int i11, g descriptor) {
        m.f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.g(i13));
            }
            i12 >>>= 1;
        }
        throw new b(descriptor.a(), arrayList);
    }

    public static final void h(String str, c baseClass) {
        String strM;
        m.f(baseClass, "baseClass");
        StringBuilder sb = new StringBuilder("in the scope of '");
        e eVar = (e) baseClass;
        sb.append(eVar.c());
        sb.append('\'');
        String string = sb.toString();
        if (str == null) {
            strM = p134m1.b.k("Class discriminator was missing and no default polymorphic serializers were registered ", string);
        } else {
            StringBuilder sbQ = p134m1.b.q("Class '", str, "' is not registered for polymorphic serialization ", string, ".\nTo be registered automatically, class '");
            sbQ.append(str);
            sbQ.append("' has to be '@Serializable', and the base class '");
            sbQ.append(eVar.c());
            sbQ.append("' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '");
            strM = p134m1.b.m(sbQ, str, "' explicitly in a corresponding SerializersModule.");
        }
        throw new p219u9.e(strM);
    }
}
