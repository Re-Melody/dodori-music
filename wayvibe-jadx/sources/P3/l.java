package P3;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9579b;

    public l(View view, ArrayList arrayList) {
        this.f9578a = view;
        this.f9579b = arrayList;
    }

    @Override // P3.r
    public final void a(s sVar) {
        sVar.w(this);
        this.f9578a.setVisibility(8);
        ArrayList arrayList = this.f9579b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // P3.r
    public final void c(s sVar) {
        sVar.w(this);
        sVar.a(this);
    }

    @Override // P3.r
    public final void b() {
    }

    @Override // P3.r
    public final void d() {
    }

    @Override // P3.r
    public final void e() {
    }
}
