package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.x;

/* JADX INFO: renamed from: z.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2434w0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f29689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0 f29691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2434w0(C0 c3, c cVar) {
        super(cVar);
        this.f29691c = c3;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29690b = obj;
        this.f29692d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29691c.b(0L, this);
    }
}
