package P0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9466a = new b();

    /* JADX WARN: Type inference failed for: r0v2, types: [P0.a] */
    public final int[] a(z zVar, RectF rectF, int i10, final Z8.e eVar) {
        SegmentFinder segmentFinderL;
        if (i10 == 1) {
            segmentFinderL = Q0.b.f10547a.a(new M.s(26, zVar.f9508e.getText(), zVar.j()));
        } else {
            O1.e.m();
            segmentFinderL = O1.e.l(O1.e.k(zVar.f9508e.getText(), zVar.f9504a));
        }
        return zVar.f9508e.getRangeForRect(rectF, segmentFinderL, new Layout.TextInclusionStrategy() { // from class: P0.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) eVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
