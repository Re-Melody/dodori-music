package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes.dex */
public final class W extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f17902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x10, Looper looper) {
        super(looper);
        this.f17902a = x10;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                V0.p.v(i10, "TransformationResultHandler received unknown message type: ", "TransformedResultImpl");
                return;
            } else {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
        }
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) message.obj;
        synchronized (this.f17902a.f17904b) {
            try {
                X x10 = this.f17902a.f17903a;
                com.google.android.gms.common.internal.E.h(x10);
                if (sVar == null) {
                    x10.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
