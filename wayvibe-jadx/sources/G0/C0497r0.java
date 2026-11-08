package G0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: G0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497r0 implements InterfaceC0496q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f5283a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5284b = new int[2];

    @Override // G0.InterfaceC0496q0
    public void i(View view, float[] fArr) {
        Matrix matrix = this.f5283a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f5284b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        p143n0.W.y(matrix, fArr);
    }
}
