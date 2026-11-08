package P0;

import H2.AbstractC0533c;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(AbstractC0533c.d().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
