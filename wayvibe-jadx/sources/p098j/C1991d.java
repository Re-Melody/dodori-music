package p098j;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: j.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1991d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1995h f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1992e f21316b;

    public C1991d(C1992e c1992e, C1995h c1995h) {
        this.f21316b = c1992e;
        this.f21315a = c1995h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        C1992e c1992e = this.f21316b;
        DialogInterface.OnClickListener onClickListener = c1992e.f21324h;
        C1995h c1995h = this.f21315a;
        onClickListener.onClick(c1995h.f21330b, i10);
        if (c1992e.f21325i) {
            return;
        }
        c1995h.f21330b.dismiss();
    }
}
