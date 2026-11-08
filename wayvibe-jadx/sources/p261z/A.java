package p261z;

import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.x;
import p262z0.InterfaceC2442b;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2442b f29342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f29343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29345d;

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f29344c = obj;
        this.f29345d |= MediaPlayerException.ERROR_UNKNOWN;
        return G.a(null, 0L, this);
    }
}
