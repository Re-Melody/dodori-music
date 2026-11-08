package A9;

/* JADX INFO: loaded from: classes2.dex */
public enum J {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public final char begin;
    public final char end;

    J(char c3, char c9) {
        this.begin = c3;
        this.end = c9;
    }
}
