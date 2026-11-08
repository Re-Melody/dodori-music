package p223v2;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27498c;

    public w(String str, int i10, int i11) {
        this.f27496a = str;
        this.f27497b = i10;
        this.f27498c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        int i10 = this.f27498c;
        String str = this.f27496a;
        int i11 = this.f27497b;
        if (i11 < 0 || wVar.f27497b < 0) {
            return TextUtils.equals(str, wVar.f27496a) && i10 == wVar.f27498c;
        }
        return TextUtils.equals(str, wVar.f27496a) && i11 == wVar.f27497b && i10 == wVar.f27498c;
    }

    public final int hashCode() {
        return Objects.hash(this.f27496a, Integer.valueOf(this.f27498c));
    }
}
