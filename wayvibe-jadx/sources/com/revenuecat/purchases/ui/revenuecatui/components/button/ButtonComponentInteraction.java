package com.revenuecat.purchases.ui.revenuecatui.components.button;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonComponentInteraction {
    public static final int $stable = 0;
    private final String url;
    private final String value;

    public ButtonComponentInteraction(String value, String str) {
        m.f(value, "value");
        this.value = value;
        this.url = str;
    }

    public static /* synthetic */ ButtonComponentInteraction copy$default(ButtonComponentInteraction buttonComponentInteraction, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = buttonComponentInteraction.value;
        }
        if ((i10 & 2) != 0) {
            str2 = buttonComponentInteraction.url;
        }
        return buttonComponentInteraction.copy(str, str2);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.url;
    }

    public final ButtonComponentInteraction copy(String value, String str) {
        m.f(value, "value");
        return new ButtonComponentInteraction(value, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponentInteraction)) {
            return false;
        }
        ButtonComponentInteraction buttonComponentInteraction = (ButtonComponentInteraction) obj;
        return m.b(this.value, buttonComponentInteraction.value) && m.b(this.url, buttonComponentInteraction.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ButtonComponentInteraction(value=");
        sb.append(this.value);
        sb.append(", url=");
        return AbstractC0112b.j(sb, this.url, ')');
    }

    public /* synthetic */ ButtonComponentInteraction(String str, String str2, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
