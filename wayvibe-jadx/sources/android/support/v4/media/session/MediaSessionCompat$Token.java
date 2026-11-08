package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f14354c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14352a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public R3.d f14355d = null;

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.f14353b = obj;
        this.f14354c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f14353b;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f14353b == null;
        }
        Object obj3 = mediaSessionCompat$Token.f14353b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final d g() {
        d dVar;
        synchronized (this.f14352a) {
            dVar = this.f14354c;
        }
        return dVar;
    }

    public final int hashCode() {
        Object obj = this.f14353b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.f14353b, i10);
    }
}
