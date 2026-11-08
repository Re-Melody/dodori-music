package p197s6;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f26149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p116k6.a f26151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f26152d;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, p116k6.a aVar) {
        this.f26152d = expandableBehavior;
        this.f26149a = view;
        this.f26150b = i10;
        this.f26151c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f26149a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f26152d;
        if (expandableBehavior.f18226a == this.f26150b) {
            Object obj = this.f26151c;
            expandableBehavior.s((View) obj, view, ((FloatingActionButton) obj).f18203o.f824c, false);
        }
        return false;
    }
}
