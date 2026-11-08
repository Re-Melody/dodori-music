package E3;

import A6.AbstractC0097w;
import A6.C0095u;
import A6.V;
import D7.p1;
import F0.H;
import M0.o;
import M0.r;
import M0.u;
import M8.l;
import U.L;
import U2.p;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p160o7.C2174c;
import p170p7.n;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3062a;

    public /* synthetic */ d(int i10) {
        this.f3062a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3062a) {
            case 0:
                return Integer.compare(((e) obj).f3064a.f3067b, ((e) obj2).f3064a.f3067b);
            case 1:
                return Long.compare(((c) obj).f3060b, ((c) obj2).f3060b);
            case 2:
                H h10 = (H) obj;
                H h11 = (H) obj2;
                float f10 = h10.f3610z.r.f3671y;
                float f11 = h11.f3610z.r.f3671y;
                return f10 == f11 ? m.g(h10.u(), h11.u()) : Float.compare(f10, f11);
            case 3:
                o oVar = (o) obj2;
                M0.j jVar = ((o) obj).f8057d;
                u uVar = r.f8094n;
                Object objValueOf = jVar.f8047a.get(uVar);
                if (objValueOf == null) {
                    objValueOf = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objValueOf).floatValue();
                Object objValueOf2 = oVar.f8057d.f8047a.get(uVar);
                if (objValueOf2 == null) {
                    objValueOf2 = Float.valueOf(0.0f);
                }
                return Float.compare(fFloatValue, ((Number) objValueOf2).floatValue());
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 5:
                J2.b bVar = (J2.b) obj;
                J2.b bVar2 = (J2.b) obj2;
                int iCompare = Integer.compare(bVar.f6471c, bVar2.f6471c);
                return iCompare != 0 ? iCompare : bVar.f6470b.compareTo(bVar2.f6470b);
            case 6:
                return CompareUtils.compareClassName((Translator) obj, (Translator) obj2);
            case 7:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                return (((Number) lVar.f8414b).intValue() - ((Number) lVar.f8413a).intValue()) - (((Number) lVar2.f8414b).intValue() - ((Number) lVar2.f8413a).intValue());
            case 8:
                return m.g(((L) obj).f11769b, ((L) obj2).f11769b);
            case 9:
                return ((C2339o) obj2).f28951i - ((C2339o) obj).f28951i;
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 11:
                return Integer.compare(((U2.g) ((List) obj).get(0)).f12107f, ((U2.g) ((List) obj2).get(0)).f12107f);
            case 12:
                return ((U2.f) Collections.max((List) obj)).compareTo((U2.f) Collections.max((List) obj2));
            case 13:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0095u.f(U2.o.c((U2.o) Collections.max(list, new d(15)), (U2.o) Collections.max(list2, new d(15)))).a(list.size(), list2.size()).b((U2.o) Collections.max(list, new d(16)), (U2.o) Collections.max(list2, new d(16)), new d(16)).e();
            case 14:
                return ((U2.l) ((List) obj).get(0)).compareTo((U2.l) ((List) obj2).get(0));
            case 15:
                return U2.o.c((U2.o) obj, (U2.o) obj2);
            case 16:
                U2.o oVar2 = (U2.o) obj;
                U2.o oVar3 = (U2.o) obj2;
                V vF = (oVar2.f12140e && oVar2.f12143h) ? p.f12153j : p.f12153j.f();
                C0095u c0095u = AbstractC0097w.f400a;
                oVar2.f12141f.getClass();
                return c0095u.b(Integer.valueOf(oVar2.k), Integer.valueOf(oVar3.k), vF).b(Integer.valueOf(oVar2.f12145j), Integer.valueOf(oVar3.f12145j), vF).e();
            case 17:
                return ((V2.r) obj).f12535a - ((V2.r) obj2).f12535a;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return Float.compare(((V2.r) obj).f12537c, ((V2.r) obj2).f12537c);
            case 19:
                C2174c c2174c = (C2174c) obj;
                C2174c c2174c2 = (C2174c) obj2;
                int iA = c2174c.f23744a.compareTo(c2174c2.f23744a);
                return iA != 0 ? iA : p207t7.u.d(c2174c.f23745b, c2174c2.f23745b);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C2174c c2174c3 = (C2174c) obj;
                C2174c c2174c4 = (C2174c) obj2;
                int iD = p207t7.u.d(c2174c3.f23745b, c2174c4.f23745b);
                return iD != 0 ? iD : c2174c3.f23744a.compareTo(c2174c4.f23744a);
            case 21:
                return ((Long) obj2).compareTo((Long) obj);
            case 22:
                p170p7.a aVar = (p170p7.a) obj;
                p170p7.a aVar2 = (p170p7.a) obj2;
                int iCompare2 = Long.compare(aVar.f25248d.f25254a, aVar2.f25248d.f25254a);
                return iCompare2 == 0 ? aVar.f25246b.compareTo(aVar2.f25246b) : iCompare2;
            case 23:
                return p207t7.u.d(((p179q7.i) obj).f25691a, ((p179q7.i) obj2).f25691a);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return CompareUtils.compareClassName((LanguageDetector) obj, (LanguageDetector) obj2);
            case 25:
                return CompareUtils.compareClassName(obj, obj2);
            case 26:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 27:
                return ((p170p7.h) obj).compareTo((p170p7.h) obj2);
            case 28:
                p170p7.a aVar3 = (p170p7.a) obj;
                p170p7.a aVar4 = (p170p7.a) obj2;
                int iCompareTo = aVar3.f25246b.compareTo(aVar4.f25246b);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                Iterator it = aVar3.f25247c.iterator();
                Iterator it2 = aVar4.f25247c.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    p170p7.d dVar = (p170p7.d) it.next();
                    p170p7.d dVar2 = (p170p7.d) it2.next();
                    dVar.getClass();
                    int iD2 = dVar.f25256a.compareTo(dVar2.f25256a);
                    int iCompareTo2 = iD2 != 0 ? iD2 : dVar.f25257b.compareTo(dVar2.f25257b);
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                return Boolean.compare(it.hasNext(), it2.hasNext());
            default:
                return p170p7.b.b((n) obj).compareTo(p170p7.b.b((n) obj2));
        }
    }
}
