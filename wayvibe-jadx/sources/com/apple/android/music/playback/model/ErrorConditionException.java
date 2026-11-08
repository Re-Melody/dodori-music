package com.apple.android.music.playback.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ErrorConditionException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17435a;

    public ErrorConditionException(String str, int i10) {
        super(str);
        this.f17435a = i10;
    }

    public int getErrorCode() {
        return this.f17435a;
    }
}
