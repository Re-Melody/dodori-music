package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.paywalls.components.PartialPackageComponent;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedPackagePartial implements PresentedPartial<PresentedPackagePartial> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final PartialPackageComponent partial;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialPackageComponent from) {
            m.f(from, "from");
            return new Result.Success(new PresentedPackagePartial(from));
        }

        private Companion() {
        }
    }

    public PresentedPackagePartial(PartialPackageComponent partial) {
        m.f(partial, "partial");
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentedPackagePartial) && m.b(this.partial, ((PresentedPackagePartial) obj).partial);
    }

    public final /* synthetic */ PartialPackageComponent getPartial() {
        return this.partial;
    }

    public int hashCode() {
        return this.partial.hashCode();
    }

    public String toString() {
        return "PresentedPackagePartial(partial=" + this.partial + ')';
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial
    public PresentedPackagePartial combine(PresentedPackagePartial presentedPackagePartial) {
        Boolean visible;
        PartialPackageComponent partialPackageComponent = presentedPackagePartial != null ? presentedPackagePartial.partial : null;
        if (partialPackageComponent == null || (visible = partialPackageComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        return new PresentedPackagePartial(new PartialPackageComponent(visible));
    }
}
