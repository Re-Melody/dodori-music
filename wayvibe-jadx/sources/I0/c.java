package I0;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    private final int id;
    private final int order;

    c(int i10) {
        this.id = i10;
        this.order = i10;
    }

    public final int f() {
        return this.id;
    }

    public final int g() {
        return this.order;
    }
}
