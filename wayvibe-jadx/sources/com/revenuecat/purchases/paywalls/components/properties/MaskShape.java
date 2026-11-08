package com.revenuecat.purchases.paywalls.components.properties;

import D7.W;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import Z8.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p240w9.g;
import p251x9.b;
import p260y9.C2385v;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface MaskShape {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Circle implements MaskShape {
        public static final Circle INSTANCE = new Circle();
        private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Circle$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return new C2385v("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Circle", Circle.INSTANCE, new Annotation[0]);
            }
        }

        private Circle() {
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) $cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final p219u9.a serializer() {
            return MaskShapeDeserializer.INSTANCE;
        }
    }

    public static final class Concave implements MaskShape {
        public static final Concave INSTANCE = new Concave();
        private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Concave$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return new C2385v("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Concave", Concave.INSTANCE, new Annotation[0]);
            }
        }

        private Concave() {
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) $cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Convex implements MaskShape {
        public static final Convex INSTANCE = new Convex();
        private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Convex$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return new C2385v("com.revenuecat.purchases.paywalls.components.properties.MaskShape.Convex", Convex.INSTANCE, new Annotation[0]);
            }
        }

        private Convex() {
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) $cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Rectangle implements MaskShape {
        public static final Companion Companion = new Companion(null);
        private final CornerRadiuses corners;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final p219u9.a serializer() {
                return MaskShape$Rectangle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Rectangle() {
            this((CornerRadiuses) null, 1, (f) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Rectangle rectangle, b bVar, g gVar) {
            if (!bVar.l(gVar) && rectangle.corners == null) {
                return;
            }
            bVar.t(gVar, 0, CornerRadiusesSerializer.INSTANCE, rectangle.corners);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && m.b(this.corners, ((Rectangle) obj).corners);
        }

        public final /* synthetic */ CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }

        @InterfaceC0641c
        public /* synthetic */ Rectangle(int i10, CornerRadiuses cornerRadiuses, Y y6) {
            if ((i10 & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        public /* synthetic */ Rectangle(CornerRadiuses cornerRadiuses, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : cornerRadiuses);
        }
    }
}
