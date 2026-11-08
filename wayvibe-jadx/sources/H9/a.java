package H9;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p046da.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6241j;

    public a(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.f6241j = bArr;
    }

    public final String toString() {
        return a.class.getSimpleName() + "[" + this.f6241j.toString() + "]";
    }
}
