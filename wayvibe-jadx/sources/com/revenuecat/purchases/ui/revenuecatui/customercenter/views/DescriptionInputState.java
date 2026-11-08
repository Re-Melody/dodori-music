package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
final class DescriptionInputState {
    private final String description;
    private final boolean enabled;
    private final c onDescriptionChange;
    private final a onSubmit;
    private final boolean showDone;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputState$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m701invoke() {
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m701invoke();
            return D.f8402a;
        }
    }

    public DescriptionInputState(String description, c onDescriptionChange, boolean z10, boolean z11, a onSubmit) {
        m.f(description, "description");
        m.f(onDescriptionChange, "onDescriptionChange");
        m.f(onSubmit, "onSubmit");
        this.description = description;
        this.onDescriptionChange = onDescriptionChange;
        this.enabled = z10;
        this.showDone = z11;
        this.onSubmit = onSubmit;
    }

    public static /* synthetic */ DescriptionInputState copy$default(DescriptionInputState descriptionInputState, String str, c cVar, boolean z10, boolean z11, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = descriptionInputState.description;
        }
        if ((i10 & 2) != 0) {
            cVar = descriptionInputState.onDescriptionChange;
        }
        if ((i10 & 4) != 0) {
            z10 = descriptionInputState.enabled;
        }
        if ((i10 & 8) != 0) {
            z11 = descriptionInputState.showDone;
        }
        if ((i10 & 16) != 0) {
            aVar = descriptionInputState.onSubmit;
        }
        a aVar2 = aVar;
        boolean z12 = z10;
        return descriptionInputState.copy(str, cVar, z12, z11, aVar2);
    }

    public final String component1() {
        return this.description;
    }

    public final c component2() {
        return this.onDescriptionChange;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.showDone;
    }

    public final a component5() {
        return this.onSubmit;
    }

    public final DescriptionInputState copy(String description, c onDescriptionChange, boolean z10, boolean z11, a onSubmit) {
        m.f(description, "description");
        m.f(onDescriptionChange, "onDescriptionChange");
        m.f(onSubmit, "onSubmit");
        return new DescriptionInputState(description, onDescriptionChange, z10, z11, onSubmit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionInputState)) {
            return false;
        }
        DescriptionInputState descriptionInputState = (DescriptionInputState) obj;
        return m.b(this.description, descriptionInputState.description) && m.b(this.onDescriptionChange, descriptionInputState.onDescriptionChange) && this.enabled == descriptionInputState.enabled && this.showDone == descriptionInputState.showDone && m.b(this.onSubmit, descriptionInputState.onSubmit);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final c getOnDescriptionChange() {
        return this.onDescriptionChange;
    }

    public final a getOnSubmit() {
        return this.onSubmit;
    }

    public final boolean getShowDone() {
        return this.showDone;
    }

    public int hashCode() {
        return this.onSubmit.hashCode() + b.f(b.f((this.onDescriptionChange.hashCode() + (this.description.hashCode() * 31)) * 31, 31, this.enabled), 31, this.showDone);
    }

    public String toString() {
        return "DescriptionInputState(description=" + this.description + ", onDescriptionChange=" + this.onDescriptionChange + ", enabled=" + this.enabled + ", showDone=" + this.showDone + ", onSubmit=" + this.onSubmit + ')';
    }

    public /* synthetic */ DescriptionInputState(String str, c cVar, boolean z10, boolean z11, a aVar, int i10, f fVar) {
        this(str, cVar, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }
}
