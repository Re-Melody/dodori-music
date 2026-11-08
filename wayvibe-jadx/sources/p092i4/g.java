package p092i4;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20497b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f20496a = bitmapDrawable;
        this.f20497b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20496a.equals(gVar.f20496a) && this.f20497b == gVar.f20497b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20497b) + (this.f20496a.hashCode() * 31);
    }
}
