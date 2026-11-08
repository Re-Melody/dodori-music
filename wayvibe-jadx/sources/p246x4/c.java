package p246x4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f28437c = new c(new int[]{2}, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f28438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28439b;

    public c(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f28438a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f28438a = new int[0];
        }
        this.f28439b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f28438a, cVar.f28438a) && this.f28439b == cVar.f28439b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f28438a) * 31) + this.f28439b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f28439b + ", supportedEncodings=" + Arrays.toString(this.f28438a) + "]";
    }
}
