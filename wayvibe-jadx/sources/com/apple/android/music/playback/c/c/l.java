package com.apple.android.music.playback.c.c;

import android.util.SparseArray;
import com.apple.android.music.playback.model.PlayerMediaItem;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;
import p235w4.B;

/* JADX INFO: loaded from: classes.dex */
public final class l implements J4.h, com.apple.android.music.playback.queue.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.queue.e f17155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.b.a f17156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.apple.android.music.playback.c.a.a f17157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f17158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.apple.android.music.playback.c.i f17159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<J4.h> f17161g = new SparseArray<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<J4.e> f17162h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<B> f17163i = new SparseArray<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p235w4.g f17164j;
    private J4.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f17165l;

    public l(com.apple.android.music.playback.queue.e eVar, com.apple.android.music.playback.c.b.a aVar, com.apple.android.music.playback.c.a.a aVar2, h hVar, j jVar, com.apple.android.music.playback.c.i iVar, com.apple.android.music.playback.c.d dVar) {
        this.f17155a = eVar;
        this.f17156b = aVar;
        this.f17157c = aVar2;
        this.f17158d = hVar;
        this.f17165l = jVar;
        this.f17159e = iVar;
        this.f17160f = dVar;
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void c(com.apple.android.music.playback.queue.e eVar, int i10) {
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void d(com.apple.android.music.playback.queue.e eVar, int i10) {
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar, int i10, int i11, int i12) {
    }

    @Override // J4.h
    public void b() {
        this.f17161g.size();
        int size = this.f17161g.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = this.f17161g.keyAt(i10);
            J4.h hVarValueAt = this.f17161g.valueAt(i10);
            J4.e eVar = this.f17162h.get(iKeyAt);
            if (eVar != null) {
                hVarValueAt.a(eVar);
                this.f17162h.remove(iKeyAt);
            }
            hVarValueAt.b();
            this.f17161g.remove(iKeyAt);
        }
        this.f17164j = null;
        this.k = null;
        this.f17155a.b(this);
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar, PlayerQueueItem playerQueueItem) {
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar, PlaybackQueueItemProvider playbackQueueItemProvider, Exception exc) {
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar, Exception exc) {
    }

    @Override // J4.h
    public void a(p235w4.g gVar, boolean z10, J4.f fVar) {
        this.f17164j = gVar;
        this.k = fVar;
        this.f17155a.a(this);
        this.k.a(this, new m(this.f17155a, this.f17163i), null);
    }

    @Override // J4.h
    public void a() {
        int size = this.f17161g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17161g.valueAt(i10).a();
        }
    }

    @Override // J4.h
    public J4.e a(J4.g gVar, W4.b bVar) {
        l lVar;
        String.format("createPeriod: periodIndex = %d", Integer.valueOf(gVar.f6604a));
        SparseArray<J4.h> sparseArray = this.f17161g;
        int i10 = gVar.f6604a;
        J4.h hVarA = sparseArray.get(i10);
        if (hVarA == null) {
            PlayerQueueItem playerQueueItemD = this.f17155a.d(i10);
            if (playerQueueItemD == null) {
                return new e(i10);
            }
            hVarA = a(playerQueueItemD.getItem());
            lVar = this;
            hVarA.a(this.f17164j, false, new s(lVar, this.f17155a, i10, this.f17163i, this.k));
            lVar.f17161g.put(i10, hVarA);
        } else {
            lVar = this;
        }
        J4.e eVarA = hVarA.a(gVar, bVar);
        lVar.f17162h.put(i10, eVarA);
        return eVarA;
    }

    @Override // J4.h
    public void a(J4.e eVar) {
        int iKeyAt;
        String.format("releasePeriod: %s", eVar);
        int iIndexOfValue = this.f17162h.indexOfValue(eVar);
        if (iIndexOfValue >= 0 && (iKeyAt = this.f17162h.keyAt(iIndexOfValue)) >= 0) {
            J4.h hVar = this.f17161g.get(iKeyAt);
            hVar.a(eVar);
            hVar.b();
            this.f17162h.remove(iKeyAt);
            this.f17161g.remove(iKeyAt);
            this.f17163i.remove(iKeyAt);
        }
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar) {
        J4.f fVar = this.k;
        if (fVar != null) {
            fVar.a(this, new m(eVar, this.f17163i), null);
        }
    }

    private J4.h a(PlayerMediaItem playerMediaItem) {
        return p.a(playerMediaItem, this.f17156b, this.f17160f, this.f17158d, this.f17157c, this.f17159e, this.f17165l);
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void a(com.apple.android.music.playback.queue.e eVar, int i10) {
    }

    @Override // com.apple.android.music.playback.queue.e.a
    public void b(com.apple.android.music.playback.queue.e eVar, int i10) {
    }
}
