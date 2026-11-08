package p070g4;

import S8.c;
import android.graphics.Bitmap;
import com.apple.android.music.playback.model.MediaPlayerException;
import p185r4.a;
import p185r4.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f20087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f20088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f20089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f20090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f20091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f20092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f20093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20094h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, c cVar) {
        super(cVar);
        this.f20093g = mVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.f20092f = obj;
        this.f20094h |= MediaPlayerException.ERROR_UNKNOWN;
        return m.a(this.f20093g, null, 0, this);
    }
}
