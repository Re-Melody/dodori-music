package p152o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: o.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2130e0 extends AbstractC2134g0 {
    @Override // p152o.AbstractC2134g0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C2136h0.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
