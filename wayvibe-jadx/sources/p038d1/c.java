package p038d1;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f19050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f19051b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f19050a = fArr;
        this.f19051b = fArr2;
    }

    @Override // p038d1.a
    public final float a(float f10) {
        return K8.c.o(f10, this.f19051b, this.f19050a);
    }

    @Override // p038d1.a
    public final float b(float f10) {
        return K8.c.o(f10, this.f19050a, this.f19051b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f19050a, cVar.f19050a) && Arrays.equals(this.f19051b, cVar.f19051b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19051b) + (Arrays.hashCode(this.f19050a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f19050a);
        m.e(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f19051b);
        m.e(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
