package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f20777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20778b;

    public r(Context context) {
        super(context);
        this.f20777a = new Rect();
        this.f20778b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f20777a.set(i10, i11, i12, i13);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f20777a, layoutParams.x, layoutParams.y, this.f20778b);
            Rect rect = this.f20778b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), MediaPlayerException.ERROR_UNKNOWN), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), MediaPlayerException.ERROR_UNKNOWN));
        }
        super.onMeasure(i10, i11);
    }
}
