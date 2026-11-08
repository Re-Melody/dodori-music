package p151n9;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: n9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2109k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2110l f23119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2106h f23121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2109k(C2110l c2110l, d dVar) {
        super(dVar);
        this.f23119c = c2110l;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f23117a = obj;
        this.f23118b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f23119c.collect(null, this);
    }
}
