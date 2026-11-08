package com.apple.android.music.playback.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface PlaybackQueueMoveTargetType {
    public static final int MOVE_AFTER_TARGET = 1;
    public static final int MOVE_BEFORE_TARGET = 2;
}
