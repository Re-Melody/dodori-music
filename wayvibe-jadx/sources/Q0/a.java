package Q0;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f10546a;

    public a(e eVar) {
        this.f10546a = eVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f10546a.k(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f10546a.f(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f10546a.g(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f10546a.j(i10);
    }
}
