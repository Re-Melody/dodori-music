package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import D0.InterfaceC0185k;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public interface BackgroundStyles {

    public static final class Color implements BackgroundStyles {
        private final ColorStyles color;

        private /* synthetic */ Color(ColorStyles colorStyles) {
            this.color = colorStyles;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Color m399boximpl(ColorStyles colorStyles) {
            return new Color(colorStyles);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ColorStyles m400constructorimpl(ColorStyles color) {
            m.f(color, "color");
            return color;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m401equalsimpl(ColorStyles colorStyles, Object obj) {
            return (obj instanceof Color) && m.b(colorStyles, ((Color) obj).m405unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m402equalsimpl0(ColorStyles colorStyles, ColorStyles colorStyles2) {
            return m.b(colorStyles, colorStyles2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m403hashCodeimpl(ColorStyles colorStyles) {
            return colorStyles.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m404toStringimpl(ColorStyles colorStyles) {
            return "Color(color=" + colorStyles + ')';
        }

        public boolean equals(Object obj) {
            return m401equalsimpl(this.color, obj);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public int hashCode() {
            return m403hashCodeimpl(this.color);
        }

        public String toString() {
            return m404toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ColorStyles m405unboximpl() {
            return this.color;
        }
    }

    public static final class Image implements BackgroundStyles {
        public static final int $stable = 0;
        private final ColorStyles colorOverlay;
        private final InterfaceC0185k contentScale;
        private final ThemeImageUrls sources;

        public Image(ThemeImageUrls sources, InterfaceC0185k contentScale, ColorStyles colorStyles) {
            m.f(sources, "sources");
            m.f(contentScale, "contentScale");
            this.sources = sources;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyles;
        }

        public static /* synthetic */ Image copy$default(Image image, ThemeImageUrls themeImageUrls, InterfaceC0185k interfaceC0185k, ColorStyles colorStyles, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                themeImageUrls = image.sources;
            }
            if ((i10 & 2) != 0) {
                interfaceC0185k = image.contentScale;
            }
            if ((i10 & 4) != 0) {
                colorStyles = image.colorOverlay;
            }
            return image.copy(themeImageUrls, interfaceC0185k, colorStyles);
        }

        public final ThemeImageUrls component1() {
            return this.sources;
        }

        public final InterfaceC0185k component2() {
            return this.contentScale;
        }

        public final ColorStyles component3() {
            return this.colorOverlay;
        }

        public final Image copy(ThemeImageUrls sources, InterfaceC0185k contentScale, ColorStyles colorStyles) {
            m.f(sources, "sources");
            m.f(contentScale, "contentScale");
            return new Image(sources, contentScale, colorStyles);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return m.b(this.sources, image.sources) && m.b(this.contentScale, image.contentScale) && m.b(this.colorOverlay, image.colorOverlay);
        }

        public final /* synthetic */ ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ InterfaceC0185k getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ ThemeImageUrls getSources() {
            return this.sources;
        }

        public int hashCode() {
            int iHashCode = (this.contentScale.hashCode() + (this.sources.hashCode() * 31)) * 31;
            ColorStyles colorStyles = this.colorOverlay;
            return iHashCode + (colorStyles == null ? 0 : colorStyles.hashCode());
        }

        public String toString() {
            return "Image(sources=" + this.sources + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }

    public static final class Video implements BackgroundStyles {
        public static final int $stable = 0;
        private final ColorStyles colorOverlay;
        private final InterfaceC0185k contentScale;
        private final ThemeImageUrls fallbackImage;
        private final boolean loop;
        private final boolean muteAudio;
        private final ThemeVideoUrls sources;

        public Video(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean z10, boolean z11, InterfaceC0185k contentScale, ColorStyles colorStyles) {
            m.f(sources, "sources");
            m.f(fallbackImage, "fallbackImage");
            m.f(contentScale, "contentScale");
            this.sources = sources;
            this.fallbackImage = fallbackImage;
            this.loop = z10;
            this.muteAudio = z11;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyles;
        }

        public static /* synthetic */ Video copy$default(Video video, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z10, boolean z11, InterfaceC0185k interfaceC0185k, ColorStyles colorStyles, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                themeVideoUrls = video.sources;
            }
            if ((i10 & 2) != 0) {
                themeImageUrls = video.fallbackImage;
            }
            if ((i10 & 4) != 0) {
                z10 = video.loop;
            }
            if ((i10 & 8) != 0) {
                z11 = video.muteAudio;
            }
            if ((i10 & 16) != 0) {
                interfaceC0185k = video.contentScale;
            }
            if ((i10 & 32) != 0) {
                colorStyles = video.colorOverlay;
            }
            InterfaceC0185k interfaceC0185k2 = interfaceC0185k;
            ColorStyles colorStyles2 = colorStyles;
            return video.copy(themeVideoUrls, themeImageUrls, z10, z11, interfaceC0185k2, colorStyles2);
        }

        public final ThemeVideoUrls component1() {
            return this.sources;
        }

        public final ThemeImageUrls component2() {
            return this.fallbackImage;
        }

        public final boolean component3() {
            return this.loop;
        }

        public final boolean component4() {
            return this.muteAudio;
        }

        public final InterfaceC0185k component5() {
            return this.contentScale;
        }

        public final ColorStyles component6() {
            return this.colorOverlay;
        }

        public final Video copy(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean z10, boolean z11, InterfaceC0185k contentScale, ColorStyles colorStyles) {
            m.f(sources, "sources");
            m.f(fallbackImage, "fallbackImage");
            m.f(contentScale, "contentScale");
            return new Video(sources, fallbackImage, z10, z11, contentScale, colorStyles);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return m.b(this.sources, video.sources) && m.b(this.fallbackImage, video.fallbackImage) && this.loop == video.loop && this.muteAudio == video.muteAudio && m.b(this.contentScale, video.contentScale) && m.b(this.colorOverlay, video.colorOverlay);
        }

        public final /* synthetic */ ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ InterfaceC0185k getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final /* synthetic */ boolean getLoop() {
            return this.loop;
        }

        public final /* synthetic */ boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final /* synthetic */ ThemeVideoUrls getSources() {
            return this.sources;
        }

        public int hashCode() {
            int iHashCode = (this.contentScale.hashCode() + b.f(b.f((this.fallbackImage.hashCode() + (this.sources.hashCode() * 31)) * 31, 31, this.loop), 31, this.muteAudio)) * 31;
            ColorStyles colorStyles = this.colorOverlay;
            return iHashCode + (colorStyles == null ? 0 : colorStyles.hashCode());
        }

        public String toString() {
            return "Video(sources=" + this.sources + ", fallbackImage=" + this.fallbackImage + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }
}
