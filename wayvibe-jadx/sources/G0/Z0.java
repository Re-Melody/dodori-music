package G0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements F0.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f5176c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f5177d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M0.h f5178e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M0.h f5179f = null;

    public Z0(int i10, ArrayList arrayList) {
        this.f5174a = i10;
        this.f5175b = arrayList;
    }

    @Override // F0.q0
    public final boolean m() {
        return this.f5175b.contains(this);
    }
}
