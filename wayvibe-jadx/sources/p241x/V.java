package p241x;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class V extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f28154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f28156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y6, c cVar) {
        super(cVar);
        this.f28156c = y6;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f28155b = obj;
        this.f28157d |= MediaPlayerException.ERROR_UNKNOWN;
        return Y.p0(this.f28156c, this);
    }
}
