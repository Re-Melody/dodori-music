package com.apple.android.music.playback.model;

import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface PlayerMediaItem extends Parcelable {
    String a();

    int b();

    String c();

    String d();

    int e();

    boolean f();

    String getAlbumArtistName();

    int getAlbumDiscCount();

    int getAlbumDiscNumber();

    String getAlbumSubscriptionStoreId();

    String getAlbumTitle();

    int getAlbumTrackCount();

    int getAlbumTrackNumber();

    String getArtistName();

    String getArtistSubscriptionStoreId();

    String getArtworkUrl();

    String getArtworkUrl(int i10, int i11);

    String getComposerName();

    long getDuration();

    String getGenreName();

    Date getReleaseDate();

    String getSubscriptionStoreId();

    String getTitle();

    int getType();

    String getUrl();

    boolean hasLyricsAvailable();

    boolean isExplicitContent();

    boolean isPlayableContent();
}
