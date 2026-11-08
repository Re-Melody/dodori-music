package h0;

import G0.A;
import android.view.autofill.AutofillManager;
import p050e5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f20148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f20150c;

    public a(A a10, f fVar) {
        this.f20148a = a10;
        this.f20149b = fVar;
        AutofillManager autofillManagerF = k.f(a10.getContext().getSystemService(k.i()));
        if (autofillManagerF == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f20150c = autofillManagerF;
        a10.setImportantForAutofill(1);
    }
}
