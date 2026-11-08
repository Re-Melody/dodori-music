package p167p4;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f25215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25216b;

    public b(Bitmap bitmap, Map map) {
        this.f25215a = bitmap;
        this.f25216b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.b(this.f25215a, bVar.f25215a) && m.b(this.f25216b, bVar.f25216b);
    }

    public final int hashCode() {
        return this.f25216b.hashCode() + (this.f25215a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.f25215a);
        sb.append(", extras=");
        return p134m1.b.n(sb, this.f25216b, ')');
    }
}
