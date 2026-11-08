package p101j2;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import p078h2.e;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21446a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f21447b;

    public g(EditText editText) {
        this.f21447b = new WeakReference(editText);
    }

    @Override // p078h2.e
    public void a() {
        switch (this.f21446a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f21447b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // p078h2.e
    public final void b() {
        switch (this.f21446a) {
            case 0:
                h.a((EditText) this.f21447b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f21447b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public g(SwitchCompat switchCompat) {
        this.f21447b = new WeakReference(switchCompat);
    }
}
