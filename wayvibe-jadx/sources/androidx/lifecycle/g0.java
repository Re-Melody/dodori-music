package androidx.lifecycle;

import android.view.View;
import app.nagakiba.wayvibe.R;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f15557b = new g0(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f15558c = new g0(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f15559d = new g0(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f15560e = new g0(1, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10, int i11) {
        super(i10);
        this.f15561a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f15561a) {
            case 0:
                View currentView = (View) obj;
                kotlin.jvm.internal.m.f(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View viewParent = (View) obj;
                kotlin.jvm.internal.m.f(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC1125u) {
                    return (InterfaceC1125u) tag;
                }
                return null;
            case 2:
                View view = (View) obj;
                kotlin.jvm.internal.m.f(view, "view");
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view2 = (View) obj;
                kotlin.jvm.internal.m.f(view2, "view");
                Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof f0) {
                    return (f0) tag2;
                }
                return null;
        }
    }
}
