package M3;

import android.view.View;
import app.nagakiba.wayvibe.R;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements Z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f8272b = new i(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f8273c = new i(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f8274a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f8274a) {
            case 0:
                View view = (View) obj;
                m.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                m.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof h) {
                    return (h) tag;
                }
                return null;
        }
    }
}
