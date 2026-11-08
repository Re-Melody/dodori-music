package com.apple.android.music.playback;

import com.apple.android.music.playback.c.c.j;
import com.apple.android.music.playback.c.d;
import com.apple.android.music.playback.g.b;
import com.apple.android.music.playback.g.f;
import com.apple.android.music.playback.g.g;
import com.apple.android.music.playback.model.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class a implements j, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f17016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<j.a> f17017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f17018c = new AtomicBoolean(false);

    public a(d dVar, j.a aVar) {
        this.f17016a = dVar;
        this.f17017b = new WeakReference<>(aVar);
    }

    @Override // com.apple.android.music.playback.c.c.j
    public String a() {
        return null;
    }

    @Override // com.apple.android.music.playback.c.c.j
    public boolean a(boolean z10) {
        return true;
    }

    @Override // com.apple.android.music.playback.c.c.j
    public i a(long j10, String[] strArr, boolean z10) throws Throwable {
        String.format("requestAsset: id = %d, forceLease = %b", Long.valueOf(j10), Boolean.valueOf(z10));
        f fVar = new f(this.f17016a, j10);
        fVar.a();
        g gVarB = fVar.b();
        if (gVarB != null) {
            String strB = gVarB.b();
            if (strB != null && !strB.isEmpty()) {
                String strC = gVarB.c();
                String.format("ERROR requestAsset: id = %d failureType = %s", Long.valueOf(j10), strB);
                a(Integer.valueOf(strB).intValue(), strC);
                return null;
            }
            List<b> listA = gVarB.a();
            if (listA != null && !listA.isEmpty()) {
                b bVar = listA.get(0);
                String strD = bVar.d();
                String strC2 = bVar.c();
                if (strC2 != null && !strC2.isEmpty() && strD != null && !strD.isEmpty()) {
                    i iVar = new i(j10, "", 7);
                    iVar.d(bVar.a());
                    iVar.b(strC2);
                    iVar.a(strD);
                    iVar.c(".m3u8");
                    iVar.a(z10);
                    return iVar;
                }
                i iVar2 = new i(j10, "", 1);
                iVar2.d(bVar.a());
                iVar2.a(bVar.b());
                return iVar2;
            }
            String.format("ERROR requestAsset: id = %d EMPTY ASSETS", Long.valueOf(j10));
            return null;
        }
        String.format("ERROR requestAsset: id = %d NULL RESPONSE", Long.valueOf(j10));
        return null;
    }

    @Override // com.apple.android.music.playback.c.c.j.a
    public void a(int i10, String str) {
        this.f17018c.set(false);
        j.a aVar = this.f17017b.get();
        if (aVar != null) {
            aVar.a(i10, str);
        }
    }
}
