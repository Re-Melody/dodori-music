package p259y8;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p151n9.C2103e;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2103e f29178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C2103e c2103e, d dVar) {
        super(dVar);
        this.f29178c = c2103e;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29176a = obj;
        this.f29177b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29178c.emit(null, this);
    }
}
