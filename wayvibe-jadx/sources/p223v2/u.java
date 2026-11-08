package p223v2;

import android.os.Build;
import android.text.TextUtils;
import io.flutter.view.b;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f27495a;

    public u(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f27495a = new w(str, i10, i11);
            return;
        }
        v vVar = new v(str, i10, i11);
        b.c(i10, i11, str);
        this.f27495a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.f27495a.equals(((u) obj).f27495a);
    }

    public final int hashCode() {
        return this.f27495a.hashCode();
    }
}
