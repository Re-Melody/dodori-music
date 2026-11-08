package p039d2;

import Q8.d;
import R.b;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f19247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, d dVar) {
        super(dVar);
        this.f19247c = bVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f19245a = obj;
        this.f19246b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f19247c.emit(null, this);
    }
}
