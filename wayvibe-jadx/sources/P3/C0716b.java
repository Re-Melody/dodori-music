package P3;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: P3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9553a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9554b;

    public /* synthetic */ C0716b(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f9553a) {
            case 0:
                Rect rect = (Rect) this.f9554b;
                ((Drawable) obj).copyBounds(rect);
                return new PointF(rect.left, rect.top);
            default:
                Matrix matrix = (Matrix) this.f9554b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f9553a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) this.f9554b;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    public C0716b() {
        super(Matrix.class, "imageMatrixProperty");
        this.f9554b = new Matrix();
    }
}
