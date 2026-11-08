package p152o;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: o.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2132f0 extends C2130e0 {
    @Override // p152o.C2130e0, p152o.AbstractC2134g0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p152o.AbstractC2134g0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
