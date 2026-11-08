package okhttp3.internal.ws;

import E9.w;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f24597a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        w wVar = this.f24597a;
        if (wVar != null) {
            wVar.close();
        }
        this.f24597a = null;
    }
}
