package H2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: H2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539i extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0540j f5907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539i(C0540j c0540j, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f5907c = c0540j;
        this.f5905a = contentResolver;
        this.f5906b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C0540j c0540j = this.f5907c;
        c0540j.a(C0536f.c(c0540j.f5908a, c0540j.f5916i, c0540j.f5915h));
    }
}
