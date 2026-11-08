package Q8;

import M8.D;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.jvm.internal.m;
import p119k9.E0;
import p9.u;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Z8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10591a;

    public /* synthetic */ b(int i10) {
        this.f10591a = i10;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        D d10 = D.f8402a;
        switch (this.f10591a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                m.f(acc, "acc");
                m.f(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 1:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                m.f(acc2, "acc");
                m.f(element2, "element");
                i iVarMinusKey = acc2.minusKey(element2.getKey());
                j jVar = j.f10595a;
                if (iVarMinusKey == jVar) {
                    return element2;
                }
                e eVar = e.f10594a;
                f fVar = (f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(element2, iVarMinusKey);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new c(fVar, element2);
                    }
                    cVar = new c(fVar, new c(element2, iVarMinusKey2));
                }
                return cVar;
            case 2:
                Z8.a f10 = (Z8.a) obj2;
                m.f(f10, "f");
                U1.a aVar = U1.d.f12053a;
                Q5.b.k((CancellationSignal) obj, f10);
                return d10;
            case 3:
                Z8.a f11 = (Z8.a) obj2;
                m.f(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!T1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return d10;
            case 4:
                Z8.a f12 = (Z8.a) obj2;
                m.f(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!T1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return d10;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 6:
                return ((i) obj).plus((g) obj2);
            case 7:
                return ((i) obj).plus((g) obj2);
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 9:
                g gVar = (g) obj2;
                if (!(gVar instanceof E0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 10:
                E0 e1 = (E0) obj;
                g gVar2 = (g) obj2;
                if (e1 != null) {
                    return e1;
                }
                if (gVar2 instanceof E0) {
                    return (E0) gVar2;
                }
                return null;
            default:
                return (u) obj;
        }
    }
}
