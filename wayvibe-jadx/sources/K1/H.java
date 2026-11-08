package K1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7243d;

    public H() {
        if (p090i2.c.f20480b == null) {
            p090i2.c.f20480b = new p090i2.c(0);
        }
    }

    public int a(int i10) {
        if (i10 < this.f7242c) {
            return ((ByteBuffer) this.f7243d).getShort(this.f7241b + i10);
        }
        return 0;
    }

    public void b() {
        if (((O8.e) this.f7243d).f9355h != this.f7242c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i10 = this.f7240a;
            O8.e eVar = (O8.e) this.f7243d;
            if (i10 >= eVar.f9353f || eVar.f9350c[i10] >= 0) {
                return;
            } else {
                this.f7240a = i10 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        C0597b c0597b;
        if (Build.VERSION.SDK_INT >= this.f7241b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f7241b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f7240a);
            if (!((Class) this.f7243d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = T.d(view);
            if (accessibilityDelegateD == null) {
                c0597b = null;
            } else {
                c0597b = accessibilityDelegateD instanceof C0595a ? ((C0595a) accessibilityDelegateD).f7265a : new C0597b(accessibilityDelegateD);
            }
            if (c0597b == null) {
                c0597b = new C0597b();
            }
            T.i(view, c0597b);
            view.setTag(this.f7240a, obj);
            T.f(view, this.f7242c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f7240a < ((O8.e) this.f7243d).f9353f;
    }

    public void remove() {
        b();
        if (this.f7241b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        O8.e eVar = (O8.e) this.f7243d;
        eVar.g();
        eVar.q(this.f7241b);
        this.f7241b = -1;
        this.f7242c = eVar.f9355h;
    }
}
