package org.maplibre.android.location;

import T0.C0802e;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.maplibre.android.log.Logger;
import p119k9.InterfaceC2024l;
import p220v.Q;
import p220v.X;
import p230w.C2287u;
import p230w.InterfaceC2286t;
import p241x.AbstractC2315s;
import p261z.C2404h;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements ma.a, p167p4.g, p158o5.b, p216u6.c, InterfaceC2286t, O1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24714a;

    public /* synthetic */ u(Object obj) {
        this.f24714a = obj;
    }

    @Override // O1.c
    public void a(Object obj) {
        AbstractC2315s.d((p250x8.m) this.f24714a, new p250x8.e("Clear Failed", ((P1.a) obj).getMessage()));
    }

    @Override // p167p4.g
    public p167p4.b b(p167p4.a aVar) {
        return null;
    }

    @Override // p167p4.g
    public void c(p167p4.a aVar, Bitmap bitmap, Map map) {
        ((A1.d) this.f24714a).p(aVar, bitmap, map, p046da.b.y(bitmap));
    }

    public void e(String str) {
        C2198e c2198e = (C2198e) this.f24714a;
        p180q8.a aVar = (p180q8.a) c2198e.f24679a;
        p045d8.F f10 = C2198e.f24678c;
        Integer numValueOf = Integer.valueOf(PipesIterator.DEFAULT_QUEUE_SIZE);
        if (f10 == null) {
            p045d8.F f11 = new p045d8.F(3);
            f11.put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
            f11.put("allScroll", 1013);
            f11.put("basic", numValueOf);
            f11.put("cell", 1006);
            f11.put("click", 1002);
            f11.put("contextMenu", 1001);
            f11.put("copy", 1011);
            f11.put("forbidden", 1012);
            f11.put("grab", 1020);
            f11.put("grabbing", 1021);
            f11.put("help", 1003);
            f11.put("move", 1013);
            f11.put("none", 0);
            f11.put("noDrop", 1012);
            f11.put("precise", 1007);
            f11.put("text", 1008);
            f11.put("resizeColumn", 1014);
            f11.put("resizeDown", 1015);
            f11.put("resizeUpLeft", 1016);
            f11.put("resizeDownRight", 1017);
            f11.put("resizeLeft", 1014);
            f11.put("resizeLeftRight", 1014);
            f11.put("resizeRight", 1014);
            f11.put("resizeRow", 1015);
            f11.put("resizeUp", 1015);
            f11.put("resizeUpDown", 1015);
            f11.put("resizeUpLeft", 1017);
            f11.put("resizeUpRight", 1016);
            f11.put("resizeUpLeftDownRight", 1017);
            f11.put("resizeUpRightDownLeft", 1016);
            f11.put("verticalText", 1009);
            f11.put("wait", 1004);
            f11.put("zoomIn", 1018);
            f11.put("zoomOut", 1019);
            C2198e.f24678c = f11;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((p045d8.t) ((p180q8.a) c2198e.f24679a)).getContext(), ((Integer) C2198e.f24678c.getOrDefault(str, numValueOf)).intValue()));
    }

    @Override // ma.a
    public void f(U4.c cVar) {
        w wVar = (w) ((WeakReference) this.f24714a).get();
        if (wVar != null) {
            wVar.p(cVar.d(), false);
        }
    }

    public void g(CancellationException cancellationException) {
        W.d dVar = (W.d) this.f24714a;
        int i10 = dVar.f12758c;
        InterfaceC2024l[] interfaceC2024lArr = new InterfaceC2024l[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC2024lArr[i11] = ((C2404h) dVar.f12756a[i11]).f29587b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC2024lArr[i12].l(cancellationException);
        }
        if (!dVar.l()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    @Override // L8.a
    public Object get() {
        String packageName = ((Context) ((K2.c) this.f24714a).f7355a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void h() {
        W.d dVar = (W.d) this.f24714a;
        int i10 = 0;
        int i11 = new p064f9.g(0, dVar.f12758c - 1, 1).f19893b;
        if (i11 >= 0) {
            while (true) {
                ((C2404h) dVar.f12756a[i10]).f29587b.resumeWith(M8.D.f8402a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        dVar.h();
    }

    @Override // ma.a
    public void onFailure(Exception exc) {
        Logger.e("Mbgl-LocationComponent", "Failed to obtain location update", exc);
    }

    @Override // O1.c
    public void onResult(Object obj) {
        ((p250x8.m) this.f24714a).invoke(new M8.o(M8.D.f8402a));
    }

    @Override // p216u6.c
    public Object zza() {
        return new p206t6.k(((C0802e) ((oa.e) this.f24714a).f23925b).f11496a);
    }

    public u(p028c1.b bVar) {
        this.f24714a = new Q(X.f27347a, bVar);
    }

    @Override // p230w.InterfaceC2286t
    public p230w.D get(int i10) {
        return (p230w.D) this.f24714a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r10
  0x0024: PHI (r10v1 int) = (r10v0 int), (r10v4 int), (r10v5 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public u(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int length = fArr.length - 1;
        C2287u[][] c2287uArr = new C2287u[length][];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 == 0) {
                i10 = i15;
            } else if (i14 == 1) {
                i11 = 1;
                i10 = i11;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        i15 = 4;
                        if (i14 != 4) {
                            i15 = 5;
                            if (i14 != 5) {
                                i10 = i12;
                            } else {
                                i10 = i15;
                            }
                        } else {
                            i10 = i15;
                        }
                    } else {
                        if (i11 != 1) {
                            i11 = 1;
                        }
                        i10 = i11;
                    }
                }
                i11 = 2;
                i10 = i11;
            }
            float[] fArr3 = fArr2[i13];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C2287u[] c2287uArr2 = new C2287u[length2];
            for (int i16 = 0; i16 < length2; i16++) {
                int i17 = i16 * 2;
                float f10 = fArr[i13];
                int i18 = i13 + 1;
                float f11 = fArr[i18];
                float[] fArr4 = fArr2[i13];
                float f12 = fArr4[i17];
                int i19 = i17 + 1;
                float f13 = fArr4[i19];
                float[] fArr5 = fArr2[i18];
                c2287uArr2[i16] = new C2287u(i10, f10, f11, f12, f13, fArr5[i17], fArr5[i19]);
            }
            c2287uArr[i13] = c2287uArr2;
            i13++;
            i12 = i10;
        }
        this.f24714a = c2287uArr;
    }

    public u() {
        this.f24714a = new W.d(new C2404h[16]);
    }

    public u(w wVar) {
        this.f24714a = new WeakReference(wVar);
    }

    @Override // p167p4.g
    public void d(int i10) {
    }
}
