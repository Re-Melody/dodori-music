package p152o;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: o.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2134g0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C2136h0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
