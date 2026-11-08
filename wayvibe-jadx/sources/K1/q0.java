package K1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends p0 {
    public q0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // K1.v0
    public z0 a() {
        return z0.g(null, this.f7329c.consumeDisplayCutout());
    }

    @Override // K1.v0
    public C0606h e() {
        DisplayCutout displayCutout = this.f7329c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0606h(displayCutout);
    }

    @Override // K1.o0, K1.v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f7329c, q0Var.f7329c) && Objects.equals(this.f7333g, q0Var.f7333g) && o0.B(this.f7334h, q0Var.f7334h);
    }

    @Override // K1.v0
    public int hashCode() {
        return this.f7329c.hashCode();
    }
}
