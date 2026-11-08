package p036d;

import G0.C0493p;
import N8.k;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.EnumC1120o;
import androidx.lifecycle.InterfaceC1125u;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f18958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f18959b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f18960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f18961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f18962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18964g;

    public G(Runnable runnable) {
        this.f18958a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f18961d = i10 >= 34 ? D.f18951a.a(new y(this, 0), new y(this, 1), new z(this, 0), new z(this, 1)) : B.f18946a.a(new z(this, 2));
        }
    }

    public final void a(InterfaceC1125u owner, x onBackPressedCallback) {
        m.f(owner, "owner");
        m.f(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1121p lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == EnumC1120o.DESTROYED) {
            return;
        }
        onBackPressedCallback.f19003b.add(new E(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f19004c = new C0493p(0, this, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
    }

    public final void b() {
        Object objPrevious;
        x xVar = this.f18960c;
        if (xVar == null) {
            k kVar = this.f18959b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f19002a);
            xVar = (x) objPrevious;
        }
        this.f18960c = null;
        if (xVar != null) {
            xVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        x xVar = this.f18960c;
        if (xVar == null) {
            k kVar = this.f18959b;
            ListIterator listIterator = kVar.listIterator(kVar.k());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f19002a);
            xVar = (x) objPrevious;
        }
        this.f18960c = null;
        if (xVar != null) {
            xVar.b();
        } else {
            this.f18958a.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f18962e;
        OnBackInvokedCallback onBackInvokedCallback = this.f18961d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        B b10 = B.f18946a;
        if (z10 && !this.f18963f) {
            b10.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f18963f = true;
        } else {
            if (z10 || !this.f18963f) {
                return;
            }
            b10.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18963f = false;
        }
    }

    public final void e() {
        boolean z10 = this.f18964g;
        boolean z11 = false;
        k kVar = this.f18959b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<E> it = kVar.iterator();
            while (it.hasNext()) {
                if (((x) it.next()).f19002a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f18964g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }
}
