package U;

import G0.C0479j0;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: U.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893j0 extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0479j0 f11874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z8.c f11875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0479j0 f11877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893j0(C0479j0 c0479j0, S8.c cVar) {
        super(cVar);
        this.f11877d = c0479j0;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f11876c = obj;
        this.f11878e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f11877d.q(null, this);
    }
}
