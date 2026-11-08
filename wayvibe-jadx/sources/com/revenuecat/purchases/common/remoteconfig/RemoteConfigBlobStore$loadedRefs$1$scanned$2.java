package com.revenuecat.purchases.common.remoteconfig;

import Z8.c;
import java.io.File;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigBlobStore$loadedRefs$1$scanned$2 extends n implements c {
    public static final RemoteConfigBlobStore$loadedRefs$1$scanned$2 INSTANCE = new RemoteConfigBlobStore$loadedRefs$1$scanned$2();

    public RemoteConfigBlobStore$loadedRefs$1$scanned$2() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // Z8.c
    public final Boolean invoke(File file) {
        boolean z10;
        if (file.isFile()) {
            RemoteConfigUtils remoteConfigUtils = RemoteConfigUtils.INSTANCE;
            String name = file.getName();
            m.e(name, "it.name");
            if (remoteConfigUtils.isValidRef(name)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
