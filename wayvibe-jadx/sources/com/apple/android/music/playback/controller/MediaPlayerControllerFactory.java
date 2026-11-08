package com.apple.android.music.playback.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.apple.android.sdk.authentication.TokenProvider;

/* JADX INFO: loaded from: classes.dex */
public class MediaPlayerControllerFactory {
    public static MediaPlayerController createLocalController(Context context, TokenProvider tokenProvider) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        if (tokenProvider != null) {
            return createLocalController(context, new Handler(Looper.getMainLooper()), tokenProvider);
        }
        throw new NullPointerException("tokenProvider cannot be null");
    }

    public static MediaPlayerController createLocalController(Context context, Handler handler, TokenProvider tokenProvider) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        if (handler == null) {
            throw new NullPointerException("eventHandler cannot be null");
        }
        if (tokenProvider != null) {
            com.apple.android.music.playback.d.b bVarA = com.apple.android.music.playback.d.b.a(context);
            bVarA.a(tokenProvider.getDeveloperToken());
            bVarA.b(tokenProvider.getUserToken());
            return new a(context, handler);
        }
        throw new NullPointerException("tokenProvider cannot be null");
    }
}
