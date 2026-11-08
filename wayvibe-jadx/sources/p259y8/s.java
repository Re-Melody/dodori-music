package p259y8;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2362m f29189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C2362m c2362m, d dVar) {
        super(dVar);
        this.f29189c = c2362m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29187a = obj;
        this.f29188b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29189c.emit(null, this);
    }
}
