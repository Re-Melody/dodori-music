package com.revenuecat.purchases.paywalls.components;

import M8.InterfaceC0641c;
import V0.p;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PaywallAnimation {
    public static final Companion Companion = new Companion(null);
    private final int msDelay;
    private final int msDuration;
    private final AnimationType type;

    public enum AnimationType {
        EASE_IN,
        EASE_OUT,
        EASE_IN_OUT,
        LINEAR;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return AnimationTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PaywallAnimation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ PaywallAnimation(int i10, AnimationType animationType, int i11, int i12, Y y6) {
        if (7 != (i10 & 7)) {
            O.g(i10, 7, PaywallAnimation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = animationType;
        this.msDelay = i11;
        this.msDuration = i12;
    }

    public static /* synthetic */ void getMsDelay$annotations() {
    }

    public static /* synthetic */ void getMsDuration$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PaywallAnimation paywallAnimation, b bVar, g gVar) {
        bVar.m(gVar, 0, AnimationTypeSerializer.INSTANCE, paywallAnimation.type);
        bVar.p(1, paywallAnimation.msDelay, gVar);
        bVar.p(2, paywallAnimation.msDuration, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallAnimation)) {
            return false;
        }
        PaywallAnimation paywallAnimation = (PaywallAnimation) obj;
        return this.type == paywallAnimation.type && this.msDelay == paywallAnimation.msDelay && this.msDuration == paywallAnimation.msDuration;
    }

    public final /* synthetic */ int getMsDelay() {
        return this.msDelay;
    }

    public final /* synthetic */ int getMsDuration() {
        return this.msDuration;
    }

    public final /* synthetic */ AnimationType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.msDelay) * 31) + this.msDuration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaywallAnimation(type=");
        sb.append(this.type);
        sb.append(", msDelay=");
        sb.append(this.msDelay);
        sb.append(", msDuration=");
        return p.q(sb, this.msDuration, ')');
    }

    public PaywallAnimation(AnimationType type, int i10, int i11) {
        m.f(type, "type");
        this.type = type;
        this.msDelay = i10;
        this.msDuration = i11;
    }
}
