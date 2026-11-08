package p185r4;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    b(boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    public final boolean f() {
        return this.readEnabled;
    }

    public final boolean g() {
        return this.writeEnabled;
    }
}
