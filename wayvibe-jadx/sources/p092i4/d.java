package p092i4;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import t9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f20487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f20488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f20490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(cVar);
        this.f20490d = eVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f20489c = obj;
        this.f20491e |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f20490d.a(this);
    }
}
