package okhttp3.internal.cache;

import E9.C;
import E9.K;
import E9.q;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache$fileSystem$1 extends q {
    @Override // E9.q, E9.AbstractC0355p
    public final K z(C file) {
        m.f(file, "file");
        C cB = file.b();
        if (cB != null) {
            b(cB);
        }
        return super.z(file);
    }
}
