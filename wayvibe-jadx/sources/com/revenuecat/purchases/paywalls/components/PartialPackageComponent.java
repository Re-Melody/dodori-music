package com.revenuecat.purchases.paywalls.components;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.C2370f;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PartialPackageComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PartialPackageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialPackageComponent() {
        this((Boolean) null, 1, (f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PartialPackageComponent partialPackageComponent, b bVar, g gVar) {
        if (!bVar.l(gVar) && partialPackageComponent.visible == null) {
            return;
        }
        bVar.t(gVar, 0, C2370f.f29283a, partialPackageComponent.visible);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PartialPackageComponent) && m.b(this.visible, ((PartialPackageComponent) obj).visible);
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "PartialPackageComponent(visible=" + this.visible + ')';
    }

    @InterfaceC0641c
    public /* synthetic */ PartialPackageComponent(int i10, Boolean bool, Y y6) {
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
    }

    public PartialPackageComponent(Boolean bool) {
        this.visible = bool;
    }

    public /* synthetic */ PartialPackageComponent(Boolean bool, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : bool);
    }
}
