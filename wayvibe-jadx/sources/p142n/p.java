package p142n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p132m.c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f22685a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f22685a = (CollapsibleActionView) view;
        addView(view);
    }
}
