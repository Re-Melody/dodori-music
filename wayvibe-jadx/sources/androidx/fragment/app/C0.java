package androidx.fragment.app;

import android.util.Log;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f15189b = new StringBuilder(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15188a = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.f15189b;
        if (sb.length() > 0) {
            Log.d(this.f15188a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c3 = cArr[i10 + i12];
            if (c3 == '\n') {
                b();
            } else {
                this.f15189b.append(c3);
            }
        }
    }
}
