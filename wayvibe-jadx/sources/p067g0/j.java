package p067g0;

import Z8.e;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f19958a = new j(2);

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        p pVar = (p) obj2;
        if (str.length() == 0) {
            return pVar.toString();
        }
        return str + ", " + pVar;
    }
}
