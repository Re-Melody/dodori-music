package Z2;

import L3.I;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13476a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f13477b;

    public H(I i10) {
        ArrayList arrayList = i10.f7686a;
        this.f13477b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String toString() {
        switch (this.f13476a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String[] strArr = this.f13477b;
                int length = strArr.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    String str = null;
                    sb.append((i11 < 0 || i11 >= strArr.length) ? null : strArr[i11]);
                    sb.append(": ");
                    int i12 = i11 + 1;
                    if (i12 >= 0 && i12 < strArr.length) {
                        str = strArr[i12];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public H(String[] strArr) {
        this.f13477b = strArr;
    }
}
