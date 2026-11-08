package p030c4;

import Z8.c;
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15888a = new e(1);

    @Override // Z8.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        m.f(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
