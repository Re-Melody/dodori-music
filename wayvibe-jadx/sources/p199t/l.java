package p199t;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p209u.a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f26294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f26295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f26296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f26297d;

    public l(int i10) {
        if (i10 == 0) {
            this.f26295b = a.f27014b;
            this.f26296c = a.f27015c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.f26295b = new long[i14];
        this.f26296c = new Object[i14];
    }

    public final void a() {
        int i10 = this.f26297d;
        Object[] objArr = this.f26296c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f26297d = 0;
        this.f26294a = false;
    }

    public final Object b(long j10) {
        Object obj;
        int iB = a.b(this.f26295b, this.f26297d, j10);
        if (iB < 0 || (obj = this.f26296c[iB]) == m.f26298a) {
            return null;
        }
        return obj;
    }

    public final int c(long j10) {
        if (this.f26294a) {
            int i10 = this.f26297d;
            long[] jArr = this.f26295b;
            Object[] objArr = this.f26296c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f26298a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f26294a = false;
            this.f26297d = i11;
        }
        return a.b(this.f26295b, this.f26297d, j10);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        m.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        l lVar = (l) objClone;
        lVar.f26295b = (long[]) this.f26295b.clone();
        lVar.f26296c = (Object[]) this.f26296c.clone();
        return lVar;
    }

    public final long d(int i10) {
        if (!(i10 >= 0 && i10 < this.f26297d)) {
            a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f26294a) {
            int i11 = this.f26297d;
            long[] jArr = this.f26295b;
            Object[] objArr = this.f26296c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f26298a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f26294a = false;
            this.f26297d = i12;
        }
        return this.f26295b[i10];
    }

    public final void e(long j10, Object obj) {
        int iB = a.b(this.f26295b, this.f26297d, j10);
        if (iB >= 0) {
            this.f26296c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f26297d;
        Object obj2 = m.f26298a;
        if (i10 < i11) {
            Object[] objArr = this.f26296c;
            if (objArr[i10] == obj2) {
                this.f26295b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f26294a) {
            long[] jArr = this.f26295b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f26296c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f26294a = false;
                this.f26297d = i12;
                i10 = ~a.b(this.f26295b, i12, j10);
            }
        }
        int i14 = this.f26297d;
        if (i14 >= this.f26295b.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f26295b, i18);
            m.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f26295b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26296c, i18);
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26296c = objArrCopyOf;
        }
        int i19 = this.f26297d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f26295b;
            int i20 = i10 + 1;
            m.f(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f26296c;
            N8.m.k0(objArr3, i20, objArr3, i10, this.f26297d);
        }
        this.f26295b[i10] = j10;
        this.f26296c[i10] = obj;
        this.f26297d++;
    }

    public final void f(long j10) {
        int iB = a.b(this.f26295b, this.f26297d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f26296c;
            Object obj = objArr[iB];
            Object obj2 = m.f26298a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f26294a = true;
            }
        }
    }

    public final int g() {
        if (this.f26294a) {
            int i10 = this.f26297d;
            long[] jArr = this.f26295b;
            Object[] objArr = this.f26296c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != m.f26298a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f26294a = false;
            this.f26297d = i11;
        }
        return this.f26297d;
    }

    public final Object h(int i10) {
        if (!(i10 >= 0 && i10 < this.f26297d)) {
            a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f26294a) {
            int i11 = this.f26297d;
            long[] jArr = this.f26295b;
            Object[] objArr = this.f26296c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != m.f26298a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f26294a = false;
            this.f26297d = i12;
        }
        return this.f26296c[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26297d * 28);
        sb.append('{');
        int i10 = this.f26297d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(d(i11));
            sb.append('=');
            Object objH = h(i11);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        m.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public /* synthetic */ l(Object obj) {
        this(10);
    }
}
