package p140m7;

/* JADX INFO: renamed from: m7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2052d {
    AND("and"),
    OR("or");

    private final String text;

    EnumC2052d(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.text;
    }
}
