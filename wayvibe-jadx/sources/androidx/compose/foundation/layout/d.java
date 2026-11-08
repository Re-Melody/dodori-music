package androidx.compose.foundation.layout;

import C.C0152j;
import C.I;
import p067g0.g;
import p067g0.h;
import p067g0.i;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f14716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f14717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f14718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f14719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f14720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f14721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f14722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f14723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f14724i;

    static {
        I i10 = I.Horizontal;
        f14716a = new FillElement(i10, 1.0f, "fillMaxWidth");
        I i11 = I.Vertical;
        f14717b = new FillElement(i11, 1.0f, "fillMaxHeight");
        I i12 = I.Both;
        f14718c = new FillElement(i12, 1.0f, "fillMaxSize");
        g gVar = p067g0.b.f19950n;
        f14719d = new WrapContentElement(i10, false, new C0152j(gVar, 4), gVar, "wrapContentWidth");
        g gVar2 = p067g0.b.f19949m;
        f14720e = new WrapContentElement(i10, false, new C0152j(gVar2, 4), gVar2, "wrapContentWidth");
        h hVar = p067g0.b.k;
        f14721f = new WrapContentElement(i11, false, new C0152j(hVar, 2), hVar, "wrapContentHeight");
        h hVar2 = p067g0.b.f19947j;
        f14722g = new WrapContentElement(i11, false, new C0152j(hVar2, 2), hVar2, "wrapContentHeight");
        i iVar = p067g0.b.f19942e;
        f14723h = new WrapContentElement(i12, false, new C0152j(iVar, 3), iVar, "wrapContentSize");
        i iVar2 = p067g0.b.f19938a;
        f14724i = new WrapContentElement(i12, false, new C0152j(iVar2, 3), iVar2, "wrapContentSize");
    }

    public static final r a(r rVar, float f10, float f11) {
        return rVar.then(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static final r b(r rVar, float f10) {
        return rVar.then(f10 == 1.0f ? f14717b : new FillElement(I.Vertical, f10, "fillMaxHeight"));
    }

    public static final r c(r rVar, float f10) {
        return rVar.then(f10 == 1.0f ? f14716a : new FillElement(I.Horizontal, f10, "fillMaxWidth"));
    }

    public static final r d(r rVar, float f10) {
        return rVar.then(new SizeElement(0.0f, f10, 0.0f, f10, true, 5));
    }

    public static final r e(r rVar, float f10, float f11) {
        return rVar.then(new SizeElement(0.0f, f10, 0.0f, f11, true, 5));
    }

    public static /* synthetic */ r f(r rVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return e(rVar, f10, f11);
    }

    public static final r g(r rVar, float f10) {
        return rVar.then(new SizeElement(0.0f, f10, 0.0f, f10, false, 5));
    }

    public static final r h(float f10) {
        return new SizeElement(f10, f10, f10, f10, false);
    }

    public static final r i(r rVar, float f10, float f11) {
        return rVar.then(new SizeElement(f10, f11, f10, f11, false));
    }

    public static r j(r rVar, float f10, float f11, float f12, float f13, int i10) {
        return rVar.then(new SizeElement(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false));
    }

    public static final r k(r rVar, float f10) {
        return rVar.then(new SizeElement(f10, 0.0f, f10, 0.0f, false, 10));
    }

    public static final r l(r rVar, float f10) {
        return rVar.then(new SizeElement(f10, f10, f10, f10, true));
    }

    public static final r m(r rVar, float f10, float f11) {
        return rVar.then(new SizeElement(f10, f11, f10, f11, true));
    }

    public static final r n(r rVar, float f10, float f11, float f12, float f13) {
        return rVar.then(new SizeElement(f10, f11, f12, f13, true));
    }

    public static final r o(r rVar, float f10) {
        return rVar.then(new SizeElement(f10, 0.0f, f10, 0.0f, true, 10));
    }

    public static r p(r rVar, float f10, float f11, int i10) {
        return rVar.then(new SizeElement((i10 & 1) != 0 ? Float.NaN : f10, 0.0f, (i10 & 2) != 0 ? Float.NaN : f11, 0.0f, true, 10));
    }

    public static r q(r rVar, p067g0.d dVar, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        h hVar = p067g0.b.k;
        p067g0.d dVar2 = i11 != 0 ? hVar : dVar;
        if (dVar2.equals(hVar)) {
            wrapContentElement = f14721f;
        } else {
            wrapContentElement = dVar2.equals(p067g0.b.f19947j) ? f14722g : new WrapContentElement(I.Vertical, false, new C0152j(dVar2, 2), dVar2, "wrapContentHeight");
        }
        return rVar.then(wrapContentElement);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static r r(r rVar, int i10) {
        WrapContentElement wrapContentElement;
        i iVar = p067g0.b.f19942e;
        if (iVar.equals(iVar)) {
            wrapContentElement = f14723h;
        } else {
            wrapContentElement = iVar.equals(p067g0.b.f19938a) ? f14724i : new WrapContentElement(I.Both, false, new C0152j(iVar, 3), iVar, "wrapContentSize");
        }
        return rVar.then(wrapContentElement);
    }

    public static r s(r rVar, p067g0.c cVar, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        g gVar = p067g0.b.f19950n;
        p067g0.c cVar2 = i11 != 0 ? gVar : cVar;
        boolean z10 = (i10 & 2) == 0;
        if (!cVar2.equals(gVar) || z10) {
            wrapContentElement = (!cVar2.equals(p067g0.b.f19949m) || z10) ? new WrapContentElement(I.Horizontal, z10, new C0152j(cVar2, 4), cVar2, "wrapContentWidth") : f14720e;
        } else {
            wrapContentElement = f14719d;
        }
        return rVar.then(wrapContentElement);
    }
}
