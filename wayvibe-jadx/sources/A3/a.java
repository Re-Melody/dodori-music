package A3;

import B2.AbstractC0111a;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import p224v4.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f224e;

    public static a b(String str) {
        AbstractC0111a.d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), f.f16451a);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strE = i.e(strArrSplit[i14].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i12 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i13 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i12 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        a aVar = new a();
        aVar.f220a = i10;
        aVar.f221b = i11;
        aVar.f222c = i13;
        aVar.f223d = i12;
        aVar.f224e = length;
        return aVar;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f220a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f223d;
            int i16 = this.f221b;
            if (i15 > i16) {
                i12 = 1;
            } else {
                i12 = i15 == i16 ? 2 : 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f223d;
            int i18 = this.f222c;
            if (i17 > i18) {
                i11 = 1;
            } else {
                i11 = i17 == i18 ? 2 : 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f224e;
            int i20 = this.f221b;
            if (i19 > i20) {
                i10 = 1;
            } else {
                i10 = i19 == i20 ? 2 : 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f224e;
            int i22 = this.f222c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
