package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class K extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f29430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f29432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(P p10, c cVar) {
        super(cVar);
        this.f29432c = p10;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29431b = obj;
        this.f29433d |= MediaPlayerException.ERROR_UNKNOWN;
        return P.r0(this.f29432c, this);
    }
}
