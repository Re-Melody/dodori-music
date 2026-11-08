package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p262z0.InterfaceC2442b;

/* JADX INFO: loaded from: classes.dex */
public final class F extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2442b f29400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z8.c f29401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29403d;

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29402c = obj;
        this.f29403d |= MediaPlayerException.ERROR_UNKNOWN;
        return G.c(null, 0L, null, this);
    }
}
