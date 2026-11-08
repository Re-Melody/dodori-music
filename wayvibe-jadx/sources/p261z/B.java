package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.y;
import p262z0.r;

/* JADX INFO: loaded from: classes.dex */
public final class B extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f29350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f29351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29353d;

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29352c = obj;
        this.f29353d |= MediaPlayerException.ERROR_UNKNOWN;
        return G.b(null, 0L, this);
    }
}
