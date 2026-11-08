package p259y8;

import Q8.d;
import R.b;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f29219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b bVar, d dVar) {
        super(dVar);
        this.f29219c = bVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29217a = obj;
        this.f29218b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29219c.emit(null, this);
    }
}
