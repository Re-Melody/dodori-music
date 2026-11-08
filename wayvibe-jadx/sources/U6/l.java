package U6;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12263a;

    public l(m mVar) {
        this.f12263a = mVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        m mVar = this.f12263a;
        try {
            j jVar = j.f12260c;
            Mac mac = (Mac) jVar.f12262a.s(mVar.f12266b);
            mac.init(mVar.f12267c);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
