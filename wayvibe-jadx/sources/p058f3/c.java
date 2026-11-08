package p058f3;

import B2.u;
import D8.AbstractC0311s0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0311s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f19764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f19765d;

    public static Serializable n(int i10, u uVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(uVar.n()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(uVar.t() == 1);
        }
        if (i10 == 2) {
            return p(uVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return o(uVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(uVar.n()));
                uVar.G(2);
                return date;
            }
            int iX = uVar.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i11 = 0; i11 < iX; i11++) {
                Serializable serializableN = n(uVar.t(), uVar);
                if (serializableN != null) {
                    arrayList.add(serializableN);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strP = p(uVar);
            int iT = uVar.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableN2 = n(iT, uVar);
            if (serializableN2 != null) {
                map.put(strP, serializableN2);
            }
        }
    }

    public static HashMap o(u uVar) {
        int iX = uVar.x();
        HashMap map = new HashMap(iX);
        for (int i10 = 0; i10 < iX; i10++) {
            String strP = p(uVar);
            Serializable serializableN = n(uVar.t(), uVar);
            if (serializableN != null) {
                map.put(strP, serializableN);
            }
        }
        return map;
    }

    public static String p(u uVar) {
        int iZ = uVar.z();
        int i10 = uVar.f631b;
        uVar.G(iZ);
        return new String(uVar.f630a, i10, iZ);
    }
}
