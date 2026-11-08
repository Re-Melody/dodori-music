package p080h4;

import Q8.d;
import R.b;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f20280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, d dVar) {
        super(dVar);
        this.f20280c = bVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f20278a = obj;
        this.f20279b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f20280c.emit(null, this);
    }
}
