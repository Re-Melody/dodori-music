package F;

import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: F.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358c extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q8.k f3525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0359d f3527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358c(C0359d c0359d, S8.c cVar) {
        super(cVar);
        this.f3527c = c0359d;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f3526b = obj;
        this.f3528d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f3527c.b(this);
    }
}
