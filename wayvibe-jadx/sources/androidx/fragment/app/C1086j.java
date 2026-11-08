package androidx.fragment.app;

import android.animation.AnimatorSet;

/* JADX INFO: renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1086j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1086j f15345a = new C1086j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.m.f(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j10) {
        kotlin.jvm.internal.m.f(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j10);
    }
}
