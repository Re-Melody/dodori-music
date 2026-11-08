package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15464e;

    public z0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f15460a = i10;
        this.f15461b = arrayList;
        this.f15462c = arrayList2;
        this.f15463d = arrayList3;
        this.f15464e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f15460a; i10++) {
            View view = (View) this.f15461b.get(i10);
            String str = (String) this.f15462c.get(i10);
            WeakHashMap weakHashMap = K1.T.f7251a;
            K1.K.m(view, str);
            K1.K.m((View) this.f15463d.get(i10), (String) this.f15464e.get(i10));
        }
    }
}
