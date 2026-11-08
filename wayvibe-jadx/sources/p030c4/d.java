package p030c4;

import Z8.c;
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15887a = new d(1);

    @Override // Z8.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        m.f(require, "$this$require");
        boolean z10 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
