package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p262z0.InterfaceC2442b;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2442b f29404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29406c;

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29405b = obj;
        this.f29406c |= MediaPlayerException.ERROR_UNKNOWN;
        return b1.a(null, this);
    }
}
