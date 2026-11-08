package P3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class B extends Q5.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f9532f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f9533g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f9534h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9535i = true;

    @Override // Q5.b
    public void R(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.R(view, i10);
        } else if (f9535i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f9535i = false;
            }
        }
    }

    public void a0(View view, int i10, int i11, int i12, int i13) {
        if (f9534h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f9534h = false;
            }
        }
    }

    public void b0(View view, Matrix matrix) {
        if (f9532f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f9532f = false;
            }
        }
    }

    public void c0(View view, Matrix matrix) {
        if (f9533g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f9533g = false;
            }
        }
    }
}
