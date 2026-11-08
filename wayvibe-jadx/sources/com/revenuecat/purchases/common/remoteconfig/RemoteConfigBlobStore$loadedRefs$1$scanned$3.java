package com.revenuecat.purchases.common.remoteconfig;

import Z8.c;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigBlobStore$loadedRefs$1$scanned$3 extends n implements c {
    public static final RemoteConfigBlobStore$loadedRefs$1$scanned$3 INSTANCE = new RemoteConfigBlobStore$loadedRefs$1$scanned$3();

    public RemoteConfigBlobStore$loadedRefs$1$scanned$3() {
        super(1);
    }

    @Override // Z8.c
    public final String invoke(File file) {
        return file.getName();
    }
}
