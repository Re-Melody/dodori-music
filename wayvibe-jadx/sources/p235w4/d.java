package p235w4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27913a;

    public d(int i10, Exception exc) {
        super(null, exc);
        this.f27913a = i10;
    }

    public static d a(Exception exc) {
        return new d(1, exc);
    }
}
