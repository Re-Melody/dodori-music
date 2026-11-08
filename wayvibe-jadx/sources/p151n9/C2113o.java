package p151n9;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: n9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2113o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2103e f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2103e f23136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2113o(C2103e c2103e, d dVar) {
        super(dVar);
        this.f23136d = c2103e;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f23135c = obj;
        this.f23137e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f23136d.emit(null, this);
    }
}
