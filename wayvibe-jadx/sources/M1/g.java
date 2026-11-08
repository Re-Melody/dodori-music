package M1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f8114a;

    public g(Object obj) {
        this.f8114a = (InputContentInfo) obj;
    }

    @Override // M1.h
    public final ClipDescription getDescription() {
        return this.f8114a.getDescription();
    }

    @Override // M1.h
    public final Uri h() {
        return this.f8114a.getContentUri();
    }

    @Override // M1.h
    public final void j() {
        this.f8114a.requestPermission();
    }

    @Override // M1.h
    public final Uri l() {
        return this.f8114a.getLinkUri();
    }

    @Override // M1.h
    public final Object z() {
        return this.f8114a;
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f8114a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
