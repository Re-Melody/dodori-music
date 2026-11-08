package p126l4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.m;
import p092i4.f;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f21954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f21956c;

    public e(Drawable drawable, boolean z10, f fVar) {
        this.f21954a = drawable;
        this.f21955b = z10;
        this.f21956c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.b(this.f21954a, eVar.f21954a) && this.f21955b == eVar.f21955b && this.f21956c == eVar.f21956c;
    }

    public final int hashCode() {
        return this.f21956c.hashCode() + b.f(this.f21954a.hashCode() * 31, 31, this.f21955b);
    }
}
