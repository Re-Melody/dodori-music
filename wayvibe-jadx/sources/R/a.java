package R;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Q8.d dVar) {
        super(dVar);
        this.f10600c = bVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f10598a = obj;
        this.f10599b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f10600c.emit(null, this);
    }
}
