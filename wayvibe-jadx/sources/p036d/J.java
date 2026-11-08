package p036d;

import Z8.c;
import android.content.res.Resources;
import android.view.View;
import app.nagakiba.wayvibe.R;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class J extends n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f18966b = new J(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f18967c = new J(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f18968d = new J(1, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i10, int i11) {
        super(i10);
        this.f18969a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f18969a) {
            case 0:
                Resources resources = (Resources) obj;
                m.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View it = (View) obj;
                m.f(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                m.f(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof I) {
                    return (I) tag;
                }
                return null;
        }
    }
}
