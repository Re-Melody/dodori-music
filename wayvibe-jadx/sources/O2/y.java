package O2;

import B2.AbstractC0112b;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9156c;

    public y(String str, boolean z10, boolean z11) {
        this.f9154a = str;
        this.f9155b = z10;
        this.f9156c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == y.class) {
            y yVar = (y) obj;
            if (TextUtils.equals(this.f9154a, yVar.f9154a) && this.f9155b == yVar.f9155b && this.f9156c == yVar.f9156c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0112b.a(31, 31, this.f9154a) + (this.f9155b ? 1231 : 1237)) * 31) + (this.f9156c ? 1231 : 1237);
    }
}
