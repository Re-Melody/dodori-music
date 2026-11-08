package G0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: G0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5186b;

    public AbstractC0454b(Bundle data, String str) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f5185a = str;
        this.f5186b = data;
    }

    public void c() {
        B2.r rVar = (B2.r) this.f5185a;
        if (rVar != null) {
            try {
                ((p098j.C) this.f5186b).k.unregisterReceiver(rVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5185a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i10);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof D1.a)) {
            return menuItem;
        }
        D1.a aVar = (D1.a) menuItem;
        if (((p199t.G) this.f5186b) == null) {
            this.f5186b = new p199t.G(0);
        }
        MenuItem menuItem2 = (MenuItem) ((p199t.G) this.f5186b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p142n.s sVar = new p142n.s((Context) this.f5185a, aVar);
        ((p199t.G) this.f5186b).put(aVar, sVar);
        return sVar;
    }

    public int[] h(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f5186b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String i() {
        String str = (String) this.f5185a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.m.l("text");
        throw null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract int[] n(int i10);

    public void o() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((B2.r) this.f5185a) == null) {
            this.f5185a = new B2.r(this, 2);
        }
        ((p098j.C) this.f5186b).k.registerReceiver((B2.r) this.f5185a, intentFilterD);
    }

    public AbstractC0454b(Context context) {
        this.f5185a = context;
    }

    public AbstractC0454b(String str, List list) {
        this.f5185a = str;
        this.f5186b = Collections.unmodifiableList(list);
    }

    public AbstractC0454b(int i10) {
        switch (i10) {
            case 3:
                this.f5185a = new android.support.v4.media.b(this);
                break;
            default:
                this.f5186b = new int[2];
                break;
        }
    }

    public AbstractC0454b(p098j.C c3) {
        this.f5186b = c3;
    }
}
