package T0;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: T0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0808k extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0816t f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0810m f11516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0808k(C0810m c0810m, S8.c cVar) {
        super(cVar);
        this.f11516c = c0810m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f11515b = obj;
        this.f11517d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f11516c.b(null, this);
    }
}
