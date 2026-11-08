package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.f0;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p028c1.e;
import p134m1.b;
import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes2.dex */
public final class StackComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final boolean applyBottomWindowInsets;
    private final boolean applyHorizontalWindowInsets;
    private final boolean applyTopWindowInsets;
    private final BackgroundStyles background;
    private final BadgeStyle badge;
    private final BorderStyles border;
    private final List<ComponentStyle> children;
    private final CountdownComponent.CountFrom countFrom;
    private final Date countdownDate;
    private final Dimension dimension;
    private final boolean ignoreHeaderHeight;
    private final f0 margin;
    private final OfferEligibility offerEligibility;
    private final List<PresentedOverride<PresentedStackPartial>> overrides;
    private final f0 padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final EnumC2391a0 scrollOrientation;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final float spacing;
    private final Integer tabIndex;
    private final boolean visible;

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, f0 f0Var, f0 f0Var2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, EnumC2391a0 enumC2391a0, Package r14, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, boolean z14, f fVar) {
        this(list, dimension, z10, size, f10, backgroundStyles, f0Var, f0Var2, shape, borderStyles, shadowStyles, badgeStyle, enumC2391a0, r14, resolvedOffer, num, offerEligibility, date, countFrom, list2, z11, z12, z13, z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-h6c5tkY$default, reason: not valid java name */
    public static /* synthetic */ StackComponentStyle m483copyh6c5tkY$default(StackComponentStyle stackComponentStyle, List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, f0 f0Var, f0 f0Var2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, EnumC2391a0 enumC2391a0, Package r31, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        boolean z15;
        boolean z16;
        List list3 = (i10 & 1) != 0 ? stackComponentStyle.children : list;
        Dimension dimension2 = (i10 & 2) != 0 ? stackComponentStyle.dimension : dimension;
        boolean z17 = (i10 & 4) != 0 ? stackComponentStyle.visible : z10;
        Size size2 = (i10 & 8) != 0 ? stackComponentStyle.size : size;
        float f11 = (i10 & 16) != 0 ? stackComponentStyle.spacing : f10;
        BackgroundStyles backgroundStyles2 = (i10 & 32) != 0 ? stackComponentStyle.background : backgroundStyles;
        f0 f0Var3 = (i10 & 64) != 0 ? stackComponentStyle.padding : f0Var;
        f0 f0Var4 = (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? stackComponentStyle.margin : f0Var2;
        Shape shape2 = (i10 & 256) != 0 ? stackComponentStyle.shape : shape;
        BorderStyles borderStyles2 = (i10 & 512) != 0 ? stackComponentStyle.border : borderStyles;
        ShadowStyles shadowStyles2 = (i10 & 1024) != 0 ? stackComponentStyle.shadow : shadowStyles;
        BadgeStyle badgeStyle2 = (i10 & 2048) != 0 ? stackComponentStyle.badge : badgeStyle;
        EnumC2391a0 enumC2391a1 = (i10 & 4096) != 0 ? stackComponentStyle.scrollOrientation : enumC2391a0;
        Package r15 = (i10 & 8192) != 0 ? stackComponentStyle.rcPackage : r31;
        List list4 = list3;
        ResolvedOffer resolvedOffer2 = (i10 & 16384) != 0 ? stackComponentStyle.resolvedOffer : resolvedOffer;
        Integer num2 = (i10 & 32768) != 0 ? stackComponentStyle.tabIndex : num;
        OfferEligibility offerEligibility2 = (i10 & ETagPayloadStore.CHUNK_CHARS) != 0 ? stackComponentStyle.offerEligibility : offerEligibility;
        Date date2 = (i10 & 131072) != 0 ? stackComponentStyle.countdownDate : date;
        CountdownComponent.CountFrom countFrom2 = (i10 & ETagPayloadStore.WRITE_BUFFER_BYTES) != 0 ? stackComponentStyle.countFrom : countFrom;
        List list5 = (i10 & 524288) != 0 ? stackComponentStyle.overrides : list2;
        boolean z18 = (i10 & 1048576) != 0 ? stackComponentStyle.applyTopWindowInsets : z11;
        boolean z19 = (i10 & 2097152) != 0 ? stackComponentStyle.ignoreHeaderHeight : z12;
        boolean z20 = (i10 & 4194304) != 0 ? stackComponentStyle.applyBottomWindowInsets : z13;
        if ((i10 & 8388608) != 0) {
            z16 = z20;
            z15 = stackComponentStyle.applyHorizontalWindowInsets;
        } else {
            z15 = z14;
            z16 = z20;
        }
        return stackComponentStyle.m485copyh6c5tkY(list4, dimension2, z17, size2, f11, backgroundStyles2, f0Var3, f0Var4, shape2, borderStyles2, shadowStyles2, badgeStyle2, enumC2391a1, r15, resolvedOffer2, num2, offerEligibility2, date2, countFrom2, list5, z18, z19, z16, z15);
    }

    public final List<ComponentStyle> component1() {
        return this.children;
    }

    public final BorderStyles component10() {
        return this.border;
    }

    public final ShadowStyles component11() {
        return this.shadow;
    }

    public final BadgeStyle component12() {
        return this.badge;
    }

    public final EnumC2391a0 component13() {
        return this.scrollOrientation;
    }

    public final Package component14() {
        return this.rcPackage;
    }

    public final ResolvedOffer component15() {
        return this.resolvedOffer;
    }

    public final Integer component16() {
        return this.tabIndex;
    }

    public final OfferEligibility component17() {
        return this.offerEligibility;
    }

    public final Date component18() {
        return this.countdownDate;
    }

    public final CountdownComponent.CountFrom component19() {
        return this.countFrom;
    }

    public final Dimension component2() {
        return this.dimension;
    }

    public final List<PresentedOverride<PresentedStackPartial>> component20() {
        return this.overrides;
    }

    public final boolean component21() {
        return this.applyTopWindowInsets;
    }

    public final boolean component22() {
        return this.ignoreHeaderHeight;
    }

    public final boolean component23() {
        return this.applyBottomWindowInsets;
    }

    public final boolean component24() {
        return this.applyHorizontalWindowInsets;
    }

    public final boolean component3() {
        return this.visible;
    }

    public final Size component4() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m484component5D9Ej5fM() {
        return this.spacing;
    }

    public final BackgroundStyles component6() {
        return this.background;
    }

    public final f0 component7() {
        return this.padding;
    }

    public final f0 component8() {
        return this.margin;
    }

    public final Shape component9() {
        return this.shape;
    }

    /* JADX INFO: renamed from: copy-h6c5tkY, reason: not valid java name */
    public final StackComponentStyle m485copyh6c5tkY(List<? extends ComponentStyle> children, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, f0 padding, f0 margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, EnumC2391a0 enumC2391a0, Package r41, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List<PresentedOverride<PresentedStackPartial>> overrides, boolean z11, boolean z12, boolean z13, boolean z14) {
        m.f(children, "children");
        m.f(dimension, "dimension");
        m.f(size, "size");
        m.f(padding, "padding");
        m.f(margin, "margin");
        m.f(shape, "shape");
        m.f(countFrom, "countFrom");
        m.f(overrides, "overrides");
        return new StackComponentStyle(children, dimension, z10, size, f10, backgroundStyles, padding, margin, shape, borderStyles, shadowStyles, badgeStyle, enumC2391a0, r41, resolvedOffer, num, offerEligibility, date, countFrom, overrides, z11, z12, z13, z14, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponentStyle)) {
            return false;
        }
        StackComponentStyle stackComponentStyle = (StackComponentStyle) obj;
        return m.b(this.children, stackComponentStyle.children) && m.b(this.dimension, stackComponentStyle.dimension) && this.visible == stackComponentStyle.visible && m.b(this.size, stackComponentStyle.size) && e.a(this.spacing, stackComponentStyle.spacing) && m.b(this.background, stackComponentStyle.background) && m.b(this.padding, stackComponentStyle.padding) && m.b(this.margin, stackComponentStyle.margin) && m.b(this.shape, stackComponentStyle.shape) && m.b(this.border, stackComponentStyle.border) && m.b(this.shadow, stackComponentStyle.shadow) && m.b(this.badge, stackComponentStyle.badge) && this.scrollOrientation == stackComponentStyle.scrollOrientation && m.b(this.rcPackage, stackComponentStyle.rcPackage) && m.b(this.resolvedOffer, stackComponentStyle.resolvedOffer) && m.b(this.tabIndex, stackComponentStyle.tabIndex) && m.b(this.offerEligibility, stackComponentStyle.offerEligibility) && m.b(this.countdownDate, stackComponentStyle.countdownDate) && this.countFrom == stackComponentStyle.countFrom && m.b(this.overrides, stackComponentStyle.overrides) && this.applyTopWindowInsets == stackComponentStyle.applyTopWindowInsets && this.ignoreHeaderHeight == stackComponentStyle.ignoreHeaderHeight && this.applyBottomWindowInsets == stackComponentStyle.applyBottomWindowInsets && this.applyHorizontalWindowInsets == stackComponentStyle.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyBottomWindowInsets() {
        return this.applyBottomWindowInsets;
    }

    public final /* synthetic */ boolean getApplyHorizontalWindowInsets() {
        return this.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyTopWindowInsets() {
        return this.applyTopWindowInsets;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BadgeStyle getBadge() {
        return this.badge;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ Date getCountdownDate() {
        return this.countdownDate;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ boolean getIgnoreHeaderHeight() {
        return this.ignoreHeaderHeight;
    }

    public final /* synthetic */ f0 getMargin() {
        return this.margin;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ f0 getPadding() {
        return this.padding;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ EnumC2391a0 getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m486getSpacingD9Ej5fM() {
        return this.spacing;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext
    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle
    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iB = b.b(this.spacing, (this.size.hashCode() + b.f((this.dimension.hashCode() + (this.children.hashCode() * 31)) * 31, 31, this.visible)) * 31, 31);
        BackgroundStyles backgroundStyles = this.background;
        int iHashCode = (this.shape.hashCode() + ((this.margin.hashCode() + ((this.padding.hashCode() + ((iB + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31)) * 31)) * 31)) * 31;
        BorderStyles borderStyles = this.border;
        int iHashCode2 = (iHashCode + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int iHashCode3 = (iHashCode2 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        BadgeStyle badgeStyle = this.badge;
        int iHashCode4 = (iHashCode3 + (badgeStyle == null ? 0 : badgeStyle.hashCode())) * 31;
        EnumC2391a0 enumC2391a0 = this.scrollOrientation;
        int iHashCode5 = (iHashCode4 + (enumC2391a0 == null ? 0 : enumC2391a0.hashCode())) * 31;
        Package r10 = this.rcPackage;
        int iHashCode6 = (iHashCode5 + (r10 == null ? 0 : r10.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int iHashCode7 = (iHashCode6 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        int iHashCode9 = (iHashCode8 + (offerEligibility == null ? 0 : offerEligibility.hashCode())) * 31;
        Date date = this.countdownDate;
        return Boolean.hashCode(this.applyHorizontalWindowInsets) + b.f(b.f(b.f(b.d((this.countFrom.hashCode() + ((iHashCode9 + (date != null ? date.hashCode() : 0)) * 31)) * 31, 31, this.overrides), 31, this.applyTopWindowInsets), 31, this.ignoreHeaderHeight), 31, this.applyBottomWindowInsets);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StackComponentStyle(children=");
        sb.append(this.children);
        sb.append(", dimension=");
        sb.append(this.dimension);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", spacing=");
        b.r(this.spacing, ", background=", sb);
        sb.append(this.background);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", scrollOrientation=");
        sb.append(this.scrollOrientation);
        sb.append(", rcPackage=");
        sb.append(this.rcPackage);
        sb.append(", resolvedOffer=");
        sb.append(this.resolvedOffer);
        sb.append(", tabIndex=");
        sb.append(this.tabIndex);
        sb.append(", offerEligibility=");
        sb.append(this.offerEligibility);
        sb.append(", countdownDate=");
        sb.append(this.countdownDate);
        sb.append(", countFrom=");
        sb.append(this.countFrom);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(", applyTopWindowInsets=");
        sb.append(this.applyTopWindowInsets);
        sb.append(", ignoreHeaderHeight=");
        sb.append(this.ignoreHeaderHeight);
        sb.append(", applyBottomWindowInsets=");
        sb.append(this.applyBottomWindowInsets);
        sb.append(", applyHorizontalWindowInsets=");
        return b.o(sb, this.applyHorizontalWindowInsets, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StackComponentStyle(List<? extends ComponentStyle> children, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, f0 padding, f0 margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, EnumC2391a0 enumC2391a0, Package r17, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List<PresentedOverride<PresentedStackPartial>> overrides, boolean z11, boolean z12, boolean z13, boolean z14) {
        m.f(children, "children");
        m.f(dimension, "dimension");
        m.f(size, "size");
        m.f(padding, "padding");
        m.f(margin, "margin");
        m.f(shape, "shape");
        m.f(countFrom, "countFrom");
        m.f(overrides, "overrides");
        this.children = children;
        this.dimension = dimension;
        this.visible = z10;
        this.size = size;
        this.spacing = f10;
        this.background = backgroundStyles;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.badge = badgeStyle;
        this.scrollOrientation = enumC2391a0;
        this.rcPackage = r17;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.countdownDate = date;
        this.countFrom = countFrom;
        this.overrides = overrides;
        this.applyTopWindowInsets = z11;
        this.ignoreHeaderHeight = z12;
        this.applyBottomWindowInsets = z13;
        this.applyHorizontalWindowInsets = z14;
    }

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z10, Size size, float f10, BackgroundStyles backgroundStyles, f0 f0Var, f0 f0Var2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, EnumC2391a0 enumC2391a0, Package r43, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z11, boolean z12, boolean z13, boolean z14, int i10, f fVar) {
        this(list, dimension, z10, size, f10, backgroundStyles, f0Var, f0Var2, shape, borderStyles, shadowStyles, badgeStyle, enumC2391a0, r43, (i10 & 16384) != 0 ? null : resolvedOffer, num, (65536 & i10) != 0 ? null : offerEligibility, date, countFrom, list2, (1048576 & i10) != 0 ? false : z11, (2097152 & i10) != 0 ? false : z12, (4194304 & i10) != 0 ? false : z13, (i10 & 8388608) != 0 ? false : z14, null);
    }
}
