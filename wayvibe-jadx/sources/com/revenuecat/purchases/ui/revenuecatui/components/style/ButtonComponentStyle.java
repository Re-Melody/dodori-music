package com.revenuecat.purchases.ui.revenuecatui.components.style;

import B2.AbstractC0112b;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallLegacyComponentInteraction;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final Action action;
    private final String componentId;
    private final String componentName;
    private final Size size;
    private final StackComponentStyle stackComponentStyle;
    private final PaywallTransition transition;
    private final boolean visible;

    public interface Action {

        public static final class CloseWorkflow implements Action {
            public static final int $stable = 0;
            public static final CloseWorkflow INSTANCE = new CloseWorkflow();

            private CloseWorkflow() {
            }
        }

        public static final class DefaultImpls {
        }

        public static final class NavigateBack implements Action {
            public static final int $stable = 0;
            public static final NavigateBack INSTANCE = new NavigateBack();

            private NavigateBack() {
            }
        }

        public static final class NoOp implements Action {
            public static final int $stable = 0;
            public static final NoOp INSTANCE = new NoOp();

            private NoOp() {
            }
        }

        public static final class RestorePurchases implements Action {
            public static final int $stable = 0;
            public static final RestorePurchases INSTANCE = new RestorePurchases();

            private RestorePurchases() {
            }
        }

        public static final class WebCheckout implements Action {
            public static final int $stable = 8;
            private final boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;
            private final Package rcPackage;

            public WebCheckout(Package r10, boolean z10, ButtonComponent.UrlMethod openMethod) {
                m.f(openMethod, "openMethod");
                this.rcPackage = r10;
                this.autoDismiss = z10;
                this.openMethod = openMethod;
            }

            public static /* synthetic */ WebCheckout copy$default(WebCheckout webCheckout, Package r10, boolean z10, ButtonComponent.UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    r10 = webCheckout.rcPackage;
                }
                if ((i10 & 2) != 0) {
                    z10 = webCheckout.autoDismiss;
                }
                if ((i10 & 4) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(r10, z10, urlMethod);
            }

            public final Package component1() {
                return this.rcPackage;
            }

            public final boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final WebCheckout copy(Package r10, boolean z10, ButtonComponent.UrlMethod openMethod) {
                m.f(openMethod, "openMethod");
                return new WebCheckout(r10, z10, openMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) obj;
                return m.b(this.rcPackage, webCheckout.rcPackage) && this.autoDismiss == webCheckout.autoDismiss && this.openMethod == webCheckout.openMethod;
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle.Action
            public String getDescription() {
                return "web_checkout";
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public int hashCode() {
                Package r10 = this.rcPackage;
                return this.openMethod.hashCode() + b.f((r10 == null ? 0 : r10.hashCode()) * 31, 31, this.autoDismiss);
            }

            public String toString() {
                return "WebCheckout(rcPackage=" + this.rcPackage + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        public static final class WebProductSelection implements Action {
            public static final int $stable = 0;
            private final boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public WebProductSelection(boolean z10, ButtonComponent.UrlMethod openMethod) {
                m.f(openMethod, "openMethod");
                this.autoDismiss = z10;
                this.openMethod = openMethod;
            }

            public static /* synthetic */ WebProductSelection copy$default(WebProductSelection webProductSelection, boolean z10, ButtonComponent.UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = webProductSelection.autoDismiss;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(z10, urlMethod);
            }

            public final boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebProductSelection copy(boolean z10, ButtonComponent.UrlMethod openMethod) {
                m.f(openMethod, "openMethod");
                return new WebProductSelection(z10, openMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) obj;
                return this.autoDismiss == webProductSelection.autoDismiss && this.openMethod == webProductSelection.openMethod;
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle.Action
            public String getDescription() {
                return "web_product_selection";
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                return this.openMethod.hashCode() + (Boolean.hashCode(this.autoDismiss) * 31);
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        public static final class WorkflowTrigger implements Action {
            public static final int $stable = 0;
            public static final WorkflowTrigger INSTANCE = new WorkflowTrigger();

            private WorkflowTrigger() {
            }
        }

        /* synthetic */ default String getDescription() {
            return "unknown";
        }

        public static final class NavigateTo implements Action {
            public static final int $stable = 8;
            private final Destination destination;

            public NavigateTo(Destination destination) {
                m.f(destination, "destination");
                this.destination = destination;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && m.b(this.destination, ((NavigateTo) obj).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }

            public interface Destination {

                public static final class CustomerCenter implements Destination {
                    public static final int $stable = 0;
                    public static final CustomerCenter INSTANCE = new CustomerCenter();

                    private CustomerCenter() {
                    }
                }

                public static final class Sheet implements Destination {
                    public static final int $stable = 0;
                    private final boolean backgroundBlur;
                    private final String id;
                    private final String name;
                    private final Size size;
                    private final ComponentStyle stack;

                    public Sheet(String id, String str, ComponentStyle stack, boolean z10, Size size) {
                        m.f(id, "id");
                        m.f(stack, "stack");
                        this.id = id;
                        this.name = str;
                        this.stack = stack;
                        this.backgroundBlur = z10;
                        this.size = size;
                    }

                    public static /* synthetic */ Sheet copy$default(Sheet sheet, String str, String str2, ComponentStyle componentStyle, boolean z10, Size size, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = sheet.id;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = sheet.name;
                        }
                        if ((i10 & 4) != 0) {
                            componentStyle = sheet.stack;
                        }
                        if ((i10 & 8) != 0) {
                            z10 = sheet.backgroundBlur;
                        }
                        if ((i10 & 16) != 0) {
                            size = sheet.size;
                        }
                        Size size2 = size;
                        ComponentStyle componentStyle2 = componentStyle;
                        return sheet.copy(str, str2, componentStyle2, z10, size2);
                    }

                    public final String component1() {
                        return this.id;
                    }

                    public final String component2() {
                        return this.name;
                    }

                    public final ComponentStyle component3() {
                        return this.stack;
                    }

                    public final boolean component4() {
                        return this.backgroundBlur;
                    }

                    public final Size component5() {
                        return this.size;
                    }

                    public final Sheet copy(String id, String str, ComponentStyle stack, boolean z10, Size size) {
                        m.f(id, "id");
                        m.f(stack, "stack");
                        return new Sheet(id, str, stack, z10, size);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Sheet)) {
                            return false;
                        }
                        Sheet sheet = (Sheet) obj;
                        return m.b(this.id, sheet.id) && m.b(this.name, sheet.name) && m.b(this.stack, sheet.stack) && this.backgroundBlur == sheet.backgroundBlur && m.b(this.size, sheet.size);
                    }

                    public final /* synthetic */ boolean getBackgroundBlur() {
                        return this.backgroundBlur;
                    }

                    public final /* synthetic */ String getId() {
                        return this.id;
                    }

                    public final /* synthetic */ String getName() {
                        return this.name;
                    }

                    public final /* synthetic */ Size getSize() {
                        return this.size;
                    }

                    public final /* synthetic */ ComponentStyle getStack() {
                        return this.stack;
                    }

                    public int hashCode() {
                        int iHashCode = this.id.hashCode() * 31;
                        String str = this.name;
                        int iF = b.f((this.stack.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.backgroundBlur);
                        Size size = this.size;
                        return iF + (size != null ? size.hashCode() : 0);
                    }

                    public String toString() {
                        return "Sheet(id=" + this.id + ", name=" + this.name + ", stack=" + this.stack + ", backgroundBlur=" + this.backgroundBlur + ", size=" + this.size + ')';
                    }
                }

                public static final class Url implements Destination {
                    public static final int $stable = 8;
                    private final String componentInteractionValue;
                    private final ButtonComponent.UrlMethod method;
                    private final NonEmptyMap<LocaleId, String> urls;

                    public Url(NonEmptyMap<LocaleId, String> urls, ButtonComponent.UrlMethod method, String componentInteractionValue) {
                        m.f(urls, "urls");
                        m.f(method, "method");
                        m.f(componentInteractionValue, "componentInteractionValue");
                        this.urls = urls;
                        this.method = method;
                        this.componentInteractionValue = componentInteractionValue;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Url copy$default(Url url, NonEmptyMap nonEmptyMap, ButtonComponent.UrlMethod urlMethod, String str, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            nonEmptyMap = url.urls;
                        }
                        if ((i10 & 2) != 0) {
                            urlMethod = url.method;
                        }
                        if ((i10 & 4) != 0) {
                            str = url.componentInteractionValue;
                        }
                        return url.copy(nonEmptyMap, urlMethod, str);
                    }

                    public final NonEmptyMap<LocaleId, String> component1() {
                        return this.urls;
                    }

                    public final ButtonComponent.UrlMethod component2() {
                        return this.method;
                    }

                    public final String component3() {
                        return this.componentInteractionValue;
                    }

                    public final Url copy(NonEmptyMap<LocaleId, String> urls, ButtonComponent.UrlMethod method, String componentInteractionValue) {
                        m.f(urls, "urls");
                        m.f(method, "method");
                        m.f(componentInteractionValue, "componentInteractionValue");
                        return new Url(urls, method, componentInteractionValue);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Url)) {
                            return false;
                        }
                        Url url = (Url) obj;
                        return m.b(this.urls, url.urls) && this.method == url.method && m.b(this.componentInteractionValue, url.componentInteractionValue);
                    }

                    public final /* synthetic */ String getComponentInteractionValue() {
                        return this.componentInteractionValue;
                    }

                    public final /* synthetic */ ButtonComponent.UrlMethod getMethod() {
                        return this.method;
                    }

                    public final /* synthetic */ NonEmptyMap getUrls() {
                        return this.urls;
                    }

                    public int hashCode() {
                        return this.componentInteractionValue.hashCode() + ((this.method.hashCode() + (this.urls.hashCode() * 31)) * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("Url(urls=");
                        sb.append(this.urls);
                        sb.append(", method=");
                        sb.append(this.method);
                        sb.append(", componentInteractionValue=");
                        return AbstractC0112b.j(sb, this.componentInteractionValue, ')');
                    }

                    public /* synthetic */ Url(NonEmptyMap nonEmptyMap, ButtonComponent.UrlMethod urlMethod, String str, int i10, f fVar) {
                        this(nonEmptyMap, urlMethod, (i10 & 4) != 0 ? "navigate_to_url" : str);
                    }
                }
            }
        }

        public static final class PurchasePackage implements Action {
            public static final int $stable = 8;
            private final Package rcPackage;
            private final ResolvedOffer resolvedOffer;

            public PurchasePackage(Package r10, ResolvedOffer resolvedOffer) {
                this.rcPackage = r10;
                this.resolvedOffer = resolvedOffer;
            }

            public static /* synthetic */ PurchasePackage copy$default(PurchasePackage purchasePackage, Package r10, ResolvedOffer resolvedOffer, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    r10 = purchasePackage.rcPackage;
                }
                if ((i10 & 2) != 0) {
                    resolvedOffer = purchasePackage.resolvedOffer;
                }
                return purchasePackage.copy(r10, resolvedOffer);
            }

            public final Package component1() {
                return this.rcPackage;
            }

            public final ResolvedOffer component2() {
                return this.resolvedOffer;
            }

            public final PurchasePackage copy(Package r10, ResolvedOffer resolvedOffer) {
                return new PurchasePackage(r10, resolvedOffer);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PurchasePackage)) {
                    return false;
                }
                PurchasePackage purchasePackage = (PurchasePackage) obj;
                return m.b(this.rcPackage, purchasePackage.rcPackage) && m.b(this.resolvedOffer, purchasePackage.resolvedOffer);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle.Action
            public String getDescription() {
                return PaywallLegacyComponentInteraction.Value.IN_APP_CHECKOUT;
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public final ResolvedOffer getResolvedOffer() {
                return this.resolvedOffer;
            }

            public int hashCode() {
                Package r10 = this.rcPackage;
                int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
                ResolvedOffer resolvedOffer = this.resolvedOffer;
                return iHashCode + (resolvedOffer != null ? resolvedOffer.hashCode() : 0);
            }

            public String toString() {
                return "PurchasePackage(rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ')';
            }

            public /* synthetic */ PurchasePackage(Package r10, ResolvedOffer resolvedOffer, int i10, f fVar) {
                this(r10, (i10 & 2) != 0 ? null : resolvedOffer);
            }
        }

        public static final class CustomWebCheckout implements Action {
            public static final int $stable = 8;
            private final String appUserIdParam;
            private final boolean autoDismiss;
            private final String envParam;
            private final ButtonComponent.UrlMethod openMethod;
            private final String packageParam;
            private final Package rcPackage;
            private final NonEmptyMap<LocaleId, String> urls;

            public CustomWebCheckout(NonEmptyMap<LocaleId, String> urls, boolean z10, ButtonComponent.UrlMethod openMethod, Package r10, String str, String str2, String str3) {
                m.f(urls, "urls");
                m.f(openMethod, "openMethod");
                this.urls = urls;
                this.autoDismiss = z10;
                this.openMethod = openMethod;
                this.rcPackage = r10;
                this.packageParam = str;
                this.appUserIdParam = str2;
                this.envParam = str3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, NonEmptyMap nonEmptyMap, boolean z10, ButtonComponent.UrlMethod urlMethod, Package r10, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    nonEmptyMap = customWebCheckout.urls;
                }
                if ((i10 & 2) != 0) {
                    z10 = customWebCheckout.autoDismiss;
                }
                if ((i10 & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                if ((i10 & 8) != 0) {
                    r10 = customWebCheckout.rcPackage;
                }
                if ((i10 & 16) != 0) {
                    str = customWebCheckout.packageParam;
                }
                if ((i10 & 32) != 0) {
                    str2 = customWebCheckout.appUserIdParam;
                }
                if ((i10 & 64) != 0) {
                    str3 = customWebCheckout.envParam;
                }
                String str4 = str2;
                String str5 = str3;
                String str6 = str;
                ButtonComponent.UrlMethod urlMethod2 = urlMethod;
                return customWebCheckout.copy(nonEmptyMap, z10, urlMethod2, r10, str6, str4, str5);
            }

            public final NonEmptyMap<LocaleId, String> component1() {
                return this.urls;
            }

            public final boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final Package component4() {
                return this.rcPackage;
            }

            public final String component5() {
                return this.packageParam;
            }

            public final String component6() {
                return this.appUserIdParam;
            }

            public final String component7() {
                return this.envParam;
            }

            public final CustomWebCheckout copy(NonEmptyMap<LocaleId, String> urls, boolean z10, ButtonComponent.UrlMethod openMethod, Package r13, String str, String str2, String str3) {
                m.f(urls, "urls");
                m.f(openMethod, "openMethod");
                return new CustomWebCheckout(urls, z10, openMethod, r13, str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) obj;
                return m.b(this.urls, customWebCheckout.urls) && this.autoDismiss == customWebCheckout.autoDismiss && this.openMethod == customWebCheckout.openMethod && m.b(this.rcPackage, customWebCheckout.rcPackage) && m.b(this.packageParam, customWebCheckout.packageParam) && m.b(this.appUserIdParam, customWebCheckout.appUserIdParam) && m.b(this.envParam, customWebCheckout.envParam);
            }

            public final String getAppUserIdParam() {
                return this.appUserIdParam;
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle.Action
            public String getDescription() {
                return "custom_web_checkout";
            }

            public final String getEnvParam() {
                return this.envParam;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final String getPackageParam() {
                return this.packageParam;
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public final NonEmptyMap<LocaleId, String> getUrls() {
                return this.urls;
            }

            public int hashCode() {
                int iHashCode = (this.openMethod.hashCode() + b.f(this.urls.hashCode() * 31, 31, this.autoDismiss)) * 31;
                Package r10 = this.rcPackage;
                int iHashCode2 = (iHashCode + (r10 == null ? 0 : r10.hashCode())) * 31;
                String str = this.packageParam;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.appUserIdParam;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.envParam;
                return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CustomWebCheckout(urls=");
                sb.append(this.urls);
                sb.append(", autoDismiss=");
                sb.append(this.autoDismiss);
                sb.append(", openMethod=");
                sb.append(this.openMethod);
                sb.append(", rcPackage=");
                sb.append(this.rcPackage);
                sb.append(", packageParam=");
                sb.append(this.packageParam);
                sb.append(", appUserIdParam=");
                sb.append(this.appUserIdParam);
                sb.append(", envParam=");
                return AbstractC0112b.j(sb, this.envParam, ')');
            }

            public /* synthetic */ CustomWebCheckout(NonEmptyMap nonEmptyMap, boolean z10, ButtonComponent.UrlMethod urlMethod, Package r10, String str, String str2, String str3, int i10, f fVar) {
                this(nonEmptyMap, z10, urlMethod, r10, str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3);
            }
        }
    }

    public ButtonComponentStyle(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, String str, String str2) {
        m.f(stackComponentStyle, "stackComponentStyle");
        m.f(action, "action");
        this.stackComponentStyle = stackComponentStyle;
        this.action = action;
        this.transition = paywallTransition;
        this.componentName = str;
        this.componentId = str2;
        this.visible = stackComponentStyle.getVisible();
        this.size = stackComponentStyle.getSize();
    }

    public static /* synthetic */ ButtonComponentStyle copy$default(ButtonComponentStyle buttonComponentStyle, StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stackComponentStyle = buttonComponentStyle.stackComponentStyle;
        }
        if ((i10 & 2) != 0) {
            action = buttonComponentStyle.action;
        }
        if ((i10 & 4) != 0) {
            paywallTransition = buttonComponentStyle.transition;
        }
        if ((i10 & 8) != 0) {
            str = buttonComponentStyle.componentName;
        }
        if ((i10 & 16) != 0) {
            str2 = buttonComponentStyle.componentId;
        }
        String str3 = str2;
        PaywallTransition paywallTransition2 = paywallTransition;
        return buttonComponentStyle.copy(stackComponentStyle, action, paywallTransition2, str, str3);
    }

    public final StackComponentStyle component1() {
        return this.stackComponentStyle;
    }

    public final Action component2() {
        return this.action;
    }

    public final PaywallTransition component3() {
        return this.transition;
    }

    public final String component4() {
        return this.componentName;
    }

    public final String component5() {
        return this.componentId;
    }

    public final ButtonComponentStyle copy(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, String str, String str2) {
        m.f(stackComponentStyle, "stackComponentStyle");
        m.f(action, "action");
        return new ButtonComponentStyle(stackComponentStyle, action, paywallTransition, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponentStyle)) {
            return false;
        }
        ButtonComponentStyle buttonComponentStyle = (ButtonComponentStyle) obj;
        return m.b(this.stackComponentStyle, buttonComponentStyle.stackComponentStyle) && m.b(this.action, buttonComponentStyle.action) && m.b(this.transition, buttonComponentStyle.transition) && m.b(this.componentName, buttonComponentStyle.componentName) && m.b(this.componentId, buttonComponentStyle.componentId);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ String getComponentId() {
        return this.componentId;
    }

    public final /* synthetic */ String getComponentName() {
        return this.componentName;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public Size getSize() {
        return this.size;
    }

    public final /* synthetic */ StackComponentStyle getStackComponentStyle() {
        return this.stackComponentStyle;
    }

    public final /* synthetic */ PaywallTransition getTransition() {
        return this.transition;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.stackComponentStyle.hashCode() * 31)) * 31;
        PaywallTransition paywallTransition = this.transition;
        int iHashCode2 = (iHashCode + (paywallTransition == null ? 0 : paywallTransition.hashCode())) * 31;
        String str = this.componentName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.componentId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ButtonComponentStyle(stackComponentStyle=");
        sb.append(this.stackComponentStyle);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", transition=");
        sb.append(this.transition);
        sb.append(", componentName=");
        sb.append(this.componentName);
        sb.append(", componentId=");
        return AbstractC0112b.j(sb, this.componentId, ')');
    }

    public /* synthetic */ ButtonComponentStyle(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, String str, String str2, int i10, f fVar) {
        this(stackComponentStyle, action, (i10 & 4) != 0 ? null : paywallTransition, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2);
    }
}
