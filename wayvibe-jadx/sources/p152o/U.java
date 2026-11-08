package p152o;

import A1.b;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p094i6.c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f23279j;
    public final /* synthetic */ Y k;

    public U(Y y6, int i10, int i11, WeakReference weakReference) {
        this.k = y6;
        this.f23277h = i10;
        this.f23278i = i11;
        this.f23279j = weakReference;
    }

    @Override // A1.b
    public final void i(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f23277h) != -1) {
            typeface = X.a(typeface, i10, (this.f23278i & 2) != 0);
        }
        Y y6 = this.k;
        if (y6.f23297m) {
            y6.f23296l = typeface;
            TextView textView = (TextView) this.f23279j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new c(textView, typeface, y6.f23295j));
                } else {
                    textView.setTypeface(typeface, y6.f23295j);
                }
            }
        }
    }

    @Override // A1.b
    public final void h(int i10) {
    }
}
