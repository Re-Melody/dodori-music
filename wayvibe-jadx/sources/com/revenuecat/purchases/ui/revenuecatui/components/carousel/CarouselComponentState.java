package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import C.f0;
import N8.t;
import U.C0880d;
import U.InterfaceC0877b0;
import U.U;
import U.Y0;
import W3.c;
import Z8.a;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p028c1.e;
import p067g0.d;
import p143n0.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class CarouselComponentState {
    public static final int $stable = 0;
    private final Y0 autoAdvance$delegate;
    private final Y0 background$delegate;
    private final Y0 border$delegate;
    private final a customVariablesProvider;
    private final Y0 initialPageIndex$delegate;
    private final Y0 loop$delegate;
    private final Y0 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final Y0 padding$delegate;
    private final Y0 pageAlignment$delegate;
    private final Y0 pageControl$delegate;
    private final Y0 pagePeek$delegate;
    private final Y0 pageSpacing$delegate;
    private final Y0 pages$delegate;
    private final Y0 presentedPartial$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final Y0 shadow$delegate;
    private final Y0 shape$delegate;
    private final Y0 size$delegate;
    private final CarouselComponentStyle style;
    private final Y0 visible$delegate;
    private final InterfaceC0877b0 windowSize$delegate;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentState$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Z8.a
        public final Map<String, CustomVariableValue> invoke() {
            return t.f8651a;
        }
    }

    public CarouselComponentState(c initialWindowSize, CarouselComponentStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
        m.f(initialWindowSize, "initialWindowSize");
        m.f(style, "style");
        m.f(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        m.f(selectedTabIndexProvider, "selectedTabIndexProvider");
        m.f(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        m.f(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = C0880d.K(initialWindowSize, U.f11815f);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial$delegate = C0880d.D(new CarouselComponentState$presentedPartial$2(this));
        this.visible$delegate = C0880d.D(new CarouselComponentState$visible$2(this));
        this.initialPageIndex$delegate = C0880d.D(new CarouselComponentState$initialPageIndex$2(this));
        this.pages$delegate = C0880d.D(new CarouselComponentState$pages$2(this));
        this.pageAlignment$delegate = C0880d.D(new CarouselComponentState$pageAlignment$2(this));
        this.size$delegate = C0880d.D(new CarouselComponentState$size$2(this));
        this.pagePeek$delegate = C0880d.D(new CarouselComponentState$pagePeek$2(this));
        this.background$delegate = C0880d.D(new CarouselComponentState$background$2(this));
        this.pageSpacing$delegate = C0880d.D(new CarouselComponentState$pageSpacing$2(this));
        this.padding$delegate = C0880d.D(new CarouselComponentState$padding$2(this));
        this.margin$delegate = C0880d.D(new CarouselComponentState$margin$2(this));
        this.shape$delegate = C0880d.D(new CarouselComponentState$shape$2(this));
        this.border$delegate = C0880d.D(new CarouselComponentState$border$2(this));
        this.shadow$delegate = C0880d.D(new CarouselComponentState$shadow$2(this));
        this.pageControl$delegate = C0880d.D(new CarouselComponentState$pageControl$2(this));
        this.loop$delegate = C0880d.D(new CarouselComponentState$loop$2(this));
        this.autoAdvance$delegate = C0880d.D(new CarouselComponentState$autoAdvance$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresentedCarouselPartial getPresentedPartial() {
        return (PresentedCarouselPartial) this.presentedPartial$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(CarouselComponentState carouselComponentState, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        carouselComponentState.update(cVar);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return (CarouselComponent.AutoAdvancePages) this.autoAdvance$delegate.getValue();
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background$delegate.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border$delegate.getValue();
    }

    public final /* synthetic */ int getInitialPageIndex() {
        return ((Number) this.initialPageIndex$delegate.getValue()).intValue();
    }

    public final /* synthetic */ boolean getLoop() {
        return ((Boolean) this.loop$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ f0 getMargin() {
        return (f0) this.margin$delegate.getValue();
    }

    public final /* synthetic */ f0 getPadding() {
        return (f0) this.padding$delegate.getValue();
    }

    public final /* synthetic */ d getPageAlignment() {
        return (d) this.pageAlignment$delegate.getValue();
    }

    public final /* synthetic */ CarouselComponentStyle.PageControlStyles getPageControl() {
        return (CarouselComponentStyle.PageControlStyles) this.pageControl$delegate.getValue();
    }

    /* JADX INFO: renamed from: getPagePeek-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m351getPagePeekD9Ej5fM() {
        return ((e) this.pagePeek$delegate.getValue()).f15849a;
    }

    /* JADX INFO: renamed from: getPageSpacing-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m352getPageSpacingD9Ej5fM() {
        return ((e) this.pageSpacing$delegate.getValue()).f15849a;
    }

    public final /* synthetic */ List getPages() {
        return (List) this.pages$delegate.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow$delegate.getValue();
    }

    public final /* synthetic */ c0 getShape() {
        return (c0) this.shape$delegate.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
    }

    public /* synthetic */ CarouselComponentState(c cVar, CarouselComponentStyle carouselComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, int i10, f fVar) {
        this(cVar, carouselComponentStyle, aVar, aVar2, aVar3, (i10 & 32) != 0 ? AnonymousClass1.INSTANCE : aVar4);
    }
}
