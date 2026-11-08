package B8;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        W w10 = (W) obj2;
        ((E8.k) ((W) obj)).getClass();
        int i11 = 3;
        try {
            Class.forName("android.app.Application", false, E8.k.class.getClassLoader());
            i10 = 8;
        } catch (Exception unused) {
            i10 = 3;
        }
        ((E8.k) w10).getClass();
        try {
            Class.forName("android.app.Application", false, E8.k.class.getClassLoader());
            i11 = 8;
        } catch (Exception unused2) {
        }
        return i10 - i11;
    }
}
