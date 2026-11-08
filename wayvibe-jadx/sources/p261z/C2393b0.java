package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: z.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2393b0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2397d0 f29546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2397d0 f29548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2393b0(C2397d0 c2397d0, c cVar) {
        super(cVar);
        this.f29548c = c2397d0;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29547b = obj;
        this.f29549d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29548c.b(this);
    }
}
