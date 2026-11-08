package P;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f9406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, S8.c cVar) {
        super(cVar);
        this.f9408c = pVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f9407b = obj;
        this.f9409d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f9408c.a(this);
    }
}
