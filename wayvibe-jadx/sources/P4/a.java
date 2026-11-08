package P4;

import B2.t;
import D7.p1;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N4.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f9630l;

    public a(List list) {
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f9630l = new j(((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR), (bArr[3] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    @Override // N4.b
    public final N4.d a(byte[] bArr, int i10, int i11, boolean z10) {
        i iVar;
        List list;
        float f10;
        float f11;
        char c3;
        char c9;
        char c10;
        int i12;
        b bVar;
        int i13;
        boolean z11;
        g gVar;
        int iK;
        int iK2;
        int iK3;
        int iK4;
        j jVar = this.f9630l;
        if (z10) {
            i iVar2 = jVar.f9679f;
            iVar2.f9664c.clear();
            iVar2.f9665d.clear();
            iVar2.f9666e.clear();
            iVar2.f9667f.clear();
            iVar2.f9668g.clear();
            iVar2.f9669h = null;
            iVar2.f9670i = null;
        }
        jVar.getClass();
        t tVar = new t(bArr, i11, 2, (byte) 0);
        while (true) {
            int iA = tVar.a();
            boolean z12 = true;
            iVar = jVar.f9679f;
            if (iA >= 48 && tVar.k(8) == 15) {
                int iK5 = tVar.k(8);
                int i14 = 16;
                int iK6 = tVar.k(16);
                int iK7 = tVar.k(16);
                X4.a.q(tVar.f625d == 0);
                int i15 = tVar.f624c + iK7;
                if (iK7 * 8 > tVar.a()) {
                    tVar.f(tVar.a());
                } else {
                    switch (iK5) {
                        case 16:
                            if (iK6 != iVar.f9662a) {
                                z11 = true;
                            } else {
                                e eVar = (e) iVar.f9670i;
                                tVar.k(8);
                                int iK8 = tVar.k(4);
                                int iK9 = tVar.k(2);
                                tVar.f(2);
                                int i16 = iK7 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i16 > 0) {
                                    int iK10 = tVar.k(8);
                                    tVar.f(8);
                                    i16 -= 6;
                                    sparseArray.put(iK10, new f(tVar.k(16), tVar.k(16)));
                                    z12 = z12;
                                }
                                z11 = z12;
                                e eVar2 = new e(iK8, iK9, sparseArray);
                                if (iK9 != 0) {
                                    iVar.f9670i = eVar2;
                                    iVar.f9664c.clear();
                                    iVar.f9665d.clear();
                                    iVar.f9666e.clear();
                                } else if (eVar != null && eVar.f9645a != iK8) {
                                    iVar.f9670i = eVar2;
                                }
                            }
                            break;
                        case 17:
                            e eVar3 = (e) iVar.f9670i;
                            if (iK6 == iVar.f9662a && eVar3 != null) {
                                int iK11 = tVar.k(8);
                                tVar.f(4);
                                boolean zQ = tVar.q();
                                tVar.f(3);
                                int iK12 = tVar.k(16);
                                int iK13 = tVar.k(16);
                                tVar.k(3);
                                int iK14 = tVar.k(3);
                                tVar.f(2);
                                int iK15 = tVar.k(8);
                                int iK16 = tVar.k(8);
                                int iK17 = tVar.k(4);
                                int iK18 = tVar.k(2);
                                tVar.f(2);
                                int i17 = iK7 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i17 > 0) {
                                    int iK19 = tVar.k(i14);
                                    int iK20 = tVar.k(2);
                                    tVar.k(2);
                                    int iK21 = tVar.k(12);
                                    tVar.f(4);
                                    int iK22 = tVar.k(12);
                                    int i18 = i17 - 6;
                                    if (iK20 == 1 || iK20 == 2) {
                                        tVar.k(8);
                                        tVar.k(8);
                                        i17 -= 8;
                                    } else {
                                        i17 = i18;
                                    }
                                    sparseArray2.put(iK19, new h(iK21, iK22));
                                    i14 = 16;
                                }
                                g gVar2 = new g(iK11, zQ, iK12, iK13, iK14, iK15, iK16, iK17, iK18, sparseArray2);
                                SparseArray sparseArray3 = iVar.f9664c;
                                if (eVar3.f9646b == 0 && (gVar = (g) sparseArray3.get(iK11)) != null) {
                                    int i19 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = gVar.f9659j;
                                        if (i19 < sparseArray4.size()) {
                                            gVar2.f9659j.put(sparseArray4.keyAt(i19), sparseArray4.valueAt(i19));
                                            i19++;
                                        }
                                    }
                                }
                                sparseArray3.put(gVar2.f9650a, gVar2);
                            }
                            z11 = true;
                            break;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            if (iK6 == iVar.f9662a) {
                                b bVarE = j.e(tVar, iK7);
                                iVar.f9665d.put(bVarE.f9631a, bVarE);
                            } else if (iK6 == iVar.f9663b) {
                                b bVarE2 = j.e(tVar, iK7);
                                iVar.f9667f.put(bVarE2.f9631a, bVarE2);
                            }
                            z11 = true;
                            break;
                        case 19:
                            if (iK6 == iVar.f9662a) {
                                d dVarD = j.d(tVar);
                                iVar.f9666e.put(dVarD.f9641a, dVarD);
                            } else if (iK6 == iVar.f9663b) {
                                d dVarD2 = j.d(tVar);
                                iVar.f9668g.put(dVarD2.f9641a, dVarD2);
                            }
                            z11 = true;
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            if (iK6 == iVar.f9662a) {
                                tVar.f(4);
                                boolean zQ2 = tVar.q();
                                tVar.f(3);
                                int iK23 = tVar.k(16);
                                int iK24 = tVar.k(16);
                                if (zQ2) {
                                    iK3 = tVar.k(16);
                                    iK = tVar.k(16);
                                    iK4 = tVar.k(16);
                                    iK2 = tVar.k(16);
                                } else {
                                    iK = iK23;
                                    iK2 = iK24;
                                    iK3 = 0;
                                    iK4 = 0;
                                }
                                iVar.f9669h = new c(iK23, iK24, iK3, iK, iK4, iK2);
                            }
                            z11 = true;
                            break;
                        default:
                            z11 = true;
                            break;
                    }
                    X4.a.q(tVar.f625d == 0 ? z11 : false);
                    int i20 = i15 - tVar.f624c;
                    X4.a.q(tVar.f625d == 0 ? z11 : false);
                    tVar.f624c += i20;
                    tVar.s();
                }
            }
        }
        if (((e) iVar.f9670i) == null) {
            list = Collections.EMPTY_LIST;
        } else {
            c cVar = (c) iVar.f9669h;
            if (cVar == null) {
                cVar = jVar.f9677d;
            }
            Bitmap bitmap = jVar.f9680g;
            Canvas canvas = jVar.f9676c;
            if (bitmap == null || cVar.f9635a + 1 != bitmap.getWidth() || cVar.f9636b + 1 != jVar.f9680g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.f9635a + 1, cVar.f9636b + 1, Bitmap.Config.ARGB_8888);
                jVar.f9680g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = ((e) iVar.f9670i).f9647c;
            int i21 = 0;
            while (i21 < sparseArray5.size()) {
                f fVar = (f) sparseArray5.valueAt(i21);
                g gVar3 = (g) iVar.f9664c.get(sparseArray5.keyAt(i21));
                int i22 = fVar.f9648a + cVar.f9637c;
                int i23 = fVar.f9649b + cVar.f9639e;
                int iMin = Math.min(gVar3.f9652c + i22, cVar.f9638d);
                int i24 = gVar3.f9653d;
                int i25 = i23 + i24;
                float f12 = i22;
                float f13 = i23;
                canvas.clipRect(f12, f13, iMin, Math.min(i25, cVar.f9640f), Region.Op.REPLACE);
                SparseArray sparseArray6 = iVar.f9665d;
                int i26 = gVar3.f9655f;
                b bVar2 = (b) sparseArray6.get(i26);
                if (bVar2 == null && (bVar2 = (b) iVar.f9667f.get(i26)) == null) {
                    bVar2 = jVar.f9678e;
                }
                int i27 = 0;
                while (true) {
                    SparseArray sparseArray7 = gVar3.f9659j;
                    SparseArray sparseArray8 = sparseArray5;
                    if (i27 < sparseArray7.size()) {
                        int iKeyAt = sparseArray7.keyAt(i27);
                        h hVar = (h) sparseArray7.valueAt(i27);
                        int i28 = i21;
                        d dVar = (d) iVar.f9666e.get(iKeyAt);
                        if (dVar == null) {
                            dVar = (d) iVar.f9668g.get(iKeyAt);
                        }
                        if (dVar != null) {
                            Paint paint = dVar.f9642b ? null : jVar.f9674a;
                            int i29 = hVar.f9660a + i22;
                            int i30 = i23 + hVar.f9661b;
                            int i31 = i27;
                            int i32 = gVar3.f9654e;
                            i13 = i31;
                            Canvas canvas2 = canvas;
                            b bVar3 = bVar2;
                            int[] iArr = i32 == 3 ? bVar2.f9634d : i32 == 2 ? bVar2.f9633c : bVar2.f9632b;
                            bVar = bVar3;
                            j.b(dVar.f9643c, iArr, i32, i29, i30, paint, canvas2);
                            j.b(dVar.f9644d, iArr, i32, i29, i30 + 1, paint, canvas2);
                            canvas = canvas2;
                        } else {
                            bVar = bVar2;
                            i13 = i27;
                        }
                        i27 = i13 + 1;
                        bVar2 = bVar;
                        sparseArray5 = sparseArray8;
                        i21 = i28;
                    } else {
                        int i33 = i21;
                        b bVar4 = bVar2;
                        boolean z13 = gVar3.f9651b;
                        int i34 = gVar3.f9652c;
                        if (z13) {
                            int i35 = gVar3.f9654e;
                            if (i35 == 3) {
                                i12 = bVar4.f9634d[gVar3.f9656g];
                                c10 = 2;
                            } else {
                                c10 = 2;
                                i12 = i35 == 2 ? bVar4.f9633c[gVar3.f9657h] : bVar4.f9632b[gVar3.f9658i];
                            }
                            Paint paint2 = jVar.f9675b;
                            paint2.setColor(i12);
                            c3 = c10;
                            c9 = 3;
                            f10 = f12;
                            f11 = f13;
                            canvas.drawRect(f10, f11, i22 + i34, i25, paint2);
                        } else {
                            f10 = f12;
                            f11 = f13;
                            c3 = 2;
                            c9 = 3;
                        }
                        Bitmap.createBitmap(jVar.f9680g, i22, i23, i34, i24);
                        arrayList.add(new N4.a(null, f11 / cVar.f9636b, f10 / cVar.f9635a, null));
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        i21 = i33 + 1;
                        sparseArray5 = sparseArray8;
                    }
                }
            }
            list = arrayList;
        }
        return new k(list);
    }
}
