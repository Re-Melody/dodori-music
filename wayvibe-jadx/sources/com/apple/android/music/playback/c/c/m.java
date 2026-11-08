package com.apple.android.music.playback.c.c;

import android.util.SparseArray;
import com.apple.android.music.playback.model.PlayerQueueItem;
import p235w4.A;
import p235w4.B;
import p235w4.z;

/* JADX INFO: loaded from: classes.dex */
final class m extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.queue.e f17166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<B> f17167c;

    public m(com.apple.android.music.playback.queue.e eVar, SparseArray<B> sparseArray) {
        this.f17166b = eVar;
        this.f17167c = sparseArray;
    }

    @Override // p235w4.B
    public int a() {
        return this.f17166b.e();
    }

    @Override // p235w4.B
    public int b() {
        return this.f17166b.e();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // p235w4.B
    public A a(int i10, A a10, boolean z10, long j10) {
        A a11;
        boolean z11;
        long j11;
        boolean z12;
        PlayerQueueItem playerQueueItemD = this.f17166b.d(i10);
        B b10 = this.f17167c.get(i10);
        if (b10 != null) {
            a11 = a10;
            z11 = z10;
            b10.a(0, a11, z11, j10);
        } else {
            a11 = a10;
            z11 = z10;
        }
        if (playerQueueItemD == null) {
            if (z11) {
                a11.getClass();
            }
            return a11;
        }
        long jA = com.apple.android.music.playback.f.e.a(playerQueueItemD.getItem());
        Long lValueOf = z11 ? Long.valueOf(playerQueueItemD.getPlaybackQueueId()) : null;
        if (b10 != null) {
            j11 = a11.f27892g;
            if (j11 == -9223372036854775807L) {
                j11 = jA;
            }
        } else {
            j11 = jA;
        }
        boolean z13 = false;
        if (b10 != null) {
            z12 = a11.f27888c;
        } else {
            z12 = jA == -9223372036854775807L;
        }
        if (b10 != null) {
            z13 = a11.f27887b;
        } else if (j11 != -9223372036854775807L) {
            z13 = true;
        }
        long j12 = b10 != null ? a11.f27891f : 0L;
        long j13 = b10 != null ? a11.f27893h : 0L;
        a11.f27886a = lValueOf;
        a11.f27887b = z13;
        a11.f27888c = z12;
        a11.f27891f = j12;
        a11.f27892g = j11;
        a11.f27889d = i10;
        a11.f27890e = i10;
        a11.f27893h = j13;
        return a11;
    }

    @Override // p235w4.B
    public z a(int i10, z zVar, boolean z10) {
        long jA;
        PlayerQueueItem playerQueueItemD = this.f17166b.d(i10);
        B b10 = this.f17167c.get(i10);
        if (b10 != null) {
            b10.a(0, zVar, z10);
        }
        if (playerQueueItemD == null) {
            if (z10) {
                zVar.getClass();
            }
            return zVar;
        }
        Long lValueOf = z10 ? Long.valueOf(playerQueueItemD.getPlaybackQueueId()) : null;
        if (b10 != null) {
            jA = zVar.f28042d;
        } else {
            jA = com.apple.android.music.playback.f.e.a(playerQueueItemD.getItem());
        }
        long j10 = b10 != null ? zVar.f28043e : 0L;
        zVar.f28039a = lValueOf;
        zVar.f28040b = lValueOf;
        zVar.f28041c = i10;
        zVar.f28042d = jA;
        zVar.f28043e = j10;
        return zVar;
    }

    @Override // p235w4.B
    public int a(Object obj) {
        int iC = this.f17166b.c(((Long) obj).longValue());
        if (this.f17166b.d(iC) == null || !this.f17166b.m(iC)) {
            return -1;
        }
        return iC;
    }

    @Override // p235w4.B
    public int a(int i10, int i11, boolean z10) {
        int iL = this.f17166b.l(i10);
        if (iL == -1) {
            return -1;
        }
        return iL;
    }
}
