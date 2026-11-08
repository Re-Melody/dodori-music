package p259y8;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2362m f29208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C2362m c2362m, d dVar) {
        super(dVar);
        this.f29208c = c2362m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29206a = obj;
        this.f29207b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29208c.emit(null, this);
    }
}
