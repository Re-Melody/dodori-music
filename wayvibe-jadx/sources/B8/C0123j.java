package B8;

import K1.InterfaceC0596a0;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: B8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0123j implements InterfaceC0596a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f825d;

    public /* synthetic */ C0123j(int i10) {
        this.f822a = i10;
    }

    @Override // K1.InterfaceC0596a0
    public void a() {
        this.f824c = true;
    }

    @Override // K1.InterfaceC0596a0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f824c = false;
    }

    @Override // K1.InterfaceC0596a0
    public void c() {
        if (this.f824c) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f825d;
        actionBarContextView.f14458f = null;
        super/*android.view.View*/.setVisibility(this.f823b);
    }

    public String toString() {
        switch (this.f822a) {
            case 0:
                U.P pF = p228v8.a.f(this);
                pF.c((C0118e) this.f825d, "callOptions");
                pF.e("previousAttempts", String.valueOf(this.f823b));
                pF.d("isTransparentRetry", this.f824c);
                return pF.toString();
            default:
                return super.toString();
        }
    }

    public C0123j(FloatingActionButton floatingActionButton) {
        this.f822a = 4;
        this.f824c = false;
        this.f823b = 0;
        this.f825d = floatingActionButton;
    }

    public C0123j(C0118e c0118e, int i10, boolean z10) {
        this.f822a = 0;
        p229v9.a.k(c0118e, "callOptions");
        this.f825d = c0118e;
        this.f823b = i10;
        this.f824c = z10;
    }

    public C0123j() {
        this.f822a = 2;
        this.f823b = -1;
        this.f825d = new W.d(new F.J[16]);
    }

    public C0123j(ActionBarContextView actionBarContextView) {
        this.f822a = 5;
        this.f825d = actionBarContextView;
        this.f824c = false;
    }
}
