package B8;

import B2.AbstractC0112b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f795c = Logger.getLogger(e0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0125l f796d = new C0125l(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B6.c f797e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f799b;

    static {
        B6.c cVar = B6.e.f713c;
        if (cVar.f715b != null) {
            cVar = new B6.c(cVar.f714a, (Character) null);
        }
        f797e = cVar;
    }

    public final void a(b0 b0Var) {
        if (this.f799b == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f799b;
            if (i10 >= i12) {
                Arrays.fill(this.f798a, i11 * 2, i12 * 2, (Object) null);
                this.f799b = i11;
                return;
            }
            if (!Arrays.equals(b0Var.f772b, e(i10))) {
                byte[] bArrE = e(i10);
                Object[] objArr = this.f798a;
                int i13 = i11 * 2;
                objArr[i13] = bArrE;
                Object obj = objArr[(i10 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f798a[i13 + 1] = obj;
                i11++;
            }
            i10++;
        }
    }

    public final void b(int i10) {
        Object[] objArr = new Object[i10];
        int i11 = this.f799b;
        if (i11 != 0) {
            System.arraycopy(this.f798a, 0, objArr, 0, i11 * 2);
        }
        this.f798a = objArr;
    }

    public final Object c(b0 b0Var) {
        for (int i10 = this.f799b - 1; i10 >= 0; i10--) {
            if (Arrays.equals(b0Var.f772b, e(i10))) {
                Object obj = this.f798a[(i10 * 2) + 1];
                if (obj instanceof byte[]) {
                    return b0Var.a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public final void d(e0 e0Var) {
        int i10 = e0Var.f799b;
        if (i10 == 0) {
            return;
        }
        Object[] objArr = this.f798a;
        int length = objArr != null ? objArr.length : 0;
        int i11 = this.f799b;
        int i12 = length - (i11 * 2);
        if (i11 == 0 || i12 < i10 * 2) {
            b((i10 * 2) + (i11 * 2));
        }
        System.arraycopy(e0Var.f798a, 0, this.f798a, this.f799b * 2, e0Var.f799b * 2);
        this.f799b += e0Var.f799b;
    }

    public final byte[] e(int i10) {
        return (byte[]) this.f798a[i10 * 2];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void f(b0 b0Var, Object obj) {
        p229v9.a.k(b0Var, "key");
        p229v9.a.k(obj, "value");
        int i10 = this.f799b;
        int i11 = i10 * 2;
        if (i11 == 0) {
            b(Math.max(i10 * 4, 8));
        } else {
            Object[] objArr = this.f798a;
            if (i11 == (objArr != null ? objArr.length : 0)) {
                b(Math.max(i10 * 4, 8));
            }
        }
        int i12 = this.f799b;
        this.f798a[i12 * 2] = b0Var.f772b;
        this.f798a[(i12 * 2) + 1] = b0Var.b(obj);
        this.f799b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f799b; i10++) {
            if (i10 != 0) {
                sb.append(',');
            }
            byte[] bArrE = e(i10);
            Charset charset = p267z6.h.f29877a;
            String str = new String(bArrE, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f798a[(i10 * 2) + 1];
                if (!(obj instanceof byte[])) {
                    AbstractC0112b.t(obj);
                    throw null;
                }
                sb.append(f797e.c((byte[]) obj));
            } else {
                Object obj2 = this.f798a[(i10 * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    AbstractC0112b.t(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
