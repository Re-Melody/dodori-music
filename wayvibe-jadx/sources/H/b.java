package H;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p133m0.d f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f5706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, S8.c cVar2) {
        super(cVar2);
        this.f5706f = cVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f5705e = obj;
        this.f5707g |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f5706f.a(null, this);
    }
}
