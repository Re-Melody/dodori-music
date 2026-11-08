package D8;

import android.view.View;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: D8.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0311s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2777a;

    public AbstractC0311s0(int i10) {
        switch (i10) {
            case 5:
                this.f2777a = new p255y2.N();
                break;
            default:
                this.f2777a = Collections.newSetFromMap(new IdentityHashMap());
                break;
        }
    }

    public static AbstractC0311s0 b(L3.s sVar, int i10) {
        if (i10 == 0) {
            return new L3.m(sVar, 0);
        }
        if (i10 == 1) {
            return new L3.m(sVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(B2.s sVar);

    public String c() {
        return null;
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public String f() {
        return (String) this.f2777a;
    }

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public abstract void l(int i10, long j10, boolean z10);

    public void m(Object obj, boolean z10) {
        Set set = (Set) this.f2777a;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                j();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            k();
        }
    }

    public AbstractC0311s0(Z2.F f10) {
        this.f2777a = f10;
    }
}
