package E4;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3126b;

    public e(String str, boolean z10) {
        this.f3125a = str;
        this.f3126b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e.class) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f3125a, eVar.f3125a) && this.f3126b == eVar.f3126b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3125a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f3126b ? 1231 : 1237);
    }
}
