package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedOverride<T extends PresentedPartial<T>> {
    public static final int $stable = 8;
    private final List<ComponentOverride.Condition> conditions;
    private final T properties;

    /* JADX WARN: Multi-variable type inference failed */
    public PresentedOverride(List<? extends ComponentOverride.Condition> conditions, T properties) {
        m.f(conditions, "conditions");
        m.f(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOverride)) {
            return false;
        }
        PresentedOverride presentedOverride = (PresentedOverride) obj;
        return m.b(this.conditions, presentedOverride.conditions) && m.b(this.properties, presentedOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PresentedPartial getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.conditions.hashCode() * 31);
    }

    public String toString() {
        return "PresentedOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }
}
