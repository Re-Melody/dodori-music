package T0;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: T0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801d extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0802e f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0802e f11494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0801d(C0802e c0802e, S8.c cVar) {
        super(cVar);
        this.f11494d = c0802e;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f11493c = obj;
        this.f11495e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f11494d.a(null, this);
    }
}
