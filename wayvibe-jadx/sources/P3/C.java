package P3;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class C extends B {
    @Override // Q5.b
    public final void Q(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // P3.B, Q5.b
    public final void R(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // P3.B
    public final void a0(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // P3.B
    public final void b0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // P3.B
    public final void c0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // Q5.b
    public final float w(View view) {
        return view.getTransitionAlpha();
    }
}
