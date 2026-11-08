package G0;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: G0.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0468f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0468f1 f5216a = new C0468f1();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
