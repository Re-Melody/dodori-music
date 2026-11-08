package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p045d8.C1929a;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1929a f20725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f20726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f20727g;

    public j(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar = this.f20726f;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f20726f.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f20727g;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f20726f;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f20726f;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20725e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.f20723c;
            this.f20721a = i10;
            int i11 = this.f20724d;
            this.f20722b = i11;
            matrix.postTranslate(i10, i11);
        } else if (action != 2) {
            matrix.postTranslate(this.f20723c, this.f20724d);
        } else {
            matrix.postTranslate(this.f20721a, this.f20722b);
            this.f20721a = this.f20723c;
            this.f20722b = this.f20724d;
        }
        this.f20725e.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f20723c = layoutParams.leftMargin;
        this.f20724d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f20727g) != null) {
            this.f20727g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f20727g == null) {
            i iVar2 = new i(this, onFocusChangeListener);
            this.f20727g = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }

    public void setTouchProcessor(C1929a c1929a) {
        this.f20725e = c1929a;
    }
}
