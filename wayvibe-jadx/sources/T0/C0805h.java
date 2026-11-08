package T0;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: renamed from: T0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0805h implements InterfaceC0799b, N, O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0805h f11500b = new C0805h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0805h f11501c = new C0805h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11502a;

    public /* synthetic */ C0805h(int i10) {
        this.f11502a = i10;
    }

    public static Typeface d(String str, I i10, int i11) {
        if (i11 == 0 && kotlin.jvm.internal.m.b(i10, I.f11457h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), i10.f11463a, i11 == 1);
    }

    public static Typeface e(String str, I i10, int i11) {
        if (i11 == 0 && kotlin.jvm.internal.m.b(i10, I.f11457h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iV = S9.b.v(i10, i11);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iV) : Typeface.create(str, iV);
    }

    public static Typeface f(String str, I i10, int i11) {
        if (str.length() != 0) {
            Typeface typefaceE = e(str, i10, i11);
            if (!kotlin.jvm.internal.m.b(typefaceE, Typeface.create(Typeface.DEFAULT, S9.b.v(i10, i11))) && !kotlin.jvm.internal.m.b(typefaceE, e(null, i10, i11))) {
                return typefaceE;
            }
        }
        return null;
    }

    @Override // T0.O
    public Typeface a(I i10, int i11) {
        switch (this.f11502a) {
            case 3:
                return d(null, i10, i11);
            default:
                return e(null, i10, i11);
        }
    }

    @Override // T0.InterfaceC0799b
    public Object awaitLoad(Context context, AbstractC0800c abstractC0800c, Q8.d dVar) {
        switch (this.f11502a) {
            case 0:
                throw new UnsupportedOperationException("All preloaded fonts are blocking.");
            default:
                throw new UnsupportedOperationException("All preloaded fonts are optional local.");
        }
    }

    @Override // T0.O
    public Typeface b(K k, I i10, int i11) {
        switch (this.f11502a) {
            case 3:
                return d(k.f11465f, i10, i11);
            default:
                String strConcat = k.f11465f;
                int i12 = i10.f11463a / 100;
                if (i12 >= 0 && i12 < 2) {
                    strConcat = strConcat.concat("-thin");
                } else if (2 <= i12 && i12 < 4) {
                    strConcat = strConcat.concat("-light");
                } else if (i12 != 4) {
                    if (i12 == 5) {
                        strConcat = strConcat.concat("-medium");
                    } else if ((6 > i12 || i12 >= 8) && 8 <= i12 && i12 < 11) {
                        strConcat = strConcat.concat("-black");
                    }
                }
                Typeface typefaceF = f(strConcat, i10, i11);
                return typefaceF == null ? e(k.f11465f, i10, i11) : typefaceF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    @Override // T0.O
    public Typeface c(String str, I i10, int i11, H h10, Context context) {
        Typeface typefaceD;
        Typeface typefaceB;
        switch (this.f11502a) {
            case 3:
                if (str.equals("sans-serif")) {
                    typefaceD = d("sans-serif", i10, i11);
                } else if (str.equals("serif")) {
                    typefaceD = d("serif", i10, i11);
                } else if (str.equals("monospace")) {
                    typefaceD = d("monospace", i10, i11);
                } else if (str.equals("cursive")) {
                    typefaceD = d("cursive", i10, i11);
                } else if (str.length() == 0) {
                    typefaceD = null;
                } else {
                    typefaceD = d(str, i10, i11);
                    if (kotlin.jvm.internal.m.b(typefaceD, V.f11476a.a(Typeface.DEFAULT, i10.f11463a, i11 == 1)) || kotlin.jvm.internal.m.b(typefaceD, d(null, i10, i11))) {
                        typefaceD = null;
                    }
                }
                return p206t6.b.b0(typefaceD, h10, context);
            default:
                if (str.equals("sans-serif")) {
                    typefaceB = b(AbstractC0818v.f11539b, i10, i11);
                } else if (str.equals("serif")) {
                    typefaceB = b(AbstractC0818v.f11540c, i10, i11);
                } else if (str.equals("monospace")) {
                    typefaceB = b(AbstractC0818v.f11541d, i10, i11);
                } else {
                    typefaceB = str.equals("cursive") ? b(AbstractC0818v.f11542e, i10, i11) : f(str, i10, i11);
                }
                return p206t6.b.b0(typefaceB, h10, context);
        }
    }

    @Override // T0.InterfaceC0799b
    public Typeface loadBlocking(Context context, AbstractC0800c abstractC0800c) {
        switch (this.f11502a) {
            case 0:
                C0798a c0798a = abstractC0800c instanceof C0798a ? (C0798a) abstractC0800c : null;
                if (c0798a == null) {
                    return null;
                }
                if (!c0798a.f11487c && c0798a.f11488d == null) {
                    int i10 = Build.VERSION.SDK_INT;
                    AssetManager assetManager = c0798a.f11489e;
                    String str = c0798a.f11490f;
                    c0798a.f11488d = i10 >= 26 ? S.f11473a.a(assetManager, str, context, c0798a.getVariationSettings()) : Typeface.createFromAsset(assetManager, str);
                }
                c0798a.f11487c = true;
                return c0798a.f11488d;
            default:
                r rVar = abstractC0800c instanceof r ? (r) abstractC0800c : null;
                if (rVar != null) {
                    return (Build.VERSION.SDK_INT >= 28 ? new C0805h(3) : new C0805h(4)).c(rVar.f11535a, rVar.f11536b, rVar.f11537c, rVar.getVariationSettings(), context);
                }
                return null;
        }
    }
}
