package com.apple.android.music.playback.queue;

import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import com.apple.android.music.playback.model.PlayerMediaItem;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Handler.Callback, PlaybackQueueItemProvider {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f17501m = "a";
    private static final long serialVersionUID = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f17502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.apple.android.music.playback.c.d f17503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ExecutorService f17504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Handler f17505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected PlaybackQueueItemProvider.a f17506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f17507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f17508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f17509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f17510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f17511j;
    protected String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f17512l;

    /* JADX INFO: renamed from: com.apple.android.music.playback.queue.a$a, reason: collision with other inner class name */
    public final class RunnableC0016a implements Runnable {
        public RunnableC0016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.f();
            } catch (IOException e2) {
                String unused = a.f17501m;
                e2.toString();
                a.this.f17505d.obtainMessage(2, e2).sendToTarget();
            }
        }
    }

    public a() {
        this(-1);
    }

    private static int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 4;
        }
        return 1;
    }

    private static int f(int i10) {
        if (i10 == 3) {
            return 10;
        }
        if (i10 != 4) {
            return (i10 == 5 || i10 == 6) ? 8 : 1;
        }
        return 11;
    }

    private static int g(int i10) {
        return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7) ? 1 : 0;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public boolean a(int i10) {
        return true;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public boolean b() {
        return false;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int c() {
        return this.f17508g;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int d() {
        return this.f17509h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract void f();

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            PlaybackQueueItemProvider.a aVar = this.f17506e;
            if (aVar != null) {
                aVar.a(this);
            }
            return true;
        }
        if (i10 == 2) {
            PlaybackQueueItemProvider.a aVar2 = this.f17506e;
            if (aVar2 != null) {
                aVar2.a(this, (IOException) message.obj);
            }
            return true;
        }
        if (i10 == 3) {
            PlaybackQueueItemProvider.a aVar3 = this.f17506e;
            if (aVar3 != null) {
                aVar3.b(this);
            }
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        PlaybackQueueItemProvider.a aVar4 = this.f17506e;
        if (aVar4 != null) {
            aVar4.b(this, message.arg1);
        }
        return true;
    }

    public void readExternal(ObjectInput objectInput) {
        this.f17507f = objectInput.readInt();
        this.f17508g = objectInput.readInt();
        this.f17509h = objectInput.readInt();
        this.f17510i = objectInput.readInt();
        this.f17511j = (String) objectInput.readObject();
        this.k = (String) objectInput.readObject();
        this.f17512l = (String) objectInput.readObject();
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.f17507f);
        objectOutput.writeInt(this.f17508g);
        objectOutput.writeInt(this.f17509h);
        objectOutput.writeInt(this.f17510i);
        objectOutput.writeObject(this.f17511j);
        objectOutput.writeObject(this.k);
        objectOutput.writeObject(this.f17512l);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17507f);
        parcel.writeInt(this.f17508g);
        parcel.writeInt(this.f17509h);
        parcel.writeInt(this.f17510i);
        parcel.writeString(this.f17511j);
        parcel.writeString(this.k);
        parcel.writeString(this.f17512l);
    }

    public a(int i10) {
        this.f17508g = i10;
        this.f17509h = 0;
        this.f17510i = -1;
        this.f17507f = -1;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int a() {
        return this.f17507f;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public final void b(int i10) {
        this.f17507f = i10;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public void c(int i10) {
        this.f17509h = i10;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public int e() {
        return this.f17510i;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider
    public void a(e eVar, com.apple.android.music.playback.c.d dVar, ExecutorService executorService, Handler handler, PlaybackQueueItemProvider.a aVar) {
        this.f17502a = eVar;
        this.f17503b = dVar;
        this.f17505d = new Handler(handler.getLooper(), this);
        this.f17506e = aVar;
        this.f17504c = executorService;
        executorService.submit(new RunnableC0016a());
    }

    public a(Parcel parcel) {
        this.f17507f = parcel.readInt();
        this.f17508g = parcel.readInt();
        this.f17509h = parcel.readInt();
        this.f17510i = parcel.readInt();
        this.f17511j = parcel.readString();
        this.k = parcel.readString();
        this.f17512l = parcel.readString();
    }

    public void a(boolean z10) {
        this.f17506e = null;
    }

    public void a(com.apple.android.music.playback.reporting.b bVar, int i10) {
        PlayerMediaItem playerMediaItemD = d(i10);
        if (playerMediaItemD != null) {
            bVar.g(this.f17511j);
            bVar.f(playerMediaItemD.getDuration());
            bVar.i(this.k);
            int iJ = j();
            bVar.c(this.f17512l);
            if (playerMediaItemD.b() == 1) {
                bVar.d(Long.parseLong(playerMediaItemD.a()));
            }
            bVar.a(e(iJ));
            bVar.b(f(playerMediaItemD.getType()));
            bVar.c(g(playerMediaItemD.getType()));
        }
    }
}
