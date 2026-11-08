package W6;

import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public class i extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        E.f(str, "Detail message must not be empty");
    }
}
