package p142n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22624b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f22627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22628f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f22626d = z10;
        this.f22627e = layoutInflater;
        this.f22623a = lVar;
        this.f22628f = i10;
        a();
    }

    public final void a() {
        l lVar = this.f22623a;
        n nVar = lVar.f22649v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f22639j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f22624b = i10;
                    return;
                }
            }
        }
        this.f22624b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        ArrayList arrayListL;
        l lVar = this.f22623a;
        if (this.f22626d) {
            lVar.i();
            arrayListL = lVar.f22639j;
        } else {
            arrayListL = lVar.l();
        }
        int i11 = this.f22624b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        l lVar = this.f22623a;
        if (this.f22626d) {
            lVar.i();
            arrayListL = lVar.f22639j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f22624b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f22627e.inflate(this.f22628f, viewGroup, false);
        }
        int i11 = getItem(i10).f22659b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f22659b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f22623a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f22625c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
