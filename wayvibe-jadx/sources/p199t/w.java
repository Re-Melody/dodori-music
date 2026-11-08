package p199t;

import R3.a;
import U.C0914u0;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p064f9.g;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f26343a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26344b;

    public final void a(Object obj) {
        int i10 = this.f26344b + 1;
        Object[] objArr = this.f26343a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f26343a = objArrCopyOf;
        }
        Object[] objArr2 = this.f26343a;
        int i11 = this.f26344b;
        objArr2[i11] = obj;
        this.f26344b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i10 = wVar.f26344b;
            int i11 = this.f26344b;
            if (i10 == i11) {
                Object[] objArr = this.f26343a;
                Object[] objArr2 = wVar.f26343a;
                g gVarJ0 = a.j0(0, i11);
                int i12 = gVarJ0.f19892a;
                int i13 = gVarJ0.f19893b;
                if (i12 > i13) {
                    return true;
                }
                while (m.b(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f26343a;
        int i10 = this.f26344b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        C0914u0 c0914u0 = new C0914u0(this, 10);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f26343a;
        int i10 = this.f26344b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                m.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c0914u0.invoke(obj));
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        m.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
