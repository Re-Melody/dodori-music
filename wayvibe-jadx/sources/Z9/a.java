package Z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends r {
    @Override // Z9.r
    public final void c(r rVar) {
        if (!(rVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f14045a = rVar;
    }
}
