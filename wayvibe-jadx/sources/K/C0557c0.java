package K;

/* JADX INFO: renamed from: K.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6951b;

    public C0557c0(int i10, int i11) {
        int i12 = (i11 & 4) != 0 ? 0 : 6;
        i10 = (i11 & 8) != 0 ? -1 : i10;
        this.f6950a = i12;
        this.f6951b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0557c0)) {
            return false;
        }
        C0557c0 c0557c0 = (C0557c0) obj;
        c0557c0.getClass();
        return this.f6950a == c0557c0.f6950a && this.f6951b == c0557c0.f6951b;
    }

    public final int hashCode() {
        return p134m1.b.c(this.f6951b, p134m1.b.c(this.f6950a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) V0.m.a(this.f6950a)) + ", imeAction=" + ((Object) V0.k.a(this.f6951b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
