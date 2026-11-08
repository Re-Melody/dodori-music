package p253y0;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f28744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f28747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c cVar) {
        super(cVar);
        this.f28747d = gVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28746c = obj;
        this.f28748e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f28747d.P(0L, this);
    }
}
