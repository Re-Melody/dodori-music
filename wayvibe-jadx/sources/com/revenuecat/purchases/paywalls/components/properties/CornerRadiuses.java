package com.revenuecat.purchases.paywalls.components.properties;

import M8.InterfaceC0641c;
import V0.p;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface CornerRadiuses {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return CornerRadiusesSerializer.INSTANCE;
        }
    }

    public static final class Dp implements CornerRadiuses {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private static final Dp f2default;
        private static final Dp zero;
        private final double bottomLeading;
        private final double bottomTrailing;
        private final double topLeading;
        private final double topTrailing;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final /* synthetic */ Dp getDefault() {
                return Dp.f2default;
            }

            public final /* synthetic */ Dp getZero() {
                return Dp.zero;
            }

            public final a serializer() {
                return CornerRadiuses$Dp$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            Dp dp = new Dp(0.0d, 0.0d, 0.0d, 0.0d);
            zero = dp;
            f2default = dp;
        }

        public Dp(double d10, double d11, double d12, double d13) {
            this.topLeading = d10;
            this.topTrailing = d11;
            this.bottomLeading = d12;
            this.bottomTrailing = d13;
        }

        public static /* synthetic */ Dp copy$default(Dp dp, double d10, double d11, double d12, double d13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = dp.topLeading;
            }
            double d14 = d10;
            if ((i10 & 2) != 0) {
                d11 = dp.topTrailing;
            }
            double d15 = d11;
            if ((i10 & 4) != 0) {
                d12 = dp.bottomLeading;
            }
            return dp.copy(d14, d15, d12, (i10 & 8) != 0 ? dp.bottomTrailing : d13);
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Dp dp, b bVar, g gVar) {
            bVar.f(gVar, 0, dp.topLeading);
            bVar.f(gVar, 1, dp.topTrailing);
            bVar.f(gVar, 2, dp.bottomLeading);
            bVar.f(gVar, 3, dp.bottomTrailing);
        }

        public final Dp copy(double d10, double d11, double d12, double d13) {
            return new Dp(d10, d11, d12, d13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dp)) {
                return false;
            }
            Dp dp = (Dp) obj;
            return Double.compare(this.topLeading, dp.topLeading) == 0 && Double.compare(this.topTrailing, dp.topTrailing) == 0 && Double.compare(this.bottomLeading, dp.bottomLeading) == 0 && Double.compare(this.bottomTrailing, dp.bottomTrailing) == 0;
        }

        public final /* synthetic */ double getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ double getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ double getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ double getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return Double.hashCode(this.bottomTrailing) + ((Double.hashCode(this.bottomLeading) + ((Double.hashCode(this.topTrailing) + (Double.hashCode(this.topLeading) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Dp(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @InterfaceC0641c
        public /* synthetic */ Dp(int i10, double d10, double d11, double d12, double d13, Y y6) {
            if (15 != (i10 & 15)) {
                O.g(i10, 15, CornerRadiuses$Dp$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = d10;
            this.topTrailing = d11;
            this.bottomLeading = d12;
            this.bottomTrailing = d13;
        }

        public Dp(double d10) {
            this(d10, d10, d10, d10);
        }
    }

    public static final class Percentage implements CornerRadiuses {
        public static final Companion Companion = new Companion(null);
        private final int bottomLeading;
        private final int bottomTrailing;
        private final int topLeading;
        private final int topTrailing;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CornerRadiuses$Percentage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Percentage(int i10, int i11, int i12, int i13) {
            this.topLeading = i10;
            this.topTrailing = i11;
            this.bottomLeading = i12;
            this.bottomTrailing = i13;
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Percentage percentage, b bVar, g gVar) {
            bVar.p(0, percentage.topLeading, gVar);
            bVar.p(1, percentage.topTrailing, gVar);
            bVar.p(2, percentage.bottomLeading, gVar);
            bVar.p(3, percentage.bottomTrailing, gVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Percentage)) {
                return false;
            }
            Percentage percentage = (Percentage) obj;
            return this.topLeading == percentage.topLeading && this.topTrailing == percentage.topTrailing && this.bottomLeading == percentage.bottomLeading && this.bottomTrailing == percentage.bottomTrailing;
        }

        public final /* synthetic */ int getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ int getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ int getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ int getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((this.topLeading * 31) + this.topTrailing) * 31) + this.bottomLeading) * 31) + this.bottomTrailing;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Percentage(topLeading=");
            sb.append(this.topLeading);
            sb.append(", topTrailing=");
            sb.append(this.topTrailing);
            sb.append(", bottomLeading=");
            sb.append(this.bottomLeading);
            sb.append(", bottomTrailing=");
            return p.q(sb, this.bottomTrailing, ')');
        }

        @InterfaceC0641c
        public /* synthetic */ Percentage(int i10, int i11, int i12, int i13, int i14, Y y6) {
            if (15 != (i10 & 15)) {
                O.g(i10, 15, CornerRadiuses$Percentage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = i11;
            this.topTrailing = i12;
            this.bottomLeading = i13;
            this.bottomTrailing = i14;
        }

        public Percentage(int i10) {
            this(i10, i10, i10, i10);
        }
    }
}
