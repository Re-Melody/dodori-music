package p223v2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27467d;

    public o(Object obj) {
        this.f27464a = obj;
    }

    public void a() {
        boolean z10 = this.f27465b;
        Object obj = this.f27464a;
        if (z10) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (this.f27466c) {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
        if (!this.f27467d) {
            this.f27465b = true;
        } else {
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + obj);
        }
    }

    public final boolean b() {
        return this.f27465b || this.f27466c || this.f27467d;
    }

    public abstract void c(Object obj);

    public final void d(Bundle bundle) {
        boolean z10 = this.f27466c;
        Object obj = this.f27464a;
        if (z10 || this.f27467d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + obj);
        }
        this.f27467d = true;
        throw new UnsupportedOperationException("It is not supported to send an error for " + obj);
    }

    public final void e(Object obj) {
        if (this.f27466c || this.f27467d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f27464a);
        }
        this.f27466c = true;
        c(obj);
    }
}
