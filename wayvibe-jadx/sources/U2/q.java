package U2;

import B2.AbstractC0111a;
import p255y2.P;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f12161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f12162b;

    public q(P p10, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0111a.m("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f12161a = p10;
        this.f12162b = iArr;
    }
}
