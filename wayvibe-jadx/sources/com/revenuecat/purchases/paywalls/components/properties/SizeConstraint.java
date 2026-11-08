package com.revenuecat.purchases.paywalls.components.properties;

import D7.W;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import M8.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.C2385v;
import p260y9.O;
import p260y9.Y;
import p260y9.j0;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface SizeConstraint {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return SizeConstraintDeserializer.INSTANCE;
        }
    }

    public static final class Fill implements SizeConstraint {
        public static final Fill INSTANCE = new Fill();
        private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements Z8.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final a invoke() {
                return new C2385v("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill", Fill.INSTANCE, new Annotation[0]);
            }
        }

        private Fill() {
        }

        private final /* synthetic */ a get$cachedSerializer() {
            return (a) $cachedSerializer$delegate.getValue();
        }

        public final a serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Fit implements SizeConstraint {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private final v f4default;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return SizeConstraint$Fit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC0641c
        public /* synthetic */ Fit(int i10, v vVar, Y y6, f fVar) {
            this(i10, vVar, y6);
        }

        /* JADX INFO: renamed from: getDefault-0hXNFcg$annotations, reason: not valid java name */
        public static /* synthetic */ void m300getDefault0hXNFcg$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Fit fit, b bVar, g gVar) {
            if (!bVar.l(gVar) && fit.f4default == null) {
                return;
            }
            bVar.t(gVar, 0, j0.f29296a, fit.f4default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fit) && m.b(this.f4default, ((Fit) obj).f4default);
        }

        /* JADX INFO: renamed from: getDefault-0hXNFcg, reason: not valid java name */
        public final /* synthetic */ v m301getDefault0hXNFcg() {
            return this.f4default;
        }

        public int hashCode() {
            v vVar = this.f4default;
            if (vVar == null) {
                return 0;
            }
            return Integer.hashCode(vVar.f8431a);
        }

        public String toString() {
            return "Fit(default=" + this.f4default + ')';
        }

        public /* synthetic */ Fit(v vVar, f fVar) {
            this(vVar);
        }

        private Fit(int i10, v vVar, Y y6) {
            if ((i10 & 1) == 0) {
                this.f4default = null;
            } else {
                this.f4default = vVar;
            }
        }

        private Fit(v vVar) {
            this.f4default = vVar;
        }

        public /* synthetic */ Fit(v vVar, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : vVar, null);
        }
    }

    public static final class Fixed implements SizeConstraint {
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return SizeConstraint$Fixed$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC0641c
        public /* synthetic */ Fixed(int i10, v vVar, Y y6, f fVar) {
            this(i10, vVar, y6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.value == ((Fixed) obj).value;
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name */
        public final /* synthetic */ int m302getValuepVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return "Fixed(value=" + ((Object) v.a(this.value)) + ')';
        }

        public /* synthetic */ Fixed(int i10, f fVar) {
            this(i10);
        }

        private Fixed(int i10) {
            this.value = i10;
        }

        private Fixed(int i10, v vVar, Y y6) {
            if (1 == (i10 & 1)) {
                this.value = vVar.f8431a;
            } else {
                O.g(i10, 1, SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }
}
