package p199t;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f26269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f26270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f26271c;

    public H(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f26269a = new int[i14];
        this.f26270b = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f26271c;
        if (i11 != 0 && i10 <= this.f26269a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f26269a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f26269a, i15);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f26269a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26270b, i15);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26270b = objArrCopyOf;
        }
        this.f26269a[i11] = i10;
        this.f26270b[i11] = obj;
        this.f26271c = i11 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final H clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        m.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        H h10 = (H) objClone;
        h10.f26269a = (int[]) this.f26269a.clone();
        h10.f26270b = (Object[]) this.f26270b.clone();
        return h10;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = a.a(this.f26269a, this.f26271c, i10);
        if (iA < 0 || (obj = this.f26270b[iA]) == m.f26300c) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int iA = a.a(this.f26269a, this.f26271c, i10);
        if (iA >= 0) {
            this.f26270b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f26271c;
        if (i11 < i12) {
            Object[] objArr = this.f26270b;
            if (objArr[i11] == m.f26300c) {
                this.f26269a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f26269a.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f26269a, i16);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f26269a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26270b, i16);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26270b = objArrCopyOf;
        }
        int i17 = this.f26271c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f26269a;
            int i18 = i11 + 1;
            N8.m.h0(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f26270b;
            N8.m.k0(objArr2, i18, objArr2, i11, this.f26271c);
        }
        this.f26269a[i11] = i10;
        this.f26270b[i11] = obj;
        this.f26271c++;
    }

    public final String toString() {
        int i10 = this.f26271c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f26271c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            sb.append(this.f26269a[i12]);
            sb.append('=');
            Object obj = this.f26270b[i12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        m.e(string, "buffer.toString()");
        return string;
    }
}
