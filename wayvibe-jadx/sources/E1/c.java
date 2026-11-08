package E1;

import B1.f;
import B2.AbstractC0112b;
import J1.e;
import android.location.LocationRequest;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3015d;

    public c(long j10, int i10, long j11, float f10) {
        this.f3013b = j10;
        this.f3012a = i10;
        this.f3014c = j11;
        this.f3015d = f10;
    }

    public final LocationRequest a(String str) {
        long j10 = this.f3013b;
        if (Build.VERSION.SDK_INT >= 31) {
            return a.c(this);
        }
        Object obj = null;
        try {
            if (p206t6.b.f26870b == null) {
                p206t6.b.f26870b = Class.forName("android.location.LocationRequest");
            }
            Method method = p206t6.b.f26871c;
            Class cls = Long.TYPE;
            if (method == null) {
                Method declaredMethod = p206t6.b.f26870b.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                p206t6.b.f26871c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = p206t6.b.f26871c.invoke(null, str, Long.valueOf(j10), Float.valueOf(this.f3015d), Boolean.FALSE);
            if (objInvoke != null) {
                Method method2 = p206t6.b.f26872d;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = p206t6.b.f26870b.getDeclaredMethod("setQuality", cls2);
                    p206t6.b.f26872d = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                p206t6.b.f26872d.invoke(objInvoke, Integer.valueOf(this.f3012a));
                if (p206t6.b.f26873e == null) {
                    Method declaredMethod3 = p206t6.b.f26870b.getDeclaredMethod("setFastestInterval", cls);
                    p206t6.b.f26873e = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method3 = p206t6.b.f26873e;
                long j11 = this.f3014c;
                if (j11 != -1) {
                    j10 = j11;
                }
                method3.invoke(objInvoke, Long.valueOf(j10));
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return f.g(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3012a == cVar.f3012a && this.f3013b == cVar.f3013b && this.f3014c == cVar.f3014c && Float.compare(cVar.f3015d, this.f3015d) == 0;
    }

    public final int hashCode() {
        int i10 = this.f3012a * 31;
        long j10 = this.f3013b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3014c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbO = AbstractC0112b.o("Request[");
        long j10 = this.f3013b;
        if (j10 != Long.MAX_VALUE) {
            sbO.append("@");
            e.c(j10, sbO);
            int i10 = this.f3012a;
            if (i10 == 100) {
                sbO.append(" HIGH_ACCURACY");
            } else if (i10 == 102) {
                sbO.append(" BALANCED");
            } else if (i10 == 104) {
                sbO.append(" LOW_POWER");
            }
        } else {
            sbO.append("PASSIVE");
        }
        long j11 = this.f3014c;
        if (j11 != -1 && j11 < j10) {
            sbO.append(", minUpdateInterval=");
            e.c(j11, sbO);
        }
        float f10 = this.f3015d;
        if (f10 > 0.0d) {
            sbO.append(", minUpdateDistance=");
            sbO.append(f10);
        }
        if (0 > j10) {
            sbO.append(", maxUpdateDelay=");
            e.c(0L, sbO);
        }
        sbO.append(']');
        return sbO.toString();
    }
}
