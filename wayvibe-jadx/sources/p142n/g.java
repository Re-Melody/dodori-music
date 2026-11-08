package p142n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22615a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f22616b;

    public g(h hVar) {
        this.f22616b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f22616b.f22619c;
        n nVar = lVar.f22649v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f22639j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f22615a = i10;
                    return;
                }
            }
        }
        this.f22615a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        h hVar = this.f22616b;
        l lVar = hVar.f22619c;
        lVar.i();
        ArrayList arrayList = lVar.f22639j;
        hVar.getClass();
        int i11 = this.f22615a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f22616b;
        l lVar = hVar.f22619c;
        lVar.i();
        int size = lVar.f22639j.size();
        hVar.getClass();
        return this.f22615a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f22616b.f22618b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
