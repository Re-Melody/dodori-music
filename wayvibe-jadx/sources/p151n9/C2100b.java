package p151n9;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p141m9.r;

/* JADX INFO: renamed from: n9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2100b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f23094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2101c f23096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2100b(C2101c c2101c, c cVar) {
        super(cVar);
        this.f23096c = c2101c;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f23095b = obj;
        this.f23097d |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f23096c.b(null, this);
    }
}
