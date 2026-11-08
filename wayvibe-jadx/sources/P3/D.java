package P3;

import android.view.View;
import android.view.ViewGroup;
import app.nagakiba.wayvibe.R;

/* JADX INFO: loaded from: classes.dex */
public final class D extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f9538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f9539d;

    public D(j jVar, ViewGroup viewGroup, View view, View view2) {
        this.f9539d = jVar;
        this.f9536a = viewGroup;
        this.f9537b = view;
        this.f9538c = view2;
    }

    @Override // P3.r
    public final void a(s sVar) {
        this.f9538c.setTag(R.id.save_overlay_view, null);
        this.f9536a.getOverlay().remove(this.f9537b);
        sVar.w(this);
    }

    @Override // P3.t, P3.r
    public final void b() {
        this.f9536a.getOverlay().remove(this.f9537b);
    }

    @Override // P3.t, P3.r
    public final void e() {
        View view = this.f9537b;
        if (view.getParent() == null) {
            this.f9536a.getOverlay().add(view);
        } else {
            this.f9539d.cancel();
        }
    }
}
