package p226v6;

import B2.AbstractC0112b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10) {
        String strY;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = p237w6.a.f28046a;
        Integer numValueOf2 = Integer.valueOf(i10);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = p237w6.a.f28047b;
            if (map2.containsKey(numValueOf2)) {
                strY = AbstractC0112b.y((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf2), ")");
            } else {
                strY = "";
            }
        } else {
            strY = "";
        }
        super(new Status(i10, String.format(locale, "Install Error(%d): %s", numValueOf, strY), null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
