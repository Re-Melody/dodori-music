package A;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f60b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, S8.c cVar) {
        super(cVar);
        this.f60b = hVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f59a = obj;
        this.f61c |= MediaPlayerException.ERROR_UNKNOWN;
        return h.b(this.f60b, null, 0.0f, 0.0f, null, this);
    }
}
