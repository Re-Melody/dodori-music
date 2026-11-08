package p267z6;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements k {
    public abstract boolean a(char c3);

    @Override // p267z6.k
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
