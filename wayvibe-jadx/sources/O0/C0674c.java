package O0;

import B2.AbstractC0112b;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: O0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8910d;

    public C0674c(int i10, int i11, Object obj, String str) {
        this.f8907a = obj;
        this.f8908b = i10;
        this.f8909c = i11;
        this.f8910d = str;
    }

    public final C0676e a(int i10) {
        int i11 = this.f8909c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C0676e(this.f8908b, i10, this.f8907a, this.f8910d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0674c)) {
            return false;
        }
        C0674c c0674c = (C0674c) obj;
        return kotlin.jvm.internal.m.b(this.f8907a, c0674c.f8907a) && this.f8908b == c0674c.f8908b && this.f8909c == c0674c.f8909c && kotlin.jvm.internal.m.b(this.f8910d, c0674c.f8910d);
    }

    public final int hashCode() {
        Object obj = this.f8907a;
        return this.f8910d.hashCode() + p134m1.b.c(this.f8909c, p134m1.b.c(this.f8908b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f8907a);
        sb.append(", start=");
        sb.append(this.f8908b);
        sb.append(", end=");
        sb.append(this.f8909c);
        sb.append(", tag=");
        return AbstractC0112b.j(sb, this.f8910d, ')');
    }

    public /* synthetic */ C0674c(Object obj, int i10, int i11, int i12) {
        this(i10, (i12 & 4) != 0 ? MediaPlayerException.ERROR_UNKNOWN : i11, obj, "");
    }
}
