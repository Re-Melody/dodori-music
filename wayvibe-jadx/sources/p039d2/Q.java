package p039d2;

import Z8.c;
import java.io.File;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f19131a = new Q(1);

    @Override // Z8.c
    public final Object invoke(Object obj) {
        File it = (File) obj;
        m.f(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        m.e(absolutePath, "file.canonicalFile.absolutePath");
        return new h0(absolutePath);
    }
}
