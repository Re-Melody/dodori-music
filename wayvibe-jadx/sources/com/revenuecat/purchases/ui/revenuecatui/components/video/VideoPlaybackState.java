package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoPlaybackState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VideoPlaybackState> CREATOR = new Creator();
    private final boolean playWhenReady;
    private final int positionMs;

    public static final class Creator implements Parcelable.Creator<VideoPlaybackState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPlaybackState createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new VideoPlaybackState(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPlaybackState[] newArray(int i10) {
            return new VideoPlaybackState[i10];
        }
    }

    public VideoPlaybackState(int i10, boolean z10) {
        this.positionMs = i10;
        this.playWhenReady = z10;
    }

    public static /* synthetic */ VideoPlaybackState copy$default(VideoPlaybackState videoPlaybackState, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = videoPlaybackState.positionMs;
        }
        if ((i11 & 2) != 0) {
            z10 = videoPlaybackState.playWhenReady;
        }
        return videoPlaybackState.copy(i10, z10);
    }

    public final int component1() {
        return this.positionMs;
    }

    public final boolean component2() {
        return this.playWhenReady;
    }

    public final VideoPlaybackState copy(int i10, boolean z10) {
        return new VideoPlaybackState(i10, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlaybackState)) {
            return false;
        }
        VideoPlaybackState videoPlaybackState = (VideoPlaybackState) obj;
        return this.positionMs == videoPlaybackState.positionMs && this.playWhenReady == videoPlaybackState.playWhenReady;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final int getPositionMs() {
        return this.positionMs;
    }

    public int hashCode() {
        return Boolean.hashCode(this.playWhenReady) + (Integer.hashCode(this.positionMs) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaybackState(positionMs=");
        sb.append(this.positionMs);
        sb.append(", playWhenReady=");
        return p134m1.b.o(sb, this.playWhenReady, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeInt(this.positionMs);
        out.writeInt(this.playWhenReady ? 1 : 0);
    }
}
