package p039d2;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class W extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f19154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileOutputStream f19155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f19157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x10, c cVar) {
        super(cVar);
        this.f19157d = x10;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f19156c = obj;
        this.f19158e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f19157d.b(null, this);
    }
}
