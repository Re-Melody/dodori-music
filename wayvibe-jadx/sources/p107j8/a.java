package p107j8;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.i;
import java.util.Iterator;
import p045d8.C1929a;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1929a f21526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f21527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f21528g;

    public a(Activity activity, float f10, C1929a c1929a) {
        super(activity, null);
        this.f21523b = f10;
        this.f21526e = c1929a;
        this.f21527f = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f21522a.getFinalMatrix());
        float f10 = this.f21523b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f21524c, -this.f21525d);
        return matrix;
    }

    public final void a() {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (iVar = this.f21528g) == null) {
            return;
        }
        this.f21528g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f21522a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f21524c, -this.f21525d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f21522a.getFinalOpacity() * 255.0f);
        Paint paint = this.f21527f;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f21522a.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1929a c1929a = this.f21526e;
        if (c1929a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        c1929a.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f21528g == null) {
            i iVar = new i(onFocusChangeListener, this);
            this.f21528g = iVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(iVar);
        }
    }
}
