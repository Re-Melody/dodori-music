package A6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: A6.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0099y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f406c;

    public AbstractC0099y(int i10) {
        AbstractC0093s.c(i10, "initialCapacity");
        this.f404a = new Object[i10];
        this.f405b = 0;
    }

    public static int d(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        return iHighestOneBit < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f405b + 1);
        Object[] objArr = this.f404a;
        int i10 = this.f405b;
        this.f405b = i10 + 1;
        objArr[i10] = obj;
    }

    public abstract AbstractC0099y b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size() + this.f405b);
            if (collection instanceof AbstractC0100z) {
                this.f405b = ((AbstractC0100z) collection).h(this.f405b, this.f404a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f404a;
        if (objArr.length < i10) {
            this.f404a = Arrays.copyOf(objArr, d(objArr.length, i10));
            this.f406c = false;
        } else if (this.f406c) {
            this.f404a = (Object[]) objArr.clone();
            this.f406c = false;
        }
    }
}
