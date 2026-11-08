package com.revenuecat.purchases.paywalls.components.properties;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Padding {
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;
    public static final Companion Companion = new Companion(null);
    private static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final Padding f3default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final /* synthetic */ Padding getDefault() {
            return Padding.f3default;
        }

        public final /* synthetic */ Padding getZero() {
            return Padding.zero;
        }

        public final a serializer() {
            return Padding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Padding() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (f) null);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Padding padding, b bVar, g gVar) {
        if (bVar.l(gVar) || Double.compare(padding.top, 0.0d) != 0) {
            bVar.f(gVar, 0, padding.top);
        }
        if (bVar.l(gVar) || Double.compare(padding.bottom, 0.0d) != 0) {
            bVar.f(gVar, 1, padding.bottom);
        }
        if (bVar.l(gVar) || Double.compare(padding.leading, 0.0d) != 0) {
            bVar.f(gVar, 2, padding.leading);
        }
        if (!bVar.l(gVar) && Double.compare(padding.trailing, 0.0d) == 0) {
            return;
        }
        bVar.f(gVar, 3, padding.trailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final /* synthetic */ double getBottom() {
        return this.bottom;
    }

    public final /* synthetic */ double getLeading() {
        return this.leading;
    }

    public final /* synthetic */ double getTop() {
        return this.top;
    }

    public final /* synthetic */ double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return Double.hashCode(this.trailing) + ((Double.hashCode(this.leading) + ((Double.hashCode(this.bottom) + (Double.hashCode(this.top) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }

    public Padding(double d10, double d11, double d12, double d13) {
        this.top = d10;
        this.bottom = d11;
        this.leading = d12;
        this.trailing = d13;
    }

    @InterfaceC0641c
    public /* synthetic */ Padding(int i10, double d10, double d11, double d12, double d13, Y y6) {
        if ((i10 & 1) == 0) {
            this.top = 0.0d;
        } else {
            this.top = d10;
        }
        if ((i10 & 2) == 0) {
            this.bottom = 0.0d;
        } else {
            this.bottom = d11;
        }
        if ((i10 & 4) == 0) {
            this.leading = 0.0d;
        } else {
            this.leading = d12;
        }
        if ((i10 & 8) == 0) {
            this.trailing = 0.0d;
        } else {
            this.trailing = d13;
        }
    }

    public /* synthetic */ Padding(double d10, double d11, double d12, double d13, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) != 0 ? 0.0d : d13);
    }
}
