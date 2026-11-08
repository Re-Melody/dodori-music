package com.revenuecat.purchases.common.uiconfig;

import com.revenuecat.purchases.UiConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface UiConfigResolution {

    public static final class Disabled implements UiConfigResolution {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }
    }

    public static final class Found implements UiConfigResolution {
        private final UiConfig uiConfig;

        public Found(UiConfig uiConfig) {
            m.f(uiConfig, "uiConfig");
            this.uiConfig = uiConfig;
        }

        public static /* synthetic */ Found copy$default(Found found, UiConfig uiConfig, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uiConfig = found.uiConfig;
            }
            return found.copy(uiConfig);
        }

        public final UiConfig component1() {
            return this.uiConfig;
        }

        public final Found copy(UiConfig uiConfig) {
            m.f(uiConfig, "uiConfig");
            return new Found(uiConfig);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Found) && m.b(this.uiConfig, ((Found) obj).uiConfig);
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return this.uiConfig.hashCode();
        }

        public String toString() {
            return "Found(uiConfig=" + this.uiConfig + ')';
        }
    }

    public static final class NotConfigured implements UiConfigResolution {
        public static final NotConfigured INSTANCE = new NotConfigured();

        private NotConfigured() {
        }
    }

    public static final class Superseded implements UiConfigResolution {
        public static final Superseded INSTANCE = new Superseded();

        private Superseded() {
        }
    }

    public static final class Unavailable implements UiConfigResolution {
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
        }
    }
}
