package L0;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f7456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f7458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, S8.c cVar) {
        super(cVar);
        this.f7458c = jVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f7457b = obj;
        this.f7459d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f7458c.b(0.0f, this);
    }
}
