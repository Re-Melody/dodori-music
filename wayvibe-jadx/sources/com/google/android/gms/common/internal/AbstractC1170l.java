package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1170l extends AbstractC1164f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C1167i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1170l(Context context, Looper looper, int i10, C1167i c1167i, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        synchronized (AbstractC1171m.f18065a) {
            try {
                if (AbstractC1171m.f18066b == null) {
                    AbstractC1171m.f18066b = new Q(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Q q5 = AbstractC1171m.f18066b;
        Object obj = H5.e.f6040c;
        E.h(interfaceC1141h);
        E.h(interfaceC1151s);
        super(context, looper, q5, i10, new C1177t(interfaceC1141h), new C1177t(interfaceC1151s), c1167i.f18041e);
        this.zab = c1167i;
        this.zad = null;
        Set<Scope> set = c1167i.f18038b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C1167i getClientSettings() {
        return this.zab;
    }

    public H5.d[] getRequiredFeatures() {
        return new H5.d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
