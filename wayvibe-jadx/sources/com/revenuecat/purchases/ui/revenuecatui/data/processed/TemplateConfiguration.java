package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import B2.AbstractC0112b;
import D7.W;
import N8.o;
import U.InterfaceC0898m;
import android.net.Uri;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;
import p143n0.C2096x;
import p228v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateConfiguration {
    public static final int $stable = 0;
    private final PaywallData.Configuration.ColorInformation colors;
    private final PaywallData.Configuration configuration;
    private final Colors darkModeColors;
    private final Images images;
    private final Map<String, Images> imagesByTier;
    private final Colors lightModeColors;
    private final Locale locale;
    private final PaywallMode mode;
    private final PackageConfiguration packages;
    private final PaywallTemplate template;

    public static final class Colors {
        public static final int $stable = 0;
        private final long accent1;
        private final long accent2;
        private final long accent3;
        private final long background;
        private final long callToActionBackground;
        private final long callToActionForeground;
        private final C2096x callToActionSecondaryBackground;
        private final C2096x closeButton;
        private final long text1;
        private final long text2;
        private final long text3;
        private final C2096x tierControlBackground;
        private final C2096x tierControlForeground;
        private final C2096x tierControlSelectedBackground;
        private final C2096x tierControlSelectedForeground;

        public /* synthetic */ Colors(long j10, long j11, long j12, long j13, long j14, long j15, C2096x c2096x, long j16, long j17, long j18, C2096x c2096x2, C2096x c2096x3, C2096x c2096x4, C2096x c2096x5, C2096x c2096x6, f fVar) {
            this(j10, j11, j12, j13, j14, j15, c2096x, j16, j17, j18, c2096x2, c2096x3, c2096x4, c2096x5, c2096x6);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m732component10d7_KjU() {
            return this.background;
        }

        /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name */
        public final long m733component100d7_KjU() {
            return this.accent3;
        }

        /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name */
        public final C2096x m734component11QN2ZGVo() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name */
        public final C2096x m735component12QN2ZGVo() {
            return this.tierControlBackground;
        }

        /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name */
        public final C2096x m736component13QN2ZGVo() {
            return this.tierControlForeground;
        }

        /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name */
        public final C2096x m737component14QN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        /* JADX INFO: renamed from: component15-QN2ZGVo, reason: not valid java name */
        public final C2096x m738component15QN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m739component20d7_KjU() {
            return this.text1;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
        public final long m740component30d7_KjU() {
            return this.text2;
        }

        /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
        public final long m741component40d7_KjU() {
            return this.text3;
        }

        /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
        public final long m742component50d7_KjU() {
            return this.callToActionBackground;
        }

        /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
        public final long m743component60d7_KjU() {
            return this.callToActionForeground;
        }

        /* JADX INFO: renamed from: component7-QN2ZGVo, reason: not valid java name */
        public final C2096x m744component7QN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name */
        public final long m745component80d7_KjU() {
            return this.accent1;
        }

        /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name */
        public final long m746component90d7_KjU() {
            return this.accent2;
        }

        /* JADX INFO: renamed from: copy-VbAgQ-U, reason: not valid java name */
        public final Colors m747copyVbAgQU(long j10, long j11, long j12, long j13, long j14, long j15, C2096x c2096x, long j16, long j17, long j18, C2096x c2096x2, C2096x c2096x3, C2096x c2096x4, C2096x c2096x5, C2096x c2096x6) {
            return new Colors(j10, j11, j12, j13, j14, j15, c2096x, j16, j17, j18, c2096x2, c2096x3, c2096x4, c2096x5, c2096x6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) obj;
            return C2096x.c(this.background, colors.background) && C2096x.c(this.text1, colors.text1) && C2096x.c(this.text2, colors.text2) && C2096x.c(this.text3, colors.text3) && C2096x.c(this.callToActionBackground, colors.callToActionBackground) && C2096x.c(this.callToActionForeground, colors.callToActionForeground) && m.b(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && C2096x.c(this.accent1, colors.accent1) && C2096x.c(this.accent2, colors.accent2) && C2096x.c(this.accent3, colors.accent3) && m.b(this.closeButton, colors.closeButton) && m.b(this.tierControlBackground, colors.tierControlBackground) && m.b(this.tierControlForeground, colors.tierControlForeground) && m.b(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && m.b(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
        }

        /* JADX INFO: renamed from: getAccent1-0d7_KjU, reason: not valid java name */
        public final long m748getAccent10d7_KjU() {
            return this.accent1;
        }

        /* JADX INFO: renamed from: getAccent2-0d7_KjU, reason: not valid java name */
        public final long m749getAccent20d7_KjU() {
            return this.accent2;
        }

        /* JADX INFO: renamed from: getAccent3-0d7_KjU, reason: not valid java name */
        public final long m750getAccent30d7_KjU() {
            return this.accent3;
        }

        /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m751getBackground0d7_KjU() {
            return this.background;
        }

        /* JADX INFO: renamed from: getCallToActionBackground-0d7_KjU, reason: not valid java name */
        public final long m752getCallToActionBackground0d7_KjU() {
            return this.callToActionBackground;
        }

        /* JADX INFO: renamed from: getCallToActionForeground-0d7_KjU, reason: not valid java name */
        public final long m753getCallToActionForeground0d7_KjU() {
            return this.callToActionForeground;
        }

        /* JADX INFO: renamed from: getCallToActionSecondaryBackground-QN2ZGVo, reason: not valid java name */
        public final C2096x m754getCallToActionSecondaryBackgroundQN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        /* JADX INFO: renamed from: getCloseButton-QN2ZGVo, reason: not valid java name */
        public final C2096x m755getCloseButtonQN2ZGVo() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: getText1-0d7_KjU, reason: not valid java name */
        public final long m756getText10d7_KjU() {
            return this.text1;
        }

        /* JADX INFO: renamed from: getText2-0d7_KjU, reason: not valid java name */
        public final long m757getText20d7_KjU() {
            return this.text2;
        }

        /* JADX INFO: renamed from: getText3-0d7_KjU, reason: not valid java name */
        public final long m758getText30d7_KjU() {
            return this.text3;
        }

        /* JADX INFO: renamed from: getTierControlBackground-QN2ZGVo, reason: not valid java name */
        public final C2096x m759getTierControlBackgroundQN2ZGVo() {
            return this.tierControlBackground;
        }

        /* JADX INFO: renamed from: getTierControlForeground-QN2ZGVo, reason: not valid java name */
        public final C2096x m760getTierControlForegroundQN2ZGVo() {
            return this.tierControlForeground;
        }

        /* JADX INFO: renamed from: getTierControlSelectedBackground-QN2ZGVo, reason: not valid java name */
        public final C2096x m761getTierControlSelectedBackgroundQN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        /* JADX INFO: renamed from: getTierControlSelectedForeground-QN2ZGVo, reason: not valid java name */
        public final C2096x m762getTierControlSelectedForegroundQN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        public int hashCode() {
            long j10 = this.background;
            int i10 = C2096x.f22803n;
            int iG = b.g(this.callToActionForeground, b.g(this.callToActionBackground, b.g(this.text3, b.g(this.text2, b.g(this.text1, Long.hashCode(j10) * 31, 31), 31), 31), 31), 31);
            C2096x c2096x = this.callToActionSecondaryBackground;
            int iG2 = b.g(this.accent3, b.g(this.accent2, b.g(this.accent1, (iG + (c2096x == null ? 0 : Long.hashCode(c2096x.f22804a))) * 31, 31), 31), 31);
            C2096x c2096x2 = this.closeButton;
            int iHashCode = (iG2 + (c2096x2 == null ? 0 : Long.hashCode(c2096x2.f22804a))) * 31;
            C2096x c2096x3 = this.tierControlBackground;
            int iHashCode2 = (iHashCode + (c2096x3 == null ? 0 : Long.hashCode(c2096x3.f22804a))) * 31;
            C2096x c2096x4 = this.tierControlForeground;
            int iHashCode3 = (iHashCode2 + (c2096x4 == null ? 0 : Long.hashCode(c2096x4.f22804a))) * 31;
            C2096x c2096x5 = this.tierControlSelectedBackground;
            int iHashCode4 = (iHashCode3 + (c2096x5 == null ? 0 : Long.hashCode(c2096x5.f22804a))) * 31;
            C2096x c2096x6 = this.tierControlSelectedForeground;
            return iHashCode4 + (c2096x6 != null ? Long.hashCode(c2096x6.f22804a) : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Colors(background=");
            b.u(this.background, ", text1=", sb);
            b.u(this.text1, ", text2=", sb);
            b.u(this.text2, ", text3=", sb);
            b.u(this.text3, ", callToActionBackground=", sb);
            b.u(this.callToActionBackground, ", callToActionForeground=", sb);
            b.u(this.callToActionForeground, ", callToActionSecondaryBackground=", sb);
            sb.append(this.callToActionSecondaryBackground);
            sb.append(", accent1=");
            b.u(this.accent1, ", accent2=", sb);
            b.u(this.accent2, ", accent3=", sb);
            b.u(this.accent3, ", closeButton=", sb);
            sb.append(this.closeButton);
            sb.append(", tierControlBackground=");
            sb.append(this.tierControlBackground);
            sb.append(", tierControlForeground=");
            sb.append(this.tierControlForeground);
            sb.append(", tierControlSelectedBackground=");
            sb.append(this.tierControlSelectedBackground);
            sb.append(", tierControlSelectedForeground=");
            sb.append(this.tierControlSelectedForeground);
            sb.append(')');
            return sb.toString();
        }

        private Colors(long j10, long j11, long j12, long j13, long j14, long j15, C2096x c2096x, long j16, long j17, long j18, C2096x c2096x2, C2096x c2096x3, C2096x c2096x4, C2096x c2096x5, C2096x c2096x6) {
            this.background = j10;
            this.text1 = j11;
            this.text2 = j12;
            this.text3 = j13;
            this.callToActionBackground = j14;
            this.callToActionForeground = j15;
            this.callToActionSecondaryBackground = c2096x;
            this.accent1 = j16;
            this.accent2 = j17;
            this.accent3 = j18;
            this.closeButton = c2096x2;
            this.tierControlBackground = c2096x3;
            this.tierControlForeground = c2096x4;
            this.tierControlSelectedBackground = c2096x5;
            this.tierControlSelectedForeground = c2096x6;
        }
    }

    public static final class Images {
        public static final int $stable = 0;
        private final Uri backgroundUri;
        private final Uri headerUri;
        private final Uri iconUri;

        public Images(Uri uri, Uri uri2, Uri uri3) {
            this.iconUri = uri;
            this.backgroundUri = uri2;
            this.headerUri = uri3;
        }

        public static /* synthetic */ Images copy$default(Images images, Uri uri, Uri uri2, Uri uri3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = images.iconUri;
            }
            if ((i10 & 2) != 0) {
                uri2 = images.backgroundUri;
            }
            if ((i10 & 4) != 0) {
                uri3 = images.headerUri;
            }
            return images.copy(uri, uri2, uri3);
        }

        public final Uri component1() {
            return this.iconUri;
        }

        public final Uri component2() {
            return this.backgroundUri;
        }

        public final Uri component3() {
            return this.headerUri;
        }

        public final Images copy(Uri uri, Uri uri2, Uri uri3) {
            return new Images(uri, uri2, uri3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return m.b(this.iconUri, images.iconUri) && m.b(this.backgroundUri, images.backgroundUri) && m.b(this.headerUri, images.headerUri);
        }

        public final Uri getBackgroundUri() {
            return this.backgroundUri;
        }

        public final Uri getHeaderUri() {
            return this.headerUri;
        }

        public final Uri getIconUri() {
            return this.iconUri;
        }

        public int hashCode() {
            Uri uri = this.iconUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            Uri uri2 = this.backgroundUri;
            int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Uri uri3 = this.headerUri;
            return iHashCode2 + (uri3 != null ? uri3.hashCode() : 0);
        }

        public String toString() {
            return "Images(iconUri=" + this.iconUri + ", backgroundUri=" + this.backgroundUri + ", headerUri=" + this.headerUri + ')';
        }
    }

    public static abstract class PackageConfiguration {
        public static final int $stable = 0;

        public static final class MultiPackage {
            public static final int $stable = 0;
            private final List<PackageInfo> all;

            /* JADX INFO: renamed from: default, reason: not valid java name */
            private final PackageInfo f32default;
            private final PackageInfo first;

            public MultiPackage(PackageInfo first, PackageInfo packageInfo, List<PackageInfo> all) {
                m.f(first, "first");
                m.f(packageInfo, "default");
                m.f(all, "all");
                this.first = first;
                this.f32default = packageInfo;
                this.all = all;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MultiPackage copy$default(MultiPackage multiPackage, PackageInfo packageInfo, PackageInfo packageInfo2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    packageInfo = multiPackage.first;
                }
                if ((i10 & 2) != 0) {
                    packageInfo2 = multiPackage.f32default;
                }
                if ((i10 & 4) != 0) {
                    list = multiPackage.all;
                }
                return multiPackage.copy(packageInfo, packageInfo2, list);
            }

            public final PackageInfo component1() {
                return this.first;
            }

            public final PackageInfo component2() {
                return this.f32default;
            }

            public final List<PackageInfo> component3() {
                return this.all;
            }

            public final MultiPackage copy(PackageInfo first, PackageInfo packageInfo, List<PackageInfo> all) {
                m.f(first, "first");
                m.f(packageInfo, "default");
                m.f(all, "all");
                return new MultiPackage(first, packageInfo, all);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiPackage)) {
                    return false;
                }
                MultiPackage multiPackage = (MultiPackage) obj;
                return m.b(this.first, multiPackage.first) && m.b(this.f32default, multiPackage.f32default) && m.b(this.all, multiPackage.all);
            }

            public final List<PackageInfo> getAll() {
                return this.all;
            }

            public final PackageInfo getDefault() {
                return this.f32default;
            }

            public final PackageInfo getFirst() {
                return this.first;
            }

            public int hashCode() {
                return this.all.hashCode() + ((this.f32default.hashCode() + (this.first.hashCode() * 31)) * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MultiPackage(first=");
                sb.append(this.first);
                sb.append(", default=");
                sb.append(this.f32default);
                sb.append(", all=");
                return AbstractC0112b.m(sb, this.all, ')');
            }
        }

        public static final class MultiTier extends PackageConfiguration {
            public static final int $stable = 0;
            private final List<TierInfo> allTiers;
            private final TierInfo defaultTier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiTier(TierInfo defaultTier, List<TierInfo> allTiers) {
                super(null);
                m.f(defaultTier, "defaultTier");
                m.f(allTiers, "allTiers");
                this.defaultTier = defaultTier;
                this.allTiers = allTiers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MultiTier copy$default(MultiTier multiTier, TierInfo tierInfo, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    tierInfo = multiTier.defaultTier;
                }
                if ((i10 & 2) != 0) {
                    list = multiTier.allTiers;
                }
                return multiTier.copy(tierInfo, list);
            }

            public final TierInfo component1() {
                return this.defaultTier;
            }

            public final List<TierInfo> component2() {
                return this.allTiers;
            }

            public final MultiTier copy(TierInfo defaultTier, List<TierInfo> allTiers) {
                m.f(defaultTier, "defaultTier");
                m.f(allTiers, "allTiers");
                return new MultiTier(defaultTier, allTiers);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiTier)) {
                    return false;
                }
                MultiTier multiTier = (MultiTier) obj;
                return m.b(this.defaultTier, multiTier.defaultTier) && m.b(this.allTiers, multiTier.allTiers);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                List<TierInfo> list = this.allTiers;
                ArrayList arrayList = new ArrayList(o.o0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TierInfo) it.next()).getPackages());
                }
                return o.p0(arrayList);
            }

            public final List<TierInfo> getAllTiers() {
                return this.allTiers;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.defaultTier.getDefaultPackage();
            }

            public final TierInfo getDefaultTier() {
                return this.defaultTier;
            }

            public int hashCode() {
                return this.allTiers.hashCode() + (this.defaultTier.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MultiTier(defaultTier=");
                sb.append(this.defaultTier);
                sb.append(", allTiers=");
                return AbstractC0112b.m(sb, this.allTiers, ')');
            }
        }

        public static final class Multiple extends PackageConfiguration {
            public static final int $stable = 0;
            private final MultiPackage multiPackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Multiple(MultiPackage multiPackage) {
                super(null);
                m.f(multiPackage, "multiPackage");
                this.multiPackage = multiPackage;
            }

            public static /* synthetic */ Multiple copy$default(Multiple multiple, MultiPackage multiPackage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    multiPackage = multiple.multiPackage;
                }
                return multiple.copy(multiPackage);
            }

            public final MultiPackage component1() {
                return this.multiPackage;
            }

            public final Multiple copy(MultiPackage multiPackage) {
                m.f(multiPackage, "multiPackage");
                return new Multiple(multiPackage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Multiple) && m.b(this.multiPackage, ((Multiple) obj).multiPackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                return this.multiPackage.getAll();
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.multiPackage.getDefault();
            }

            public final MultiPackage getMultiPackage() {
                return this.multiPackage;
            }

            public int hashCode() {
                return this.multiPackage.hashCode();
            }

            public String toString() {
                return "Multiple(multiPackage=" + this.multiPackage + ')';
            }
        }

        public static final class Single extends PackageConfiguration {
            public static final int $stable = 0;
            private final PackageInfo singlePackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Single(PackageInfo singlePackage) {
                super(null);
                m.f(singlePackage, "singlePackage");
                this.singlePackage = singlePackage;
            }

            public static /* synthetic */ Single copy$default(Single single, PackageInfo packageInfo, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    packageInfo = single.singlePackage;
                }
                return single.copy(packageInfo);
            }

            public final PackageInfo component1() {
                return this.singlePackage;
            }

            public final Single copy(PackageInfo singlePackage) {
                m.f(singlePackage, "singlePackage");
                return new Single(singlePackage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Single) && m.b(this.singlePackage, ((Single) obj).singlePackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                return W.T(this.singlePackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.singlePackage;
            }

            public final PackageInfo getSinglePackage() {
                return this.singlePackage;
            }

            public int hashCode() {
                return this.singlePackage.hashCode();
            }

            public String toString() {
                return "Single(singlePackage=" + this.singlePackage + ')';
            }
        }

        public /* synthetic */ PackageConfiguration(f fVar) {
            this();
        }

        public abstract List<PackageInfo> getAll();

        public abstract PackageInfo getDefault();

        private PackageConfiguration() {
        }
    }

    public static final class PackageInfo {
        public static final int $stable = 0;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final ProcessedLocalizedConfiguration localization;
        private final Package rcPackage;

        public PackageInfo(Package rcPackage, ProcessedLocalizedConfiguration localization, Double d10) {
            m.f(rcPackage, "rcPackage");
            m.f(localization, "localization");
            this.rcPackage = rcPackage;
            this.localization = localization;
            this.discountRelativeToMostExpensivePerMonth = d10;
        }

        public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, Package r10, ProcessedLocalizedConfiguration processedLocalizedConfiguration, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                r10 = packageInfo.rcPackage;
            }
            if ((i10 & 2) != 0) {
                processedLocalizedConfiguration = packageInfo.localization;
            }
            if ((i10 & 4) != 0) {
                d10 = packageInfo.discountRelativeToMostExpensivePerMonth;
            }
            return packageInfo.copy(r10, processedLocalizedConfiguration, d10);
        }

        public final Package component1() {
            return this.rcPackage;
        }

        public final ProcessedLocalizedConfiguration component2() {
            return this.localization;
        }

        public final Double component3() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final PackageInfo copy(Package rcPackage, ProcessedLocalizedConfiguration localization, Double d10) {
            m.f(rcPackage, "rcPackage");
            m.f(localization, "localization");
            return new PackageInfo(rcPackage, localization, d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackageInfo)) {
                return false;
            }
            PackageInfo packageInfo = (PackageInfo) obj;
            return m.b(this.rcPackage, packageInfo.rcPackage) && m.b(this.localization, packageInfo.localization) && m.b(this.discountRelativeToMostExpensivePerMonth, packageInfo.discountRelativeToMostExpensivePerMonth);
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final ProcessedLocalizedConfiguration getLocalization() {
            return this.localization;
        }

        public final Package getRcPackage() {
            return this.rcPackage;
        }

        public int hashCode() {
            int iHashCode = (this.localization.hashCode() + (this.rcPackage.hashCode() * 31)) * 31;
            Double d10 = this.discountRelativeToMostExpensivePerMonth;
            return iHashCode + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            return "PackageInfo(rcPackage=" + this.rcPackage + ", localization=" + this.localization + ", discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ')';
        }
    }

    public static final class TierInfo {
        public static final int $stable = 0;
        private final PackageInfo defaultPackage;
        private final String id;
        private final String name;
        private final List<PackageInfo> packages;

        public TierInfo(String name, String id, PackageInfo defaultPackage, List<PackageInfo> packages) {
            m.f(name, "name");
            m.f(id, "id");
            m.f(defaultPackage, "defaultPackage");
            m.f(packages, "packages");
            this.name = name;
            this.id = id;
            this.defaultPackage = defaultPackage;
            this.packages = packages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TierInfo copy$default(TierInfo tierInfo, String str, String str2, PackageInfo packageInfo, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tierInfo.name;
            }
            if ((i10 & 2) != 0) {
                str2 = tierInfo.id;
            }
            if ((i10 & 4) != 0) {
                packageInfo = tierInfo.defaultPackage;
            }
            if ((i10 & 8) != 0) {
                list = tierInfo.packages;
            }
            return tierInfo.copy(str, str2, packageInfo, list);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.id;
        }

        public final PackageInfo component3() {
            return this.defaultPackage;
        }

        public final List<PackageInfo> component4() {
            return this.packages;
        }

        public final TierInfo copy(String name, String id, PackageInfo defaultPackage, List<PackageInfo> packages) {
            m.f(name, "name");
            m.f(id, "id");
            m.f(defaultPackage, "defaultPackage");
            m.f(packages, "packages");
            return new TierInfo(name, id, defaultPackage, packages);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TierInfo)) {
                return false;
            }
            TierInfo tierInfo = (TierInfo) obj;
            return m.b(this.name, tierInfo.name) && m.b(this.id, tierInfo.id) && m.b(this.defaultPackage, tierInfo.defaultPackage) && m.b(this.packages, tierInfo.packages);
        }

        public final PackageInfo getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final List<PackageInfo> getPackages() {
            return this.packages;
        }

        public int hashCode() {
            return this.packages.hashCode() + ((this.defaultPackage.hashCode() + AbstractC0112b.a(this.name.hashCode() * 31, 31, this.id)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TierInfo(name=");
            sb.append(this.name);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", defaultPackage=");
            sb.append(this.defaultPackage);
            sb.append(", packages=");
            return AbstractC0112b.m(sb, this.packages, ')');
        }
    }

    public TemplateConfiguration(PaywallTemplate template, PaywallMode mode, PackageConfiguration packages, PaywallData.Configuration configuration, Images images, Map<String, Images> imagesByTier, PaywallData.Configuration.ColorInformation colors, Locale locale) {
        m.f(template, "template");
        m.f(mode, "mode");
        m.f(packages, "packages");
        m.f(configuration, "configuration");
        m.f(images, "images");
        m.f(imagesByTier, "imagesByTier");
        m.f(colors, "colors");
        m.f(locale, "locale");
        this.template = template;
        this.mode = mode;
        this.packages = packages;
        this.configuration = configuration;
        this.images = images;
        this.imagesByTier = imagesByTier;
        this.colors = colors;
        this.locale = locale;
        ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
        PaywallData.Configuration.Colors dark = colors.getDark();
        this.darkModeColors = colorsFactory.create(dark == null ? colors.getLight() : dark);
        this.lightModeColors = colorsFactory.create(colors.getLight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateConfiguration copy$default(TemplateConfiguration templateConfiguration, PaywallTemplate paywallTemplate, PaywallMode paywallMode, PackageConfiguration packageConfiguration, PaywallData.Configuration configuration, Images images, Map map, PaywallData.Configuration.ColorInformation colorInformation, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallTemplate = templateConfiguration.template;
        }
        if ((i10 & 2) != 0) {
            paywallMode = templateConfiguration.mode;
        }
        if ((i10 & 4) != 0) {
            packageConfiguration = templateConfiguration.packages;
        }
        if ((i10 & 8) != 0) {
            configuration = templateConfiguration.configuration;
        }
        if ((i10 & 16) != 0) {
            images = templateConfiguration.images;
        }
        if ((i10 & 32) != 0) {
            map = templateConfiguration.imagesByTier;
        }
        if ((i10 & 64) != 0) {
            colorInformation = templateConfiguration.colors;
        }
        if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
            locale = templateConfiguration.locale;
        }
        PaywallData.Configuration.ColorInformation colorInformation2 = colorInformation;
        Locale locale2 = locale;
        Images images2 = images;
        Map map2 = map;
        return templateConfiguration.copy(paywallTemplate, paywallMode, packageConfiguration, configuration, images2, map2, colorInformation2, locale2);
    }

    public final PaywallTemplate component1() {
        return this.template;
    }

    public final PaywallMode component2() {
        return this.mode;
    }

    public final PackageConfiguration component3() {
        return this.packages;
    }

    public final PaywallData.Configuration component4() {
        return this.configuration;
    }

    public final Images component5() {
        return this.images;
    }

    public final Map<String, Images> component6() {
        return this.imagesByTier;
    }

    public final PaywallData.Configuration.ColorInformation component7() {
        return this.colors;
    }

    public final Locale component8() {
        return this.locale;
    }

    public final TemplateConfiguration copy(PaywallTemplate template, PaywallMode mode, PackageConfiguration packages, PaywallData.Configuration configuration, Images images, Map<String, Images> imagesByTier, PaywallData.Configuration.ColorInformation colors, Locale locale) {
        m.f(template, "template");
        m.f(mode, "mode");
        m.f(packages, "packages");
        m.f(configuration, "configuration");
        m.f(images, "images");
        m.f(imagesByTier, "imagesByTier");
        m.f(colors, "colors");
        m.f(locale, "locale");
        return new TemplateConfiguration(template, mode, packages, configuration, images, imagesByTier, colors, locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateConfiguration)) {
            return false;
        }
        TemplateConfiguration templateConfiguration = (TemplateConfiguration) obj;
        return this.template == templateConfiguration.template && this.mode == templateConfiguration.mode && m.b(this.packages, templateConfiguration.packages) && m.b(this.configuration, templateConfiguration.configuration) && m.b(this.images, templateConfiguration.images) && m.b(this.imagesByTier, templateConfiguration.imagesByTier) && m.b(this.colors, templateConfiguration.colors) && m.b(this.locale, templateConfiguration.locale);
    }

    public final PaywallData.Configuration.ColorInformation getColors() {
        return this.colors;
    }

    public final PaywallData.Configuration getConfiguration() {
        return this.configuration;
    }

    public final Colors getCurrentColors(InterfaceC0898m interfaceC0898m, int i10) {
        return a.d(interfaceC0898m) ? this.darkModeColors : this.lightModeColors;
    }

    public final Colors getCurrentColorsForTier(TierInfo tier, InterfaceC0898m interfaceC0898m, int i10) {
        Colors colorsCreate;
        m.f(tier, "tier");
        Map<String, PaywallData.Configuration.ColorInformation> colorsByTier = this.configuration.getColorsByTier();
        Colors colors = null;
        PaywallData.Configuration.ColorInformation colorInformation = colorsByTier != null ? colorsByTier.get(tier.getId()) : null;
        if (colorInformation != null) {
            if (a.d(interfaceC0898m)) {
                ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
                PaywallData.Configuration.Colors dark = colorInformation.getDark();
                if (dark == null) {
                    dark = colorInformation.getLight();
                }
                colorsCreate = colorsFactory.create(dark);
            } else {
                colorsCreate = ColorsFactory.INSTANCE.create(colorInformation.getLight());
            }
            colors = colorsCreate;
        }
        return colors == null ? getCurrentColors(interfaceC0898m, (i10 >> 3) & 14) : colors;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Map<String, Images> getImagesByTier() {
        return this.imagesByTier;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final PaywallMode getMode() {
        return this.mode;
    }

    public final PackageConfiguration getPackages() {
        return this.packages;
    }

    public final PaywallTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return this.locale.hashCode() + ((this.colors.hashCode() + b.e((this.images.hashCode() + ((this.configuration.hashCode() + ((this.packages.hashCode() + ((this.mode.hashCode() + (this.template.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.imagesByTier)) * 31);
    }

    public String toString() {
        return "TemplateConfiguration(template=" + this.template + ", mode=" + this.mode + ", packages=" + this.packages + ", configuration=" + this.configuration + ", images=" + this.images + ", imagesByTier=" + this.imagesByTier + ", colors=" + this.colors + ", locale=" + this.locale + ')';
    }
}
