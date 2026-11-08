package com.apple.android.music.playback.queue;

import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.apple.android.music.playback.f.i;
import com.apple.android.music.playback.model.PlayerMediaItem;
import com.apple.android.music.playback.model.m;
import com.apple.android.music.playback.model.q;
import com.apple.android.music.playback.model.r;
import com.apple.android.music.playback.model.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CatalogPlaybackQueueItemProvider extends com.apple.android.music.playback.queue.a {
    public static final Parcelable.Creator<CatalogPlaybackQueueItemProvider> CREATOR = new Parcelable.Creator<CatalogPlaybackQueueItemProvider>() { // from class: com.apple.android.music.playback.queue.CatalogPlaybackQueueItemProvider.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CatalogPlaybackQueueItemProvider createFromParcel(Parcel parcel) {
            return new CatalogPlaybackQueueItemProvider(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CatalogPlaybackQueueItemProvider[] newArray(int i10) {
            return new CatalogPlaybackQueueItemProvider[i10];
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Uri f17488m = Uri.parse("https://api.music.apple.com/v1/catalog/");
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f17489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile int f17492q;
    private volatile String r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile Cursor f17493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile List<q> f17494t;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String[] f17497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17498d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17499e = 0;

        public PlaybackQueueItemProvider build() {
            return new CatalogPlaybackQueueItemProvider(this);
        }

        public Builder containers(int i10, String... strArr) {
            this.f17495a = i10;
            this.f17496b = 0;
            this.f17497c = strArr;
            return this;
        }

        public Builder items(int i10, String... strArr) {
            this.f17495a = 0;
            this.f17496b = i10;
            this.f17497c = strArr;
            return this;
        }

        public Builder shuffleMode(int i10) {
            this.f17499e = i10;
            return this;
        }

        public Builder startItemIndex(int i10) {
            this.f17498d = i10;
            return this;
        }
    }

    public final class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CatalogPlaybackQueueItemProvider.this.k();
        }
    }

    @Override // com.apple.android.music.playback.queue.a, com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public void a(com.apple.android.music.playback.reporting.b bVar, int i10) {
        super.a(bVar, i10);
        PlayerMediaItem playerMediaItemD = d(i10);
        if (playerMediaItemD != null) {
            String strI = i();
            if (this.f17492q == 2) {
                bVar.b(strI);
            } else if (strI != null) {
                bVar.a(Long.parseLong(strI));
            }
            String subscriptionStoreId = playerMediaItemD.getSubscriptionStoreId();
            if (subscriptionStoreId != null) {
                bVar.e(Long.parseLong(subscriptionStoreId));
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public PlayerMediaItem d(int i10) {
        synchronized (this) {
            try {
                if (this.f17493s != null && i10 >= 0 && i10 < this.f17493s.getCount()) {
                    this.f17493s.moveToPosition(i10);
                    return s.a(this.f17493s);
                }
                if (this.f17494t == null || i10 < 0 || i10 >= this.f17494t.size()) {
                    return null;
                }
                return this.f17494t.get(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.a
    public void f() throws Throwable {
        HttpURLConnection httpURLConnectionA;
        IOException e2;
        InputStream inputStream;
        Throwable th;
        String[] strArr = this.f17489n;
        if (strArr == null || strArr.length == 0) {
            throw new IOException(new IllegalArgumentException("Subscription item ids cannot be empty"));
        }
        this.f17493s = new com.apple.android.music.playback.queue.a.c(this.f17502a).a(this);
        if (this.f17493s.getCount() == 0) {
            this.f17493s.close();
            this.f17493s = null;
            if (!this.f17503b.i()) {
                throw new m("Network is unreachable with current settings");
            }
            String strA = i.a(this.f17503b);
            if (strA == null) {
                throw new IOException(new IllegalStateException("User store front identifier cannot be null"));
            }
            try {
                httpURLConnectionA = a(strA);
                try {
                    int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode < 200 || responseCode > 299) {
                        a(httpURLConnectionA);
                        throw new IOException();
                    }
                    try {
                        inputStream = httpURLConnectionA.getInputStream();
                        try {
                            Map<String, r> mapA = com.apple.android.music.playback.f.f.a(inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            a(httpURLConnectionA);
                            String[] strArr2 = this.f17489n;
                            if (strArr2.length == 1) {
                                r rVar = mapA.get(strArr2[0]);
                                if (rVar != null) {
                                    this.f17492q = rVar.a();
                                    this.r = rVar.b();
                                    this.f17494t = rVar.c();
                                }
                            } else {
                                this.f17492q = 0;
                                this.r = null;
                                this.f17494t = new ArrayList(this.f17489n.length);
                                for (String str : this.f17489n) {
                                    r rVar2 = mapA.get(str);
                                    if (rVar2 != null) {
                                        this.f17494t.addAll(rVar2.c());
                                    }
                                }
                            }
                            if (this.f17494t != null && !this.f17494t.isEmpty()) {
                                this.f17504c.submit(new a());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            a(httpURLConnectionA);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        inputStream = null;
                        th = th3;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    a(httpURLConnectionA);
                    throw e2;
                }
            } catch (IOException e7) {
                httpURLConnectionA = null;
                e2 = e7;
            }
        }
        this.f17505d.sendEmptyMessage(1);
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int h() {
        synchronized (this) {
            try {
                if (this.f17493s != null) {
                    return this.f17493s.getCount();
                }
                if (this.f17494t == null) {
                    return 0;
                }
                return this.f17494t.size();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public String i() {
        return this.r;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int j() {
        return this.f17492q;
    }

    public void k() {
        if (this.f17494t == null || this.f17494t.isEmpty()) {
            return;
        }
        com.apple.android.music.playback.queue.a.c cVar = new com.apple.android.music.playback.queue.a.c(this.f17502a);
        if (cVar.a(this, this.f17494t) != 0) {
            synchronized (this) {
                this.f17493s = cVar.a(this);
                this.f17494t = null;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.a, java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.f17489n = (String[]) objectInput.readObject();
        this.f17491p = objectInput.readInt();
        this.f17490o = objectInput.readInt();
    }

    @Override // com.apple.android.music.playback.queue.a, java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.f17489n);
        objectOutput.writeInt(this.f17491p);
        objectOutput.writeInt(this.f17490o);
    }

    @Override // com.apple.android.music.playback.queue.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f17489n.length);
        parcel.writeStringArray(this.f17489n);
        parcel.writeInt(this.f17491p);
        parcel.writeInt(this.f17490o);
    }

    public CatalogPlaybackQueueItemProvider() {
        this.f17490o = 0;
        this.f17491p = 0;
        this.f17492q = 0;
        this.r = null;
    }

    private CatalogPlaybackQueueItemProvider(Builder builder) {
        this.f17490o = 0;
        this.f17491p = 0;
        this.f17492q = 0;
        this.r = null;
        this.f17489n = builder.f17497c;
        this.f17491p = builder.f17495a;
        this.f17490o = builder.f17496b;
        this.f17509h = builder.f17499e;
        this.f17508g = builder.f17498d;
    }

    @Override // com.apple.android.music.playback.queue.a, com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public void a(boolean z10) {
        e eVar;
        super.a(z10);
        if (this.f17493s != null) {
            this.f17493s.close();
        }
        if (!z10 || (eVar = this.f17502a) == null) {
            return;
        }
        new com.apple.android.music.playback.queue.a.c(eVar).b(this);
    }

    private HttpURLConnection a(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f17489n;
            if (i10 >= strArr.length) {
                break;
            }
            sb.append(strArr[i10]);
            if (i10 < this.f17489n.length - 1) {
                sb.append(',');
            }
            i10++;
        }
        Uri.Builder builderBuildUpon = f17488m.buildUpon();
        builderBuildUpon.appendPath(str);
        int i11 = this.f17491p;
        if (i11 == 0) {
            int i12 = this.f17490o;
            if (i12 != 0) {
                if (i12 == 1) {
                    builderBuildUpon.appendPath("songs");
                } else if (i12 == 2) {
                    builderBuildUpon.appendPath("music-videos");
                }
            }
        } else if (i11 == 1) {
            builderBuildUpon.appendPath("albums");
        } else if (i11 == 2) {
            builderBuildUpon.appendPath("playlists");
        }
        builderBuildUpon.appendQueryParameter("ids", sb.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(builderBuildUpon.build().toString()).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestProperty("Accept", "*/*");
        httpURLConnection.setRequestProperty("User-Agent", this.f17503b.v());
        httpURLConnection.addRequestProperty("Authorization", "Bearer " + this.f17503b.u());
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private CatalogPlaybackQueueItemProvider(Parcel parcel) {
        super(parcel);
        this.f17490o = 0;
        this.f17491p = 0;
        this.f17492q = 0;
        this.r = null;
        String[] strArr = new String[parcel.readInt()];
        this.f17489n = strArr;
        parcel.readStringArray(strArr);
        this.f17491p = parcel.readInt();
        this.f17490o = parcel.readInt();
    }

    private void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }
}
