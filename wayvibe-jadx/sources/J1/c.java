package J1;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6459b;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6458a = new Object[i10];
    }

    public Object a() {
        int i10 = this.f6459b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f6458a;
        Object obj = objArr[i11];
        m.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f6459b--;
        return obj;
    }

    public void b(p100j1.b bVar) {
        int i10 = this.f6459b;
        Object[] objArr = this.f6458a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f6459b = i10 + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z10;
        m.f(instance, "instance");
        int i10 = this.f6459b;
        int i11 = 0;
        while (true) {
            objArr = this.f6458a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f6459b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f6459b = i12 + 1;
        return true;
    }

    public c(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f6458a = new Object[256];
                break;
            default:
                this.f6458a = new Object[256];
                break;
        }
    }
}
