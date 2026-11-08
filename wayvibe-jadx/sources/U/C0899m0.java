package U;

import B2.AbstractC0112b;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import p230w.InterfaceC2286t;

/* JADX INFO: renamed from: U.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0899m0 implements InterfaceC2286t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f11887a;

    public C0899m0(int i10) {
        switch (i10) {
            case 1:
                this.f11887a = new ArrayList();
                break;
            case 2:
                this.f11887a = new ArrayList();
                break;
            default:
                this.f11887a = new ArrayList();
                break;
        }
    }

    public void a(int i10) {
        ArrayList arrayList = this.f11887a;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i10 || ((Number) p134m1.b.i(1, arrayList)).intValue() == i10)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i10));
            while (size > 0) {
                int i11 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) arrayList.get(i11)).intValue();
                if (i10 <= iIntValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(iIntValue));
                size = i11;
            }
            arrayList.set(size, Integer.valueOf(i10));
        }
    }

    public LatLngBounds b() {
        ArrayList<LatLng> latLngs = this.f11887a;
        if (latLngs.size() < 2) {
            throw new B8.V(AbstractC0112b.d(latLngs.size(), "Cannot create a LatLngBounds from ", " items"));
        }
        LatLngBounds.Companion.getClass();
        kotlin.jvm.internal.m.f(latLngs, "latLngs");
        double dMin = 90.0d;
        double dMin2 = Double.MAX_VALUE;
        double dMax = -90.0d;
        double dMax2 = -1.7976931348623157E308d;
        for (LatLng latLng : latLngs) {
            double dG = latLng.g();
            double dK = latLng.k();
            dMin = Math.min(dMin, dG);
            dMin2 = Math.min(dMin2, dK);
            dMax = Math.max(dMax, dG);
            dMax2 = Math.max(dMax2, dK);
        }
        return new LatLngBounds(dMax, dMax2, dMin, dMin2);
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11887a;
            if (i10 >= arrayList.size()) {
                return sb.toString();
            }
            if (i10 != 0) {
                sb.append('\n');
            }
            sb.append(((p014aa.c) arrayList.get(i10)).f14311a);
            i10++;
        }
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11887a.iterator();
        while (it.hasNext()) {
            Z9.w wVar = ((p014aa.c) it.next()).f14312b;
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public void e(LatLng latLng) {
        kotlin.jvm.internal.m.f(latLng, "latLng");
        this.f11887a.add(latLng);
    }

    public int f() {
        int iIntValue;
        ArrayList arrayList = this.f11887a;
        if (arrayList.size() <= 0) {
            C0880d.w("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == iIntValue2) {
            arrayList.set(0, N8.n.I0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) arrayList.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) arrayList.get(i12)).intValue();
                if (i11 < size && (iIntValue = ((Number) arrayList.get(i11)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    arrayList.set(i10, Integer.valueOf(iIntValue));
                    arrayList.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    arrayList.set(i10, Integer.valueOf(iIntValue4));
                    arrayList.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    @Override // p230w.InterfaceC2286t
    public p230w.D get(int i10) {
        return (p230w.E) this.f11887a.get(i10);
    }
}
