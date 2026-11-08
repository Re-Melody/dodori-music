package G9;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5699b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f5700a;

    public e(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f5700a = serializable;
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
