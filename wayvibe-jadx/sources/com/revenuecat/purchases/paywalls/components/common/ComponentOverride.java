package com.revenuecat.purchases.paywalls.components.common;

import B2.AbstractC0112b;
import D7.W;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.C2367c;
import p260y9.C2385v;
import p260y9.O;
import p260y9.Q;
import p260y9.Y;
import p260y9.c0;
import p270z9.C;
import p270z9.D;
import p270z9.v;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ComponentOverride<T extends PartialComponent> {
    private static final g $cachedDescriptor;
    private final List<Condition> conditions;
    private final T properties;
    public static final Companion Companion = new Companion(null);
    private static final a[] $childSerializers = {new C2367c(ConditionSerializer.INSTANCE), null};

    public enum ArrayOperator {
        IN,
        NOT_IN;

        public static final Companion Companion = new Companion(null);
        private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$ArrayOperator$Companion$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return O.d("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator", ArrayOperator.values(), new String[]{"in", "not in"}, new Annotation[][]{null, null});
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) ArrayOperator.$cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final <T0> a serializer(a typeSerial0) {
            m.f(typeSerial0, "typeSerial0");
            return new ComponentOverride$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    public enum EqualityOperator {
        EQUALS,
        NOT_EQUALS;

        public static final Companion Companion = new Companion(null);
        private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$EqualityOperator$Companion$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return O.d("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator", EqualityOperator.values(), new String[]{com.amazon.a.a.o.b.f.f16452b, "!="}, new Annotation[][]{null, null});
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) EqualityOperator.$cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    static {
        Q q5 = new Q("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", null, 2);
        q5.k("conditions", false);
        q5.k(DiagnosticsEntry.PROPERTIES_KEY, false);
        $cachedDescriptor = q5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC0641c
    public /* synthetic */ ComponentOverride(int i10, List list, PartialComponent partialComponent, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, $cachedDescriptor);
            throw null;
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ComponentOverride componentOverride, b bVar, g gVar, a aVar) {
        bVar.m(gVar, 0, $childSerializers[0], componentOverride.conditions);
        bVar.m(gVar, 1, aVar, componentOverride.properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverride)) {
            return false;
        }
        ComponentOverride componentOverride = (ComponentOverride) obj;
        return m.b(this.conditions, componentOverride.conditions) && m.b(this.properties, componentOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.conditions.hashCode() * 31);
    }

    public String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }

    public interface Condition {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Compact implements Condition {
            public static final Compact INSTANCE = new Compact();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Compact$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact", Compact.INSTANCE, new Annotation[0]);
                }
            }

            private Compact() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                return ConditionSerializer.INSTANCE;
            }
        }

        public static final class DefaultImpls {
            @Deprecated
            public static boolean isRule(Condition condition) {
                return Condition.super.isRule();
            }

            @InternalRevenueCatAPI
            public static /* synthetic */ void isRule$annotations() {
            }
        }

        public static final class Expanded implements Condition {
            public static final Expanded INSTANCE = new Expanded();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Expanded$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded", Expanded.INSTANCE, new Annotation[0]);
                }
            }

            private Expanded() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class IntroOffer implements Condition {
            public static final IntroOffer INSTANCE = new IntroOffer();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$IntroOffer$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer", IntroOffer.INSTANCE, new Annotation[0]);
                }
            }

            private IntroOffer() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class IntroOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.Companion.serializer(), null};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ IntroOfferRule(int i10, EqualityOperator equalityOperator, boolean z10, Y y6) {
                if (3 != (i10 & 3)) {
                    O.g(i10, 3, ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z10;
            }

            public static /* synthetic */ IntroOfferRule copy$default(IntroOfferRule introOfferRule, EqualityOperator equalityOperator, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = introOfferRule.operator;
                }
                if ((i10 & 2) != 0) {
                    z10 = introOfferRule.value;
                }
                return introOfferRule.copy(equalityOperator, z10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(IntroOfferRule introOfferRule, b bVar, g gVar) {
                bVar.m(gVar, 0, $childSerializers[0], introOfferRule.operator);
                bVar.s(gVar, 1, introOfferRule.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final boolean component2() {
                return this.value;
            }

            public final IntroOfferRule copy(EqualityOperator operator, boolean z10) {
                m.f(operator, "operator");
                return new IntroOfferRule(operator, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IntroOfferRule)) {
                    return false;
                }
                IntroOfferRule introOfferRule = (IntroOfferRule) obj;
                return this.operator == introOfferRule.operator && this.value == introOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("IntroOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return p134m1.b.o(sb, this.value, ')');
            }

            public IntroOfferRule(EqualityOperator operator, boolean z10) {
                m.f(operator, "operator");
                this.operator = operator;
                this.value = z10;
            }
        }

        public static final class Medium implements Condition {
            public static final Medium INSTANCE = new Medium();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Medium$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium", Medium.INSTANCE, new Annotation[0]);
                }
            }

            private Medium() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class MultiplePhaseOffers implements Condition {
            public static final MultiplePhaseOffers INSTANCE = new MultiplePhaseOffers();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$MultiplePhaseOffers$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers", MultiplePhaseOffers.INSTANCE, new Annotation[0]);
                }
            }

            private MultiplePhaseOffers() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PromoOffer implements Condition {
            public static final PromoOffer INSTANCE = new PromoOffer();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$PromoOffer$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer", PromoOffer.INSTANCE, new Annotation[0]);
                }
            }

            private PromoOffer() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PromoOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.Companion.serializer(), null};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ PromoOfferRule(int i10, EqualityOperator equalityOperator, boolean z10, Y y6) {
                if (3 != (i10 & 3)) {
                    O.g(i10, 3, ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z10;
            }

            public static /* synthetic */ PromoOfferRule copy$default(PromoOfferRule promoOfferRule, EqualityOperator equalityOperator, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = promoOfferRule.operator;
                }
                if ((i10 & 2) != 0) {
                    z10 = promoOfferRule.value;
                }
                return promoOfferRule.copy(equalityOperator, z10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PromoOfferRule promoOfferRule, b bVar, g gVar) {
                bVar.m(gVar, 0, $childSerializers[0], promoOfferRule.operator);
                bVar.s(gVar, 1, promoOfferRule.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final boolean component2() {
                return this.value;
            }

            public final PromoOfferRule copy(EqualityOperator operator, boolean z10) {
                m.f(operator, "operator");
                return new PromoOfferRule(operator, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PromoOfferRule)) {
                    return false;
                }
                PromoOfferRule promoOfferRule = (PromoOfferRule) obj;
                return this.operator == promoOfferRule.operator && this.value == promoOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("PromoOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return p134m1.b.o(sb, this.value, ')');
            }

            public PromoOfferRule(EqualityOperator operator, boolean z10) {
                m.f(operator, "operator");
                this.operator = operator;
                this.value = z10;
            }
        }

        public static final class Selected implements Condition {
            public static final Selected INSTANCE = new Selected();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Selected$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected", Selected.INSTANCE, new Annotation[0]);
                }
            }

            private Selected() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class SelectedPackage implements Condition {
            private final ArrayOperator operator;
            private final List<String> packages;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {ArrayOperator.Companion.serializer(), new C2367c(c0.f29272a)};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ SelectedPackage(int i10, ArrayOperator arrayOperator, List list, Y y6) {
                if (3 != (i10 & 3)) {
                    O.g(i10, 3, ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = arrayOperator;
                this.packages = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SelectedPackage copy$default(SelectedPackage selectedPackage, ArrayOperator arrayOperator, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    arrayOperator = selectedPackage.operator;
                }
                if ((i10 & 2) != 0) {
                    list = selectedPackage.packages;
                }
                return selectedPackage.copy(arrayOperator, list);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(SelectedPackage selectedPackage, b bVar, g gVar) {
                a[] aVarArr = $childSerializers;
                bVar.m(gVar, 0, aVarArr[0], selectedPackage.operator);
                bVar.m(gVar, 1, aVarArr[1], selectedPackage.packages);
            }

            public final ArrayOperator component1() {
                return this.operator;
            }

            public final List<String> component2() {
                return this.packages;
            }

            public final SelectedPackage copy(ArrayOperator operator, List<String> packages) {
                m.f(operator, "operator");
                m.f(packages, "packages");
                return new SelectedPackage(operator, packages);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectedPackage)) {
                    return false;
                }
                SelectedPackage selectedPackage = (SelectedPackage) obj;
                return this.operator == selectedPackage.operator && m.b(this.packages, selectedPackage.packages);
            }

            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List<String> getPackages() {
                return this.packages;
            }

            public int hashCode() {
                return this.packages.hashCode() + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SelectedPackage(operator=");
                sb.append(this.operator);
                sb.append(", packages=");
                return AbstractC0112b.m(sb, this.packages, ')');
            }

            public SelectedPackage(ArrayOperator operator, List<String> packages) {
                m.f(operator, "operator");
                m.f(packages, "packages");
                this.operator = operator;
                this.packages = packages;
            }
        }

        public static final class Unsupported implements Condition {
            public static final Unsupported INSTANCE = new Unsupported();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Unsupported$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported", Unsupported.INSTANCE, new Annotation[0]);
                }
            }

            private Unsupported() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Variable implements Condition {
            private final EqualityOperator operator;
            private final C value;
            private final String variable;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.Companion.serializer(), null, null};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$Variable$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ Variable(int i10, EqualityOperator equalityOperator, String str, C c3, Y y6) {
                if (7 != (i10 & 7)) {
                    O.g(i10, 7, ComponentOverride$Condition$Variable$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.variable = str;
                this.value = c3;
            }

            public static /* synthetic */ Variable copy$default(Variable variable, EqualityOperator equalityOperator, String str, C c3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = variable.operator;
                }
                if ((i10 & 2) != 0) {
                    str = variable.variable;
                }
                if ((i10 & 4) != 0) {
                    c3 = variable.value;
                }
                return variable.copy(equalityOperator, str, c3);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Variable variable, b bVar, g gVar) {
                bVar.m(gVar, 0, $childSerializers[0], variable.operator);
                bVar.u(gVar, 1, variable.variable);
                bVar.m(gVar, 2, D.f29913a, variable.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final String component2() {
                return this.variable;
            }

            public final C component3() {
                return this.value;
            }

            public final Variable copy(EqualityOperator operator, String variable, C value) {
                m.f(operator, "operator");
                m.f(variable, "variable");
                m.f(value, "value");
                return new Variable(operator, variable, value);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Variable)) {
                    return false;
                }
                Variable variable = (Variable) obj;
                return this.operator == variable.operator && m.b(this.variable, variable.variable) && m.b(this.value, variable.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final C getValue() {
                return this.value;
            }

            public final String getVariable() {
                return this.variable;
            }

            public int hashCode() {
                return this.value.hashCode() + AbstractC0112b.a(this.operator.hashCode() * 31, 31, this.variable);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "Variable(operator=" + this.operator + ", variable=" + this.variable + ", value=" + this.value + ')';
            }

            public Variable(EqualityOperator operator, String variable, C value) {
                m.f(operator, "operator");
                m.f(variable, "variable");
                m.f(value, "value");
                this.operator = operator;
                this.variable = variable;
                this.value = value;
            }
        }

        default boolean isRule() {
            return false;
        }

        public static final class State implements Condition {
            private final String name;
            private final EqualityOperator operator;
            private final C value;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.Companion.serializer(), null, null};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$State$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ State(int i10, EqualityOperator equalityOperator, String str, C c3, Y y6) {
                if (7 != (i10 & 7)) {
                    O.g(i10, 7, ComponentOverride$Condition$State$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.name = str;
                this.value = c3;
                if (c3 instanceof v) {
                    throw new IllegalArgumentException("State condition value must not be null");
                }
            }

            public static /* synthetic */ State copy$default(State state, EqualityOperator equalityOperator, String str, C c3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = state.operator;
                }
                if ((i10 & 2) != 0) {
                    str = state.name;
                }
                if ((i10 & 4) != 0) {
                    c3 = state.value;
                }
                return state.copy(equalityOperator, str, c3);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(State state, b bVar, g gVar) {
                bVar.m(gVar, 0, $childSerializers[0], state.operator);
                bVar.u(gVar, 1, state.name);
                bVar.m(gVar, 2, D.f29913a, state.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final String component2() {
                return this.name;
            }

            public final C component3() {
                return this.value;
            }

            public final State copy(EqualityOperator operator, String name, C value) {
                m.f(operator, "operator");
                m.f(name, "name");
                m.f(value, "value");
                return new State(operator, name, value);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof State)) {
                    return false;
                }
                State state = (State) obj;
                return this.operator == state.operator && m.b(this.name, state.name) && m.b(this.value, state.value);
            }

            public final String getName() {
                return this.name;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final C getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + AbstractC0112b.a(this.operator.hashCode() * 31, 31, this.name);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "State(operator=" + this.operator + ", name=" + this.name + ", value=" + this.value + ')';
            }

            public State(EqualityOperator operator, String name, C value) {
                m.f(operator, "operator");
                m.f(name, "name");
                m.f(value, "value");
                this.operator = operator;
                this.name = name;
                this.value = value;
                if (value instanceof v) {
                    throw new IllegalArgumentException("State condition value must not be null");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentOverride(List<? extends Condition> conditions, T properties) {
        m.f(conditions, "conditions");
        m.f(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }
}
