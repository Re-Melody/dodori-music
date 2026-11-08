package p253y0;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28734c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, S8.c cVar) {
        super(cVar);
        this.f28733b = dVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28732a = obj;
        this.f28734c |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f28733b.b(0L, this);
    }
}
