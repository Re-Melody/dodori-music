package com.revenuecat.purchases.paywalls.components;

import B2.AbstractC0112b;
import B8.V;
import D7.W;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.C2370f;
import p260y9.C2385v;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PurchaseButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final Action action;
    private final Method method;
    private final String name;
    private final StackComponent stack;

    public enum Action {
        IN_APP_CHECKOUT,
        WEB_CHECKOUT,
        WEB_PRODUCT_SELECTION;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return ActionDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Action.values().length];
                try {
                    iArr[Action.IN_APP_CHECKOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.WEB_CHECKOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.WEB_PRODUCT_SELECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Method toMethod() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return Method.InAppCheckout.INSTANCE;
            }
            int i11 = 3;
            Boolean bool = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            if (i10 == 2) {
                return new Method.WebCheckout((Boolean) (b12 == true ? 1 : 0), (ButtonComponent.UrlMethod) (b11 == true ? 1 : 0), i11, (f) (b10 == true ? 1 : 0));
            }
            if (i10 == 3) {
                return new Method.WebProductSelection(bool, (ButtonComponent.UrlMethod) (b14 == true ? 1 : 0), i11, (f) (b13 == true ? 1 : 0));
            }
            throw new V();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PurchaseButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class CustomUrl {
        public static final Companion Companion = new Companion(null);
        private final String appUserIdParam;
        private final String envParam;
        private final String packageParam;
        private final String urlLid;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC0641c
        public /* synthetic */ CustomUrl(int i10, String str, String str2, String str3, String str4, Y y6, f fVar) {
            this(i10, str, str2, str3, str4, y6);
        }

        /* JADX INFO: renamed from: copy-MN4ShmA$default, reason: not valid java name */
        public static /* synthetic */ CustomUrl m238copyMN4ShmA$default(CustomUrl customUrl, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = customUrl.urlLid;
            }
            if ((i10 & 2) != 0) {
                str2 = customUrl.packageParam;
            }
            if ((i10 & 4) != 0) {
                str3 = customUrl.appUserIdParam;
            }
            if ((i10 & 8) != 0) {
                str4 = customUrl.envParam;
            }
            return customUrl.m241copyMN4ShmA(str, str2, str3, str4);
        }

        public static /* synthetic */ void getAppUserIdParam$annotations() {
        }

        public static /* synthetic */ void getEnvParam$annotations() {
        }

        public static /* synthetic */ void getPackageParam$annotations() {
        }

        /* JADX INFO: renamed from: getUrlLid-z7Tp-4o$annotations, reason: not valid java name */
        public static /* synthetic */ void m239getUrlLidz7Tp4o$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CustomUrl customUrl, b bVar, g gVar) {
            bVar.m(gVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m286boximpl(customUrl.urlLid));
            if (bVar.l(gVar) || customUrl.packageParam != null) {
                bVar.t(gVar, 1, c0.f29272a, customUrl.packageParam);
            }
            if (bVar.l(gVar) || customUrl.appUserIdParam != null) {
                bVar.t(gVar, 2, c0.f29272a, customUrl.appUserIdParam);
            }
            if (!bVar.l(gVar) && customUrl.envParam == null) {
                return;
            }
            bVar.t(gVar, 3, c0.f29272a, customUrl.envParam);
        }

        /* JADX INFO: renamed from: component1-z7Tp-4o, reason: not valid java name */
        public final String m240component1z7Tp4o() {
            return this.urlLid;
        }

        public final String component2() {
            return this.packageParam;
        }

        public final String component3() {
            return this.appUserIdParam;
        }

        public final String component4() {
            return this.envParam;
        }

        /* JADX INFO: renamed from: copy-MN4ShmA, reason: not valid java name */
        public final CustomUrl m241copyMN4ShmA(String urlLid, String str, String str2, String str3) {
            m.f(urlLid, "urlLid");
            return new CustomUrl(urlLid, str, str2, str3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomUrl)) {
                return false;
            }
            CustomUrl customUrl = (CustomUrl) obj;
            return LocalizationKey.m289equalsimpl0(this.urlLid, customUrl.urlLid) && m.b(this.packageParam, customUrl.packageParam) && m.b(this.appUserIdParam, customUrl.appUserIdParam) && m.b(this.envParam, customUrl.envParam);
        }

        public final String getAppUserIdParam() {
            return this.appUserIdParam;
        }

        public final String getEnvParam() {
            return this.envParam;
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        /* JADX INFO: renamed from: getUrlLid-z7Tp-4o, reason: not valid java name */
        public final String m242getUrlLidz7Tp4o() {
            return this.urlLid;
        }

        public int hashCode() {
            int iM290hashCodeimpl = LocalizationKey.m290hashCodeimpl(this.urlLid) * 31;
            String str = this.packageParam;
            int iHashCode = (iM290hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appUserIdParam;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.envParam;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CustomUrl(urlLid=");
            sb.append((Object) LocalizationKey.m291toStringimpl(this.urlLid));
            sb.append(", packageParam=");
            sb.append(this.packageParam);
            sb.append(", appUserIdParam=");
            sb.append(this.appUserIdParam);
            sb.append(", envParam=");
            return AbstractC0112b.j(sb, this.envParam, ')');
        }

        public /* synthetic */ CustomUrl(String str, String str2, String str3, String str4, f fVar) {
            this(str, str2, str3, str4);
        }

        private CustomUrl(int i10, String str, String str2, String str3, String str4, Y y6) {
            if (1 != (i10 & 1)) {
                O.g(i10, 1, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.urlLid = str;
            if ((i10 & 2) == 0) {
                this.packageParam = null;
            } else {
                this.packageParam = str2;
            }
            if ((i10 & 4) == 0) {
                this.appUserIdParam = null;
            } else {
                this.appUserIdParam = str3;
            }
            if ((i10 & 8) == 0) {
                this.envParam = null;
            } else {
                this.envParam = str4;
            }
        }

        private CustomUrl(String urlLid, String str, String str2, String str3) {
            m.f(urlLid, "urlLid");
            this.urlLid = urlLid;
            this.packageParam = str;
            this.appUserIdParam = str2;
            this.envParam = str3;
        }

        public /* synthetic */ CustomUrl(String str, String str2, String str3, String str4, int i10, f fVar) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, null);
        }
    }

    public interface Method {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                return PurchaseButtonMethodDeserializer.INSTANCE;
            }
        }

        public static final class CustomWebCheckout implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final CustomUrl customUrl;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC0641c
            public /* synthetic */ CustomWebCheckout(int i10, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, Y y6) {
                if (1 != (i10 & 1)) {
                    O.g(i10, 1, PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.customUrl = customUrl;
                if ((i10 & 2) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i10 & 4) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public static /* synthetic */ CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    customUrl = customWebCheckout.customUrl;
                }
                if ((i10 & 2) != 0) {
                    bool = customWebCheckout.autoDismiss;
                }
                if ((i10 & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                return customWebCheckout.copy(customUrl, bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getCustomUrl$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CustomWebCheckout customWebCheckout, b bVar, g gVar) {
                bVar.m(gVar, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, customWebCheckout.customUrl);
                if (bVar.l(gVar) || customWebCheckout.autoDismiss != null) {
                    bVar.t(gVar, 1, C2370f.f29283a, customWebCheckout.autoDismiss);
                }
                if (!bVar.l(gVar) && customWebCheckout.openMethod == null) {
                    return;
                }
                bVar.t(gVar, 2, UrlMethodDeserializer.INSTANCE, customWebCheckout.openMethod);
            }

            public final CustomUrl component1() {
                return this.customUrl;
            }

            public final Boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final CustomWebCheckout copy(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                m.f(customUrl, "customUrl");
                return new CustomWebCheckout(customUrl, bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) obj;
                return m.b(this.customUrl, customWebCheckout.customUrl) && m.b(this.autoDismiss, customWebCheckout.autoDismiss) && this.openMethod == customWebCheckout.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                int iHashCode = this.customUrl.hashCode() * 31;
                Boolean bool = this.autoDismiss;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode2 + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "CustomWebCheckout(customUrl=" + this.customUrl + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                m.f(customUrl, "customUrl");
                this.customUrl = customUrl;
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, f fVar) {
                this(customUrl, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : urlMethod);
            }
        }

        public static final class InAppCheckout implements Method {
            public static final InAppCheckout INSTANCE = new InAppCheckout();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$InAppCheckout$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout", InAppCheckout.INSTANCE, new Annotation[0]);
                }
            }

            private InAppCheckout() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Unknown implements Method {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ h $cachedSerializer$delegate = W.R(j.PUBLICATION, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$Unknown$1, reason: invalid class name */
            public static final class AnonymousClass1 extends n implements Z8.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // Z8.a
                public final a invoke() {
                    return new C2385v("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class WebCheckout implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$WebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebCheckout() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ WebCheckout copy$default(WebCheckout webCheckout, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = webCheckout.autoDismiss;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(WebCheckout webCheckout, b bVar, g gVar) {
                if (bVar.l(gVar) || webCheckout.autoDismiss != null) {
                    bVar.t(gVar, 0, C2370f.f29283a, webCheckout.autoDismiss);
                }
                if (!bVar.l(gVar) && webCheckout.openMethod == null) {
                    return;
                }
                bVar.t(gVar, 1, UrlMethodDeserializer.INSTANCE, webCheckout.openMethod);
            }

            public final Boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebCheckout copy(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                return new WebCheckout(bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) obj;
                return m.b(this.autoDismiss, webCheckout.autoDismiss) && this.openMethod == webCheckout.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebCheckout(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @InterfaceC0641c
            public /* synthetic */ WebCheckout(int i10, Boolean bool, ButtonComponent.UrlMethod urlMethod, Y y6) {
                if ((i10 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i10 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, f fVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : urlMethod);
            }
        }

        public static final class WebProductSelection implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$WebProductSelection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebProductSelection() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ WebProductSelection copy$default(WebProductSelection webProductSelection, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = webProductSelection.autoDismiss;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(WebProductSelection webProductSelection, b bVar, g gVar) {
                if (bVar.l(gVar) || webProductSelection.autoDismiss != null) {
                    bVar.t(gVar, 0, C2370f.f29283a, webProductSelection.autoDismiss);
                }
                if (!bVar.l(gVar) && webProductSelection.openMethod == null) {
                    return;
                }
                bVar.t(gVar, 1, UrlMethodDeserializer.INSTANCE, webProductSelection.openMethod);
            }

            public final Boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebProductSelection copy(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                return new WebProductSelection(bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) obj;
                return m.b(this.autoDismiss, webProductSelection.autoDismiss) && this.openMethod == webProductSelection.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @InterfaceC0641c
            public /* synthetic */ WebProductSelection(int i10, Boolean bool, ButtonComponent.UrlMethod urlMethod, Y y6) {
                if ((i10 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i10 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i10, f fVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : urlMethod);
            }
        }
    }

    @InterfaceC0641c
    public /* synthetic */ PurchaseButtonComponent(int i10, StackComponent stackComponent, Action action, Method method, String str, Y y6) {
        if (1 != (i10 & 1)) {
            O.g(i10, 1, PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        if ((i10 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i10 & 4) == 0) {
            this.method = null;
        } else {
            this.method = method;
        }
        if ((i10 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PurchaseButtonComponent purchaseButtonComponent, b bVar, g gVar) {
        bVar.m(gVar, 0, StackComponent$$serializer.INSTANCE, purchaseButtonComponent.stack);
        if (bVar.l(gVar) || purchaseButtonComponent.action != null) {
            bVar.t(gVar, 1, ActionDeserializer.INSTANCE, purchaseButtonComponent.action);
        }
        if (bVar.l(gVar) || purchaseButtonComponent.method != null) {
            bVar.t(gVar, 2, PurchaseButtonMethodDeserializer.INSTANCE, purchaseButtonComponent.method);
        }
        if (!bVar.l(gVar) && purchaseButtonComponent.name == null) {
            return;
        }
        bVar.t(gVar, 3, c0.f29272a, purchaseButtonComponent.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseButtonComponent)) {
            return false;
        }
        PurchaseButtonComponent purchaseButtonComponent = (PurchaseButtonComponent) obj;
        return m.b(this.stack, purchaseButtonComponent.stack) && this.action == purchaseButtonComponent.action && m.b(this.method, purchaseButtonComponent.method) && m.b(this.name, purchaseButtonComponent.name);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ Method getMethod() {
        return this.method;
    }

    public final /* synthetic */ String getName() {
        return this.name;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int iHashCode = this.stack.hashCode() * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Method method = this.method;
        int iHashCode3 = (iHashCode2 + (method == null ? 0 : method.hashCode())) * 31;
        String str = this.name;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseButtonComponent(stack=");
        sb.append(this.stack);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", name=");
        return AbstractC0112b.j(sb, this.name, ')');
    }

    public PurchaseButtonComponent(StackComponent stack, Action action, Method method, String str) {
        m.f(stack, "stack");
        this.stack = stack;
        this.action = action;
        this.method = method;
        this.name = str;
    }

    public /* synthetic */ PurchaseButtonComponent(StackComponent stackComponent, Action action, Method method, String str, int i10, f fVar) {
        this(stackComponent, (i10 & 2) != 0 ? null : action, (i10 & 4) != 0 ? null : method, (i10 & 8) != 0 ? null : str);
    }
}
