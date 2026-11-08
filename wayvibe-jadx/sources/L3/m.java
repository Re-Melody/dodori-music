package L3;

import D8.AbstractC0311s0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0311s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7757b;

    public m(s sVar, int i10) {
        this.f7757b = i10;
        new Rect();
        this.f2777a = sVar;
    }

    @Override // D8.AbstractC0311s0
    public final int d(View view) {
        switch (this.f7757b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f2777a).getClass();
                return view.getRight() + ((t) view.getLayoutParams()).f7770a.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f2777a).getClass();
                return view.getBottom() + ((t) view.getLayoutParams()).f7770a.bottom + ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
        }
    }

    @Override // D8.AbstractC0311s0
    public final int e(View view) {
        switch (this.f7757b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f2777a).getClass();
                return (view.getLeft() - ((t) view.getLayoutParams()).f7770a.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f2777a).getClass();
                return (view.getTop() - ((t) view.getLayoutParams()).f7770a.top) - ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
        }
    }

    @Override // D8.AbstractC0311s0
    public final int g() {
        switch (this.f7757b) {
            case 0:
                s sVar = (s) this.f2777a;
                return sVar.f7768f - sVar.t();
            default:
                s sVar2 = (s) this.f2777a;
                return sVar2.f7769g - sVar2.r();
        }
    }

    @Override // D8.AbstractC0311s0
    public final int h() {
        switch (this.f7757b) {
            case 0:
                return ((s) this.f2777a).s();
            default:
                return ((s) this.f2777a).u();
        }
    }

    @Override // D8.AbstractC0311s0
    public final int i() {
        switch (this.f7757b) {
            case 0:
                s sVar = (s) this.f2777a;
                return (sVar.f7768f - sVar.s()) - sVar.t();
            default:
                s sVar2 = (s) this.f2777a;
                return (sVar2.f7769g - sVar2.u()) - sVar2.r();
        }
    }
}
