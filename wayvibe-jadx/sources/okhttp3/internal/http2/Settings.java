package okhttp3.internal.http2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24510b = new int[10];

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final int a() {
        if ((this.f24509a & 16) != 0) {
            return this.f24510b[4];
        }
        return 65535;
    }

    public final void b(Settings other) {
        m.f(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f24509a) != 0) {
                c(i10, other.f24510b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f24510b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f24509a = (1 << i10) | this.f24509a;
            iArr[i10] = i11;
        }
    }
}
