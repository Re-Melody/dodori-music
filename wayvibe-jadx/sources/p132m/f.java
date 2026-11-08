package p132m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p142n.A;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22133b;

    public f(Context context, b bVar) {
        this.f22132a = context;
        this.f22133b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f22133b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f22133b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new A(this.f22132a, this.f22133b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f22133b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f22133b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f22133b.f22118a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f22133b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f22133b.f22119b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f22133b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f22133b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f22133b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f22133b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f22133b.f22118a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f22133b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f22133b.o(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f22133b.k(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f22133b.m(i10);
    }
}
