package Q;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V0 f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T0 f9979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t9.a f9980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V0 f9982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(V0 v3, S8.c cVar) {
        super(cVar);
        this.f9982e = v3;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f9981d = obj;
        this.f9983f |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f9982e.a(null, this);
    }
}
