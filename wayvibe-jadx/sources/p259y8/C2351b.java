package p259y8;

import D7.W;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.m;
import p161o8.w;

/* JADX INFO: renamed from: y8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2351b extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2351b f29140e = new C2351b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29141d;

    public /* synthetic */ C2351b(int i10) {
        this.f29141d = i10;
    }

    @Override // p161o8.w
    public Object f(byte b10, ByteBuffer byteBuffer) {
        switch (this.f29141d) {
            case 1:
                if (b10 == -127) {
                    Long l10 = (Long) e(byteBuffer);
                    if (l10 == null) {
                        return null;
                    }
                    int iLongValue = (int) l10.longValue();
                    M.Companion.getClass();
                    for (M m8 : M.values()) {
                        if (m8.f() == iLongValue) {
                            return m8;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    m.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C2356g(str, ((Boolean) obj).booleanValue());
                }
                if (b10 != -125) {
                    return super.f(b10, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                m.d(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new O(str2, (M) obj2);
            default:
                return super.f(b10, byteBuffer);
        }
    }

    @Override // p161o8.w
    public void k(ByteArrayOutputStream stream, Object obj) {
        switch (this.f29141d) {
            case 1:
                m.f(stream, "stream");
                if (obj instanceof M) {
                    stream.write(129);
                    k(stream, Integer.valueOf(((M) obj).f()));
                } else if (obj instanceof C2356g) {
                    stream.write(130);
                    C2356g c2356g = (C2356g) obj;
                    k(stream, W.U(c2356g.f29149a, Boolean.valueOf(c2356g.f29150b)));
                } else if (!(obj instanceof O)) {
                    super.k(stream, obj);
                } else {
                    stream.write(131);
                    O o10 = (O) obj;
                    k(stream, W.U(o10.f29136a, o10.f29137b));
                }
                break;
            default:
                super.k(stream, obj);
                break;
        }
    }
}
