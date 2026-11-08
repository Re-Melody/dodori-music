package O1;

import G0.AbstractC0454b;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractC0454b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Bundle data, String str) {
        super(data, str);
        kotlin.jvm.internal.m.f(data, "data");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
