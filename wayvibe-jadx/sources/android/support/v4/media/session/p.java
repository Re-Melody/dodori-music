package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    @Override // android.support.v4.media.session.o
    public final p223v2.u c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f14396a.getCurrentControllerInfo();
        p223v2.u uVar = new p223v2.u();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        uVar.f27495a = new p223v2.v(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return uVar;
    }

    @Override // android.support.v4.media.session.o
    public final void f(p223v2.u uVar) {
    }
}
