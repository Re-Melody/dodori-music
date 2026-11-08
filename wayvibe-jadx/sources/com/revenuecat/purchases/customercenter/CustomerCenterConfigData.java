package com.revenuecat.purchases.customercenter;

import B2.AbstractC0112b;
import B8.V;
import D7.W;
import D7.p1;
import M8.InterfaceC0641c;
import M8.h;
import M8.j;
import N8.t;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallLegacyComponentInteraction;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import p075g9.c;
import p219u9.a;
import p219u9.d;
import p240w9.g;
import p251x9.b;
import p260y9.C2367c;
import p260y9.C2370f;
import p260y9.G;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class CustomerCenterConfigData {
    public static final Companion Companion = new Companion(null);
    private final Appearance appearance;
    private final String lastPublishedAppVersion;
    private final Localization localization;
    private final Map<Screen.ScreenType, Screen> screens;
    private final Support support;

    public static final class Appearance {
        public static final Companion Companion = new Companion(null);
        private final ColorInformation dark;
        private final ColorInformation light;

        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accentColor;
            private final PaywallColor backgroundColor;
            private final PaywallColor buttonBackgroundColor;
            private final PaywallColor buttonTextColor;
            private final PaywallColor textColor;

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ColorInformation() {
                this((PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31, (f) null);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallColor = colorInformation.accentColor;
                }
                if ((i10 & 2) != 0) {
                    paywallColor2 = colorInformation.textColor;
                }
                if ((i10 & 4) != 0) {
                    paywallColor3 = colorInformation.backgroundColor;
                }
                if ((i10 & 8) != 0) {
                    paywallColor4 = colorInformation.buttonTextColor;
                }
                if ((i10 & 16) != 0) {
                    paywallColor5 = colorInformation.buttonBackgroundColor;
                }
                PaywallColor paywallColor6 = paywallColor5;
                PaywallColor paywallColor7 = paywallColor3;
                return colorInformation.copy(paywallColor, paywallColor2, paywallColor7, paywallColor4, paywallColor6);
            }

            public static /* synthetic */ void getAccentColor$annotations() {
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonTextColor$annotations() {
            }

            public static /* synthetic */ void getTextColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ColorInformation colorInformation, b bVar, g gVar) {
                if (bVar.l(gVar) || colorInformation.accentColor != null) {
                    bVar.t(gVar, 0, PaywallColor.Serializer.INSTANCE, colorInformation.accentColor);
                }
                if (bVar.l(gVar) || colorInformation.textColor != null) {
                    bVar.t(gVar, 1, PaywallColor.Serializer.INSTANCE, colorInformation.textColor);
                }
                if (bVar.l(gVar) || colorInformation.backgroundColor != null) {
                    bVar.t(gVar, 2, PaywallColor.Serializer.INSTANCE, colorInformation.backgroundColor);
                }
                if (bVar.l(gVar) || colorInformation.buttonTextColor != null) {
                    bVar.t(gVar, 3, PaywallColor.Serializer.INSTANCE, colorInformation.buttonTextColor);
                }
                if (!bVar.l(gVar) && colorInformation.buttonBackgroundColor == null) {
                    return;
                }
                bVar.t(gVar, 4, PaywallColor.Serializer.INSTANCE, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor component1() {
                return this.accentColor;
            }

            public final PaywallColor component2() {
                return this.textColor;
            }

            public final PaywallColor component3() {
                return this.backgroundColor;
            }

            public final PaywallColor component4() {
                return this.buttonTextColor;
            }

            public final PaywallColor component5() {
                return this.buttonBackgroundColor;
            }

            public final ColorInformation copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                return new ColorInformation(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return m.b(this.accentColor, colorInformation.accentColor) && m.b(this.textColor, colorInformation.textColor) && m.b(this.backgroundColor, colorInformation.backgroundColor) && m.b(this.buttonTextColor, colorInformation.buttonTextColor) && m.b(this.buttonBackgroundColor, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                PaywallColor paywallColor = this.accentColor;
                int iHashCode = (paywallColor == null ? 0 : paywallColor.hashCode()) * 31;
                PaywallColor paywallColor2 = this.textColor;
                int iHashCode2 = (iHashCode + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31;
                PaywallColor paywallColor3 = this.backgroundColor;
                int iHashCode3 = (iHashCode2 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.buttonTextColor;
                int iHashCode4 = (iHashCode3 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.buttonBackgroundColor;
                return iHashCode4 + (paywallColor5 != null ? paywallColor5.hashCode() : 0);
            }

            public String toString() {
                return "ColorInformation(accentColor=" + this.accentColor + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonTextColor=" + this.buttonTextColor + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ')';
            }

            @InterfaceC0641c
            public /* synthetic */ ColorInformation(int i10, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, Y y6) {
                if ((i10 & 1) == 0) {
                    this.accentColor = null;
                } else {
                    this.accentColor = paywallColor;
                }
                if ((i10 & 2) == 0) {
                    this.textColor = null;
                } else {
                    this.textColor = paywallColor2;
                }
                if ((i10 & 4) == 0) {
                    this.backgroundColor = null;
                } else {
                    this.backgroundColor = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.buttonTextColor = null;
                } else {
                    this.buttonTextColor = paywallColor4;
                }
                if ((i10 & 16) == 0) {
                    this.buttonBackgroundColor = null;
                } else {
                    this.buttonBackgroundColor = paywallColor5;
                }
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                this.accentColor = paywallColor;
                this.textColor = paywallColor2;
                this.backgroundColor = paywallColor3;
                this.buttonTextColor = paywallColor4;
                this.buttonBackgroundColor = paywallColor5;
            }

            public /* synthetic */ ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i10, f fVar) {
                this((i10 & 1) != 0 ? null : paywallColor, (i10 & 2) != 0 ? null : paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, (i10 & 16) != 0 ? null : paywallColor5);
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$Appearance$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Appearance() {
            this((ColorInformation) null, (ColorInformation) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, ColorInformation colorInformation, ColorInformation colorInformation2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                colorInformation = appearance.light;
            }
            if ((i10 & 2) != 0) {
                colorInformation2 = appearance.dark;
            }
            return appearance.copy(colorInformation, colorInformation2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Appearance appearance, b bVar, g gVar) {
            if (bVar.l(gVar) || appearance.light != null) {
                bVar.t(gVar, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.light);
            }
            if (!bVar.l(gVar) && appearance.dark == null) {
                return;
            }
            bVar.t(gVar, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.dark);
        }

        public final ColorInformation component1() {
            return this.light;
        }

        public final ColorInformation component2() {
            return this.dark;
        }

        public final Appearance copy(ColorInformation colorInformation, ColorInformation colorInformation2) {
            return new Appearance(colorInformation, colorInformation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) obj;
            return m.b(this.light, appearance.light) && m.b(this.dark, appearance.dark);
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public int hashCode() {
            ColorInformation colorInformation = this.light;
            int iHashCode = (colorInformation == null ? 0 : colorInformation.hashCode()) * 31;
            ColorInformation colorInformation2 = this.dark;
            return iHashCode + (colorInformation2 != null ? colorInformation2.hashCode() : 0);
        }

        public String toString() {
            return "Appearance(light=" + this.light + ", dark=" + this.dark + ')';
        }

        @InterfaceC0641c
        public /* synthetic */ Appearance(int i10, ColorInformation colorInformation, ColorInformation colorInformation2, Y y6) {
            if ((i10 & 1) == 0) {
                this.light = null;
            } else {
                this.light = colorInformation;
            }
            if ((i10 & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = colorInformation2;
            }
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2) {
            this.light = colorInformation;
            this.dark = colorInformation2;
        }

        public /* synthetic */ Appearance(ColorInformation colorInformation, ColorInformation colorInformation2, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : colorInformation, (i10 & 2) != 0 ? null : colorInformation2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CustomerCenterConfigData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class HelpPath {
        private final String actionIdentifier;
        private final PathDetail.FeedbackSurvey feedbackSurvey;
        private final String id;
        private final OpenMethod openMethod;
        private final PathDetail.PromotionalOffer promotionalOffer;
        private final String title;
        private final PathType type;
        private final String url;
        public static final Companion Companion = new Companion(null);
        private static final a[] $childSerializers = {null, null, PathType.Companion.serializer(), null, null, null, OpenMethod.Companion.serializer(), null};

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$HelpPath$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum OpenMethod {
            IN_APP,
            EXTERNAL;

            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$OpenMethod$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return O.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.OpenMethod", OpenMethod.values());
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) OpenMethod.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        public static abstract class PathDetail {
            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return new d("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail", z.a(PathDetail.class), new c[]{z.a(FeedbackSurvey.class), z.a(PromotionalOffer.class)}, new a[]{CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) PathDetail.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            public static final class FeedbackSurvey extends PathDetail {
                private final List<Option> options;
                private final String title;
                public static final Companion Companion = new Companion(null);
                private static final a[] $childSerializers = {null, new C2367c(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE)};

                public static final class Companion {
                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }

                    public final a serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static final class Option {
                    public static final Companion Companion = new Companion(null);
                    private final String id;
                    private final PromotionalOffer promotionalOffer;
                    private final String title;

                    public static final class Companion {
                        public /* synthetic */ Companion(f fVar) {
                            this();
                        }

                        public final a serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC0641c
                    public /* synthetic */ Option(int i10, String str, String str2, PromotionalOffer promotionalOffer, Y y6) {
                        if (3 != (i10 & 3)) {
                            O.g(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.id = str;
                        this.title = str2;
                        if ((i10 & 4) == 0) {
                            this.promotionalOffer = null;
                        } else {
                            this.promotionalOffer = promotionalOffer;
                        }
                    }

                    public static /* synthetic */ Option copy$default(Option option, String str, String str2, PromotionalOffer promotionalOffer, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = option.id;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = option.title;
                        }
                        if ((i10 & 4) != 0) {
                            promotionalOffer = option.promotionalOffer;
                        }
                        return option.copy(str, str2, promotionalOffer);
                    }

                    public static /* synthetic */ void getPromotionalOffer$annotations() {
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Option option, b bVar, g gVar) {
                        bVar.u(gVar, 0, option.id);
                        bVar.u(gVar, 1, option.title);
                        if (!bVar.l(gVar) && option.promotionalOffer == null) {
                            return;
                        }
                        bVar.t(gVar, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, option.promotionalOffer);
                    }

                    public final String component1() {
                        return this.id;
                    }

                    public final String component2() {
                        return this.title;
                    }

                    public final PromotionalOffer component3() {
                        return this.promotionalOffer;
                    }

                    public final Option copy(String id, String title, PromotionalOffer promotionalOffer) {
                        m.f(id, "id");
                        m.f(title, "title");
                        return new Option(id, title, promotionalOffer);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) obj;
                        return m.b(this.id, option.id) && m.b(this.title, option.title) && m.b(this.promotionalOffer, option.promotionalOffer);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int iA = AbstractC0112b.a(this.id.hashCode() * 31, 31, this.title);
                        PromotionalOffer promotionalOffer = this.promotionalOffer;
                        return iA + (promotionalOffer == null ? 0 : promotionalOffer.hashCode());
                    }

                    public String toString() {
                        return "Option(id=" + this.id + ", title=" + this.title + ", promotionalOffer=" + this.promotionalOffer + ')';
                    }

                    public Option(String id, String title, PromotionalOffer promotionalOffer) {
                        m.f(id, "id");
                        m.f(title, "title");
                        this.id = id;
                        this.title = title;
                        this.promotionalOffer = promotionalOffer;
                    }

                    public /* synthetic */ Option(String str, String str2, PromotionalOffer promotionalOffer, int i10, f fVar) {
                        this(str, str2, (i10 & 4) != 0 ? null : promotionalOffer);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @InterfaceC0641c
                public /* synthetic */ FeedbackSurvey(int i10, String str, List list, Y y6) {
                    super(i10, y6);
                    if (3 != (i10 & 3)) {
                        O.g(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.options = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ FeedbackSurvey copy$default(FeedbackSurvey feedbackSurvey, String str, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = feedbackSurvey.title;
                    }
                    if ((i10 & 2) != 0) {
                        list = feedbackSurvey.options;
                    }
                    return feedbackSurvey.copy(str, list);
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsRelease(FeedbackSurvey feedbackSurvey, b bVar, g gVar) {
                    PathDetail.write$Self(feedbackSurvey, bVar, gVar);
                    a[] aVarArr = $childSerializers;
                    bVar.u(gVar, 0, feedbackSurvey.title);
                    bVar.m(gVar, 1, aVarArr[1], feedbackSurvey.options);
                }

                public final String component1() {
                    return this.title;
                }

                public final List<Option> component2() {
                    return this.options;
                }

                public final FeedbackSurvey copy(String title, List<Option> options) {
                    m.f(title, "title");
                    m.f(options, "options");
                    return new FeedbackSurvey(title, options);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FeedbackSurvey)) {
                        return false;
                    }
                    FeedbackSurvey feedbackSurvey = (FeedbackSurvey) obj;
                    return m.b(this.title, feedbackSurvey.title) && m.b(this.options, feedbackSurvey.options);
                }

                public final List<Option> getOptions() {
                    return this.options;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.options.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("FeedbackSurvey(title=");
                    sb.append(this.title);
                    sb.append(", options=");
                    return AbstractC0112b.m(sb, this.options, ')');
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FeedbackSurvey(String title, List<Option> options) {
                    super(null);
                    m.f(title, "title");
                    m.f(options, "options");
                    this.title = title;
                    this.options = options;
                }
            }

            public static final class PromotionalOffer extends PathDetail {
                private static final a[] $childSerializers;
                public static final Companion Companion = new Companion(null);
                private final String androidOfferId;
                private final Map<String, CrossProductPromotion> crossProductPromotions;
                private final boolean eligible;
                private final Map<String, String> productMapping;
                private final String subtitle;
                private final String title;

                public static final class Companion {
                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }

                    public final a serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static final class CrossProductPromotion {
                    public static final Companion Companion = new Companion(null);
                    private final String storeOfferIdentifier;
                    private final String targetProductId;

                    public static final class Companion {
                        public /* synthetic */ Companion(f fVar) {
                            this();
                        }

                        public final a serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC0641c
                    public /* synthetic */ CrossProductPromotion(int i10, String str, String str2, Y y6) {
                        if (3 != (i10 & 3)) {
                            O.g(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.storeOfferIdentifier = str;
                        this.targetProductId = str2;
                    }

                    public static /* synthetic */ void getStoreOfferIdentifier$annotations() {
                    }

                    public static /* synthetic */ void getTargetProductId$annotations() {
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CrossProductPromotion crossProductPromotion, b bVar, g gVar) {
                        bVar.u(gVar, 0, crossProductPromotion.storeOfferIdentifier);
                        bVar.u(gVar, 1, crossProductPromotion.targetProductId);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CrossProductPromotion)) {
                            return false;
                        }
                        CrossProductPromotion crossProductPromotion = (CrossProductPromotion) obj;
                        return m.b(this.storeOfferIdentifier, crossProductPromotion.storeOfferIdentifier) && m.b(this.targetProductId, crossProductPromotion.targetProductId);
                    }

                    public final String getStoreOfferIdentifier() {
                        return this.storeOfferIdentifier;
                    }

                    public final String getTargetProductId() {
                        return this.targetProductId;
                    }

                    public int hashCode() {
                        return this.targetProductId.hashCode() + (this.storeOfferIdentifier.hashCode() * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("CrossProductPromotion(storeOfferIdentifier=");
                        sb.append(this.storeOfferIdentifier);
                        sb.append(", targetProductId=");
                        return AbstractC0112b.j(sb, this.targetProductId, ')');
                    }

                    public CrossProductPromotion(String storeOfferIdentifier, String targetProductId) {
                        m.f(storeOfferIdentifier, "storeOfferIdentifier");
                        m.f(targetProductId, "targetProductId");
                        this.storeOfferIdentifier = storeOfferIdentifier;
                        this.targetProductId = targetProductId;
                    }
                }

                static {
                    c0 c0Var = c0.f29272a;
                    $childSerializers = new a[]{null, null, null, null, new G(c0Var, c0Var), new G(c0Var, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE)};
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @InterfaceC0641c
                public /* synthetic */ PromotionalOffer(int i10, String str, boolean z10, String str2, String str3, Map map, Map map2, Y y6) {
                    super(i10, y6);
                    if (31 != (i10 & 31)) {
                        O.g(i10, 31, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.androidOfferId = str;
                    this.eligible = z10;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                    if ((i10 & 32) == 0) {
                        this.crossProductPromotions = t.f8651a;
                    } else {
                        this.crossProductPromotions = map2;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z10, String str2, String str3, Map map, Map map2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i10 & 2) != 0) {
                        z10 = promotionalOffer.eligible;
                    }
                    if ((i10 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    if ((i10 & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    if ((i10 & 32) != 0) {
                        map2 = promotionalOffer.crossProductPromotions;
                    }
                    Map map3 = map;
                    Map map4 = map2;
                    return promotionalOffer.copy(str, z10, str2, str3, map3, map4);
                }

                public static /* synthetic */ void getAndroidOfferId$annotations() {
                }

                public static /* synthetic */ void getCrossProductPromotions$annotations() {
                }

                public static /* synthetic */ void getProductMapping$annotations() {
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PromotionalOffer promotionalOffer, b bVar, g gVar) {
                    PathDetail.write$Self(promotionalOffer, bVar, gVar);
                    a[] aVarArr = $childSerializers;
                    bVar.u(gVar, 0, promotionalOffer.androidOfferId);
                    bVar.s(gVar, 1, promotionalOffer.eligible);
                    bVar.u(gVar, 2, promotionalOffer.title);
                    bVar.u(gVar, 3, promotionalOffer.subtitle);
                    bVar.m(gVar, 4, aVarArr[4], promotionalOffer.productMapping);
                    if (!bVar.l(gVar) && m.b(promotionalOffer.crossProductPromotions, t.f8651a)) {
                        return;
                    }
                    bVar.m(gVar, 5, aVarArr[5], promotionalOffer.crossProductPromotions);
                }

                public final String component1() {
                    return this.androidOfferId;
                }

                public final boolean component2() {
                    return this.eligible;
                }

                public final String component3() {
                    return this.title;
                }

                public final String component4() {
                    return this.subtitle;
                }

                public final Map<String, String> component5() {
                    return this.productMapping;
                }

                public final Map<String, CrossProductPromotion> component6() {
                    return this.crossProductPromotions;
                }

                public final PromotionalOffer copy(String androidOfferId, boolean z10, String title, String subtitle, Map<String, String> productMapping, Map<String, CrossProductPromotion> crossProductPromotions) {
                    m.f(androidOfferId, "androidOfferId");
                    m.f(title, "title");
                    m.f(subtitle, "subtitle");
                    m.f(productMapping, "productMapping");
                    m.f(crossProductPromotions, "crossProductPromotions");
                    return new PromotionalOffer(androidOfferId, z10, title, subtitle, productMapping, crossProductPromotions);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromotionalOffer)) {
                        return false;
                    }
                    PromotionalOffer promotionalOffer = (PromotionalOffer) obj;
                    return m.b(this.androidOfferId, promotionalOffer.androidOfferId) && this.eligible == promotionalOffer.eligible && m.b(this.title, promotionalOffer.title) && m.b(this.subtitle, promotionalOffer.subtitle) && m.b(this.productMapping, promotionalOffer.productMapping) && m.b(this.crossProductPromotions, promotionalOffer.crossProductPromotions);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final Map<String, CrossProductPromotion> getCrossProductPromotions() {
                    return this.crossProductPromotions;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final Map<String, String> getProductMapping() {
                    return this.productMapping;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.crossProductPromotions.hashCode() + p134m1.b.e(AbstractC0112b.a(AbstractC0112b.a(p134m1.b.f(this.androidOfferId.hashCode() * 31, 31, this.eligible), 31, this.title), 31, this.subtitle), 31, this.productMapping);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("PromotionalOffer(androidOfferId=");
                    sb.append(this.androidOfferId);
                    sb.append(", eligible=");
                    sb.append(this.eligible);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", subtitle=");
                    sb.append(this.subtitle);
                    sb.append(", productMapping=");
                    sb.append(this.productMapping);
                    sb.append(", crossProductPromotions=");
                    return p134m1.b.n(sb, this.crossProductPromotions, ')');
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z10, String str2, String str3, Map map, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i10 & 2) != 0) {
                        z10 = promotionalOffer.eligible;
                    }
                    if ((i10 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    if ((i10 & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    Map map2 = map;
                    String str4 = str2;
                    return promotionalOffer.copy(str, z10, str4, str3, map2);
                }

                @InterfaceC0641c
                public final PromotionalOffer copy(String androidOfferId, boolean z10, String title, String subtitle, Map<String, String> productMapping) {
                    m.f(androidOfferId, "androidOfferId");
                    m.f(title, "title");
                    m.f(subtitle, "subtitle");
                    m.f(productMapping, "productMapping");
                    return copy(androidOfferId, z10, title, subtitle, productMapping, t.f8651a);
                }

                public /* synthetic */ PromotionalOffer(String str, boolean z10, String str2, String str3, Map map, Map map2, int i10, f fVar) {
                    this(str, z10, str2, str3, map, (i10 & 32) != 0 ? t.f8651a : map2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PromotionalOffer(String androidOfferId, boolean z10, String title, String subtitle, Map<String, String> productMapping, Map<String, CrossProductPromotion> crossProductPromotions) {
                    super(null);
                    m.f(androidOfferId, "androidOfferId");
                    m.f(title, "title");
                    m.f(subtitle, "subtitle");
                    m.f(productMapping, "productMapping");
                    m.f(crossProductPromotions, "crossProductPromotions");
                    this.androidOfferId = androidOfferId;
                    this.eligible = z10;
                    this.title = title;
                    this.subtitle = subtitle;
                    this.productMapping = productMapping;
                    this.crossProductPromotions = crossProductPromotions;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                @InterfaceC0641c
                public PromotionalOffer(String androidOfferId, boolean z10, String title, String subtitle, Map<String, String> productMapping) {
                    this(androidOfferId, z10, title, subtitle, productMapping, t.f8651a);
                    m.f(androidOfferId, "androidOfferId");
                    m.f(title, "title");
                    m.f(subtitle, "subtitle");
                    m.f(productMapping, "productMapping");
                }
            }

            public /* synthetic */ PathDetail(f fVar) {
                this();
            }

            private PathDetail() {
            }

            @InterfaceC0641c
            public /* synthetic */ PathDetail(int i10, Y y6) {
            }

            public static final /* synthetic */ void write$Self(PathDetail pathDetail, b bVar, g gVar) {
            }
        }

        public enum PathType {
            MISSING_PURCHASE,
            REFUND_REQUEST,
            CHANGE_PLANS,
            CANCEL,
            CUSTOM_URL,
            CUSTOM_ACTION,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathType$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return O.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType", PathType.values());
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) PathType.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        @InterfaceC0641c
        public /* synthetic */ HelpPath(int i10, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, Y y6) {
            if (7 != (i10 & 7)) {
                O.g(i10, 7, CustomerCenterConfigData$HelpPath$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.title = str2;
            this.type = pathType;
            if ((i10 & 8) == 0) {
                this.promotionalOffer = null;
            } else {
                this.promotionalOffer = promotionalOffer;
            }
            if ((i10 & 16) == 0) {
                this.feedbackSurvey = null;
            } else {
                this.feedbackSurvey = feedbackSurvey;
            }
            if ((i10 & 32) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i10 & 64) == 0) {
                this.openMethod = null;
            } else {
                this.openMethod = openMethod;
            }
            if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 0) {
                this.actionIdentifier = null;
            } else {
                this.actionIdentifier = str4;
            }
        }

        public static /* synthetic */ HelpPath copy$default(HelpPath helpPath, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpPath.id;
            }
            if ((i10 & 2) != 0) {
                str2 = helpPath.title;
            }
            if ((i10 & 4) != 0) {
                pathType = helpPath.type;
            }
            if ((i10 & 8) != 0) {
                promotionalOffer = helpPath.promotionalOffer;
            }
            if ((i10 & 16) != 0) {
                feedbackSurvey = helpPath.feedbackSurvey;
            }
            if ((i10 & 32) != 0) {
                str3 = helpPath.url;
            }
            if ((i10 & 64) != 0) {
                openMethod = helpPath.openMethod;
            }
            if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
                str4 = helpPath.actionIdentifier;
            }
            OpenMethod openMethod2 = openMethod;
            String str5 = str4;
            PathDetail.FeedbackSurvey feedbackSurvey2 = feedbackSurvey;
            String str6 = str3;
            return helpPath.copy(str, str2, pathType, promotionalOffer, feedbackSurvey2, str6, openMethod2, str5);
        }

        public static /* synthetic */ void getActionIdentifier$annotations() {
        }

        public static /* synthetic */ void getFeedbackSurvey$annotations() {
        }

        public static /* synthetic */ void getOpenMethod$annotations() {
        }

        public static /* synthetic */ void getPromotionalOffer$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(HelpPath helpPath, b bVar, g gVar) {
            a[] aVarArr = $childSerializers;
            bVar.u(gVar, 0, helpPath.id);
            bVar.u(gVar, 1, helpPath.title);
            bVar.m(gVar, 2, aVarArr[2], helpPath.type);
            if (bVar.l(gVar) || helpPath.promotionalOffer != null) {
                bVar.t(gVar, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, helpPath.promotionalOffer);
            }
            if (bVar.l(gVar) || helpPath.feedbackSurvey != null) {
                bVar.t(gVar, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, helpPath.feedbackSurvey);
            }
            if (bVar.l(gVar) || helpPath.url != null) {
                bVar.t(gVar, 5, c0.f29272a, helpPath.url);
            }
            if (bVar.l(gVar) || helpPath.openMethod != null) {
                bVar.t(gVar, 6, aVarArr[6], helpPath.openMethod);
            }
            if (!bVar.l(gVar) && helpPath.actionIdentifier == null) {
                return;
            }
            bVar.t(gVar, 7, c0.f29272a, helpPath.actionIdentifier);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final PathType component3() {
            return this.type;
        }

        public final PathDetail.PromotionalOffer component4() {
            return this.promotionalOffer;
        }

        public final PathDetail.FeedbackSurvey component5() {
            return this.feedbackSurvey;
        }

        public final String component6() {
            return this.url;
        }

        public final OpenMethod component7() {
            return this.openMethod;
        }

        public final String component8() {
            return this.actionIdentifier;
        }

        public final HelpPath copy(String id, String title, PathType type, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str, OpenMethod openMethod, String str2) {
            m.f(id, "id");
            m.f(title, "title");
            m.f(type, "type");
            return new HelpPath(id, title, type, promotionalOffer, feedbackSurvey, str, openMethod, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpPath)) {
                return false;
            }
            HelpPath helpPath = (HelpPath) obj;
            return m.b(this.id, helpPath.id) && m.b(this.title, helpPath.title) && this.type == helpPath.type && m.b(this.promotionalOffer, helpPath.promotionalOffer) && m.b(this.feedbackSurvey, helpPath.feedbackSurvey) && m.b(this.url, helpPath.url) && this.openMethod == helpPath.openMethod && m.b(this.actionIdentifier, helpPath.actionIdentifier);
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getId() {
            return this.id;
        }

        public final OpenMethod getOpenMethod() {
            return this.openMethod;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + AbstractC0112b.a(this.id.hashCode() * 31, 31, this.title)) * 31;
            PathDetail.PromotionalOffer promotionalOffer = this.promotionalOffer;
            int iHashCode2 = (iHashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode())) * 31;
            PathDetail.FeedbackSurvey feedbackSurvey = this.feedbackSurvey;
            int iHashCode3 = (iHashCode2 + (feedbackSurvey == null ? 0 : feedbackSurvey.hashCode())) * 31;
            String str = this.url;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            OpenMethod openMethod = this.openMethod;
            int iHashCode5 = (iHashCode4 + (openMethod == null ? 0 : openMethod.hashCode())) * 31;
            String str2 = this.actionIdentifier;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpPath(id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", promotionalOffer=");
            sb.append(this.promotionalOffer);
            sb.append(", feedbackSurvey=");
            sb.append(this.feedbackSurvey);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", openMethod=");
            sb.append(this.openMethod);
            sb.append(", actionIdentifier=");
            return AbstractC0112b.j(sb, this.actionIdentifier, ')');
        }

        public HelpPath(String id, String title, PathType type, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str, OpenMethod openMethod, String str2) {
            m.f(id, "id");
            m.f(title, "title");
            m.f(type, "type");
            this.id = id;
            this.title = title;
            this.type = type;
            this.promotionalOffer = promotionalOffer;
            this.feedbackSurvey = feedbackSurvey;
            this.url = str;
            this.openMethod = openMethod;
            this.actionIdentifier = str2;
        }

        public /* synthetic */ HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i10, f fVar) {
            this(str, str2, pathType, (i10 & 8) != 0 ? null : promotionalOffer, (i10 & 16) != 0 ? null : feedbackSurvey, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : openMethod, (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? null : str4);
        }
    }

    public static final class Localization {
        private static final a[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final String locale;
        private final Map<String, String> localizedStrings;

        public enum CommonLocalizedString {
            NO_THANKS,
            NO_SUBSCRIPTIONS_FOUND,
            TRY_CHECK_RESTORE,
            RESTORE_PURCHASES,
            CANCEL,
            BILLING_CYCLE,
            CURRENT_PRICE,
            EXPIRED,
            EXPIRES,
            NEXT_BILLING_DATE,
            REFUND_CANCELED,
            REFUND_ERROR_GENERIC,
            REFUND_GRANTED,
            REFUND_STATUS,
            SUB_EARLIEST_EXPIRATION,
            SUB_EARLIEST_RENEWAL,
            SUB_EXPIRED,
            CONTACT_SUPPORT,
            DEFAULT_BODY,
            DEFAULT_SUBJECT,
            DISMISS,
            UPDATE_WARNING_TITLE,
            UPDATE_WARNING_DESCRIPTION,
            UPDATE_WARNING_UPDATE,
            UPDATE_WARNING_IGNORE,
            PLEASE_CONTACT_SUPPORT,
            APPLE_SUBSCRIPTION_MANAGE,
            GOOGLE_SUBSCRIPTION_MANAGE,
            AMAZON_SUBSCRIPTION_MANAGE,
            PLATFORM_MISMATCH,
            GOING_TO_CHECK_PURCHASES,
            CHECK_PAST_PURCHASES,
            PURCHASES_RECOVERED,
            PURCHASES_RECOVERED_EXPLANATION,
            PURCHASES_NOT_RECOVERED,
            PURCHASES_NOT_FOUND,
            PURCHASES_RESTORING,
            MANAGE_SUBSCRIPTION,
            YOU_HAVE_PROMO,
            YOU_HAVE_LIFETIME,
            WEB_SUBSCRIPTION_MANAGE,
            FREE,
            NEVER,
            FREE_TRIAL_THEN_PRICE,
            SINGLE_PAYMENT_THEN_PRICE,
            DISCOUNTED_RECURRING_THEN_PRICE,
            FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_THEN_PRICE,
            DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            DONE,
            RENEWS_ON_DATE_FOR_PRICE,
            RENEWS_ON_DATE,
            PURCHASE_INFO_EXPIRED_ON_DATE,
            PURCHASE_INFO_EXPIRES_ON_DATE,
            ACTIVE,
            BADGE_CANCELLED,
            BADGE_FREE_TRIAL,
            BADGE_FREE_TRIAL_CANCELLED,
            BADGE_LIFETIME,
            APP_STORE,
            MAC_APP_STORE,
            GOOGLE_PLAY_STORE,
            AMAZON_STORE,
            GALAXY_STORE,
            WEB_STORE,
            UNKNOWN_STORE,
            TEST_STORE,
            CARD_STORE_PROMOTIONAL,
            RESUBSCRIBE,
            TYPE_SUBSCRIPTION,
            TYPE_ONE_TIME_PURCHASE,
            BUY_SUBSCRIPTION,
            LAST_CHARGE_WAS,
            NEXT_BILLING_DATE_ON,
            SEE_ALL_VIRTUAL_CURRENCIES,
            VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER,
            NO_VIRTUAL_CURRENCY_BALANCES_FOUND,
            SUPPORT_TICKET_CREATE,
            EMAIL,
            ENTER_EMAIL,
            DESCRIPTION,
            SENT,
            SUPPORT_TICKET_FAILED,
            SUBMIT_TICKET,
            INVALID_EMAIL_ERROR,
            CHARACTERS_REMAINING;

            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return O.d("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString", CommonLocalizedString.values(), new String[]{"no_thanks", "no_subscriptions_found", "try_check_restore", PaywallLegacyComponentInteraction.Value.RESTORE_PURCHASES, "cancel", "billing_cycle", "current_price", "expired", "expires", "next_billing_date", "refund_canceled", "refund_error_generic", "refund_granted", "refund_status", "sub_earliest_expiration", "sub_earliest_renewal", "sub_expired", "contact_support", "default_body", "default_subject", "dismiss", "update_warning_title", "update_warning_description", "update_warning_update", "update_warning_ignore", "please_contact_support", "apple_subscription_manage", "google_subscription_manage", "amazon_subscription_manage", "platform_mismatch", "going_to_check_purchases", "check_past_purchases", "purchases_recovered", "purchases_recovered_explanation", "purchases_not_recovered", "purchases_not_found", "purchases_restoring", "manage_subscription", "you_have_promo", "you_have_lifetime", "web_subscription_manage", "free", "never", "free_trial_then_price", "single_payment_then_price", "discounted_recurring_then_price", "free_trial_single_payment_then_price", "free_trial_discounted_then_price", "discounted_recurring_payment_then_price", "free_trial_discounted_recurring_payment_then_price", "done", "renews_on_date_for_price", "renews_on_date", "purchase_info_expired_on_date", "purchase_info_expires_on_date", "active", "badge_cancelled", "badge_free_trial", "badge_free_trial_cancelled", "badge_lifetime", "app_store", "mac_app_store", "google_play_store", "amazon_store", "galaxy_store", "web_store", "unknown_store", "test_store", "card_store_promotional", "resubscribe", "type_subscription", "type_one_time_purchase", "buy_subscription", "last_charge_was", "next_billing_date_on", "see_all_virtual_currencies", "virtual_currency_balances_screen_header", "no_virtual_currency_balances_found", "support_ticket_create", "email", "enter_email", com.amazon.a.a.o.b.f16404c, "sent", "support_ticket_failed", "submit_ticket", "invalid_email_error", "characters_remaining"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) CommonLocalizedString.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonLocalizedString.values().length];
                    try {
                        iArr[CommonLocalizedString.NO_THANKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_SUBSCRIPTIONS_FOUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonLocalizedString.TRY_CHECK_RESTORE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESTORE_PURCHASES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CommonLocalizedString.CANCEL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CommonLocalizedString.BILLING_CYCLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CommonLocalizedString.CURRENT_PRICE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRES.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_CANCELED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_ERROR_GENERIC.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_GRANTED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_STATUS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_EXPIRATION.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_RENEWAL.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EXPIRED.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[CommonLocalizedString.CONTACT_SUPPORT.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_BODY.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_SUBJECT.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISMISS.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_TITLE.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_DESCRIPTION.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_UPDATE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_IGNORE.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLATFORM_MISMATCH.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLEASE_CONTACT_SUPPORT.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[CommonLocalizedString.APPLE_SUBSCRIPTION_MANAGE.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_SUBSCRIPTION_MANAGE.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_SUBSCRIPTION_MANAGE.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOING_TO_CHECK_PURCHASES.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHECK_PAST_PURCHASES.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_RECOVERED.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_FOUND.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RESTORING.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[CommonLocalizedString.MANAGE_SUBSCRIPTION.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_PROMO.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_LIFETIME.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_SUBSCRIPTION_MANAGE.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEVER.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_THEN_PRICE.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_THEN_PRICE.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_THEN_PRICE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 49;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 50;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr[CommonLocalizedString.DONE.ordinal()] = 51;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE_FOR_PRICE.ordinal()] = 52;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE.ordinal()] = 53;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE.ordinal()] = 54;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE.ordinal()] = 55;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr[CommonLocalizedString.ACTIVE.ordinal()] = 56;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_CANCELLED.ordinal()] = 57;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL.ordinal()] = 58;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL_CANCELLED.ordinal()] = 59;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_LIFETIME.ordinal()] = 60;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr[CommonLocalizedString.APP_STORE.ordinal()] = 61;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr[CommonLocalizedString.MAC_APP_STORE.ordinal()] = 62;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_PLAY_STORE.ordinal()] = 63;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_STORE.ordinal()] = 64;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr[CommonLocalizedString.GALAXY_STORE.ordinal()] = 65;
                    } catch (NoSuchFieldError unused65) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_STORE.ordinal()] = 66;
                    } catch (NoSuchFieldError unused66) {
                    }
                    try {
                        iArr[CommonLocalizedString.UNKNOWN_STORE.ordinal()] = 67;
                    } catch (NoSuchFieldError unused67) {
                    }
                    try {
                        iArr[CommonLocalizedString.TEST_STORE.ordinal()] = 68;
                    } catch (NoSuchFieldError unused68) {
                    }
                    try {
                        iArr[CommonLocalizedString.CARD_STORE_PROMOTIONAL.ordinal()] = 69;
                    } catch (NoSuchFieldError unused69) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESUBSCRIBE.ordinal()] = 70;
                    } catch (NoSuchFieldError unused70) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_SUBSCRIPTION.ordinal()] = 71;
                    } catch (NoSuchFieldError unused71) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_ONE_TIME_PURCHASE.ordinal()] = 72;
                    } catch (NoSuchFieldError unused72) {
                    }
                    try {
                        iArr[CommonLocalizedString.BUY_SUBSCRIPTION.ordinal()] = 73;
                    } catch (NoSuchFieldError unused73) {
                    }
                    try {
                        iArr[CommonLocalizedString.LAST_CHARGE_WAS.ordinal()] = 74;
                    } catch (NoSuchFieldError unused74) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE_ON.ordinal()] = 75;
                    } catch (NoSuchFieldError unused75) {
                    }
                    try {
                        iArr[CommonLocalizedString.SEE_ALL_VIRTUAL_CURRENCIES.ordinal()] = 76;
                    } catch (NoSuchFieldError unused76) {
                    }
                    try {
                        iArr[CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER.ordinal()] = 77;
                    } catch (NoSuchFieldError unused77) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_VIRTUAL_CURRENCY_BALANCES_FOUND.ordinal()] = 78;
                    } catch (NoSuchFieldError unused78) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_CREATE.ordinal()] = 79;
                    } catch (NoSuchFieldError unused79) {
                    }
                    try {
                        iArr[CommonLocalizedString.EMAIL.ordinal()] = 80;
                    } catch (NoSuchFieldError unused80) {
                    }
                    try {
                        iArr[CommonLocalizedString.ENTER_EMAIL.ordinal()] = 81;
                    } catch (NoSuchFieldError unused81) {
                    }
                    try {
                        iArr[CommonLocalizedString.DESCRIPTION.ordinal()] = 82;
                    } catch (NoSuchFieldError unused82) {
                    }
                    try {
                        iArr[CommonLocalizedString.SENT.ordinal()] = 83;
                    } catch (NoSuchFieldError unused83) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_FAILED.ordinal()] = 84;
                    } catch (NoSuchFieldError unused84) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUBMIT_TICKET.ordinal()] = 85;
                    } catch (NoSuchFieldError unused85) {
                    }
                    try {
                        iArr[CommonLocalizedString.INVALID_EMAIL_ERROR.ordinal()] = 86;
                    } catch (NoSuchFieldError unused86) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHARACTERS_REMAINING.ordinal()] = 87;
                    } catch (NoSuchFieldError unused87) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final String getDefaultValue() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return "No, thanks";
                    case 2:
                        return "No Subscriptions found";
                    case 3:
                        return "We can try checking your Apple account for any previous purchases";
                    case 4:
                        return "Restore purchases";
                    case 5:
                        return "Cancel";
                    case 6:
                        return "Billing cycle";
                    case 7:
                        return "Current price";
                    case 8:
                        return "Expired";
                    case 9:
                        return "Expires";
                    case 10:
                        return "Next billing date";
                    case 11:
                        return "Refund canceled";
                    case 12:
                        return "An error occurred while processing the refund request. Please try again.";
                    case 13:
                        return "Refund granted successfully!";
                    case 14:
                        return "Refund status";
                    case 15:
                        return "This is your subscription with the earliest expiration date.";
                    case 16:
                        return "This is your subscription with the earliest billing date.";
                    case 17:
                        return "This subscription has expired.";
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "Contact support";
                    case 19:
                        return "Please describe your issue or question.";
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        return "Support Request";
                    case 21:
                        return "Dismiss";
                    case 22:
                        return "Update available";
                    case 23:
                        return "Downloading the latest version of the app may help solve the problem.";
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        return "Update";
                    case 25:
                        return "Continue";
                    case 26:
                        return "Platform mismatch";
                    case 27:
                        return "Please contact support to manage your subscription.";
                    case 28:
                        return "You can manage your subscription by using the App Store app on an Apple device.";
                    case 29:
                        return "You have an active subscription from the Google Play Store";
                    case 30:
                        return "You have an active subscription from the Amazon Appstore. You can manage your subscription in the Amazon Appstore app.";
                    case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                        return "Let's take a look! We're going to check your account for missing purchases.";
                    case com.amazon.c.a.a.c.f16581h /* 32 */:
                        return "Check past purchases";
                    case 33:
                        return "Purchases restored";
                    case 34:
                        return "We restored your past purchases and applied them to your account.";
                    case 35:
                        return "We could not find any purchases with your account. If you think this is an error, please contact support.";
                    case 36:
                        return "No past purchases";
                    case 37:
                        return "Restoring...";
                    case 38:
                        return "Manage your subscription";
                    case 39:
                        return "You've been granted a subscription that doesn't renew";
                    case 40:
                        return "Your active lifetime subscription";
                    case 41:
                        return "You have an active subscription that was purchased on the web. You can manage your subscription using the button below.";
                    case 42:
                        return "Free";
                    case 43:
                        return "Never";
                    case 44:
                        return "First {{ sub_offer_duration }} free, then {{ price }}";
                    case 45:
                        return "{{ sub_offer_duration }} for {{ sub_offer_price }}, then {{ price }}";
                    case 46:
                        return "{{ sub_offer_price }} during {{ sub_offer_duration }}, then {{ price }}";
                    case 47:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_duration_2 }} for {{ sub_offer_price_2 }}, and {{ price }} thereafter";
                    case 48:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_price_2 }} during {{ sub_offer_duration_2 }}, and {{ price }} thereafter";
                    case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                        return "{{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, then {{ price }}";
                    case 50:
                        return "Try {{ sub_offer_duration }} for free, then {{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, and {{ price }} thereafter";
                    case 51:
                        return "Done";
                    case 52:
                        return "Your next charge is {{ price }} on {{ date }}.";
                    case 53:
                        return "Renews on {{ date }}";
                    case 54:
                        return "Expired on {{ date }}";
                    case 55:
                        return "Expires on {{ date }}";
                    case 56:
                        return "Active";
                    case 57:
                        return "Cancelled";
                    case 58:
                        return "Free Trial";
                    case 59:
                        return "Cancelled Trial";
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        return "Lifetime";
                    case 61:
                        return "App Store";
                    case 62:
                        return "Mac App Store";
                    case 63:
                        return "Google Play Store";
                    case 64:
                        return "Amazon Store";
                    case 65:
                        return "Galaxy Store";
                    case 66:
                        return "Web";
                    case 67:
                        return "Unknown";
                    case 68:
                        return "Test Store";
                    case 69:
                        return "Via Support";
                    case 70:
                        return "Resubscribe";
                    case 71:
                        return "Subscription";
                    case 72:
                        return "One time purchase";
                    case 73:
                        return "Buy Subscription";
                    case 74:
                        return "Last charge: {{ price }}";
                    case 75:
                        return "Next billing date: {{ date }}";
                    case 76:
                        return "See all in-app currencies";
                    case 77:
                        return "In-App Currencies";
                    case 78:
                        return "It doesn't look like you've purchased any in-app currencies.";
                    case 79:
                        return "Create a support ticket";
                    case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                        return "Email";
                    case 81:
                        return "Enter your email";
                    case 82:
                        return "Description";
                    case 83:
                        return "Message sent";
                    case 84:
                        return "Failed to send, please try again.";
                    case 85:
                        return "Submit ticket";
                    case 86:
                        return "Please enter a valid email address";
                    case 87:
                        return "{{ count }} characters";
                    default:
                        throw new V();
                }
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$Localization$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum VariableName {
            PRICE(com.amazon.a.a.o.b.f16423x),
            SUB_OFFER_DURATION("sub_offer_duration"),
            SUB_OFFER_DURATION_2("sub_offer_duration_2"),
            SUB_OFFER_PRICE("sub_offer_price"),
            SUB_OFFER_PRICE_2("sub_offer_price_2"),
            DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD("discounted_recurring_payment_price_per_period"),
            DISCOUNTED_RECURRING_PAYMENT_CYCLES("discounted_recurring_payment_cycles");

            private final String identifier;
            public static final Companion Companion = new Companion(null);
            private static final h valueMap$delegate = W.S(CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2.INSTANCE);

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final Map<String, VariableName> getValueMap() {
                    return (Map) VariableName.valueMap$delegate.getValue();
                }

                public final VariableName valueOfIdentifier(String identifier) {
                    m.f(identifier, "identifier");
                    return getValueMap().get(identifier);
                }

                private Companion() {
                }
            }

            VariableName(String str) {
                this.identifier = str;
            }

            public final String getIdentifier() {
                return this.identifier;
            }
        }

        static {
            c0 c0Var = c0.f29272a;
            $childSerializers = new a[]{null, new G(c0Var, c0Var)};
        }

        @InterfaceC0641c
        public /* synthetic */ Localization(int i10, String str, Map map, Y y6) {
            if (3 != (i10 & 3)) {
                O.g(i10, 3, CustomerCenterConfigData$Localization$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.locale = str;
            this.localizedStrings = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Localization copy$default(Localization localization, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = localization.locale;
            }
            if ((i10 & 2) != 0) {
                map = localization.localizedStrings;
            }
            return localization.copy(str, map);
        }

        public static /* synthetic */ void getLocalizedStrings$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Localization localization, b bVar, g gVar) {
            a[] aVarArr = $childSerializers;
            bVar.u(gVar, 0, localization.locale);
            bVar.m(gVar, 1, aVarArr[1], localization.localizedStrings);
        }

        public final String commonLocalizedString(CommonLocalizedString key) {
            m.f(key, "key");
            Map<String, String> map = this.localizedStrings;
            String lowerCase = key.name().toLowerCase(Locale.ROOT);
            m.e(lowerCase, "toLowerCase(...)");
            String str = map.get(lowerCase);
            return str == null ? key.getDefaultValue() : str;
        }

        public final String component1() {
            return this.locale;
        }

        public final Map<String, String> component2() {
            return this.localizedStrings;
        }

        public final Localization copy(String locale, Map<String, String> localizedStrings) {
            m.f(locale, "locale");
            m.f(localizedStrings, "localizedStrings");
            return new Localization(locale, localizedStrings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) obj;
            return m.b(this.locale, localization.locale) && m.b(this.localizedStrings, localization.localizedStrings);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map<String, String> getLocalizedStrings() {
            return this.localizedStrings;
        }

        public int hashCode() {
            return this.localizedStrings.hashCode() + (this.locale.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Localization(locale=");
            sb.append(this.locale);
            sb.append(", localizedStrings=");
            return p134m1.b.n(sb, this.localizedStrings, ')');
        }

        public Localization(String locale, Map<String, String> localizedStrings) {
            m.f(locale, "locale");
            m.f(localizedStrings, "localizedStrings");
            this.locale = locale;
            this.localizedStrings = localizedStrings;
        }
    }

    public static final class Screen {
        private final ScreenOffering offering;
        private final List<HelpPath> paths;
        private final String subtitle;
        private final String title;
        private final ScreenType type;
        public static final Companion Companion = new Companion(null);
        private static final a[] $childSerializers = {ScreenType.Companion.serializer(), null, null, null, null};

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$Screen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum ScreenType {
            MANAGEMENT,
            NO_ACTIVE,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen$ScreenType$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return O.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType", ScreenType.values());
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) ScreenType.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        @InterfaceC0641c
        public /* synthetic */ Screen(int i10, ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, Y y6) {
            if (11 != (i10 & 11)) {
                O.g(i10, 11, CustomerCenterConfigData$Screen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = screenType;
            this.title = str;
            if ((i10 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.paths = list;
            if ((i10 & 16) == 0) {
                this.offering = null;
            } else {
                this.offering = screenOffering;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Screen copy$default(Screen screen, ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                screenType = screen.type;
            }
            if ((i10 & 2) != 0) {
                str = screen.title;
            }
            if ((i10 & 4) != 0) {
                str2 = screen.subtitle;
            }
            if ((i10 & 8) != 0) {
                list = screen.paths;
            }
            if ((i10 & 16) != 0) {
                screenOffering = screen.offering;
            }
            ScreenOffering screenOffering2 = screenOffering;
            String str3 = str2;
            return screen.copy(screenType, str, str3, list, screenOffering2);
        }

        public static /* synthetic */ void getPaths$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Screen screen, b bVar, g gVar) {
            bVar.m(gVar, 0, $childSerializers[0], screen.type);
            bVar.u(gVar, 1, screen.title);
            if (bVar.l(gVar) || screen.subtitle != null) {
                bVar.t(gVar, 2, EmptyStringToNullSerializer.INSTANCE, screen.subtitle);
            }
            bVar.m(gVar, 3, HelpPathsSerializer.INSTANCE, screen.paths);
            if (!bVar.l(gVar) && screen.offering == null) {
                return;
            }
            bVar.t(gVar, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, screen.offering);
        }

        public final ScreenType component1() {
            return this.type;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final List<HelpPath> component4() {
            return this.paths;
        }

        public final ScreenOffering component5() {
            return this.offering;
        }

        public final Screen copy(ScreenType type, String title, String str, List<HelpPath> paths, ScreenOffering screenOffering) {
            m.f(type, "type");
            m.f(title, "title");
            m.f(paths, "paths");
            return new Screen(type, title, str, paths, screenOffering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.type == screen.type && m.b(this.title, screen.title) && m.b(this.subtitle, screen.subtitle) && m.b(this.paths, screen.paths) && m.b(this.offering, screen.offering);
        }

        public final ScreenOffering getOffering() {
            return this.offering;
        }

        public final List<HelpPath> getPaths() {
            return this.paths;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ScreenType getType() {
            return this.type;
        }

        public int hashCode() {
            int iA = AbstractC0112b.a(this.type.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iD = p134m1.b.d((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.paths);
            ScreenOffering screenOffering = this.offering;
            return iD + (screenOffering != null ? screenOffering.hashCode() : 0);
        }

        public String toString() {
            return "Screen(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paths=" + this.paths + ", offering=" + this.offering + ')';
        }

        public Screen(ScreenType type, String title, String str, List<HelpPath> paths, ScreenOffering screenOffering) {
            m.f(type, "type");
            m.f(title, "title");
            m.f(paths, "paths");
            this.type = type;
            this.title = title;
            this.subtitle = str;
            this.paths = paths;
            this.offering = screenOffering;
        }

        public /* synthetic */ Screen(ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i10, f fVar) {
            this(screenType, str, (i10 & 4) != 0 ? null : str2, list, (i10 & 16) != 0 ? null : screenOffering);
        }
    }

    public static final class ScreenOffering {
        private final String buttonText;
        private final String offeringId;
        private final ScreenOfferingType type;
        public static final Companion Companion = new Companion(null);
        private static final a[] $childSerializers = {ScreenOfferingType.Companion.serializer(), null, null};

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum ScreenOfferingType {
            CURRENT("CURRENT"),
            SPECIFIC("SPECIFIC");

            private final String value;
            public static final Companion Companion = new Companion(null);
            private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering$ScreenOfferingType$Companion$1, reason: invalid class name */
                public static final class AnonymousClass1 extends n implements Z8.a {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // Z8.a
                    public final a invoke() {
                        return O.d("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering.ScreenOfferingType", ScreenOfferingType.values(), new String[]{"CURRENT", "SPECIFIC"}, new Annotation[][]{null, null});
                    }
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private final /* synthetic */ a get$cachedSerializer() {
                    return (a) ScreenOfferingType.$cachedSerializer$delegate.getValue();
                }

                public final a serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            ScreenOfferingType(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        @InterfaceC0641c
        public /* synthetic */ ScreenOffering(int i10, ScreenOfferingType screenOfferingType, String str, String str2, Y y6) {
            if (1 != (i10 & 1)) {
                O.g(i10, 1, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = screenOfferingType;
            if ((i10 & 2) == 0) {
                this.offeringId = null;
            } else {
                this.offeringId = str;
            }
            if ((i10 & 4) == 0) {
                this.buttonText = null;
            } else {
                this.buttonText = str2;
            }
        }

        public static /* synthetic */ ScreenOffering copy$default(ScreenOffering screenOffering, ScreenOfferingType screenOfferingType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                screenOfferingType = screenOffering.type;
            }
            if ((i10 & 2) != 0) {
                str = screenOffering.offeringId;
            }
            if ((i10 & 4) != 0) {
                str2 = screenOffering.buttonText;
            }
            return screenOffering.copy(screenOfferingType, str, str2);
        }

        public static /* synthetic */ void getButtonText$annotations() {
        }

        public static /* synthetic */ void getOfferingId$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ScreenOffering screenOffering, b bVar, g gVar) {
            bVar.m(gVar, 0, $childSerializers[0], screenOffering.type);
            if (bVar.l(gVar) || screenOffering.offeringId != null) {
                bVar.t(gVar, 1, c0.f29272a, screenOffering.offeringId);
            }
            if (!bVar.l(gVar) && screenOffering.buttonText == null) {
                return;
            }
            bVar.t(gVar, 2, c0.f29272a, screenOffering.buttonText);
        }

        public final ScreenOfferingType component1() {
            return this.type;
        }

        public final String component2() {
            return this.offeringId;
        }

        public final String component3() {
            return this.buttonText;
        }

        public final ScreenOffering copy(ScreenOfferingType type, String str, String str2) {
            m.f(type, "type");
            return new ScreenOffering(type, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenOffering)) {
                return false;
            }
            ScreenOffering screenOffering = (ScreenOffering) obj;
            return this.type == screenOffering.type && m.b(this.offeringId, screenOffering.offeringId) && m.b(this.buttonText, screenOffering.buttonText);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final ScreenOfferingType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.offeringId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonText;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ScreenOffering(type=");
            sb.append(this.type);
            sb.append(", offeringId=");
            sb.append(this.offeringId);
            sb.append(", buttonText=");
            return AbstractC0112b.j(sb, this.buttonText, ')');
        }

        public ScreenOffering(ScreenOfferingType type, String str, String str2) {
            m.f(type, "type");
            this.type = type;
            this.offeringId = str;
            this.buttonText = str2;
        }

        public /* synthetic */ ScreenOffering(ScreenOfferingType screenOfferingType, String str, String str2, int i10, f fVar) {
            this(screenOfferingType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }
    }

    public static final class Support {
        public static final Companion Companion = new Companion(null);
        private final Boolean displayVirtualCurrencies;
        private final String email;
        private final Boolean shouldWarnCustomerToUpdate;
        private final SupportTickets supportTickets;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CustomerCenterConfigData$Support$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class SupportTickets {
            private final boolean allowCreation;
            private final CustomerDetails customerDetails;
            private final CustomerType customerType;
            public static final Companion Companion = new Companion(null);
            private static final a[] $childSerializers = {null, null, CustomerType.Companion.serializer()};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static final class CustomerDetails {
                public static final Companion Companion = new Companion(null);
                private final boolean activeEntitlements;
                private final boolean appUserId;
                private final boolean attConsent;
                private final boolean country;
                private final boolean deviceVersion;
                private final boolean email;
                private final boolean facebookAnonId;
                private final boolean idfa;
                private final boolean idfv;
                private final boolean ip;
                private final boolean lastOpened;
                private final boolean lastSeenAppVersion;
                private final boolean totalSpent;
                private final boolean userSince;

                public static final class Companion {
                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }

                    public final a serializer() {
                        return CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public CustomerDetails() {
                    this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (f) null);
                }

                public static /* synthetic */ void getActiveEntitlements$annotations() {
                }

                public static /* synthetic */ void getAppUserId$annotations() {
                }

                public static /* synthetic */ void getAttConsent$annotations() {
                }

                public static /* synthetic */ void getDeviceVersion$annotations() {
                }

                public static /* synthetic */ void getFacebookAnonId$annotations() {
                }

                public static /* synthetic */ void getLastOpened$annotations() {
                }

                public static /* synthetic */ void getLastSeenAppVersion$annotations() {
                }

                public static /* synthetic */ void getTotalSpent$annotations() {
                }

                public static /* synthetic */ void getUserSince$annotations() {
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CustomerDetails customerDetails, b bVar, g gVar) {
                    if (bVar.l(gVar) || customerDetails.activeEntitlements) {
                        bVar.s(gVar, 0, customerDetails.activeEntitlements);
                    }
                    if (bVar.l(gVar) || customerDetails.appUserId) {
                        bVar.s(gVar, 1, customerDetails.appUserId);
                    }
                    if (bVar.l(gVar) || customerDetails.attConsent) {
                        bVar.s(gVar, 2, customerDetails.attConsent);
                    }
                    if (bVar.l(gVar) || customerDetails.country) {
                        bVar.s(gVar, 3, customerDetails.country);
                    }
                    if (bVar.l(gVar) || customerDetails.deviceVersion) {
                        bVar.s(gVar, 4, customerDetails.deviceVersion);
                    }
                    if (bVar.l(gVar) || customerDetails.email) {
                        bVar.s(gVar, 5, customerDetails.email);
                    }
                    if (bVar.l(gVar) || customerDetails.facebookAnonId) {
                        bVar.s(gVar, 6, customerDetails.facebookAnonId);
                    }
                    if (bVar.l(gVar) || customerDetails.idfa) {
                        bVar.s(gVar, 7, customerDetails.idfa);
                    }
                    if (bVar.l(gVar) || customerDetails.idfv) {
                        bVar.s(gVar, 8, customerDetails.idfv);
                    }
                    if (bVar.l(gVar) || customerDetails.ip) {
                        bVar.s(gVar, 9, customerDetails.ip);
                    }
                    if (bVar.l(gVar) || customerDetails.lastOpened) {
                        bVar.s(gVar, 10, customerDetails.lastOpened);
                    }
                    if (bVar.l(gVar) || customerDetails.lastSeenAppVersion) {
                        bVar.s(gVar, 11, customerDetails.lastSeenAppVersion);
                    }
                    if (bVar.l(gVar) || customerDetails.totalSpent) {
                        bVar.s(gVar, 12, customerDetails.totalSpent);
                    }
                    if (bVar.l(gVar) || customerDetails.userSince) {
                        bVar.s(gVar, 13, customerDetails.userSince);
                    }
                }

                public final boolean component1() {
                    return this.activeEntitlements;
                }

                public final boolean component10() {
                    return this.ip;
                }

                public final boolean component11() {
                    return this.lastOpened;
                }

                public final boolean component12() {
                    return this.lastSeenAppVersion;
                }

                public final boolean component13() {
                    return this.totalSpent;
                }

                public final boolean component14() {
                    return this.userSince;
                }

                public final boolean component2() {
                    return this.appUserId;
                }

                public final boolean component3() {
                    return this.attConsent;
                }

                public final boolean component4() {
                    return this.country;
                }

                public final boolean component5() {
                    return this.deviceVersion;
                }

                public final boolean component6() {
                    return this.email;
                }

                public final boolean component7() {
                    return this.facebookAnonId;
                }

                public final boolean component8() {
                    return this.idfa;
                }

                public final boolean component9() {
                    return this.idfv;
                }

                public final CustomerDetails copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
                    return new CustomerDetails(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CustomerDetails)) {
                        return false;
                    }
                    CustomerDetails customerDetails = (CustomerDetails) obj;
                    return this.activeEntitlements == customerDetails.activeEntitlements && this.appUserId == customerDetails.appUserId && this.attConsent == customerDetails.attConsent && this.country == customerDetails.country && this.deviceVersion == customerDetails.deviceVersion && this.email == customerDetails.email && this.facebookAnonId == customerDetails.facebookAnonId && this.idfa == customerDetails.idfa && this.idfv == customerDetails.idfv && this.ip == customerDetails.ip && this.lastOpened == customerDetails.lastOpened && this.lastSeenAppVersion == customerDetails.lastSeenAppVersion && this.totalSpent == customerDetails.totalSpent && this.userSince == customerDetails.userSince;
                }

                public final boolean getActiveEntitlements() {
                    return this.activeEntitlements;
                }

                public final boolean getAppUserId() {
                    return this.appUserId;
                }

                public final boolean getAttConsent() {
                    return this.attConsent;
                }

                public final boolean getCountry() {
                    return this.country;
                }

                public final boolean getDeviceVersion() {
                    return this.deviceVersion;
                }

                public final boolean getEmail() {
                    return this.email;
                }

                public final boolean getFacebookAnonId() {
                    return this.facebookAnonId;
                }

                public final boolean getIdfa() {
                    return this.idfa;
                }

                public final boolean getIdfv() {
                    return this.idfv;
                }

                public final boolean getIp() {
                    return this.ip;
                }

                public final boolean getLastOpened() {
                    return this.lastOpened;
                }

                public final boolean getLastSeenAppVersion() {
                    return this.lastSeenAppVersion;
                }

                public final boolean getTotalSpent() {
                    return this.totalSpent;
                }

                public final boolean getUserSince() {
                    return this.userSince;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.userSince) + p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(p134m1.b.f(Boolean.hashCode(this.activeEntitlements) * 31, 31, this.appUserId), 31, this.attConsent), 31, this.country), 31, this.deviceVersion), 31, this.email), 31, this.facebookAnonId), 31, this.idfa), 31, this.idfv), 31, this.ip), 31, this.lastOpened), 31, this.lastSeenAppVersion), 31, this.totalSpent);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("CustomerDetails(activeEntitlements=");
                    sb.append(this.activeEntitlements);
                    sb.append(", appUserId=");
                    sb.append(this.appUserId);
                    sb.append(", attConsent=");
                    sb.append(this.attConsent);
                    sb.append(", country=");
                    sb.append(this.country);
                    sb.append(", deviceVersion=");
                    sb.append(this.deviceVersion);
                    sb.append(", email=");
                    sb.append(this.email);
                    sb.append(", facebookAnonId=");
                    sb.append(this.facebookAnonId);
                    sb.append(", idfa=");
                    sb.append(this.idfa);
                    sb.append(", idfv=");
                    sb.append(this.idfv);
                    sb.append(", ip=");
                    sb.append(this.ip);
                    sb.append(", lastOpened=");
                    sb.append(this.lastOpened);
                    sb.append(", lastSeenAppVersion=");
                    sb.append(this.lastSeenAppVersion);
                    sb.append(", totalSpent=");
                    sb.append(this.totalSpent);
                    sb.append(", userSince=");
                    return p134m1.b.o(sb, this.userSince, ')');
                }

                @InterfaceC0641c
                public /* synthetic */ CustomerDetails(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, Y y6) {
                    if ((i10 & 1) == 0) {
                        this.activeEntitlements = false;
                    } else {
                        this.activeEntitlements = z10;
                    }
                    if ((i10 & 2) == 0) {
                        this.appUserId = false;
                    } else {
                        this.appUserId = z11;
                    }
                    if ((i10 & 4) == 0) {
                        this.attConsent = false;
                    } else {
                        this.attConsent = z12;
                    }
                    if ((i10 & 8) == 0) {
                        this.country = false;
                    } else {
                        this.country = z13;
                    }
                    if ((i10 & 16) == 0) {
                        this.deviceVersion = false;
                    } else {
                        this.deviceVersion = z14;
                    }
                    if ((i10 & 32) == 0) {
                        this.email = false;
                    } else {
                        this.email = z15;
                    }
                    if ((i10 & 64) == 0) {
                        this.facebookAnonId = false;
                    } else {
                        this.facebookAnonId = z16;
                    }
                    if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 0) {
                        this.idfa = false;
                    } else {
                        this.idfa = z17;
                    }
                    if ((i10 & 256) == 0) {
                        this.idfv = false;
                    } else {
                        this.idfv = z18;
                    }
                    if ((i10 & 512) == 0) {
                        this.ip = false;
                    } else {
                        this.ip = z19;
                    }
                    if ((i10 & 1024) == 0) {
                        this.lastOpened = false;
                    } else {
                        this.lastOpened = z20;
                    }
                    if ((i10 & 2048) == 0) {
                        this.lastSeenAppVersion = false;
                    } else {
                        this.lastSeenAppVersion = z21;
                    }
                    if ((i10 & 4096) == 0) {
                        this.totalSpent = false;
                    } else {
                        this.totalSpent = z22;
                    }
                    if ((i10 & 8192) == 0) {
                        this.userSince = false;
                    } else {
                        this.userSince = z23;
                    }
                }

                public CustomerDetails(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
                    this.activeEntitlements = z10;
                    this.appUserId = z11;
                    this.attConsent = z12;
                    this.country = z13;
                    this.deviceVersion = z14;
                    this.email = z15;
                    this.facebookAnonId = z16;
                    this.idfa = z17;
                    this.idfv = z18;
                    this.ip = z19;
                    this.lastOpened = z20;
                    this.lastSeenAppVersion = z21;
                    this.totalSpent = z22;
                    this.userSince = z23;
                }

                public /* synthetic */ CustomerDetails(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, int i10, f fVar) {
                    this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? false : z17, (i10 & 256) != 0 ? false : z18, (i10 & 512) != 0 ? false : z19, (i10 & 1024) != 0 ? false : z20, (i10 & 2048) != 0 ? false : z21, (i10 & 4096) != 0 ? false : z22, (i10 & 8192) != 0 ? false : z23);
                }
            }

            public enum CustomerType {
                NOT_ACTIVE,
                NONE,
                ALL,
                ACTIVE;

                public static final Companion Companion = new Companion(null);
                private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

                public static final class Companion {

                    /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerType$Companion$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends n implements Z8.a {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        public AnonymousClass1() {
                            super(0);
                        }

                        @Override // Z8.a
                        public final a invoke() {
                            return O.d("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerType", CustomerType.values(), new String[]{"not_active", "none", "all", "active"}, new Annotation[][]{null, null, null, null});
                        }
                    }

                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }

                    private final /* synthetic */ a get$cachedSerializer() {
                        return (a) CustomerType.$cachedSerializer$delegate.getValue();
                    }

                    public final a serializer() {
                        return get$cachedSerializer();
                    }

                    private Companion() {
                    }
                }
            }

            public SupportTickets() {
                this(false, (CustomerDetails) null, (CustomerType) null, 7, (f) null);
            }

            public static /* synthetic */ SupportTickets copy$default(SupportTickets supportTickets, boolean z10, CustomerDetails customerDetails, CustomerType customerType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = supportTickets.allowCreation;
                }
                if ((i10 & 2) != 0) {
                    customerDetails = supportTickets.customerDetails;
                }
                if ((i10 & 4) != 0) {
                    customerType = supportTickets.customerType;
                }
                return supportTickets.copy(z10, customerDetails, customerType);
            }

            public static /* synthetic */ void getAllowCreation$annotations() {
            }

            public static /* synthetic */ void getCustomerDetails$annotations() {
            }

            public static /* synthetic */ void getCustomerType$annotations() {
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0043  */
            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(SupportTickets supportTickets, b bVar, g gVar) {
                a[] aVarArr = $childSerializers;
                if (bVar.l(gVar) || supportTickets.allowCreation) {
                    bVar.s(gVar, 0, supportTickets.allowCreation);
                }
                if (bVar.l(gVar)) {
                    bVar.m(gVar, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, supportTickets.customerDetails);
                } else {
                    if (!m.b(supportTickets.customerDetails, new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (f) null))) {
                        bVar.m(gVar, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, supportTickets.customerDetails);
                    }
                }
                if (!bVar.l(gVar) && supportTickets.customerType == CustomerType.NOT_ACTIVE) {
                    return;
                }
                bVar.m(gVar, 2, aVarArr[2], supportTickets.customerType);
            }

            public final boolean allowsActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.ACTIVE;
            }

            public final boolean allowsNonActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.NOT_ACTIVE;
            }

            public final boolean component1() {
                return this.allowCreation;
            }

            public final CustomerDetails component2() {
                return this.customerDetails;
            }

            public final CustomerType component3() {
                return this.customerType;
            }

            public final SupportTickets copy(boolean z10, CustomerDetails customerDetails, CustomerType customerType) {
                m.f(customerDetails, "customerDetails");
                m.f(customerType, "customerType");
                return new SupportTickets(z10, customerDetails, customerType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportTickets)) {
                    return false;
                }
                SupportTickets supportTickets = (SupportTickets) obj;
                return this.allowCreation == supportTickets.allowCreation && m.b(this.customerDetails, supportTickets.customerDetails) && this.customerType == supportTickets.customerType;
            }

            public final boolean getAllowCreation() {
                return this.allowCreation;
            }

            public final CustomerDetails getCustomerDetails() {
                return this.customerDetails;
            }

            public final CustomerType getCustomerType() {
                return this.customerType;
            }

            public int hashCode() {
                return this.customerType.hashCode() + ((this.customerDetails.hashCode() + (Boolean.hashCode(this.allowCreation) * 31)) * 31);
            }

            public String toString() {
                return "SupportTickets(allowCreation=" + this.allowCreation + ", customerDetails=" + this.customerDetails + ", customerType=" + this.customerType + ')';
            }

            @InterfaceC0641c
            public /* synthetic */ SupportTickets(int i10, boolean z10, CustomerDetails customerDetails, CustomerType customerType, Y y6) {
                this.allowCreation = (i10 & 1) == 0 ? false : z10;
                if ((i10 & 2) == 0) {
                    this.customerDetails = new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (f) null);
                } else {
                    this.customerDetails = customerDetails;
                }
                this.customerType = (i10 & 4) == 0 ? CustomerType.NOT_ACTIVE : customerType;
            }

            public SupportTickets(boolean z10, CustomerDetails customerDetails, CustomerType customerType) {
                m.f(customerDetails, "customerDetails");
                m.f(customerType, "customerType");
                this.allowCreation = z10;
                this.customerDetails = customerDetails;
                this.customerType = customerType;
            }

            public /* synthetic */ SupportTickets(boolean z10, CustomerDetails customerDetails, CustomerType customerType, int i10, f fVar) {
                this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (f) null) : customerDetails, (i10 & 4) != 0 ? CustomerType.NOT_ACTIVE : customerType);
            }
        }

        public Support() {
            this((String) null, (Boolean) null, (Boolean) null, (SupportTickets) null, 15, (f) null);
        }

        public static /* synthetic */ Support copy$default(Support support, String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = support.email;
            }
            if ((i10 & 2) != 0) {
                bool = support.shouldWarnCustomerToUpdate;
            }
            if ((i10 & 4) != 0) {
                bool2 = support.displayVirtualCurrencies;
            }
            if ((i10 & 8) != 0) {
                supportTickets = support.supportTickets;
            }
            return support.copy(str, bool, bool2, supportTickets);
        }

        public static /* synthetic */ void getDisplayVirtualCurrencies$annotations() {
        }

        public static /* synthetic */ void getEmail$annotations() {
        }

        public static /* synthetic */ void getShouldWarnCustomerToUpdate$annotations() {
        }

        public static /* synthetic */ void getSupportTickets$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Support support, b bVar, g gVar) {
            if (bVar.l(gVar) || support.email != null) {
                bVar.t(gVar, 0, EmptyStringToNullSerializer.INSTANCE, support.email);
            }
            if (bVar.l(gVar) || support.shouldWarnCustomerToUpdate != null) {
                bVar.t(gVar, 1, C2370f.f29283a, support.shouldWarnCustomerToUpdate);
            }
            if (bVar.l(gVar) || support.displayVirtualCurrencies != null) {
                bVar.t(gVar, 2, C2370f.f29283a, support.displayVirtualCurrencies);
            }
            if (!bVar.l(gVar)) {
                if (m.b(support.supportTickets, new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (f) null))) {
                    return;
                }
            }
            bVar.m(gVar, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, support.supportTickets);
        }

        public final String component1() {
            return this.email;
        }

        public final Boolean component2() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final Boolean component3() {
            return this.displayVirtualCurrencies;
        }

        public final SupportTickets component4() {
            return this.supportTickets;
        }

        public final Support copy(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets) {
            m.f(supportTickets, "supportTickets");
            return new Support(str, bool, bool2, supportTickets);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Support)) {
                return false;
            }
            Support support = (Support) obj;
            return m.b(this.email, support.email) && m.b(this.shouldWarnCustomerToUpdate, support.shouldWarnCustomerToUpdate) && m.b(this.displayVirtualCurrencies, support.displayVirtualCurrencies) && m.b(this.supportTickets, support.supportTickets);
        }

        public final Boolean getDisplayVirtualCurrencies() {
            return this.displayVirtualCurrencies;
        }

        public final String getEmail() {
            return this.email;
        }

        public final Boolean getShouldWarnCustomerToUpdate() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final SupportTickets getSupportTickets() {
            return this.supportTickets;
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.shouldWarnCustomerToUpdate;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.displayVirtualCurrencies;
            return this.supportTickets.hashCode() + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Support(email=" + this.email + ", shouldWarnCustomerToUpdate=" + this.shouldWarnCustomerToUpdate + ", displayVirtualCurrencies=" + this.displayVirtualCurrencies + ", supportTickets=" + this.supportTickets + ')';
        }

        @InterfaceC0641c
        public /* synthetic */ Support(int i10, String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, Y y6) {
            if ((i10 & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
            }
            if ((i10 & 2) == 0) {
                this.shouldWarnCustomerToUpdate = null;
            } else {
                this.shouldWarnCustomerToUpdate = bool;
            }
            if ((i10 & 4) == 0) {
                this.displayVirtualCurrencies = null;
            } else {
                this.displayVirtualCurrencies = bool2;
            }
            if ((i10 & 8) != 0) {
                this.supportTickets = supportTickets;
                return;
            }
            this.supportTickets = new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (f) null);
        }

        public Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets) {
            m.f(supportTickets, "supportTickets");
            this.email = str;
            this.shouldWarnCustomerToUpdate = bool;
            this.displayVirtualCurrencies = bool2;
            this.supportTickets = supportTickets;
        }

        public /* synthetic */ Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (f) null) : supportTickets);
        }
    }

    @InterfaceC0641c
    public /* synthetic */ CustomerCenterConfigData(int i10, Map map, Appearance appearance, Localization localization, Support support, String str, Y y6) {
        if (15 != (i10 & 15)) {
            O.g(i10, 15, CustomerCenterConfigData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        if ((i10 & 16) == 0) {
            this.lastPublishedAppVersion = null;
        } else {
            this.lastPublishedAppVersion = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerCenterConfigData copy$default(CustomerCenterConfigData customerCenterConfigData, Map map, Appearance appearance, Localization localization, Support support, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = customerCenterConfigData.screens;
        }
        if ((i10 & 2) != 0) {
            appearance = customerCenterConfigData.appearance;
        }
        if ((i10 & 4) != 0) {
            localization = customerCenterConfigData.localization;
        }
        if ((i10 & 8) != 0) {
            support = customerCenterConfigData.support;
        }
        if ((i10 & 16) != 0) {
            str = customerCenterConfigData.lastPublishedAppVersion;
        }
        String str2 = str;
        Localization localization2 = localization;
        return customerCenterConfigData.copy(map, appearance, localization2, support, str2);
    }

    public static /* synthetic */ void getLastPublishedAppVersion$annotations() {
    }

    public static /* synthetic */ void getScreens$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CustomerCenterConfigData customerCenterConfigData, b bVar, g gVar) {
        bVar.m(gVar, 0, ScreenMapSerializer.INSTANCE, customerCenterConfigData.screens);
        bVar.m(gVar, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, customerCenterConfigData.appearance);
        bVar.m(gVar, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, customerCenterConfigData.localization);
        bVar.m(gVar, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, customerCenterConfigData.support);
        if (!bVar.l(gVar) && customerCenterConfigData.lastPublishedAppVersion == null) {
            return;
        }
        bVar.t(gVar, 4, EmptyStringToNullSerializer.INSTANCE, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Map<Screen.ScreenType, Screen> component1() {
        return this.screens;
    }

    public final Appearance component2() {
        return this.appearance;
    }

    public final Localization component3() {
        return this.localization;
    }

    public final Support component4() {
        return this.support;
    }

    public final String component5() {
        return this.lastPublishedAppVersion;
    }

    public final CustomerCenterConfigData copy(Map<Screen.ScreenType, Screen> screens, Appearance appearance, Localization localization, Support support, String str) {
        m.f(screens, "screens");
        m.f(appearance, "appearance");
        m.f(localization, "localization");
        m.f(support, "support");
        return new CustomerCenterConfigData(screens, appearance, localization, support, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterConfigData)) {
            return false;
        }
        CustomerCenterConfigData customerCenterConfigData = (CustomerCenterConfigData) obj;
        return m.b(this.screens, customerCenterConfigData.screens) && m.b(this.appearance, customerCenterConfigData.appearance) && m.b(this.localization, customerCenterConfigData.localization) && m.b(this.support, customerCenterConfigData.support) && m.b(this.lastPublishedAppVersion, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Screen getManagementScreen() {
        return this.screens.get(Screen.ScreenType.MANAGEMENT);
    }

    public final Screen getNoActiveScreen() {
        return this.screens.get(Screen.ScreenType.NO_ACTIVE);
    }

    public final Map<Screen.ScreenType, Screen> getScreens() {
        return this.screens;
    }

    public final Support getSupport() {
        return this.support;
    }

    public int hashCode() {
        int iHashCode = (this.support.hashCode() + ((this.localization.hashCode() + ((this.appearance.hashCode() + (this.screens.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.lastPublishedAppVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerCenterConfigData(screens=");
        sb.append(this.screens);
        sb.append(", appearance=");
        sb.append(this.appearance);
        sb.append(", localization=");
        sb.append(this.localization);
        sb.append(", support=");
        sb.append(this.support);
        sb.append(", lastPublishedAppVersion=");
        return AbstractC0112b.j(sb, this.lastPublishedAppVersion, ')');
    }

    public CustomerCenterConfigData(Map<Screen.ScreenType, Screen> screens, Appearance appearance, Localization localization, Support support, String str) {
        m.f(screens, "screens");
        m.f(appearance, "appearance");
        m.f(localization, "localization");
        m.f(support, "support");
        this.screens = screens;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        this.lastPublishedAppVersion = str;
    }

    public /* synthetic */ CustomerCenterConfigData(Map map, Appearance appearance, Localization localization, Support support, String str, int i10, f fVar) {
        this(map, appearance, localization, support, (i10 & 16) != 0 ? null : str);
    }
}
