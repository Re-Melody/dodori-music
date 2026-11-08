package Ja;

import M.s;
import android.media.SoundPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p119k9.F;
import p119k9.O;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f6768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.c f6770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f6771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f6772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ia.a f6773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f6774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ka.d f6775h;

    public l(p wrappedPlayer, s soundPoolManager) {
        kotlin.jvm.internal.m.f(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.m.f(soundPoolManager, "soundPoolManager");
        this.f6768a = wrappedPlayer;
        this.f6769b = soundPoolManager;
        r9.f fVar = O.f21697a;
        this.f6770c = F.b(p9.m.f25335a);
        Ia.a aVar = wrappedPlayer.f6784c;
        this.f6773f = aVar;
        soundPoolManager.z(aVar);
        Ia.a audioContext = this.f6773f;
        kotlin.jvm.internal.m.f(audioContext, "audioContext");
        m mVar = (m) ((HashMap) soundPoolManager.f7971c).get(audioContext.a());
        if (mVar != null) {
            this.f6774g = mVar;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.f6773f).toString());
        }
    }

    public final void a(Ka.d dVar) throws Throwable {
        l lVar;
        Ka.d dVar2;
        Throwable th;
        if (dVar != null) {
            synchronized (this.f6774g.f6778c) {
                try {
                    Map map = this.f6774g.f6778c;
                    Object arrayList = map.get(dVar);
                    if (arrayList == null) {
                        try {
                            arrayList = new ArrayList();
                            map.put(dVar, arrayList);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    List list = (List) arrayList;
                    l lVar2 = (l) N8.n.D0(list);
                    if (lVar2 != null) {
                        boolean z10 = lVar2.f6768a.f6793m;
                        this.f6768a.h(z10);
                        this.f6771d = lVar2.f6771d;
                        this.f6768a.c("Reusing soundId " + this.f6771d + " for " + dVar + " is prepared=" + z10 + ' ' + this);
                        lVar = this;
                        dVar2 = dVar;
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f6768a.h(false);
                        this.f6768a.c("Fetching actual URL for " + dVar);
                        p9.c cVar = this.f6770c;
                        r9.f fVar = O.f21697a;
                        lVar = this;
                        dVar2 = dVar;
                        try {
                            F.w(cVar, r9.e.f26007c, null, new k(dVar2, lVar, this, jCurrentTimeMillis, null), 2);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                    list.add(this);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else {
            lVar = this;
            dVar2 = dVar;
        }
        lVar.f6775h = dVar2;
    }

    @Override // Ja.h
    public final /* bridge */ /* synthetic */ Integer getCurrentPosition() {
        return null;
    }

    @Override // Ja.h
    public final /* bridge */ /* synthetic */ Integer getDuration() {
        return null;
    }

    @Override // Ja.h
    public final boolean isLiveStream() {
        return false;
    }

    @Override // Ja.h
    public final void l(boolean z10) {
        Integer num = this.f6772e;
        if (num != null) {
            this.f6774g.f6776a.setLoop(num.intValue(), z10 ? -1 : 0);
        }
    }

    @Override // Ja.h
    public final void o(float f10, float f11) {
        Integer num = this.f6772e;
        if (num != null) {
            this.f6774g.f6776a.setVolume(num.intValue(), f10, f11);
        }
    }

    @Override // Ja.h
    public final void p(Ia.a aVar) {
        if (!this.f6773f.a().equals(aVar.a())) {
            release();
            s sVar = this.f6769b;
            sVar.z(aVar);
            m mVar = (m) ((HashMap) sVar.f7971c).get(aVar.a());
            if (mVar == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f6774g = mVar;
        }
        this.f6773f = aVar;
    }

    @Override // Ja.h
    public final void pause() {
        Integer num = this.f6772e;
        if (num != null) {
            this.f6774g.f6776a.pause(num.intValue());
        }
    }

    @Override // Ja.h
    public final void q(float f10) {
        Integer num = this.f6772e;
        if (num != null) {
            this.f6774g.f6776a.setRate(num.intValue(), f10);
        }
    }

    @Override // Ja.h
    public final void release() {
        stop();
        Integer num = this.f6771d;
        if (num != null) {
            int iIntValue = num.intValue();
            Ka.d dVar = this.f6775h;
            if (dVar == null) {
                return;
            }
            synchronized (this.f6774g.f6778c) {
                try {
                    List list = (List) this.f6774g.f6778c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if (N8.n.P0(list) == this) {
                        this.f6774g.f6778c.remove(dVar);
                        this.f6774g.f6776a.unload(iIntValue);
                        this.f6774g.f6777b.remove(num);
                        this.f6768a.c("unloaded soundId " + iIntValue);
                    } else {
                        list.remove(this);
                    }
                    this.f6771d = null;
                    a(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Ja.h
    public final void s(Ka.c source) {
        kotlin.jvm.internal.m.f(source, "source");
        source.b(this);
    }

    @Override // Ja.h
    public final void seekTo(int i10) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
        }
        Integer num = this.f6772e;
        if (num != null) {
            int iIntValue = num.intValue();
            stop();
            if (this.f6768a.f6794n) {
                this.f6774g.f6776a.resume(iIntValue);
            }
        }
    }

    @Override // Ja.h
    public final void start() {
        Integer num = this.f6772e;
        Integer num2 = this.f6771d;
        if (num != null) {
            this.f6774g.f6776a.resume(num.intValue());
            return;
        }
        if (num2 != null) {
            SoundPool soundPool = this.f6774g.f6776a;
            int iIntValue = num2.intValue();
            p pVar = this.f6768a;
            float f10 = pVar.f6788g;
            this.f6772e = Integer.valueOf(soundPool.play(iIntValue, f10, f10, 0, pVar.f6791j == Ia.e.LOOP ? -1 : 0, pVar.f6790i));
        }
    }

    @Override // Ja.h
    public final void stop() {
        Integer num = this.f6772e;
        if (num != null) {
            this.f6774g.f6776a.stop(num.intValue());
            this.f6772e = null;
        }
    }

    @Override // Ja.h
    public final void j() {
    }

    @Override // Ja.h
    public final void k() {
    }
}
