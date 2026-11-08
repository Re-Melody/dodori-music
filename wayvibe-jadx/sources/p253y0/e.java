package p253y0;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f28738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f28742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, c cVar) {
        super(cVar);
        this.f28742e = gVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28741d = obj;
        this.f28743f |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f28742e.Z(0L, 0L, this);
    }
}
