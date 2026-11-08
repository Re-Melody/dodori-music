package p143n0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.m;
import p133m0.d;

/* JADX INFO: renamed from: n0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2083j implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f22776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f22777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f22778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f22779d;

    public C2083j(Path path) {
        this.f22776a = path;
    }

    public final d c() {
        if (this.f22777b == null) {
            this.f22777b = new RectF();
        }
        RectF rectF = this.f22777b;
        m.c(rectF);
        this.f22776a.computeBounds(rectF, true);
        return new d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void d(float f10, float f11) {
        this.f22776a.lineTo(f10, f11);
    }

    public final boolean e(U u10, U u11, int i10) {
        Path.Op op;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(u10 instanceof C2083j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C2083j) u10).f22776a;
        if (u11 instanceof C2083j) {
            return this.f22776a.op(path, ((C2083j) u11).f22776a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void f() {
        this.f22776a.reset();
    }
}
