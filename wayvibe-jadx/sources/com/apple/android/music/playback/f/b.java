package com.apple.android.music.playback.f;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Message a(Message message, long j10) {
        message.arg1 = (int) (j10 >> 32);
        message.arg2 = (int) (j10 & 4294967295L);
        return message;
    }

    public static long a(Message message) {
        return (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L);
    }
}
