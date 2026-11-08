package p061f6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f19837a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f19838b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19839c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        float[] fArr = this.f19837a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f19838b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = b.a(f11, f12, f10, f12);
        }
        Matrix matrix = this.f19839c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
