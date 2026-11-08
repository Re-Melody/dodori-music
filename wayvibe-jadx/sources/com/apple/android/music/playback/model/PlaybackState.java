package com.apple.android.music.playback.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface PlaybackState {
    public static final int PAUSED = 2;
    public static final int PLAYING = 1;
    public static final int STOPPED = 0;
}
