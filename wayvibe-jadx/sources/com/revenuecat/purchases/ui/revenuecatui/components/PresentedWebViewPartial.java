package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.paywalls.components.PartialWebViewComponent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedWebViewPartial implements PresentedPartial<PresentedWebViewPartial> {
    public static final int $stable = 0;
    private final PartialWebViewComponent partial;

    public PresentedWebViewPartial(PartialWebViewComponent partial) {
        m.f(partial, "partial");
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentedWebViewPartial) && m.b(this.partial, ((PresentedWebViewPartial) obj).partial);
    }

    public final /* synthetic */ PartialWebViewComponent getPartial() {
        return this.partial;
    }

    public int hashCode() {
        return this.partial.hashCode();
    }

    public String toString() {
        return "PresentedWebViewPartial(partial=" + this.partial + ')';
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial
    public PresentedWebViewPartial combine(PresentedWebViewPartial presentedWebViewPartial) {
        Boolean visible;
        PartialWebViewComponent partialWebViewComponent = presentedWebViewPartial != null ? presentedWebViewPartial.partial : null;
        if (partialWebViewComponent == null || (visible = partialWebViewComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        return new PresentedWebViewPartial(new PartialWebViewComponent(visible));
    }
}
