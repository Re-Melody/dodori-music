package com.google.android.gms.common.api.internal;

import G0.C0467f0;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.InterfaceC1174p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.u> extends com.google.android.gms.common.api.s {
    static final ThreadLocal zaa = new C0467f0(9);
    public static final /* synthetic */ int zad = 0;
    private f0 resultGuardian;
    protected final HandlerC1140g zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.v zah;
    private com.google.android.gms.common.api.u zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC1174p zao;
    private volatile X zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.q qVar) {
        this.zab = new HandlerC1140g(qVar != null ? ((J) qVar).f17874b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(qVar);
    }

    public static void zal(com.google.android.gms.common.api.u uVar) {
    }

    public final com.google.android.gms.common.api.u a() {
        com.google.android.gms.common.api.u uVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.E.j("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.E.j("Result is not ready.", isReady());
            uVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.E.h(uVar);
        return uVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.r rVar) {
        com.google.android.gms.common.internal.E.a("Callback cannot be null.", rVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    rVar.a(this.zak);
                } else {
                    this.zag.add(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.E.g("await must not be called on the UI thread");
        com.google.android.gms.common.internal.E.j("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.E.j("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f17830f);
        }
        com.google.android.gms.common.internal.E.j("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.u uVar) {
        this.zaj = uVar;
        this.zak = uVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.v vVar = this.zah;
            if (vVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(vVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.common.api.r) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    InterfaceC1174p interfaceC1174p = this.zao;
                    if (interfaceC1174p != null) {
                        try {
                            com.google.android.gms.common.internal.U u10 = (com.google.android.gms.common.internal.U) interfaceC1174p;
                            u10.zzC(2, u10.zza());
                        } catch (RemoteException unused) {
                        }
                    }
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f17833i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract com.google.android.gms.common.api.u createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC1174p interfaceC1174p) {
        synchronized (this.zae) {
            this.zao = interfaceC1174p;
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.v vVar) {
        synchronized (this.zae) {
            try {
                if (vVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.E.j("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.E.j("Cannot set callbacks if then() has been called.", z10);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(vVar, a());
                } else {
                    this.zah = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.u> com.google.android.gms.common.api.x then(com.google.android.gms.common.api.w wVar) {
        X x10;
        com.google.android.gms.common.internal.E.j("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.E.j("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.E.j("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.E.j("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new X(this.zac);
                X x11 = this.zap;
                synchronized (x11.f17904b) {
                    x10 = new X(x11.f17905c);
                    x11.f17903a = x10;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.q) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(Y y6) {
        this.zai.set(y6);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1139f
    public final void setResult(R r) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.E.j("Results have already been set", !isReady());
                com.google.android.gms.common.internal.E.j("Result has already been consumed", !this.zal);
                b(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            com.google.android.gms.common.internal.E.g("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.E.j("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.E.j("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f17832h);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f17830f);
        }
        com.google.android.gms.common.internal.E.j("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.v vVar, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (vVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.E.j("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.E.j("Cannot set callbacks if then() has been called.", z10);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(vVar, a());
                } else {
                    this.zah = vVar;
                    HandlerC1140g handlerC1140g = this.zab;
                    handlerC1140g.sendMessageDelayed(handlerC1140g.obtainMessage(2, this), timeUnit.toMillis(j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
