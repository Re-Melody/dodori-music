package com.apple.android.music.playback.f;

import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecureRandom f17400a = new SecureRandom();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f17401b = ByteBuffer.allocate(8);

    public synchronized long a() {
        long j10;
        j10 = 0;
        while (j10 == 0) {
            this.f17400a.nextBytes(this.f17401b.array());
            j10 = this.f17401b.getLong(0);
        }
        return j10;
    }
}
