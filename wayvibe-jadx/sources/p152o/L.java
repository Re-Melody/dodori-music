package p152o;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class L implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f23231a;

    public L(N n6) {
        this.f23231a = n6;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        N n6 = this.f23231a;
        n6.f23240F.setSelection(i10);
        Q q5 = n6.f23240F;
        if (q5.getOnItemClickListener() != null) {
            q5.performItemClick(view, i10, n6.f23237C.getItemId(i10));
        }
        n6.dismiss();
    }
}
