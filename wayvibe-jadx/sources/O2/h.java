package O2;

import B2.AbstractC0111a;
import U.W0;
import android.content.Context;
import com.google.firebase.firestore.Z;
import p140m7.C2061m;
import p152o.h1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j, p248x6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f9063a;

    public /* synthetic */ h(Context context) {
        this.f9063a = context;
    }

    @Override // p248x6.i
    public Object a() {
        return this.f9063a;
    }

    public p138m5.j b() {
        Context context = this.f9063a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        p138m5.j jVar = new p138m5.j();
        jVar.f22330a = p158o5.a.a(p138m5.l.f22338a);
        K2.c cVar = new K2.c(context);
        jVar.f22331b = cVar;
        jVar.f22332c = p158o5.a.a(new W9.j(20, cVar, new Y5.h(cVar, 19)));
        K2.c cVar2 = jVar.f22331b;
        jVar.f22333d = new org.maplibre.android.location.v(cVar2);
        L8.a aVarA = p158o5.a.a(new p161o8.p(jVar.f22333d, p158o5.a.a(new org.maplibre.android.location.u(cVar2)), false));
        jVar.f22334e = aVarA;
        p090i2.c cVar3 = new p090i2.c(7);
        K2.c cVar4 = jVar.f22331b;
        p150n8.a aVar = new p150n8.a(cVar4, aVarA, cVar3);
        L8.a aVar2 = jVar.f22330a;
        L8.a aVar3 = jVar.f22332c;
        jVar.f22335f = p158o5.a.a(new W0(new B9.d(aVar2, aVar3, aVar, aVarA, aVarA, 13), new h1(cVar4, aVar3, aVarA, aVar, aVar2, aVarA, aVarA), new C2061m(aVar2, aVarA, aVar, aVarA), 25));
        return jVar;
    }

    @Override // O2.j
    public k e(i iVar) {
        Context context;
        int i10 = B2.C.f560a;
        if (i10 < 23 || (i10 < 31 && ((context = this.f9063a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new Z(15).e(iVar);
        }
        int iG = p255y2.C.g(iVar.f9066c.f28954m);
        AbstractC0111a.p("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + B2.C.C(iG));
        return new ua.c(iG).e(iVar);
    }
}
