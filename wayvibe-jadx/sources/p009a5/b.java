package p009a5;

import D7.W;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.m;
import p161o8.w;
import p250x8.a;
import p250x8.c;
import p250x8.f;
import p250x8.h;
import p250x8.i;
import p250x8.j;
import p250x8.l;
import p250x8.v;
import p250x8.x;
import p250x8.y;

/* JADX INFO: loaded from: classes.dex */
public class b extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14135d;

    public /* synthetic */ b(int i10) {
        this.f14135d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [x8.c[]] */
    /* JADX WARN: Type inference failed for: r2v36, types: [x8.h[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [x8.h] */
    /* JADX WARN: Type inference failed for: r6v9, types: [x8.c] */
    @Override // p161o8.w
    public Object f(byte b10, ByteBuffer byteBuffer) {
        ?? r10;
        switch (this.f14135d) {
            case 1:
                int i10 = 0;
                if (b10 == -127) {
                    Long l10 = (Long) e(byteBuffer);
                    if (l10 == null) {
                        return null;
                    }
                    int iLongValue = (int) l10.longValue();
                    h.Companion.getClass();
                    ?? Values = h.values();
                    int length = Values.length;
                    while (i10 < length) {
                        r10 = Values[i10];
                        if (r10.f() != iLongValue) {
                            i10++;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Long l11 = (Long) e(byteBuffer);
                    if (l11 == null) {
                        return null;
                    }
                    int iLongValue2 = (int) l11.longValue();
                    c.Companion.getClass();
                    ?? Values2 = c.values();
                    int length2 = Values2.length;
                    while (i10 < length2) {
                        r10 = Values2[i10];
                        if (r10.f() != iLongValue2) {
                            i10++;
                        }
                    }
                    return null;
                }
                if (b10 == -125) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    Object obj = list.get(0);
                    m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new v((List) obj, (String) list.get(1), (String) list.get(2), (String) list.get(3));
                }
                if (b10 == -124) {
                    Object objE2 = e(byteBuffer);
                    List list2 = objE2 instanceof List ? (List) objE2 : null;
                    if (list2 == null) {
                        return null;
                    }
                    Object obj2 = list2.get(0);
                    m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    Object obj3 = list2.get(1);
                    m.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestGoogleIdOptionParams");
                    return new j(zBooleanValue, (i) obj3, (String) list2.get(2), (String) list2.get(3), (String) list2.get(4));
                }
                if (b10 == -123) {
                    Object objE3 = e(byteBuffer);
                    List list3 = objE3 instanceof List ? (List) objE3 : null;
                    if (list3 == null) {
                        return null;
                    }
                    Object obj4 = list3.get(0);
                    m.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                    Object obj5 = list3.get(1);
                    m.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                    return new i(zBooleanValue2, ((Boolean) obj5).booleanValue());
                }
                if (b10 == -122) {
                    Object objE4 = e(byteBuffer);
                    List list4 = objE4 instanceof List ? (List) objE4 : null;
                    if (list4 == null) {
                        return null;
                    }
                    Object obj6 = list4.get(0);
                    m.d(obj6, "null cannot be cast to non-null type kotlin.String");
                    Object obj7 = list4.get(1);
                    m.d(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new y((String) obj6, (List) obj7);
                }
                if (b10 == -121) {
                    Object objE5 = e(byteBuffer);
                    List list5 = objE5 instanceof List ? (List) objE5 : null;
                    if (list5 == null) {
                        return null;
                    }
                    String str = (String) list5.get(0);
                    String str2 = (String) list5.get(1);
                    String str3 = (String) list5.get(2);
                    Object obj8 = list5.get(3);
                    m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) obj8;
                    Object obj9 = list5.get(4);
                    m.d(obj9, "null cannot be cast to non-null type kotlin.String");
                    return new x(str, str2, str3, str4, (String) obj9, (String) list5.get(5));
                }
                if (b10 == -120) {
                    Object objE6 = e(byteBuffer);
                    List list6 = objE6 instanceof List ? (List) objE6 : null;
                    if (list6 == null) {
                        return null;
                    }
                    Object obj10 = list6.get(0);
                    m.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialFailureType");
                    return new f((h) obj10, (String) list6.get(1), (String) list6.get(2));
                }
                if (b10 == -119) {
                    Object objE7 = e(byteBuffer);
                    List list7 = objE7 instanceof List ? (List) objE7 : null;
                    if (list7 == null) {
                        return null;
                    }
                    Object obj11 = list7.get(0);
                    m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformGoogleIdTokenCredential");
                    return new l((x) obj11);
                }
                if (b10 == -118) {
                    Object objE8 = e(byteBuffer);
                    List list8 = objE8 instanceof List ? (List) objE8 : null;
                    if (list8 == null) {
                        return null;
                    }
                    Object obj12 = list8.get(0);
                    m.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.AuthorizeFailureType");
                    return new a((c) obj12, (String) list8.get(1), (String) list8.get(2));
                }
                if (b10 != -117) {
                    return super.f(b10, byteBuffer);
                }
                Object objE9 = e(byteBuffer);
                List list9 = objE9 instanceof List ? (List) objE9 : null;
                if (list9 == null) {
                    return null;
                }
                String str5 = (String) list9.get(0);
                String str6 = (String) list9.get(1);
                Object obj13 = list9.get(2);
                m.d(obj13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new p250x8.w(str5, str6, (List) obj13);
                return r10;
            default:
                return super.f(b10, byteBuffer);
        }
    }

    @Override // p161o8.w
    public void k(ByteArrayOutputStream stream, Object obj) {
        switch (this.f14135d) {
            case 0:
                m.f(stream, "stream");
                super.k(stream, obj);
                break;
            default:
                m.f(stream, "stream");
                if (obj instanceof h) {
                    stream.write(129);
                    k(stream, Long.valueOf(((h) obj).f()));
                } else if (obj instanceof c) {
                    stream.write(130);
                    k(stream, Long.valueOf(((c) obj).f()));
                } else if (obj instanceof v) {
                    stream.write(131);
                    k(stream, ((v) obj).a());
                } else if (obj instanceof j) {
                    stream.write(132);
                    k(stream, ((j) obj).a());
                } else if (obj instanceof i) {
                    stream.write(133);
                    k(stream, ((i) obj).a());
                } else if (obj instanceof y) {
                    stream.write(134);
                    y yVar = (y) obj;
                    k(stream, W.U(yVar.f28681a, yVar.f28682b));
                } else if (obj instanceof x) {
                    stream.write(135);
                    k(stream, ((x) obj).a());
                } else if (obj instanceof f) {
                    stream.write(136);
                    k(stream, ((f) obj).a());
                } else if (obj instanceof l) {
                    stream.write(137);
                    k(stream, W.T(((l) obj).f28646a));
                } else if (obj instanceof a) {
                    stream.write(138);
                    k(stream, ((a) obj).a());
                } else if (!(obj instanceof p250x8.w)) {
                    super.k(stream, obj);
                } else {
                    stream.write(139);
                    k(stream, ((p250x8.w) obj).a());
                }
                break;
        }
    }
}
