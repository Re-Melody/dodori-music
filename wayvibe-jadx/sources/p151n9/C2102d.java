package p151n9;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: renamed from: n9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2102d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2103e f23101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2102d(C2103e c2103e, d dVar) {
        super(dVar);
        this.f23101b = c2103e;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f23100a = obj;
        this.f23102c |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f23101b.emit(null, this);
    }
}
