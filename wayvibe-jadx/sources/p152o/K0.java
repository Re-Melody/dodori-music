package p152o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p142n.i;
import p142n.l;
import p142n.n;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends C2161u0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public H0 f23229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n f23230p;

    public K0(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f23227m = 21;
            this.f23228n = 22;
        } else {
            this.f23227m = 22;
            this.f23228n = 21;
        }
    }

    @Override // p152o.C2161u0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        i iVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f23229o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (i) adapter;
                headersCount = 0;
            }
            n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            n nVar = this.f23230p;
            if (nVar != nVarB) {
                l lVar = iVar.f22623a;
                if (nVar != null) {
                    this.f23229o.n(lVar, nVar);
                }
                this.f23230p = nVarB;
                if (nVarB != null) {
                    this.f23229o.t(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f23227m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f23228n) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (i) adapter).f22623a.c(false);
        return true;
    }

    public void setHoverListener(H0 h10) {
        this.f23229o = h10;
    }

    @Override // p152o.C2161u0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
