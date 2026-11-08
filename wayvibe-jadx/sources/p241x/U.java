package p241x;

import B.h;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class U extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f28149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f28150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f28152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Y y6, c cVar) {
        super(cVar);
        this.f28152d = y6;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28151c = obj;
        this.f28153e |= MediaPlayerException.ERROR_UNKNOWN;
        return Y.o0(this.f28152d, this);
    }
}
