package H9;

import com.google.android.gms.common.api.f;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends b {
    static {
        OpenOption[] openOptionArr = I9.a.f6429a;
    }

    public d() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: H9.c
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                this.f6243a.getClass();
                if (i10 <= Integer.MAX_VALUE) {
                    return i10;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i10), Integer.valueOf(f.API_PRIORITY_OTHER)));
            }
        };
    }
}
