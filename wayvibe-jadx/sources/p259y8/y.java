package p259y8;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2362m f29216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C2362m c2362m, d dVar) {
        super(dVar);
        this.f29216c = c2362m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29214a = obj;
        this.f29215b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29216c.emit(null, this);
    }
}
