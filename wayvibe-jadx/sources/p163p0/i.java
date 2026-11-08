package p163p0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25155d;

    public i(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f25152a = f10;
        this.f25153b = f11;
        this.f25154c = i10;
        this.f25155d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f25152a == iVar.f25152a && this.f25153b == iVar.f25153b) {
            if (this.f25154c == iVar.f25154c) {
                if (this.f25155d == iVar.f25155d) {
                    iVar.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return b.c(this.f25155d, b.c(this.f25154c, b.b(this.f25153b, Float.hashCode(this.f25152a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f25152a);
        sb.append(", miter=");
        sb.append(this.f25153b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i10 = this.f25154c;
        if (i10 == 0) {
            str = "Butt";
        } else if (i10 == 1) {
            str = "Round";
        } else {
            str = i10 == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i11 = this.f25155d;
        if (i11 == 0) {
            str2 = "Miter";
        } else if (i11 == 1) {
            str2 = "Round";
        } else if (i11 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
