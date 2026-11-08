package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f14348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaSession.QueueItem f14350c;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j10 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f14348a = mediaDescriptionCompat;
        this.f14349b = j10;
        this.f14350c = queueItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f14348a);
        sb.append(", Id=");
        return V0.p.k(this.f14349b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f14348a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f14349b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f14348a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f14349b = parcel.readLong();
    }
}
