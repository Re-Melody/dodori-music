package r9;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f26009d;

    static {
        int i10 = l.f26017c;
        int i11 = l.f26018d;
        long j10 = l.f26019e;
        String str = l.f26015a;
        f fVar = new f();
        fVar.f26011c = new d(i10, i11, j10, str);
        f26009d = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p119k9.AbstractC2040y
    public final String toString() {
        return "Dispatchers.Default";
    }
}
