package B2;

import E9.C0348i;
import Z4.C0976i;
import Z4.N;
import Z4.Q;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import com.google.android.gms.common.api.internal.C1148o;
import com.google.android.gms.common.api.internal.C1150q;
import com.google.android.gms.common.api.internal.C1153u;
import com.google.android.gms.common.api.internal.InterfaceC1154v;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcv;
import com.google.android.gms.internal.play_billing.zzjd;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import org.apache.tika.metadata.ClimateForcast;
import p143n0.AbstractC2082i;
import p143n0.AbstractC2097y;
import p143n0.S;
import p143n0.W;
import p143n0.h0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements N4.d, zzcv, S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static s f617e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f621d;

    public s(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f618a = i10;
        this.f621d = str;
        this.f619b = arrayList;
        this.f620c = arrayList2;
    }

    public static synchronized s e(Context context) {
        try {
            if (f617e == null) {
                f617e = new s(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f617e;
    }

    @Override // N4.d
    public int a(long j10) {
        long[] jArr = (long[]) this.f621d;
        int i10 = X4.j.i(jArr, j10, false, false);
        if (i10 < jArr.length) {
            return i10;
        }
        return -1;
    }

    @Override // N4.d
    public int b() {
        return ((long[]) this.f621d).length;
    }

    public C1153u c() {
        E.a("Must set register function", ((InterfaceC1154v) this.f619b) != null);
        E.a("Must set unregister function", ((InterfaceC1154v) this.f620c) != null);
        E.a("Must set holder", ((C1150q) this.f621d) != null);
        C1148o c1148o = ((C1150q) this.f621d).f17954c;
        E.i(c1148o, "Key must not be null");
        return new C1153u(new com.google.android.gms.common.api.internal.S(this, (C1150q) this.f621d, this.f618a), new T(this, c1148o));
    }

    public void d(boolean z10, E8.z zVar, C0348i c0348i, boolean z11) {
        p229v9.a.k(c0348i, ClimateForcast.SOURCE);
        int iMin = Math.min(zVar.f3327c, ((E8.z) zVar.f3331g.f621d).f3327c);
        C0348i c0348i2 = zVar.f3325a;
        boolean z12 = c0348i2.f3387b > 0;
        int i10 = (int) c0348i.f3387b;
        if (z12 || iMin < i10) {
            if (!z12 && iMin > 0) {
                zVar.b(iMin, c0348i, false);
            }
            c0348i2.r((int) c0348i.f3387b, c0348i);
            zVar.f3330f = z10 | zVar.f3330f;
        } else {
            zVar.b(i10, c0348i, z10);
        }
        if (z11) {
            try {
                ((E8.d) this.f620c).flush();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public int f() {
        int i10;
        synchronized (this.f621d) {
            i10 = this.f618a;
        }
        return i10;
    }

    public int g() {
        int i10 = this.f618a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public int h() {
        Paint.Cap strokeCap = ((Paint) this.f619b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : AbstractC2082i.f22774a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int i() {
        Paint.Join strokeJoin = ((Paint) this.f619b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : AbstractC2082i.f22775b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void j(float f10) {
        ((Paint) this.f619b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void k(int i10) {
        if (this.f618a == i10) {
            return;
        }
        this.f618a = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f619b;
        if (i11 >= 29) {
            h0.f22773a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(W.I(i10)));
        }
    }

    public void l(long j10) {
        ((Paint) this.f619b).setColor(W.E(j10));
    }

    public void m(AbstractC2097y abstractC2097y) {
        this.f621d = abstractC2097y;
        ((Paint) this.f619b).setColorFilter(abstractC2097y != null ? abstractC2097y.f22805a : null);
    }

    public void n(int i10) {
        ((Paint) this.f619b).setFilterBitmap(!(i10 == 0));
    }

    public void o(Shader shader) {
        this.f620c = shader;
        ((Paint) this.f619b).setShader(shader);
    }

    public void p(int i10) {
        Paint.Cap cap;
        if (i10 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i10 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        ((Paint) this.f619b).setStrokeCap(cap);
    }

    public void q(int i10) {
        Paint.Join join;
        if (i10 == 0) {
            join = Paint.Join.MITER;
        } else if (i10 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        ((Paint) this.f619b).setStrokeJoin(join);
    }

    public void r(float f10) {
        ((Paint) this.f619b).setStrokeWidth(f10);
    }

    public void s(int i10) {
        ((Paint) this.f619b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void t(E8.z zVar, int i10) {
        if (zVar == null) {
            ((E8.z) this.f621d).a(i10);
            u();
            return;
        }
        zVar.a(i10);
        E8.A a10 = new E8.A();
        zVar.c(Math.min(zVar.f3327c, ((E8.z) zVar.f3331g.f621d).f3327c), a10);
        if (a10.f3181a > 0) {
            try {
                ((E8.d) this.f620c).flush();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void u() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f619b
            E8.p r0 = (E8.p) r0
            E8.z[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f621d
            E8.z r2 = (E8.z) r2
            int r2 = r2.f3327c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f3327c
            E9.i r10 = r8.f3325a
            long r11 = r10.f3387b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f3328d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f3328d
            int r11 = r11 + r9
            r8.f3328d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f3327c
            long r10 = r10.f3387b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f3328d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            E8.A r1 = new E8.A
            r1.<init>()
            E8.z[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f3328d
            r5.c(r6, r1)
            r5.f3328d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f3181a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f620c     // Catch: java.io.IOException -> L8f
            E8.d r0 = (E8.d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.s.u():void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public void zza(Throwable th) {
        boolean z10 = th instanceof TimeoutException;
        N n6 = (N) this.f621d;
        if (z10) {
            n6.S(28, Q.f13694E, zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            n6.S(28, Q.f13694E, zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f620c).run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            ((Runnable) this.f620c).run();
            return;
        }
        int iIntValue = num.intValue();
        N n6 = (N) this.f621d;
        n6.getClass();
        C0976i c0976iA = Q.a(iIntValue, "Billing override value was set by a license tester.");
        n6.S(this.f618a, c0976iA, zzjd.LICENSE_TESTER_BILLING_OVERRIDE);
        ((J1.a) this.f619b).accept(c0976iA);
    }

    public s(Paint paint) {
        this.f619b = paint;
        this.f618a = 3;
    }

    @Override // N4.d
    public List b(long j10) {
        U4.g gVar = null;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < this.f618a; i10++) {
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f620c;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                U4.g gVar2 = (U4.g) ((ArrayList) this.f619b).get(i10);
                if (gVar2.f8592b != Float.MIN_VALUE || gVar2.f8593c != Float.MIN_VALUE) {
                    arrayList.add(gVar2);
                } else if (gVar == null) {
                    gVar = gVar2;
                } else {
                    CharSequence charSequence = gVar2.f8591a;
                    if (spannableStringBuilder == null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append(gVar.f8591a).append((CharSequence) "\n").append(charSequence);
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n").append(charSequence);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new U4.g(0L, 0L, spannableStringBuilder, Float.MIN_VALUE, Float.MIN_VALUE));
        } else if (gVar != null) {
            arrayList.add(gVar);
        }
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    @Override // N4.d
    public long a(int i10) {
        X4.a.k(i10 >= 0);
        long[] jArr = (long[]) this.f621d;
        X4.a.k(i10 < jArr.length);
        return jArr[i10];
    }

    public s(Context context) {
        this.f619b = new Handler(Looper.getMainLooper());
        this.f620c = new CopyOnWriteArrayList();
        this.f621d = new Object();
        this.f618a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new r(this, 0), intentFilter);
    }

    public s(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f619b = str;
        this.f618a = i11;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f620c = listUnmodifiableList;
        this.f621d = bArr;
    }

    public static void b(int i10, s sVar) {
        synchronized (sVar.f621d) {
            try {
                if (sVar.f618a == i10) {
                    return;
                }
                sVar.f618a = i10;
                for (WeakReference weakReference : (CopyOnWriteArrayList) sVar.f620c) {
                    V2.f fVar = (V2.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) sVar.f620c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
