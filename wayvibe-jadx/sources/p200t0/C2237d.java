package p200t0;

import N8.s;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: t0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2237d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f26446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f26447j;

    public C2237d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = G.f26395a;
            list = s.f8650a;
        }
        ArrayList arrayList = new ArrayList();
        this.f26438a = str;
        this.f26439b = f10;
        this.f26440c = f11;
        this.f26441d = f12;
        this.f26442e = f13;
        this.f26443f = f14;
        this.f26444g = f15;
        this.f26445h = f16;
        this.f26446i = list;
        this.f26447j = arrayList;
    }
}
