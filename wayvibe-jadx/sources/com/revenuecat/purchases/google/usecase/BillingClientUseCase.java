package com.revenuecat.purchases.google.usecase;

import M8.D;
import V0.p;
import Z4.AbstractC0969b;
import Z4.C0970c;
import Z4.C0976i;
import Z8.e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.slf4j.helpers.i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final e executeRequestOnUIThread;
    private final int maxRetries;
    private final Z8.c onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements Z8.c {
        public AnonymousClass1(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "onOk", "onOk(Ljava/lang/Object;)V");
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m203invoke(obj);
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m203invoke(T t10) {
            ((BillingClientUseCase) this.receiver).onOk(t10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends j implements Z8.c {
        public AnonymousClass2(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V");
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C0976i) obj);
            return D.f8402a;
        }

        public final void invoke(C0976i p10) {
            m.f(p10, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$run$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14301 extends n implements Z8.c {
        final /* synthetic */ BillingClientUseCase<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14301(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return D.f8402a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    public BillingClientUseCase(UseCaseParams useCaseParams, Z8.c onError, e executeRequestOnUIThread) {
        m.f(useCaseParams, "useCaseParams");
        m.f(onError, "onError");
        m.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    }

    private final void backoffOrErrorIfServiceUnavailable(Z8.c cVar, C0976i c0976i) {
        LogHandler currentLogHandler;
        String strL;
        String str;
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 = new BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strL = p.l(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(p.l(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(p.l(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strL = p.l(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(p.l(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strL = p.l(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strL = p.l(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(p.l(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(p.l(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(p.l(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
        }
        if (p108j9.b.c(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            cVar.invoke(c0976i);
        }
    }

    private final void backoffOrRetryNetworkError(Z8.c cVar, C0976i c0976i) {
        int i10;
        if (getBackoffForNetworkErrors() && p108j9.b.c(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i10 = this.retryAttempt) >= this.maxRetries) {
            cVar.invoke(c0976i);
        } else {
            this.retryAttempt = i10 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(C0976i c0976i) {
        LogHandler currentLogHandler;
        String strL;
        String str;
        String str2 = getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(c0976i);
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$forwardError$$inlined$log$1 billingClientUseCase$forwardError$$inlined$log$1 = new BillingClientUseCase$forwardError$$inlined$log$1(logIntent, str2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strL = p.l(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(p.l(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(p.l(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strL = p.l(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(p.l(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strL = p.l(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strL = p.l(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(p.l(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(p.l(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(p.l(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
        }
        Z8.c cVar = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(c0976i.f13768a, str2);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        cVar.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new RuntimeException("Billing client disconnected stack trace snapshot").printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        m.e(string, "stringWriter.toString()");
        return string;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, C0976i c0976i, Object obj, Z8.c cVar, Z8.c cVar2, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i10 & 4) != 0) {
            cVar = new AnonymousClass1(billingClientUseCase);
        }
        if ((i10 & 8) != 0) {
            cVar2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(c0976i, obj, cVar, cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    private final void retryWithBackoff() {
        long jT;
        long j10 = this.retryBackoff;
        if (p108j9.b.f(j10)) {
            jT = j10;
        } else {
            long j11 = j10 >> 1;
            long j12 = 2;
            long j13 = j11 * j12;
            boolean z10 = (((int) j10) & 1) == 0;
            jT = p108j9.b.f21531d;
            long j14 = p108j9.b.f21530c;
            if (z10) {
                if (-2147483647L <= j11 && j11 < 2147483648L) {
                    jT = i.v(j13);
                } else if (j13 / j12 == j11) {
                    jT = (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) ? i.t(j13 / ((long) 1000000)) : i.v(j13);
                } else {
                    long j15 = 1000000;
                    long j16 = j11 / j15;
                    long j17 = j16 * j12;
                    long j18 = (((j11 - (j16 * j15)) * j12) / j15) + j17;
                    if (j17 / j12 != j16 || (j18 ^ j17) < 0) {
                        if (Integer.signum(2) * Long.signum(j11) > 0) {
                            jT = j14;
                        }
                    } else {
                        jT = i.t(R3.a.q(j18, new p064f9.i(-4611686018427387903L, 4611686018427387903L)));
                    }
                }
            } else if (j13 / j12 == j11) {
                jT = i.t(R3.a.q(j13, new p064f9.i(-4611686018427387903L, 4611686018427387903L)));
            } else {
                if (Integer.signum(2) * Long.signum(j11) > 0) {
                    jT = j14;
                }
            }
        }
        this.retryBackoff = DurationExtensionsKt.m152minQTBD994(jT, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(p108j9.b.d(j10));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        billingClientUseCase.run(j10);
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final e getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t10);

    public final void processResult(C0976i billingResult, T t10, Z8.c onSuccess, Z8.c onError) {
        LogHandler currentLogHandler;
        String strL;
        String str;
        m.f(billingResult, "billingResult");
        m.f(onSuccess, "onSuccess");
        m.f(onError, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.Companion.fromCode(billingResult.f13768a);
        if (m.b(billingResponseFromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            onSuccess.invoke(t10);
            return;
        }
        if (!m.b(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            if (m.b(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(onError, billingResult);
                return;
            }
            if (m.b(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : m.b(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(onError, billingResult);
                return;
            } else {
                onError.invoke(billingResult);
                return;
            }
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$processResult$$inlined$log$1 billingClientUseCase$processResult$$inlined$log$1 = new BillingClientUseCase$processResult$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strL = p.l(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(p.l(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(p.l(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strL = p.l(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(p.l(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strL = p.l(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strL = p.l(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strL, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(p.l(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(p.l(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(p.l(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
        }
        run$default(this, 0L, 1, null);
    }

    public final void run(long j10) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j10), new C14301(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final void withConnectedClient(AbstractC0969b abstractC0969b, Z8.c receivingFunction) {
        D d10;
        m.f(receivingFunction, "receivingFunction");
        if (abstractC0969b == null) {
            d10 = null;
        } else {
            if (!((C0970c) abstractC0969b).G()) {
                abstractC0969b = null;
            }
            if (abstractC0969b != null) {
                receivingFunction.invoke(abstractC0969b);
                d10 = D.f8402a;
            } else {
                d10 = null;
            }
        }
        if (d10 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            BillingClientUseCase$withConnectedClient$$inlined$log$1 billingClientUseCase$withConnectedClient$$inlined$log$1 = new BillingClientUseCase$withConnectedClient$$inlined$log$1(logIntent, this);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(p.l(logLevel, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(p.l(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(p.l(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(p.l(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(p.l(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(p.l(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(p.l(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(p.l(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(p.l(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(p.l(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }
}
