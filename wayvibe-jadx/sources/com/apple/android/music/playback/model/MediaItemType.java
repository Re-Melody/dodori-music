package com.apple.android.music.playback.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface MediaItemType {
    public static final int SONG = 1;
    public static final int UNKNOWN = 0;
    public static final int UPLOADED_AUDIO = 5;
}
