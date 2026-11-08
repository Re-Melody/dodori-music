package T0;

import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.List;

/* JADX INFO: renamed from: T0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0806i extends S8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0810m f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0816t f11505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0810m f11509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806i(C0810m c0810m, S8.c cVar) {
        super(cVar);
        this.f11509g = c0810m;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f11508f = obj;
        this.f11510h |= MediaPlayerException.ERROR_UNKNOWN;
        return this.f11509g.a(this);
    }
}
