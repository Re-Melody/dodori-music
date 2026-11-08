package p039d2;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f19125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f19127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p10, c cVar) {
        super(cVar);
        this.f19127d = p10;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f19126c = obj;
        this.f19128e |= MediaPlayerException.ERROR_UNKNOWN;
        return P.a(this.f19127d, this);
    }
}
