package p141m9;

import S8.c;
import Z8.a;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f22534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22536c;

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f22535b = obj;
        this.f22536c |= MediaPlayerException.ERROR_UNKNOWN;
        return j.b(null, null, this);
    }
}
