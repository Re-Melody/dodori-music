package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: z.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2395c0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2397d0 f29554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2397d0 f29556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2395c0(C2397d0 c2397d0, c cVar) {
        super(cVar);
        this.f29556c = c2397d0;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29555b = obj;
        this.f29557d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29556c.d(this);
    }
}
