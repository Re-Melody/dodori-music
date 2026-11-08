package p140m7;

/* JADX INFO: loaded from: classes.dex */
public enum C {
    ASCENDING(1),
    DESCENDING(-1);

    private final int comparisonModifier;

    C(int i10) {
        this.comparisonModifier = i10;
    }

    public final int f() {
        return this.comparisonModifier;
    }
}
