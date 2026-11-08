package G;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class N extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f4743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, S8.c cVar) {
        super(cVar);
        this.f4743b = o10;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f4742a = obj;
        this.f4744c |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f4743b.a(null, 0.0f, this);
    }
}
