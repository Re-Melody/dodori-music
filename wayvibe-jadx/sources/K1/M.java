package K1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i10) {
        view.setImportantForAutofill(i10);
    }
}
