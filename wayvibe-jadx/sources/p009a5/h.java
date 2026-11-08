package p009a5;

import M8.D;
import M8.n;
import M8.o;
import Z8.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14153b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f14152a = i10;
        this.f14153b = obj;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        o oVar = (o) obj;
        switch (this.f14152a) {
            case 0:
                Object obj2 = oVar.f8416a;
                if (obj2 instanceof n) {
                    i.l("Address", this.f14153b, o.a(obj2));
                }
                break;
            case 1:
                Object obj3 = oVar.f8416a;
                if (obj3 instanceof n) {
                    i.l("GeographicBounds", this.f14153b, o.a(obj3));
                }
                break;
            case 2:
                Object obj4 = oVar.f8416a;
                if (obj4 instanceof n) {
                    i.l("Build", this.f14153b, o.a(obj4));
                }
                break;
            case 3:
                Object obj5 = oVar.f8416a;
                if (obj5 instanceof n) {
                    i.l("Geocoder", this.f14153b, o.a(obj5));
                }
                break;
            default:
                Object obj6 = oVar.f8416a;
                if (obj6 instanceof n) {
                    i.l("Locale", this.f14153b, o.a(obj6));
                }
                break;
        }
        return D.f8402a;
    }
}
