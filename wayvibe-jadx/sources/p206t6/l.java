package p206t6;

import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26903a;

    public l(int i10) {
        this.f26903a = i10;
    }

    public static l a(int i10) {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            return new l(i10);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b10 & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f26903a == ((l) obj).f26903a;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f26903a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return AbstractC0112b.i(new StringBuilder("AppUpdateOptions{appUpdateType="), this.f26903a, ", allowAssetPackDeletion=false}");
    }
}
