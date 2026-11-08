package G0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f5109a = new Q();

    public final boolean onClearTranslation(View view) {
        M0.a aVar;
        Z8.a aVar2;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p088i0.d contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f20403g = p088i0.a.SHOW_ORIGINAL;
        p199t.q qVarB = contentCaptureManager$ui_release.b();
        Object[] objArr = qVarB.f26311c;
        long[] jArr = qVarB.f26309a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        M0.j jVar = ((C0456b1) objArr[(i10 << 3) + i12]).f5190a.f8057d;
                        if (p046da.b.D(jVar, M0.r.f8102w) != null && (aVar = (M0.a) p046da.b.D(jVar, M0.i.f8033l)) != null && (aVar2 = (Z8.a) aVar.f8011b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        M0.a aVar;
        Z8.c cVar;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p088i0.d contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f20403g = p088i0.a.SHOW_ORIGINAL;
        p199t.q qVarB = contentCaptureManager$ui_release.b();
        Object[] objArr = qVarB.f26311c;
        long[] jArr = qVarB.f26309a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        M0.j jVar = ((C0456b1) objArr[(i10 << 3) + i12]).f5190a.f8057d;
                        if (kotlin.jvm.internal.m.b(p046da.b.D(jVar, M0.r.f8102w), Boolean.TRUE) && (aVar = (M0.a) p046da.b.D(jVar, M0.i.k)) != null && (cVar = (Z8.c) aVar.f8011b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        M0.a aVar;
        Z8.c cVar;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p088i0.d contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f20403g = p088i0.a.SHOW_TRANSLATED;
        p199t.q qVarB = contentCaptureManager$ui_release.b();
        Object[] objArr = qVarB.f26311c;
        long[] jArr = qVarB.f26309a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        M0.j jVar = ((C0456b1) objArr[(i10 << 3) + i12]).f5190a.f8057d;
                        if (kotlin.jvm.internal.m.b(p046da.b.D(jVar, M0.r.f8102w), Boolean.FALSE) && (aVar = (M0.a) p046da.b.D(jVar, M0.i.k)) != null && (cVar = (Z8.c) aVar.f8011b) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
