package p185r4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f25901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f25902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f25903c;

    public e(Drawable drawable, i iVar, Throwable th) {
        this.f25901a = drawable;
        this.f25902b = iVar;
        this.f25903c = th;
    }

    @Override // p185r4.j
    public final Drawable a() {
        return this.f25901a;
    }

    @Override // p185r4.j
    public final i b() {
        return this.f25902b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (m.b(this.f25901a, eVar.f25901a)) {
            return m.b(this.f25902b, eVar.f25902b) && m.b(this.f25903c, eVar.f25903c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f25901a;
        return this.f25903c.hashCode() + ((this.f25902b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
