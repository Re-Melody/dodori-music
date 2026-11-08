package com.apple.android.music.playback.queue;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface PlaybackQueueInsertionType {
    public static final int INSERTION_TYPE_AFTER_CURRENT_ITEM = 3;
    public static final int INSERTION_TYPE_AT_END = 2;
    public static final int INSERTION_TYPE_BEFORE_CURRENT_ITEM = 4;
    public static final int INSERTION_TYPE_CLEAR_AND_REPLACE = 5;
    public static final int INSERTION_TYPE_KEEP_AND_REPLACE = 6;
    public static final int INSERTION_TYPE_NONE = 0;
    public static final int INSERTION_TYPE_REPLACE = 1;
}
