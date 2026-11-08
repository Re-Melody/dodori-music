package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Z8.c;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
final class EmailInputState {
    private final String email;
    private final boolean enabled;
    private final c onEmailChange;
    private final c onFocusChanged;
    private final boolean showError;

    public EmailInputState(String email, c onEmailChange, c onFocusChanged, boolean z10, boolean z11) {
        m.f(email, "email");
        m.f(onEmailChange, "onEmailChange");
        m.f(onFocusChanged, "onFocusChanged");
        this.email = email;
        this.onEmailChange = onEmailChange;
        this.onFocusChanged = onFocusChanged;
        this.showError = z10;
        this.enabled = z11;
    }

    public static /* synthetic */ EmailInputState copy$default(EmailInputState emailInputState, String str, c cVar, c cVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailInputState.email;
        }
        if ((i10 & 2) != 0) {
            cVar = emailInputState.onEmailChange;
        }
        if ((i10 & 4) != 0) {
            cVar2 = emailInputState.onFocusChanged;
        }
        if ((i10 & 8) != 0) {
            z10 = emailInputState.showError;
        }
        if ((i10 & 16) != 0) {
            z11 = emailInputState.enabled;
        }
        boolean z12 = z11;
        c cVar3 = cVar2;
        return emailInputState.copy(str, cVar, cVar3, z10, z12);
    }

    public final String component1() {
        return this.email;
    }

    public final c component2() {
        return this.onEmailChange;
    }

    public final c component3() {
        return this.onFocusChanged;
    }

    public final boolean component4() {
        return this.showError;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final EmailInputState copy(String email, c onEmailChange, c onFocusChanged, boolean z10, boolean z11) {
        m.f(email, "email");
        m.f(onEmailChange, "onEmailChange");
        m.f(onFocusChanged, "onFocusChanged");
        return new EmailInputState(email, onEmailChange, onFocusChanged, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailInputState)) {
            return false;
        }
        EmailInputState emailInputState = (EmailInputState) obj;
        return m.b(this.email, emailInputState.email) && m.b(this.onEmailChange, emailInputState.onEmailChange) && m.b(this.onFocusChanged, emailInputState.onFocusChanged) && this.showError == emailInputState.showError && this.enabled == emailInputState.enabled;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final c getOnEmailChange() {
        return this.onEmailChange;
    }

    public final c getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + b.f((this.onFocusChanged.hashCode() + ((this.onEmailChange.hashCode() + (this.email.hashCode() * 31)) * 31)) * 31, 31, this.showError);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmailInputState(email=");
        sb.append(this.email);
        sb.append(", onEmailChange=");
        sb.append(this.onEmailChange);
        sb.append(", onFocusChanged=");
        sb.append(this.onFocusChanged);
        sb.append(", showError=");
        sb.append(this.showError);
        sb.append(", enabled=");
        return b.o(sb, this.enabled, ')');
    }
}
