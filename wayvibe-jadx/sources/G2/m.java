package G2;

import B2.AbstractC0111a;
import B2.C;
import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5426c;

    static {
        if (C.f560a < 31) {
            new m("");
        } else {
            new m(l.f5422b, "");
        }
    }

    public m(String str) {
        AbstractC0111a.h(C.f560a < 31);
        this.f5424a = str;
        this.f5425b = null;
        this.f5426c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f5424a, mVar.f5424a) && Objects.equals(this.f5425b, mVar.f5425b) && Objects.equals(this.f5426c, mVar.f5426c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5424a, this.f5425b, this.f5426c);
    }

    public m(LogSessionId logSessionId, String str) {
        this(new l(logSessionId), str);
    }

    public m(l lVar, String str) {
        this.f5425b = lVar;
        this.f5424a = str;
        this.f5426c = new Object();
    }
}
