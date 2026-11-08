package p030c4;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f15886a = new c(1);

    @Override // Z8.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        m.f(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
