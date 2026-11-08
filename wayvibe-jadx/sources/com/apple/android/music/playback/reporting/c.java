package com.apple.android.music.playback.reporting;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.model.k;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.apple.android.music.playback.c.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17619a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f17621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f17622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17623e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f17624f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17625g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17626h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17627i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f17628j;
    private byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f17629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f17631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f17632o;

    public c(com.apple.android.music.playback.c.d dVar) {
        Context contextF = dVar.f();
        this.f17621c = contextF;
        this.f17620b = dVar;
        this.f17631n = contextF.getPackageName();
        try {
            this.f17632o = contextF.getPackageManager().getPackageInfo(this.f17631n, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, int i10) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(com.apple.android.music.playback.c.c cVar, int i10, int i11) {
        if (this.f17623e) {
            if (i11 == -1) {
                a(cVar, 5, this.f17624f, this.f17628j);
            } else if (i11 == i10 + 1) {
                a(cVar, 2, this.f17624f, i10);
            } else if (i11 == i10 - 1) {
                a(cVar, 14, this.f17624f, i10);
            } else {
                a(cVar, 5, this.f17624f, this.f17628j);
            }
            this.f17623e = false;
            this.f17624f = 0L;
        } else if (this.f17625g) {
            a(cVar, 7, this.f17624f, i10);
            this.f17625g = false;
        } else {
            a(cVar, 5, this.f17624f, this.f17628j);
        }
        if (cVar.e() == 1) {
            b(cVar, true);
            this.f17627i = true;
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, int i10, int i11, float f10) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, int i10, int i11, int i12) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, PlayerQueueItem playerQueueItem) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, List<PlayerQueueItem> list) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, Set<k> set) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, boolean z10) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, int i10, int i11) {
        long jF = cVar.f();
        if (i11 == 1) {
            if (!this.f17627i) {
                b(cVar, false);
            }
            this.f17630m = SystemClock.elapsedRealtime();
            return;
        }
        if (i11 == 2) {
            if (jF == -1) {
                if (this.f17630m == 0) {
                    this.f17630m = SystemClock.elapsedRealtime();
                }
                jF = SystemClock.elapsedRealtime() - this.f17630m;
            }
            long j10 = jF;
            if (i10 == 1) {
                a(cVar, 3, j10, cVar.m());
            }
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(com.apple.android.music.playback.c.c cVar, List<com.apple.android.music.playback.c.d.b> list) {
        for (com.apple.android.music.playback.c.d.b bVar : list) {
            if ("PRIV".equals(bVar.a()) && "com.apple.radio.ping.jingle".equals(bVar.b())) {
                byte[] bArrC = bVar.c();
                if (!Arrays.equals(this.k, bArrC)) {
                    cVar.f();
                    a(cVar, bArrC);
                    this.k = bArrC;
                }
            }
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, PlayerQueueItem playerQueueItem, long j10) {
        long duration = playerQueueItem.getItem().getDuration();
        long j11 = j10 - duration;
        if (duration > 0 && Math.abs(j11) < 999) {
            this.f17625g = true;
        } else {
            this.f17623e = true;
        }
        if (j10 == -1) {
            if (this.f17630m == 0) {
                this.f17630m = SystemClock.elapsedRealtime();
            }
            j10 = SystemClock.elapsedRealtime() - this.f17630m;
        }
        this.f17624f = j10;
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(com.apple.android.music.playback.c.c cVar, long j10, long j11) {
        this.f17626h = j10;
        a(cVar, 13, j11, cVar.m());
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, MediaPlayerException mediaPlayerException) {
        a(cVar, 10, 0L, cVar.m());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004f  */
    private synchronized void b(b bVar) {
        String strValueOf;
        String strValueOf2;
        a aVar;
        int i10 = bVar.r;
        if (bVar.f17606m == 0 && bVar.f17605l == 0 && bVar.f17607n == null && bVar.f17601g == null) {
            return;
        }
        long j10 = bVar.f17596b;
        if (j10 != 0) {
            strValueOf = String.valueOf(j10);
        } else {
            strValueOf = bVar.f17599e;
            if (strValueOf == null && (strValueOf = bVar.f17601g) == null) {
                strValueOf = null;
            }
        }
        a aVar2 = this.f17622d;
        if (aVar2 != null) {
            long j11 = aVar2.f17564b;
            if (j11 != 0) {
                strValueOf2 = String.valueOf(j11);
            } else {
                String str = aVar2.f17567e;
                if (str != null) {
                    strValueOf2 = str;
                } else {
                    strValueOf2 = aVar2.f17569g;
                    if (strValueOf2 == null) {
                        strValueOf2 = null;
                    }
                }
            }
        } else {
            strValueOf2 = null;
        }
        if (bVar.r == 1 && strValueOf != null && (this.f17622d == null || strValueOf2 == null || !strValueOf2.equals(strValueOf))) {
            bVar.f(1);
        }
        if (bVar.f17603i == 9) {
            bVar.e(0L);
            bVar.a(0L);
            bVar.a(0);
            bVar.b(9);
            bVar.d((String) null);
            bVar.e((String) null);
            bVar.c((String) null);
            bVar.c(0L);
            bVar.b(0L);
            bVar.a((String) null);
            bVar.g((String) null);
            bVar.i((String) null);
            bVar.e(0);
            long jAbs = Math.abs(bVar.f17610q - bVar.f17609p);
            bVar.g(0L);
            bVar.h(jAbs);
            bVar.i(0L);
            bVar.j(0L);
        }
        if (bVar.r == 0 && (aVar = this.f17622d) != null && aVar.r == 0) {
            bVar.f17609p = aVar.f17578q;
        }
        this.f17622d = new a(bVar);
        a(this.f17621c.getApplicationContext(), bVar.a());
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar, long j10, long j11) {
        a(cVar, 12, j10, cVar.m());
    }

    private void a(b bVar) {
        bVar.g(this.f17626h);
        bVar.f((String) null);
        bVar.b(this.f17620b.l());
        bVar.c(com.apple.android.music.playback.d.a.a(this.f17621c).h());
        bVar.a(a());
        bVar.h(this.f17620b.w());
        bVar.f17593G = this.f17631n;
        bVar.f17594H = this.f17632o;
    }

    private void a(com.apple.android.music.playback.c.c cVar, int i10, long j10, int i11) {
        this.f17627i = false;
        b bVar = new b();
        bVar.d(0);
        bVar.h(j10);
        bVar.e(i10);
        cVar.a(bVar, i11);
        a(bVar);
        a(cVar, bVar);
        b(bVar);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(com.apple.android.music.playback.c.c cVar) {
    }

    private void a(com.apple.android.music.playback.c.c cVar, int i10, long j10, b bVar) {
        this.f17627i = false;
        if (bVar == null) {
            return;
        }
        bVar.d(0);
        bVar.h(j10);
        bVar.e(i10);
        a(bVar);
        a(cVar, bVar);
        b(bVar);
        this.f17628j = null;
    }

    private boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f17621c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo == null || !activeNetworkInfo.isConnected();
    }

    public static void a(Context context, a aVar) {
        Intent intent = new Intent();
        intent.putExtra("playActivityEvent", aVar);
        intent.setAction("com.apple.android.music.playback.reporting.PLAY_ACTIVITY");
        if (Build.VERSION.SDK_INT >= 26) {
            ReportingServiceApi26.a(context, intent);
        } else {
            intent.setClass(context, ReportingService.class);
            context.startService(intent);
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(com.apple.android.music.playback.c.c cVar, int i10) {
    }

    private void a(com.apple.android.music.playback.c.c cVar, byte[] bArr) {
        b bVar = this.f17628j;
        if (bVar != null) {
            this.f17629l = bVar;
        }
        long jElapsedRealtime = cVar.r() ? SystemClock.elapsedRealtime() - this.f17630m : cVar.f();
        b bVar2 = this.f17629l;
        if (bVar2 != null) {
            bVar2.d(0);
            this.f17629l.a(bArr);
            this.f17629l.b(7);
            this.f17629l.e(0);
            b bVar3 = this.f17629l;
            bVar3.g(bVar3.f17610q);
            this.f17629l.h(jElapsedRealtime);
            a(cVar, this.f17629l);
            b(this.f17629l);
        }
    }

    private void b(com.apple.android.music.playback.c.c cVar, boolean z10) {
        b bVar = new b();
        bVar.d(1);
        cVar.a(bVar, cVar.m());
        this.f17626h = z10 ? 0L : cVar.f();
        a(bVar);
        this.f17628j = bVar;
        b(bVar);
    }

    private void a(com.apple.android.music.playback.c.c cVar, b bVar) {
        int i10 = bVar.f17603i;
        if (i10 == 4 || i10 == 7) {
            bVar.f(cVar.r() ? 0L : cVar.h());
        }
    }
}
