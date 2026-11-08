package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f14367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f14369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f14370j;
    public final Bundle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PlaybackState f14371l;

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f14361a = i10;
        this.f14362b = j10;
        this.f14363c = j11;
        this.f14364d = f10;
        this.f14365e = j12;
        this.f14366f = i11;
        this.f14367g = charSequence;
        this.f14368h = j13;
        this.f14369i = new ArrayList(arrayList);
        this.f14370j = j14;
        this.k = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f14361a);
        sb.append(", position=");
        sb.append(this.f14362b);
        sb.append(", buffered position=");
        sb.append(this.f14363c);
        sb.append(", speed=");
        sb.append(this.f14364d);
        sb.append(", updated=");
        sb.append(this.f14368h);
        sb.append(", actions=");
        sb.append(this.f14365e);
        sb.append(", error code=");
        sb.append(this.f14366f);
        sb.append(", error message=");
        sb.append(this.f14367g);
        sb.append(", custom actions=");
        sb.append(this.f14369i);
        sb.append(", active item id=");
        return V0.p.k(this.f14370j, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14361a);
        parcel.writeLong(this.f14362b);
        parcel.writeFloat(this.f14364d);
        parcel.writeLong(this.f14368h);
        parcel.writeLong(this.f14363c);
        parcel.writeLong(this.f14365e);
        TextUtils.writeToParcel(this.f14367g, parcel, i10);
        parcel.writeTypedList(this.f14369i);
        parcel.writeLong(this.f14370j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f14366f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new w();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f14373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f14375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PlaybackState.CustomAction f14376e;

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f14372a = str;
            this.f14373b = charSequence;
            this.f14374c = i10;
            this.f14375d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f14373b) + ", mIcon=" + this.f14374c + ", mExtras=" + this.f14375d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f14372a);
            TextUtils.writeToParcel(this.f14373b, parcel, i10);
            parcel.writeInt(this.f14374c);
            parcel.writeBundle(this.f14375d);
        }

        public CustomAction(Parcel parcel) {
            this.f14372a = parcel.readString();
            this.f14373b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14374c = parcel.readInt();
            this.f14375d = parcel.readBundle(t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f14361a = parcel.readInt();
        this.f14362b = parcel.readLong();
        this.f14364d = parcel.readFloat();
        this.f14368h = parcel.readLong();
        this.f14363c = parcel.readLong();
        this.f14365e = parcel.readLong();
        this.f14367g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14369i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f14370j = parcel.readLong();
        this.k = parcel.readBundle(t.class.getClassLoader());
        this.f14366f = parcel.readInt();
    }
}
