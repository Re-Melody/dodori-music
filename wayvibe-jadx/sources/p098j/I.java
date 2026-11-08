package p098j;

import B8.r0;
import S9.b;
import android.os.Messenger;
import android.view.Menu;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import org.maplibre.android.log.Logger;
import p142n.l;
import p152o.C2161u0;
import p223v2.i;
import s7.AbstractC2221b;
import s7.s;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21268b;

    public /* synthetic */ I(Object obj, int i10) {
        this.f21267a = i10;
        this.f21268b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21267a) {
            case 0:
                J j10 = (J) this.f21268b;
                y yVar = j10.f21270b;
                Menu menuQ = j10.q();
                l lVar = menuQ instanceof l ? (l) menuQ : null;
                if (lVar != null) {
                    lVar.w();
                }
                try {
                    menuQ.clear();
                    if (!yVar.onCreatePanelMenu(0, menuQ) || !yVar.onPreparePanel(0, null, menuQ)) {
                        menuQ.clear();
                    }
                    if (lVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (lVar != null) {
                        lVar.v();
                    }
                }
                break;
            case 1:
                try {
                    ((Runnable) this.f21268b).run();
                    return;
                } catch (Exception e2) {
                    b.q("Executor", "Background execution failure.", e2);
                    return;
                }
            case 2:
                C2161u0 c2161u0 = (C2161u0) this.f21268b;
                c2161u0.f23452l = null;
                c2161u0.drawableStateChanged();
                return;
            case 3:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f21268b;
                if (searchView$SearchAutoComplete.f14524f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f14524f = false;
                    return;
                }
                return;
            case 4:
                ((Toolbar) this.f21268b).u();
                return;
            case 5:
                String str = (String) this.f21268b;
                try {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.delete()) {
                            Logger.d("Mbgl-FileUtils", "File deleted to save space: " + str);
                        } else {
                            Logger.e("Mbgl-FileUtils", "Failed to delete file: " + str);
                        }
                    }
                    return;
                } catch (Exception e4) {
                    Logger.e("Mbgl-FileUtils", "Failed to delete file: ", e4);
                    return;
                }
            case 6:
                AbstractC2221b abstractC2221b = (AbstractC2221b) this.f21268b;
                if (abstractC2221b.c()) {
                    abstractC2221b.a(s.Initial, r0.f848e);
                    return;
                }
                return;
            default:
                i iVar = (i) this.f21268b;
                iVar.f27457g.f27492d.remove(((Messenger) iVar.f27454d.f24715a).getBinder());
                return;
        }
    }
}
