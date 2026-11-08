package V3;

import B2.AbstractC0112b;
import android.graphics.Rect;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12551d;

    public b(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f12548a = i10;
        this.f12549b = i11;
        this.f12550c = i12;
        this.f12551d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(AbstractC0112b.e("Left must be less than or equal to right, left: ", i10, i12, ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(AbstractC0112b.e("top must be less than or equal to bottom, top: ", i11, i13, ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f12548a, this.f12549b, this.f12550c, this.f12551d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f12548a == bVar.f12548a && this.f12549b == bVar.f12549b && this.f12550c == bVar.f12550c && this.f12551d == bVar.f12551d;
    }

    public final int hashCode() {
        return (((((this.f12548a * 31) + this.f12549b) * 31) + this.f12550c) * 31) + this.f12551d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f12548a);
        sb.append(',');
        sb.append(this.f12549b);
        sb.append(',');
        sb.append(this.f12550c);
        sb.append(',');
        return AbstractC0112b.i(sb, this.f12551d, "] }");
    }
}
