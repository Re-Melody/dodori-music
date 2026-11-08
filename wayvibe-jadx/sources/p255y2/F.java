package p255y2;

import B2.AbstractC0111a;
import B2.C;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f28760d = new F(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28763c;

    static {
        C.D(0);
        C.D(1);
    }

    public F(float f10, float f11) {
        AbstractC0111a.d(f10 > 0.0f);
        AbstractC0111a.d(f11 > 0.0f);
        this.f28761a = f10;
        this.f28762b = f11;
        this.f28763c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f10 = (F) obj;
            if (this.f28761a == f10.f28761a && this.f28762b == f10.f28762b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f28762b) + ((Float.floatToRawIntBits(this.f28761a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f28761a), Float.valueOf(this.f28762b)};
        int i10 = C.f560a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
