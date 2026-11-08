package p253y0;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, c cVar) {
        super(cVar);
        this.f28730b = dVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28729a = obj;
        this.f28731c |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f28730b.a(0L, 0L, this);
    }
}
