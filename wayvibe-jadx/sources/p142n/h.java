package p142n;

import A1.d;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p098j.C1992e;
import p098j.DialogInterfaceC1996i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f22618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f22619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f22620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f22621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f22622f;

    public h(ContextWrapper contextWrapper) {
        this.f22617a = contextWrapper;
        this.f22618b = LayoutInflater.from(contextWrapper);
    }

    @Override // p142n.x
    public final void a(l lVar, boolean z10) {
        w wVar = this.f22621e;
        if (wVar != null) {
            wVar.a(lVar, z10);
        }
    }

    @Override // p142n.x
    public final void c(Context context, l lVar) {
        if (this.f22617a != null) {
            this.f22617a = context;
            if (this.f22618b == null) {
                this.f22618b = LayoutInflater.from(context);
            }
        }
        this.f22619c = lVar;
        g gVar = this.f22622f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p142n.x
    public final boolean d(D d10) {
        if (!d10.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f22652a = d10;
        Context context = d10.f22630a;
        d dVar = new d(context);
        C1992e c1992e = (C1992e) dVar.f117c;
        h hVar = new h(c1992e.f21317a);
        mVar.f22654c = hVar;
        hVar.f22621e = mVar;
        d10.b(hVar, context);
        h hVar2 = mVar.f22654c;
        if (hVar2.f22622f == null) {
            hVar2.f22622f = new g(hVar2);
        }
        c1992e.f21323g = hVar2.f22622f;
        c1992e.f21324h = mVar;
        View view = d10.f22643o;
        if (view != null) {
            c1992e.f21321e = view;
        } else {
            c1992e.f21319c = d10.f22642n;
            c1992e.f21320d = d10.f22641m;
        }
        c1992e.f21322f = mVar;
        DialogInterfaceC1996i dialogInterfaceC1996iF = dVar.f();
        mVar.f22653b = dialogInterfaceC1996iF;
        dialogInterfaceC1996iF.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f22653b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f22653b.show();
        w wVar = this.f22621e;
        if (wVar == null) {
            return true;
        }
        wVar.b(d10);
        return true;
    }

    @Override // p142n.x
    public final boolean e() {
        return false;
    }

    @Override // p142n.x
    public final void g() {
        g gVar = this.f22622f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p142n.x
    public final boolean i(n nVar) {
        return false;
    }

    @Override // p142n.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // p142n.x
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f22619c.q(this.f22622f.getItem(i10), this, 0);
    }
}
