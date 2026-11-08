package p259y8;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: y8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2361l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2362m f29164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2361l(C2362m c2362m, d dVar) {
        super(dVar);
        this.f29164c = c2362m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29162a = obj;
        this.f29163b |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f29164c.emit(null, this);
    }
}
