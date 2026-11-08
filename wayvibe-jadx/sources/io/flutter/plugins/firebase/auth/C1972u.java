package io.flutter.plugins.firebase.auth;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.auth.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1972u extends p161o8.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1972u f20941e = new C1972u(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1972u f20942f = new C1972u(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1972u f20943g = new C1972u(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1972u f20944h = new C1972u(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1972u f20945i = new C1972u(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20946d;

    public /* synthetic */ C1972u(int i10) {
        this.f20946d = i10;
    }

    @Override // p161o8.w
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        Object obj;
        Object obj2;
        switch (this.f20946d) {
            case 0:
                switch (b10) {
                    case -128:
                        return C1968p.a((ArrayList) e(byteBuffer));
                    case -127:
                        return D.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList = (ArrayList) e(byteBuffer);
                        E e2 = new E();
                        e2.f20803a = (String) arrayList.get(0);
                        e2.f20804b = (String) arrayList.get(1);
                        obj = e2;
                        break;
                    case -125:
                        return F.a((ArrayList) e(byteBuffer));
                    case -124:
                        return G.a((ArrayList) e(byteBuffer));
                    case -123:
                        return H.a((ArrayList) e(byteBuffer));
                    case -122:
                        return I.a((ArrayList) e(byteBuffer));
                    case -121:
                        return J.a((ArrayList) e(byteBuffer));
                    case -120:
                        return K.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                        L l10 = new L();
                        String str = (String) arrayList2.get(0);
                        if (str == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        l10.f20839a = str;
                        obj = l10;
                        break;
                        break;
                    case -118:
                        return M.a((ArrayList) e(byteBuffer));
                    case -117:
                        return N.a((ArrayList) e(byteBuffer));
                    case -116:
                        return O.a((ArrayList) e(byteBuffer));
                    case -115:
                        return P.a((ArrayList) e(byteBuffer));
                    case -114:
                        return Q.a((ArrayList) e(byteBuffer));
                    case -113:
                        return S.a((ArrayList) e(byteBuffer));
                    case -112:
                        return T.a((ArrayList) e(byteBuffer));
                    case -111:
                        return U.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b10, byteBuffer);
                }
                return obj;
            case 1:
                switch (b10) {
                    case -128:
                        return C1968p.a((ArrayList) e(byteBuffer));
                    case -127:
                        return D.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                        E e4 = new E();
                        e4.f20803a = (String) arrayList3.get(0);
                        e4.f20804b = (String) arrayList3.get(1);
                        obj2 = e4;
                        break;
                    case -125:
                        return F.a((ArrayList) e(byteBuffer));
                    case -124:
                        return G.a((ArrayList) e(byteBuffer));
                    case -123:
                        return H.a((ArrayList) e(byteBuffer));
                    case -122:
                        return I.a((ArrayList) e(byteBuffer));
                    case -121:
                        return J.a((ArrayList) e(byteBuffer));
                    case -120:
                        return K.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                        L l11 = new L();
                        String str2 = (String) arrayList4.get(0);
                        if (str2 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        l11.f20839a = str2;
                        obj2 = l11;
                        break;
                        break;
                    case -118:
                        return M.a((ArrayList) e(byteBuffer));
                    case -117:
                        return N.a((ArrayList) e(byteBuffer));
                    case -116:
                        return O.a((ArrayList) e(byteBuffer));
                    case -115:
                        return P.a((ArrayList) e(byteBuffer));
                    case -114:
                        return Q.a((ArrayList) e(byteBuffer));
                    case -113:
                        return S.a((ArrayList) e(byteBuffer));
                    case -112:
                        return T.a((ArrayList) e(byteBuffer));
                    case -111:
                        return U.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b10, byteBuffer);
                }
                return obj2;
            case 2:
                switch (b10) {
                    case -128:
                        return G.a((ArrayList) e(byteBuffer));
                    case -127:
                        return H.a((ArrayList) e(byteBuffer));
                    case -126:
                        return M.a((ArrayList) e(byteBuffer));
                    case -125:
                        return P.a((ArrayList) e(byteBuffer));
                    case -124:
                        return Q.a((ArrayList) e(byteBuffer));
                    case -123:
                        return S.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b10, byteBuffer);
                }
            case 3:
                return b10 != -128 ? super.f(b10, byteBuffer) : O.a((ArrayList) e(byteBuffer));
            default:
                switch (b10) {
                    case -128:
                        return C1968p.a((ArrayList) e(byteBuffer));
                    case -127:
                        return K.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                        L l12 = new L();
                        String str3 = (String) arrayList5.get(0);
                        if (str3 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        l12.f20839a = str3;
                        return l12;
                    case -125:
                        return M.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b10, byteBuffer);
                }
        }
    }

    @Override // p161o8.w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        switch (this.f20946d) {
            case 0:
                if (obj instanceof C1968p) {
                    byteArrayOutputStream.write(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    k(byteArrayOutputStream, ((C1968p) obj).b());
                } else if (obj instanceof D) {
                    byteArrayOutputStream.write(129);
                    D d10 = (D) obj;
                    d10.getClass();
                    ArrayList arrayList = new ArrayList(2);
                    EnumC1967o enumC1967o = d10.f20801a;
                    arrayList.add(enumC1967o == null ? null : Integer.valueOf(enumC1967o.index));
                    arrayList.add(d10.f20802b);
                    k(byteArrayOutputStream, arrayList);
                } else if (obj instanceof E) {
                    byteArrayOutputStream.write(130);
                    E e2 = (E) obj;
                    e2.getClass();
                    ArrayList arrayList2 = new ArrayList(2);
                    arrayList2.add(e2.f20803a);
                    arrayList2.add(e2.f20804b);
                    k(byteArrayOutputStream, arrayList2);
                } else if (obj instanceof F) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((F) obj).b());
                } else if (obj instanceof G) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((G) obj).b());
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((H) obj).b());
                } else if (obj instanceof I) {
                    byteArrayOutputStream.write(134);
                    k(byteArrayOutputStream, ((I) obj).b());
                } else if (obj instanceof J) {
                    byteArrayOutputStream.write(135);
                    k(byteArrayOutputStream, ((J) obj).b());
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(136);
                    k(byteArrayOutputStream, ((K) obj).b());
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(137);
                    L l10 = (L) obj;
                    l10.getClass();
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(l10.f20839a);
                    k(byteArrayOutputStream, arrayList3);
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(138);
                    k(byteArrayOutputStream, ((M) obj).b());
                } else if (obj instanceof N) {
                    byteArrayOutputStream.write(139);
                    N n6 = (N) obj;
                    n6.getClass();
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(n6.f20842a);
                    arrayList4.add(n6.f20843b);
                    arrayList4.add(n6.f20844c);
                    k(byteArrayOutputStream, arrayList4);
                } else if (obj instanceof O) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((O) obj).b());
                } else if (obj instanceof P) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((P) obj).b());
                } else if (obj instanceof Q) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((Q) obj).b());
                } else if (obj instanceof S) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((S) obj).b());
                } else if (obj instanceof T) {
                    byteArrayOutputStream.write(144);
                    T t10 = (T) obj;
                    t10.getClass();
                    ArrayList arrayList5 = new ArrayList(4);
                    arrayList5.add(t10.f20866a);
                    arrayList5.add(t10.f20867b);
                    arrayList5.add(t10.f20868c);
                    arrayList5.add(t10.f20869d);
                    k(byteArrayOutputStream, arrayList5);
                } else if (!(obj instanceof U)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(145);
                    k(byteArrayOutputStream, ((U) obj).b());
                }
                break;
            case 1:
                if (obj instanceof C1968p) {
                    byteArrayOutputStream.write(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    k(byteArrayOutputStream, ((C1968p) obj).b());
                } else if (obj instanceof D) {
                    byteArrayOutputStream.write(129);
                    D d11 = (D) obj;
                    d11.getClass();
                    ArrayList arrayList6 = new ArrayList(2);
                    EnumC1967o enumC1967o2 = d11.f20801a;
                    arrayList6.add(enumC1967o2 == null ? null : Integer.valueOf(enumC1967o2.index));
                    arrayList6.add(d11.f20802b);
                    k(byteArrayOutputStream, arrayList6);
                } else if (obj instanceof E) {
                    byteArrayOutputStream.write(130);
                    E e4 = (E) obj;
                    e4.getClass();
                    ArrayList arrayList7 = new ArrayList(2);
                    arrayList7.add(e4.f20803a);
                    arrayList7.add(e4.f20804b);
                    k(byteArrayOutputStream, arrayList7);
                } else if (obj instanceof F) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((F) obj).b());
                } else if (obj instanceof G) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((G) obj).b());
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((H) obj).b());
                } else if (obj instanceof I) {
                    byteArrayOutputStream.write(134);
                    k(byteArrayOutputStream, ((I) obj).b());
                } else if (obj instanceof J) {
                    byteArrayOutputStream.write(135);
                    k(byteArrayOutputStream, ((J) obj).b());
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(136);
                    k(byteArrayOutputStream, ((K) obj).b());
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(137);
                    L l11 = (L) obj;
                    l11.getClass();
                    ArrayList arrayList8 = new ArrayList(1);
                    arrayList8.add(l11.f20839a);
                    k(byteArrayOutputStream, arrayList8);
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(138);
                    k(byteArrayOutputStream, ((M) obj).b());
                } else if (obj instanceof N) {
                    byteArrayOutputStream.write(139);
                    N n10 = (N) obj;
                    n10.getClass();
                    ArrayList arrayList9 = new ArrayList(3);
                    arrayList9.add(n10.f20842a);
                    arrayList9.add(n10.f20843b);
                    arrayList9.add(n10.f20844c);
                    k(byteArrayOutputStream, arrayList9);
                } else if (obj instanceof O) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((O) obj).b());
                } else if (obj instanceof P) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((P) obj).b());
                } else if (obj instanceof Q) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((Q) obj).b());
                } else if (obj instanceof S) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((S) obj).b());
                } else if (obj instanceof T) {
                    byteArrayOutputStream.write(144);
                    T t11 = (T) obj;
                    t11.getClass();
                    ArrayList arrayList10 = new ArrayList(4);
                    arrayList10.add(t11.f20866a);
                    arrayList10.add(t11.f20867b);
                    arrayList10.add(t11.f20868c);
                    arrayList10.add(t11.f20869d);
                    k(byteArrayOutputStream, arrayList10);
                } else if (!(obj instanceof U)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(145);
                    k(byteArrayOutputStream, ((U) obj).b());
                }
                break;
            case 2:
                if (obj instanceof G) {
                    byteArrayOutputStream.write(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    k(byteArrayOutputStream, ((G) obj).b());
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, ((H) obj).b());
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(130);
                    k(byteArrayOutputStream, ((M) obj).b());
                } else if (obj instanceof P) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((P) obj).b());
                } else if (obj instanceof Q) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((Q) obj).b());
                } else if (!(obj instanceof S)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((S) obj).b());
                }
                break;
            case 3:
                if (!(obj instanceof O)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    k(byteArrayOutputStream, ((O) obj).b());
                }
                break;
            default:
                if (obj instanceof C1968p) {
                    byteArrayOutputStream.write(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    k(byteArrayOutputStream, ((C1968p) obj).b());
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, ((K) obj).b());
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(130);
                    L l12 = (L) obj;
                    l12.getClass();
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(l12.f20839a);
                    k(byteArrayOutputStream, arrayList11);
                } else if (!(obj instanceof M)) {
                    super.k(byteArrayOutputStream, obj);
                } else {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((M) obj).b());
                }
                break;
        }
    }
}
