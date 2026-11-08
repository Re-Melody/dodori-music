package com.revenuecat.purchases.storage;

import Z8.a;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultFileCache$cacheDir$2 extends n implements a {
    final /* synthetic */ DefaultFileCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFileCache$cacheDir$2(DefaultFileCache defaultFileCache) {
        super(0);
        this.this$0 = defaultFileCache;
    }

    @Override // Z8.a
    public final File invoke() {
        File file = new File(this.this$0.context.getCacheDir(), this.this$0.subDir);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
