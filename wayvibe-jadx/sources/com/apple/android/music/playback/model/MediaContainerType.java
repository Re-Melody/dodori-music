package com.apple.android.music.playback.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface MediaContainerType {
    public static final int ALBUM = 1;
    public static final int NONE = 0;
    public static final int PLAYLIST = 2;
}
