package L1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7470c;

    public a(int i10, f fVar, int i11) {
        this.f7468a = i10;
        this.f7469b = fVar;
        this.f7470c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7468a);
        this.f7469b.f7483a.performAction(this.f7470c, bundle);
    }
}
