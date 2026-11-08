package p235w4;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f28035c = new t(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28037b;

    public t(float f10) {
        this.f28036a = f10;
        this.f28037b = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t.class == obj.getClass() && this.f28036a == ((t) obj).f28036a;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.f28036a) + 527) * 31);
    }
}
