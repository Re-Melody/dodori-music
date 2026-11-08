package com.apple.android.music.playback.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q implements PlayerMediaItem, Externalizable {
    public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator<q>() { // from class: com.apple.android.music.playback.model.q.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f17463x = Pattern.compile("(\\{w\\})|(\\{h\\})|(\\{c\\})|(\\{f\\})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f17464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f17466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f17467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f17468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f17469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f17470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f17471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f17472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f17473j;
    String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f17474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f17475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f17476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f17477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Date f17478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f17479q;
    int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f17480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f17481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f17482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f17483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f17484w;

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String a() {
        return this.f17464a;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int b() {
        return 3;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String c() {
        return null;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String d() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int e() {
        return this.f17482u;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public boolean f() {
        return this.f17465b == 1;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getAlbumArtistName() {
        return this.f17471h;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int getAlbumDiscCount() {
        return this.f17481t;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int getAlbumDiscNumber() {
        return this.f17480s;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getAlbumSubscriptionStoreId() {
        return this.f17467d;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getAlbumTitle() {
        return this.f17468e;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int getAlbumTrackCount() {
        return this.r;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int getAlbumTrackNumber() {
        return this.f17479q;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getArtistName() {
        return this.f17470g;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getArtistSubscriptionStoreId() {
        return this.f17469f;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getArtworkUrl() {
        return getArtworkUrl(512, 512);
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getComposerName() {
        return this.f17475m;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public long getDuration() {
        return this.f17477o;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getGenreName() {
        return this.f17474l;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public Date getReleaseDate() {
        return this.f17478p;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getSubscriptionStoreId() {
        return this.f17464a;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getTitle() {
        return this.f17466c;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public int getType() {
        return this.f17465b;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getUrl() {
        return this.f17472i;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public boolean hasLyricsAvailable() {
        return this.f17483v;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public boolean isExplicitContent() {
        return this.f17482u >= 500;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public boolean isPlayableContent() {
        switch (this.f17465b) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f17476n;
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        this.f17464a = (String) objectInput.readObject();
        this.f17465b = objectInput.readInt();
        this.f17466c = (String) objectInput.readObject();
        this.f17467d = (String) objectInput.readObject();
        this.f17468e = (String) objectInput.readObject();
        this.f17469f = (String) objectInput.readObject();
        this.f17470g = (String) objectInput.readObject();
        this.f17471h = (String) objectInput.readObject();
        this.f17472i = (String) objectInput.readObject();
        this.f17473j = (String) objectInput.readObject();
        this.k = (String) objectInput.readObject();
        this.f17474l = (String) objectInput.readObject();
        this.f17475m = (String) objectInput.readObject();
        this.f17476n = objectInput.readBoolean();
        this.f17477o = objectInput.readLong();
        this.f17478p = (Date) objectInput.readObject();
        this.f17479q = objectInput.readInt();
        this.r = objectInput.readInt();
        this.f17480s = objectInput.readInt();
        this.f17481t = objectInput.readInt();
        this.f17482u = objectInput.readInt();
        this.f17483v = objectInput.readBoolean();
        this.f17484w = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f17464a);
        objectOutput.writeInt(this.f17465b);
        objectOutput.writeObject(this.f17466c);
        objectOutput.writeObject(this.f17467d);
        objectOutput.writeObject(this.f17468e);
        objectOutput.writeObject(this.f17469f);
        objectOutput.writeObject(this.f17470g);
        objectOutput.writeObject(this.f17471h);
        objectOutput.writeObject(this.f17472i);
        objectOutput.writeObject(this.f17473j);
        objectOutput.writeObject(this.k);
        objectOutput.writeObject(this.f17474l);
        objectOutput.writeObject(this.f17475m);
        objectOutput.writeBoolean(this.f17476n);
        objectOutput.writeLong(this.f17477o);
        objectOutput.writeObject(this.f17478p);
        objectOutput.writeInt(this.f17479q);
        objectOutput.writeInt(this.r);
        objectOutput.writeInt(this.f17480s);
        objectOutput.writeInt(this.f17481t);
        objectOutput.writeInt(this.f17482u);
        objectOutput.writeBoolean(this.f17483v);
        objectOutput.writeBoolean(this.f17484w);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17464a);
        parcel.writeInt(this.f17465b);
        parcel.writeString(this.f17466c);
        parcel.writeString(this.f17467d);
        parcel.writeString(this.f17468e);
        parcel.writeString(this.f17469f);
        parcel.writeString(this.f17470g);
        parcel.writeString(this.f17471h);
        parcel.writeString(this.f17472i);
        parcel.writeString(this.f17473j);
        parcel.writeString(this.k);
        parcel.writeString(this.f17474l);
        parcel.writeString(this.f17475m);
        parcel.writeByte(this.f17476n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f17477o);
        parcel.writeSerializable(this.f17478p);
        parcel.writeInt(this.f17479q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.f17480s);
        parcel.writeInt(this.f17481t);
        parcel.writeInt(this.f17482u);
        parcel.writeByte(this.f17483v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f17484w ? 1 : 0);
    }

    public q() {
        this.f17464a = null;
        this.f17465b = 0;
        this.f17466c = null;
        this.f17467d = null;
        this.f17468e = null;
        this.f17469f = null;
        this.f17470g = null;
        this.f17471h = null;
        this.f17472i = null;
        this.f17473j = null;
        this.k = null;
        this.f17474l = null;
        this.f17475m = null;
        this.f17476n = false;
        this.f17477o = -1L;
        this.f17478p = null;
        this.f17479q = 0;
        this.r = 0;
        this.f17480s = 0;
        this.f17481t = 0;
        this.f17482u = 100;
        this.f17483v = false;
        this.f17484w = false;
    }

    @Override // com.apple.android.music.playback.model.PlayerMediaItem
    public String getArtworkUrl(int i10, int i11) {
        String str = this.f17473j;
        if (str == null) {
            return null;
        }
        return com.apple.android.music.playback.f.e.a(str, i10, i11, "bb");
    }

    private q(Parcel parcel) {
        this.f17464a = parcel.readString();
        this.f17465b = parcel.readInt();
        this.f17466c = parcel.readString();
        this.f17467d = parcel.readString();
        this.f17468e = parcel.readString();
        this.f17469f = parcel.readString();
        this.f17470g = parcel.readString();
        this.f17471h = parcel.readString();
        this.f17472i = parcel.readString();
        this.f17473j = parcel.readString();
        this.k = parcel.readString();
        this.f17474l = parcel.readString();
        this.f17475m = parcel.readString();
        this.f17476n = parcel.readByte() == 1;
        this.f17477o = parcel.readLong();
        this.f17478p = (Date) parcel.readSerializable();
        this.f17479q = parcel.readInt();
        this.r = parcel.readInt();
        this.f17480s = parcel.readInt();
        this.f17481t = parcel.readInt();
        this.f17482u = parcel.readInt();
        this.f17483v = parcel.readByte() == 1;
        this.f17484w = parcel.readInt() == 1;
    }
}
