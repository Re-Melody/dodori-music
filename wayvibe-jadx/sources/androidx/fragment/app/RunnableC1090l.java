package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1090l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15356a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15358c;

    public /* synthetic */ RunnableC1090l(A0 a10, View view, Rect rect) {
        this.f15357b = view;
        this.f15358c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15356a) {
            case 0:
                F0 operation = (F0) this.f15357b;
                kotlin.jvm.internal.m.f(operation, "$operation");
                C1092m this$0 = (C1092m) this.f15358c;
                kotlin.jvm.internal.m.f(this$0, "this$0");
                if (AbstractC1083h0.J(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                A0.g((View) this.f15357b, (Rect) this.f15358c);
                break;
        }
    }

    public /* synthetic */ RunnableC1090l(F0 f10, C1092m c1092m) {
        this.f15357b = f10;
        this.f15358c = c1092m;
    }
}
