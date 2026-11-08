package O0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f8965b = new v(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8966a;

    public v() {
        this.f8966a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f8966a == ((v) obj).f8966a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f8966a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f8966a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public v(boolean z10) {
        this.f8966a = z10;
    }
}
